package ro.ase.csie.cts.g1093.laboratory3.stage3.services;

import ro.ase.csie.g1093.laboratory3.exception.InvalidAccountAgeException;
import ro.ase.csie.g1093.laboratory3.exception.InvalidPriceException;

public class ValidatorService implements ValidatorInterface {

	@Override
	public void validatePrice(float price) throws InvalidPriceException {
		if (price <= 0) {
			throw new InvalidPriceException();
		}

	}

	@Override
	public void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException {
		if (accountAgeInYears < 0) {
			throw new InvalidAccountAgeException();
		}

	}

}
