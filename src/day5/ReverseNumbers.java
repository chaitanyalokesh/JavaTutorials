package day5;

public class ReverseNumbers {

	public static void main(String[] args) {
		
		

		int num=121;
		int org_num=num;
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;    // % will extract, / will eliminate last no; 1%10=1; 1/10=0;
			num=num/10;
		}
		System.out.println("Reverse No is:"+rev);
		
		if(org_num==rev)
		{
			System.out.println("number is palindrome");
		}
		
	}

}
