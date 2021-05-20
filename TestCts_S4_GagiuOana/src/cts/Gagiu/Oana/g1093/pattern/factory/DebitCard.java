package cts.Gagiu.Oana.g1093.pattern.factory;

public class DebitCard {


	String details;
	boolean SalaryIsCollected;
	double overdraft;
	
	
	public DebitCard(String details, boolean salaryIsCollected, double overdraft) {
		super();
		this.details = details;
		SalaryIsCollected = salaryIsCollected;
		this.overdraft = overdraft;
	}
}
