package com.studytrails.tutorials.springautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class ATM {

	private Printer printer;

	public Printer getPrinter() {
		return printer;
	}
	@Autowired
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void printBalanceInformation(String accountNumber) {
		getPrinter().printBalanceInformation(accountNumber);

	}

}
