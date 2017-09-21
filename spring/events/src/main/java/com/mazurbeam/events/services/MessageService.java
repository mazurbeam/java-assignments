package com.mazurbeam.events.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mazurbeam.events.models.Event;
import com.mazurbeam.events.models.Message;
import com.mazurbeam.events.repositories.MessageRepository;

@Service
public class MessageService {
	private MessageRepository messageRepository;
	
	public MessageService(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}
	
	public List<Message> getAllMessagesForEvent(Event event) {
		return messageRepository.findAllMessagesWithEventId(event.getId());
	}
	public void saveMessageForEvent(Message message) {
		messageRepository.save(message);
	}
}
