package ro.ase.csie.cts.g1093.laboratory3.stage3.services;

import ro.ase.csie.g1093.laboratory3.exception.InvalidAccountAgeException;
import ro.ase.csie.g1093.laboratory3.exception.InvalidPriceException;

public interface ValidatorInterface {
	public void validatePrice(float price) throws InvalidPriceException;
	public void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException;
	
	
}