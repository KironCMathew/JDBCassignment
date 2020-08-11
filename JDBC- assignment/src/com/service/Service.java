package com.service;

import java.util.regex.Pattern;

public class Service {
	public boolean nameValidation(String name) {
		if (Pattern.matches("^[A-Z]{1}[a-z]{2,}$", name)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean idValidation(String id) {
		if (Pattern.matches("^[1-9]{7}-[A-Z]{4}$", id)) {
			return true;
		} else
			return false;
	}
}
