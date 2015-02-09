package jp.miyabilink;

public class List14_1 {
	String owner;	//口座名義人
	int balance;	//口座残高
	public Account(String owner, int balance){
		this.owner = owner;
		this.balance = balance;
	}
	public void transfer(Account dest, int amount){
		dest.balance += amount;
		balance -= amount;
	}
}