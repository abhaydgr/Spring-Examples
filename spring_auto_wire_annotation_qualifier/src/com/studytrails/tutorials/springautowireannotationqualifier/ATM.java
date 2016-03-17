package com.studytrails.tutorials.springautowireannotationqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ATM {

	private Printer printer;

	public Printer getPrinter() {
		return printer;
	}
	@Autowired
	@Qualifier("printer")
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void printBalanceInformation(String accountNumber) {
		getPrinter().printBalanceInformation(accountNumber);

	}

}
