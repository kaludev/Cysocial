package com.kaludev.Cysocial.registration.token;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.kaludev.Cysocial.appuser.AppUser;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ConfirmationToken {
	
	@Id
	@SequenceGenerator(allocationSize = 1,
			name = "confirmation_token_sequence",
			sequenceName = "confirmation_token_sequence"
			)
	@GeneratedValue(
			generator = "confirmation_token_sequence",
			strategy = GenerationType.SEQUENCE
			)
	private long id;
	
	private String token;
	
	@Column(nullable = false)
	private LocalDateTime createdAt;
	
	@Column(nullable = false)
	private LocalDateTime expiredAt;
	
	private LocalDateTime confirmedAt;	
	
	@ManyToOne
	@JoinColumn(nullable = false,
			name = "app_user_id")
	private AppUser appUser;
	
	public ConfirmationToken(String token, LocalDateTime createdAt, LocalDateTime expiredAt,
			AppUser appUser) {
		super();
		this.token = token;
		this.createdAt = createdAt;
		this.expiredAt = expiredAt;
		this.appUser = appUser;
	}
}
