package cts.Gagiu.Oana.g1093.pattern.factory;

import cts.Gagiu.Oana.g1063.BankAccount;

public class BankFactory {
	
	
	public static BankAccount createAccount(CardType type, double balance, String id) {
		BankAccount account = null;
		switch (type) {
		case CREDIT_CARD: 
			//account = new CreditCard(noOfInstallments, creditLimit, details);
			break;
		case DEBIT_CARD:
			//account = new DebitCard(SalaryIsCollected, overdraft, details);
		 
		case  JUNIOR_CARD:
		//account = new JuniorCard(details);
			break;
		
		default:
			throw new UnsupportedOperationException();
		}
		
		return account;
	}
}
