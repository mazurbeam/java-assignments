package com.mazurbeam.ninjagold.controllers;



import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("game")
public class HomeController {
	
	@ModelAttribute("game")
	public NinjaGold getNinjaGold() {
		return new NinjaGold();
	}
	

	@RequestMapping("/")
	public String index(@ModelAttribute("game") NinjaGold game) {
		System.out.println("Gold from index " + game.getGold());
		return "index.jsp";
	}
	
	@RequestMapping(path="/findGold", method=RequestMethod.POST)
	public String findGold(@ModelAttribute("game") NinjaGold game, @RequestParam(value="building") String building) {
		System.out.println(building);
		Date now = new Date();
		if(building.equals("farm")) {
			int found = (int)(Math.random()*10 + 10);
			System.out.println("Found " +found);
			game.setGold(game.getGold()+found);
			game.addActivity("You entered a farm and earned "+found+" gold. ("+now.toString()+")");
			System.out.println("Gold after set gold: "+game.getGold());
			
		} else if(building.equals("cave")) {
			int found = (int)(Math.random()*5 + 5);
			System.out.println("Found " +found);
			game.setGold(game.getGold()+found);
			game.addActivity("You entered a cave and earned "+found+" gold. ("+now.toString()+")");
		} else if(building.equals("house") ) {
			int found = (int)(Math.random()*3+2);
			System.out.println("Found " +found);
			game.setGold(game.getGold()+found);
			game.addActivity("You entered a house and earned "+found+" gold. ("+now.toString()+")");
		} else if(building.equals("casino")) {
			int winlose = (int)(Math.random()*2);
			int amount = (int)(Math.random()*50+1);
			if(winlose == 0) {
				game.addActivity("You entered a casino and lost "+amount+" gold.. Ouch ("+now.toString()+")");
				game.setGold(game.getGold()-amount);
			} else {
				game.setGold(game.getGold()+amount);
				game.addActivity("You entered a casino and won "+amount+" gold. ("+now.toString()+")");
			}
		}
		return "redirect:/";
	}
}
