package com.ess.thirdpartyservice;

import com.ess.thirdpartyservice.service.INotificationService;
import com.ess.thirdpartyservice.service.model.MessageDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@RequiredArgsConstructor
public class ThirdPartyServiceApplication implements CommandLineRunner {
	private final INotificationService notificationService;

	public static void main(String[] args) {
		SpringApplication.run(ThirdPartyServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MessageDTO messageDTO = new MessageDTO();
		messageDTO.setFrom("essaadani80@gmail.com");
		messageDTO.setTo("essaadani80@gmail.com");
		messageDTO.setSubject("SUBJECT FOR MAIL");
		messageDTO.setBody("HELLOW!");

		notificationService.send(messageDTO);
	}
}
