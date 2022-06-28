package day10;

public class AccountMain {

	public static void main(String[] args) {

		Account acc=new Account();
		   
		acc.setAcc_no(101010);                   //operated through only getter setter
		acc.setName("john");
		acc.setAmount(50000);
		
		System.out.println(acc.getAcc_no());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
		
	}

}
