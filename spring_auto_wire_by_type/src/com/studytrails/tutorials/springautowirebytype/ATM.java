package com.studytrails.tutorials.springautowirebytype;

public class ATM {

	private Printer printer;

	public Printer getPrinter() {
		return printer;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public void printBalanceInformation(String accountNumber) {
		getPrinter().printBalanceInformation(accountNumber);

	}

}
