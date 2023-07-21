package com.bikkadit.MakeMyTrip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.RequestBodyUriSpec;

import com.bikkadit.MakeMyTrip.entity.Passanger;
import com.bikkadit.MakeMyTrip.entity.Ticket;
import com.bikkadit.MakeMyTrip.repository.PassangerRepository;

@Service
public class PassangerServiceImpl implements PassangerServiceI{
	
	@Autowired
	private PassangerRepository passangerRepository;

	@Override
	public Ticket bookTicket(Passanger passanger) {
		
		Passanger passanger2 = passangerRepository.save(passanger);
		
		String url="http://localhost:8080/bookTicket";
		
		WebClient webClient =WebClient.create();
		
		Ticket ticket = webClient.post()
				.uri(url)
				.accept(MediaType.APPLICATION_JSON)
				.bodyValue(passanger2)
				.retrieve()
				.bodyToMono(Ticket.class)
				.block();

		return ticket;
	}

}
