package com.studytrails.tutorials.springautowireconstructor;

public class ATM {

	private Printer printer;

	
	public ATM(Printer printer) {
		super();
		this.printer = printer;
	}
	
	public Printer getPrinter() {
		return printer;
	}
	
	public void printBalanceInformation(String accountNumber) {
		getPrinter().printBalanceInformation(accountNumber);

	}

}
