package day10;

public class Account {
	
	private int acc_no;
	private String name;
	private double amount;     //encapsulation variables must be private
	
	
	public int getAcc_no() {    //for every variable must have getter and setter
		return acc_no;
	}
	public void setAcc_no(int acc_no) {  //operated through only getter setter
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
}
