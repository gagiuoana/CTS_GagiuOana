package ro.ase.csie.cts.g1093.laboratory3.stage3.test;

import ro.ase.csie.cts.g1093.laboratory3.stage3.Product;
import ro.ase.csie.cts.g1093.laboratory3.stage3.ProductType;
import ro.ase.csie.g1093.laboratory3.exception.InvalidAccountAgeException;
import ro.ase.csie.g1093.laboratory3.exception.InvalidPriceException;

public class TestProduct {
	public static void main (String[] args) {
		
		
		Product product = new Product(null, null);
		float finalPrice = 0;
		
		
		try {
			finalPrice = product.getFinalPrice(ProductType.DISCOUNT, 100, 12);
		} catch (InvalidPriceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAccountAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The final price is "+ finalPrice);
	}
}
