package javaKampDay4.Core;

import javaKampDay4.Utilities.GamerValidator;

public class GamerValidatorAdapter implements IValidatorService{

	@Override
	public void Validate(String message) {
		GamerValidator gamerValidator = new GamerValidator();
		
	}

}
