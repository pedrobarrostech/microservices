package com.porcelani.services.imp;

import com.porcelani.models.Password;
import com.porcelani.services.roles.Additions;
import com.porcelani.services.type.Flat;

public class NumberOfCharacters implements Additions, Flat {

	public int rate(Password password) {
		int n = password.totalChars();

		return n*4;
	}

}
