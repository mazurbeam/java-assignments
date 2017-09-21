package com.mazurbeam.events.controllers;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mazurbeam.events.models.Event;
import com.mazurbeam.events.models.Message;
import com.mazurbeam.events.models.State;
import com.mazurbeam.events.models.User;
import com.mazurbeam.events.services.EventService;
import com.mazurbeam.events.services.MessageService;
import com.mazurbeam.events.services.StateService;
import com.mazurbeam.events.services.UserService;
import com.mazurbeam.events.validator.UserValidator;

@Controller
public class Users {
    
	private UserService userService;
	private StateService stateService;
	private EventService eventService;
	private MessageService messageService;
	
	private UserValidator userValidator;
	 
	public Users(MessageService messageService,UserService userService, StateService stateService, EventService eventService, UserValidator userValidator) {
	    this.messageService = messageService;
		this.userService = userService;
	    this.stateService = stateService;
	    this.eventService = eventService;
	    this.setUserValidator(userValidator);
	 }

   
	@RequestMapping(value="/register", method = RequestMethod.POST)
    public String registration( @ModelAttribute("user") User user, BindingResult result,Model model, HttpSession session) {
    		if (result.hasErrors()) {
    			return "login.jsp";
    		}
    		userService.saveWithUserRole(user);
    		return "redirect:/login";
    }
    
    @RequestMapping("/login")
    public String login(@Valid @ModelAttribute("user") User user, @RequestParam(value="error", required=false) String error, @RequestParam(value="logout", required=false) String logout, Model model) {
    		model.addAttribute("states", stateService.allStates()); 
		System.out.println(error);
	
    		if(error != null) {
            model.addAttribute("errorMessage", "Invalid Credentials, Please try again.");
        }
        if(logout != null) {
            model.addAttribute("logoutMessage", "Logout Successfull!");
        }
        return "login.jsp";
    }
    
    @RequestMapping(value = {"/", "/events"})
    public String home(@ModelAttribute("event") Event event, Principal principal, Model model) {
        // 1
        String username = principal.getName();
        User currentUser = userService.findByUsername(username);
        model.addAttribute("currentUser", currentUser);
		model.addAttribute("states", stateService.allStates()); 
		model.addAttribute("localEvents", eventService.findAllEventsFromState(currentUser.getState()));
		model.addAttribute("events", eventService.findAllEventsNotFromState(currentUser.getState()));
        return "events.jsp";
    }
    
    @RequestMapping("/admin")
    public String adminPage(Principal principal, Model model) {
        String username = principal.getName();
        model.addAttribute("currentUser", userService.findByUsername(username));
        return "adminPage.jsp";
    }
    
    @PostMapping("/newEvent")
    public String addEvent(@ModelAttribute("event") Event event, BindingResult result,Model model, Principal principal) {
    	if (result.hasErrors()) {
			return "events.jsp";
		}
    		String username = principal.getName();
    		event.setUser(userService.findByUsername(username));
		eventService.saveEvent(event);
    		return "redirect:/events";
    }
    
    @RequestMapping("/events/{eventId}")
    public String viewEvent(@PathVariable Long eventId, Model model, @ModelAttribute("message") Message message, Principal principal) {
    		Event event = eventService.findEventWithId(eventId);
    		model.addAttribute("event", event);
    		model.addAttribute("joined", event.getUsers());
    		model.addAttribute("currentUser", userService.findByUsername(principal.getName()));
    		model.addAttribute("messages", messageService.getAllMessagesForEvent(event));
    		return "eventPage.jsp";
    }
    
    @RequestMapping("/events/{eventId}/edit")
    public String editEvent(@PathVariable Long eventId) {
    		return "editEvent.jsp";
    }
    
    @RequestMapping("/events/{eventId}/join")
    public String joinEvent(@PathVariable Long eventId, Model model, Principal principal){
    		Event event = eventService.findEventWithId(eventId);
    		User user = userService.findByUsername(principal.getName());
    		System.out.println(event);
    		System.out.println(user);
    		event.addUser(user);
    		eventService.saveEvent(event);
    		return "redirect:/events/".concat(eventId.toString());
    }
    
    @PostMapping("/newMessage/{eventId}")
    public String newMessage(@PathVariable Long eventId, @ModelAttribute("message") Message message, Model model, BindingResult result, Principal principal) {
    		User user = userService.findByUsername(principal.getName());
    		message.setUser(user);
    		message.setEvent(eventService.findEventWithId(eventId));
    		messageService.saveMessageForEvent(message);
    		return "redirect:/events/".concat(eventId.toString());
    }

	public UserValidator getUserValidator() {
		return userValidator;
	}

	public void setUserValidator(UserValidator userValidator) {
		this.userValidator = userValidator;
	}


}
