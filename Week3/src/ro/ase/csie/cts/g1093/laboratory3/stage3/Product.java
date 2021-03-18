package ro.ase.csie.cts.g1093.laboratory3.stage3;

import ro.ase.csie.g1093.laboratory3.exception.InvalidAccountAgeException;
import ro.ase.csie.g1093.laboratory3.exception.InvalidPriceException;

public class Product {
	
//  NOT LIKE THIS
//	MarketingInterface mkService = new MkStrategySpring2021();
//	ValidatorInterface validatorService = new ValidatorService();
	
	MarketingInterface mkService = null;
	ValidatorInterface validatorService = null;
	
	public Product(MarketingInterface mkService, ValidatorInterface validatorService) {
		if(mkService == null) {
			throw new NullPointerException();
		}
		if(validatorService == null) {
			throw new NullPointerException();
		}
		this.mkService = mkService;
		this.validatorService = validatorService;
	}

	public static float getPriceWithDiscount(float initialPrice, float discountValue) {
		return initialPrice - (discountValue * initialPrice);
	}
	
	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears) throws InvalidPriceException, InvalidAccountAgeException{
		
		validatorService.validatePrice(initialPrice);
		validatorService.validateAccountAge(accountAgeInYears);
		
	    float fidelityDiscount = (productType == ProductType.NEW) ? 0 : mkService.getFidelityDiscount(accountAgeInYears);
	    float discountValue = productType.getDiscount();
		float priceWithDiscount = getPriceWithDiscount(initialPrice, discountValue);
		float finalPrice = priceWithDiscount*(1-fidelityDiscount);
	    
		return finalPrice;
	}
}