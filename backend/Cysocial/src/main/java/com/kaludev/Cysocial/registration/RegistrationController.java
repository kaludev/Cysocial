package com.kaludev.Cysocial.registration;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/registration")
@AllArgsConstructor
public class RegistrationController {
	private final RegistrationService registrationService;
	

	@PostMapping
	public String register(@RequestBody RegistrationRequest request) {
		return registrationService.register(request);
	}
	
	@GetMapping(path = "/confirm")
	public String confirmToken(String token) {
		return registrationService.confirmToken(token);
	}
}
