package com.studytrails.tutorials.springautowireannotationjsr330;

import javax.inject.Inject;

public class ATM {

	private Printer printer;

	public Printer getPrinter() {
		return printer;
	}
	@Inject
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void printBalanceInformation(String accountNumber) {
		getPrinter().printBalanceInformation(accountNumber);

	}

}
