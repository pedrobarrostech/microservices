package com.porcelani.services.roles.imp;

import com.porcelani.models.PasswordCharacters;
import com.porcelani.services.roles.common.Consecutive;
import com.porcelani.services.roles.Deductions;
import com.porcelani.services.type.Flat;

public class ConsecutiveLowercaseLetters extends Consecutive implements Deductions, Flat {

	public int rate(PasswordCharacters passwordCharacters) {
		int totalDeOcorrencias = consecutive(passwordCharacters.value());

		return -totalDeOcorrencias * 2;
	}

	@Override
	protected boolean extracted(char c) {
		return Character.isLowerCase(c);
	}
}
