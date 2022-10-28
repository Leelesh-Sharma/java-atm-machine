package java_atm_machine;

import java.util.*;
import java.text.*;

public class Account {
	
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	public double calcCheckingWithdraw(double amt) {
		checkingBalance = (checkingBalance - amt);
		return checkingBalance;
	}
	
	public double calcSavingWithdraw(double amt) {
		savingBalance = (savingBalance - amt);
		return savingBalance;
	}
	
	public double calcSavingDeposit(double amt) {
		savingBalance = (savingBalance + amt);
		return savingBalance;
	}
	
	public double calcCheckingDeposit(double amt) {
		checkingBalance = (checkingBalance + amt);
		return checkingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: "+checkingBalance);
		System.out.println("Amout to be Withdrawed: ");
		double amt = sc.nextDouble();
		
		if((checkingBalance - amt) >= 0) {
			calcCheckingWithdraw(amt);
			System.out.println("New Checking Account Balance: "+checkingBalance);
		}else {
			System.out.println("Not Sufficient Funds.");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: "+savingBalance);
		System.out.println("Amout to be Withdrawed: ");
		double amt = sc.nextDouble();
		
		if((savingBalance - amt) >= 0) {
			calcSavingWithdraw(amt);
			System.out.println("New Saving Account Balance: "+savingBalance);
		}else {
			System.out.println("Not Sufficient Funds.");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: "+checkingBalance);
		System.out.println("Amount to be Deposited: ");
		double amt = sc.nextDouble();
		
		if((checkingBalance + amt) >= 0) {
			calcCheckingDeposit(amt);
			System.out.println("New Checking Account Balance: "+ checkingBalance);
		}else {
			System.out.println("Resulting amount can't be negative.");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: "+savingBalance);
		System.out.println("Amount to be Deposited: ");
		double amt = sc.nextDouble();
		
		if((savingBalance + amt) >= 0) {
			calcCheckingDeposit(amt);
			System.out.println("New Saving Account Balance: "+ savingBalance);
		}else {
			System.out.println("Resulting amount can't be negative.");
		}
	}
}

