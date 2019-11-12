package entities;

public class Conta {
	
	private int number;
	private String name;
	private double balance;
	private double transactionTax = 5;
	
	public Conta(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		deposit(balance);
	}
	public Conta(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public double getTransactionTax() {
		return transactionTax;
	}
	public void setTransactionTax(double transactionTax) {
		this.transactionTax = transactionTax;
	}
	public double getBalance() {
		return balance;
	}
	public int getNumber() {
		return number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	public void withdraw(double amount) {
		balance -= amount + transactionTax;
		

	}
	public void transfer(Conta destino, double amount) {
		destino.deposit(amount);
		this.withdraw(amount - transactionTax);
		
	}
	
	
	
	

}
