/*package com.kaludev.Cysocial.post;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Post {
	
	@SequenceGenerator(
			name = "post_sequence",
			allocationSize = 1,
			sequenceName ="post_sequence" 
			)
	@GeneratedValue(
			generator = "post_sequence",
			strategy = GenerationType.SEQUENCE
			)
	private long id;
	
}
*/