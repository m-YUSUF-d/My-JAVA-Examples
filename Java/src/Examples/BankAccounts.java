package Examples;

import java.util.ArrayList;
import java.util.Collections;

class MainBankAccount {
	private String accountNo;
	String accountOwner;
	double balance;
	String moneyUnit;

	public MainBankAccount(String accountNo, String accountOwner, double balance, String moneyUnit) {
		this.accountNo = accountNo;
		this.accountOwner = accountOwner;
		this.balance = balance;
		this.moneyUnit = moneyUnit;

	}

	public void LoadMoney(double money) {
		balance += money;
		System.out.println(money + " loaded. New balance : " + balance);
	}

	public void WithdrawMoney(double money) {
		if (money < balance) {
			balance -= money;
			System.out.println(money + " sold. New balance : " + balance);
		} else
			System.out.println("Your balance is " + balance + ". Plesae enter right amount.");

	}

	public double BalanceInquiry() {
		return balance;
	}

	public void PrintAccountInfos() {
		System.out.println("AccountNO : " + accountNo + "\nOwner : " + accountOwner + "\nBalance : " + balance
				+ "\nMoneyUnit : " + moneyUnit);
	}
}

class DepositAccount extends MainBankAccount {
	double dailyInterestRate;
	int depositDay;

	public DepositAccount(String accountNo, String accountOwner, double balance, String moneyUnit,
			double dailyInterestRate, int depositday) {
		super(accountNo, accountOwner, balance, moneyUnit);
		this.dailyInterestRate = dailyInterestRate;
		this.depositDay = depositday;
	}

	public void AddInterest() {
		balance += balance * dailyInterestRate * depositDay;
	}

	public double BalanceInquiry() {
		return balance;
	}
}

class GoldAccount extends MainBankAccount {
	double gramPrice;

	public GoldAccount(String accountNo, String accountOwner, double balance, String moneyUnit, double gramPrice) {
		super(accountNo, accountOwner, balance, moneyUnit);
		this.gramPrice = gramPrice;
	}

	public void BuyGold(double money) {
		balance += money * gramPrice;
		System.out.println(money + " gold convert to " + money * gramPrice + " and loaded. New balance : " + balance);
	}

	public void SellGold(double money) {
		if (money * 2000 < balance) {
			balance -= money * gramPrice;
			System.out.println(money + " gold converted " + money * gramPrice + " and sold. New balance : " + balance);
		} else
			System.out.println("Your balance is " + balance + ". Plesae enter right amount.");
	}

}

class EuroAccount extends MainBankAccount {
	double exchangeRate;

	public EuroAccount(String accountNo, String accountOwner, double balance, String moneyUnit, double exchangeRate) {
		super(accountNo, accountOwner, balance, moneyUnit);
		this.exchangeRate = exchangeRate;
	}

	public void BuyEuro(double money) {
		balance += money * exchangeRate;
		System.out
				.println(money + " EUR converted to " + money * exchangeRate + " and loaded. New balance : " + balance);
	}

	public void SellEuro(double money) {
		if (money < balance) {
			balance -= money;
			System.out.println(
					money + " EUR converted to " + money * exchangeRate + " and sold. New balance : " + balance);
		} else
			System.out.println("Your balance is " + balance + ". Plesae enter right amount.");

	}

}

public class BankAccounts {

	public static void main(String[] args) {
		ArrayList<MainBankAccount> bankAccounts = new ArrayList<>();
		bankAccounts.add(new MainBankAccount("12345", "Yusuf", 10000, "TL"));
		bankAccounts.add(new DepositAccount("54321", "Ahmet", 5000, "TL", 0.5, 10));
		bankAccounts.add(new GoldAccount("15234", "Mehmet", 4000, "TL", 2000));
		bankAccounts.add(new EuroAccount("44556", "Ali", 2000, "TL", 30.5));

		
		// main
		System.out.println("Main*********************************");
		bankAccounts.get(0).LoadMoney(1500);
		System.out.println(bankAccounts.get(0).BalanceInquiry());
		bankAccounts.get(0).PrintAccountInfos();
		System.out.println("*************************************");

		
		// deposit
		System.out.println("\nDeposit******************************");
		((DepositAccount) bankAccounts.get(1)).AddInterest();
		bankAccounts.get(1).BalanceInquiry();
		bankAccounts.get(1).PrintAccountInfos();
		System.out.println("*************************************");

		
		// gold
		System.out.println("\nGold*********************************");
		((GoldAccount) bankAccounts.get(2)).BuyGold(3);
		((GoldAccount) bankAccounts.get(2)).SellGold(1);
		bankAccounts.get(2).PrintAccountInfos();
		System.out.println("*************************************");

		
		// euro
		System.out.println("\nEuro*********************************");
		((EuroAccount) bankAccounts.get(3)).BuyEuro(2500);
		((EuroAccount) bankAccounts.get(3)).SellEuro(1500);
		bankAccounts.get(3).PrintAccountInfos();
		System.out.println("*************************************");
	}
}
