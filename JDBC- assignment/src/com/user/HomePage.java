package com.user;

import java.util.Scanner;

import com.bean.Account;
import com.bean.Loan;
import com.dao.Dao;
import com.service.Service;

public class HomePage {
	public static void main(String[] args) {
		String name, id, address, loan_id, loan_type;
		double deposit, withdraw, loan_amount;
		
		Dao dao = new Dao();
		Service vd = new Service();

		while (true) {
			System.out.println("1. Open Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Apply Loan");
			System.out.println("5. Show Account Details");
			System.out.println("6. Pay Loan");
			System.out.println("7. Show Loan Details");
			System.out.println("8. Exit");

			Scanner scanner = new Scanner(System.in);
			System.out.println("enter option");
			int option = scanner.nextInt();

			switch (option) {

			case 1: {
				while (true) {
					System.out.println("Enter your name (First letter Capital)");
					name = scanner.next();
					if (vd.nameValidation(name)) {
						System.out.println("Enter account Id (eg. 1234567-ABCD");
						id = scanner.next();
						if (vd.idValidation(id)) {
							System.out.println("Enter address");
							address = scanner.next();
							System.out.println("Enter deposit");
							deposit = scanner.nextDouble();
							Account acc = new Account(id, name, address, deposit);
							dao.createAccount(acc);
							break;
						} else {
							System.out.println("Please enter valid Id");
						}
					} else
						System.out.println("Please enter valid name ");
				}
				break;
			}
			case 2: {
				System.out.println("Enter account Id and amount");
				id = scanner.next();
				deposit = scanner.nextDouble();
				System.out.println("New balance after deposit is: "+ dao.deposit(id, deposit));
				break;
			}

			case 3: {
				System.out.println("Enter account Id and amount");
				id = scanner.next();
				withdraw = scanner.nextDouble();
				System.out.println("New balance after withdrawl is: " +dao.withdraw(id, withdraw));
				break;
			}
			case 4: {
				System.out.println("Enter account Id");
				id = scanner.next();
				System.out.println("Enter Loan Id");
				loan_id = scanner.next();
				if (id.equals(loan_id)) {
					System.out.println("Select Loan Type :");
					loan_type = scanner.next();
					System.out.println("Enter loan amount");
					loan_amount = scanner.nextDouble();
					Loan loan = new Loan(loan_id, loan_type, loan_amount);
					dao.applyLoan(loan);
					break;
				} else
					System.out.println("Check your Loan Id");
				break;
			}

			case 5: {
				System.out.println("Enter account Id");
				id = scanner.next();
				Account b = dao.getAccountDetails(id);
				System.out.println("Your account details are: ");
				System.out.println(b);
				break;

			}

			case 6: {
				System.out.println("Enter account Id");
				id = scanner.next();
				System.out.println("Enter Loan Id");
				loan_id = scanner.next();
				if (id.equals(loan_id)) {
					System.out.println("Enter amount to pay");
					loan_amount = scanner.nextDouble();
					System.out.println("New Balance after paying loan is : " + dao.payLoan(loan_id, loan_amount));
					break;
				}
			}
			case 7:

			{
				System.out.println("Enter loan Id");
				loan_id = scanner.next();
				Loan l = dao.getLoanDetails(loan_id);
				System.out.println("Loan Details are: ");
				System.out.println(l);
				break;

			}
			
			case 8: 
			{
				System.exit(0);
			}
			
			default:
				System.out.println("Please enter correct choice");
			}
		}
	}
}
