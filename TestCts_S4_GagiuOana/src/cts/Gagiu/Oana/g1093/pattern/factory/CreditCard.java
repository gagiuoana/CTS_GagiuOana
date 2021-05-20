package cts.Gagiu.Oana.g1093.pattern.factory;

public class CreditCard  {

	
	
	int noOfInstallments;
	double CreditLimit;
	String details;
	
	
	public CreditCard(int noOfInstallments, double creditLimit, String details) {
		super();
		this.noOfInstallments = noOfInstallments;
		CreditLimit = creditLimit;
		this.details = details;
	}
}

