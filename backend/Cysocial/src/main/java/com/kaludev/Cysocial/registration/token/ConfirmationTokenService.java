package com.kaludev.Cysocial.registration.token;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

	private final ConfirmationTokenRepository confirmationTokenRepository;
	
	public void saveConfirmationToken(ConfirmationToken token) {
		confirmationTokenRepository.save(token);
	}
	 public ConfirmationToken getToken(String token) {
		 return confirmationTokenRepository.findByToken(token).orElseThrow(() -> new IllegalStateException("token not found"));
	 }
	public int setConfirmedAt(String token) {
		return confirmationTokenRepository.updateConfirmedAt(token,LocalDateTime.now());
	}
}
