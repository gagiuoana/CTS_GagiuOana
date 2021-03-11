package ro.ase.csie.cts.g1093.laboratory3;

import ro.ase.csie.g1093.laboratory3.exception.InvalidAccountAgeException;
import ro.ase.csie.g1093.laboratory3.exception.InvalidPriceException;

public class TestProduct {
public static void main (String[]args )
{
	Product product= new Product();
	try {
		product.getFinalPrice(ProductType.NEW, 0, 0);
	} catch (InvalidAccountAgeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvalidPriceException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
