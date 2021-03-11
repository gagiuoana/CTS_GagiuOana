package ro.ase.csie.cts.g1093.laboratory3;

import ro.ase.csie.g1093.laboratory3.exception.InvalidAccountAgeException;
import ro.ase.csie.g1093.laboratory3.exception.InvalidPriceException;

public class Product {
	
	public final static int MAX_ACCOUNT_AGE = 10; 
	public final static float MAX_FIDELITY_DISCOUNT = 0.15f;
	
	
	
	public float getFinalPrice(ProductType productType, float initialPrice, int accountAgeInYears) throws InvalidAccountAgeException, InvalidPriceException {

		if (initialPrice <= 0)
		{
			throw new InvalidPriceException();
		}
		
		if(accountAgeInYears < 0)
		{
			throw new InvalidAccountAgeException();
		}
		
		float finalPrice = 0;
		float fidelityDiscount = (accountAgeInYears > MAX_ACCOUNT_AGE) ? MAX_FIDELITY_DISCOUNT : (float) accountAgeInYears / 100;
		
		float discountValue = 0;
		
		switch(productType) {
		
		case NEW:
			finalPrice=initialPrice;
			break;
		case DISCOUNT:
			discountValue= ProductType.DISCOUNT.getDiscount();
			finalPrice = (initialPrice - (0.1f * initialPrice))
					- fidelityDiscount * (initialPrice - (0.1f * initialPrice));
		break;
		
		case LIMITED_STOCK:
			discountValue= ProductType.LIMITED_STOCK.getDiscount();
			finalPrice = (initialPrice - (0.25f * initialPrice))
					- fidelityDiscount * (initialPrice - (0.25f * initialPrice));
			break;
			
		case LEGACY:
			discountValue= ProductType.LEGACY.getDiscount();
			finalPrice = (initialPrice - (0.35f * initialPrice))
					- fidelityDiscount * (initialPrice - (0.35f * initialPrice));
			
			break;
			default: 
				throw new UnsupportedOperationException("New enum symbol not processed");
				
			
		}
		
		{
			return finalPrice;
		}
		
		
		
	}
}