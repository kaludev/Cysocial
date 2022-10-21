package com.kaludev.Cysocial.registration;

import java.util.function.Predicate;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;


@Service
public class EmailValidator implements Predicate<String>{

	@Override
	public boolean test(String t) {
		return Pattern.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", t);
	}
	
}
