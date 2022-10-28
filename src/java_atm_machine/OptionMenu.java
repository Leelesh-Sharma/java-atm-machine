package java_atm_machine;

import java.io.*;
import java.util.*;
import java.text.*;

public class OptionMenu extends Account{
	Scanner sc = new Scanner(System.in);
	
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 	// userName & pin <- mapping
	
	public void getLogin() throws IOException{										// verify login info
		boolean flag = true;
		
		while(flag){
			try {
				map.put(696969, 0420);
				map.put(999999, 0000);
				
				System.out.println("ATM by leelesharma");
				System.out.println("Enter Customer Number: ");
				setCustomerNumber(sc.nextInt());
				
				System.out.println("Enter Pin: ");
				setPinNumber(sc.nextInt());
			}catch(Exception e) {
				System.out.println("Invalid Character(s).");
				flag = false;
			}
			
			int cn = getCustomerNumber();
			int pn = getPinNumber();
			if(map.containsKey(cn) && map.get(cn) == pn) {
				getAccountType();
			}
			else {
				System.out.println("Wrong Customer Id or Pin Number.");
			}
		}
	}
	
	public void getAccountType(){													// chechkingAcc, savingAcc, exit
		System.out.println("Select the Account you want to access: ");
		System.out.println("Type 1: Checking Account.");
		System.out.println("Type 2: Saving Account.");
		System.out.println("Type 3: Exit.");
		System.out.println("Choice: ");
		
		int selection = sc.nextInt();
		
		switch(selection) {
		
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Sayonara.");
			break;
		
		default:
			System.out.println("Invalid.");
		}
	}
	
	public void getChecking(){														// withdraw, deposit, viewBalance, exit
		System.out.println("Checking Account");
		System.out.println("Type 1: to view balance");
		System.out.println("Type 2: Withdraw");
		System.out.println("Type 3: Deposit");
		System.out.println("Type 4: Exit.");
		System.out.println("Choice: ");
		
		int selection = sc.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Your Checking Account Balance: "+getCheckingBalance());
			break;
		
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Sayonara.");
			break;
		
		default:
			System.out.println("Invalid.");
		}
	}
	
	public void getSaving(){														// withdraw, deposit, viewBalacne, exit
		System.out.println("Saving Account");
		System.out.println("Type 1: to view balance");
		System.out.println("Type 2: Withdraw");
		System.out.println("Type 3: Deposit");
		System.out.println("Type 4: Exit.");
		System.out.println("Choice: ");
		
		int selection = sc.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Your Saving Account Balance: "+getSavingBalance());
			break;
			
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Sayonara.");
			break;
			
		default:
			System.out.println("Invalid.");
		}
	}
}
