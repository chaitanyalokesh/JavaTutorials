package day5;

public class JumpingStatements {

	public static void main(String[] args) {

	System.out.println("----Break------");

		for(int i=1; i<=5;i++)
		{
			if(i==3)
			{
			break;    //from 3 nothing printed
			}
			System.out.println(i);
		}
		
	System.out.println("----Continue------");
		
	for(int a=1; a<=5;a++)
		{
			if(a==3)
			{
			continue;    //except 3 all will be printed
			}
			System.out.println(a);
		}
	
	System.out.println("----skip and continue------");
	
	for(int b=1; b<=10;b++)
		{
			if(b==3 || b==5 || b==7)
			{
			continue;    //skip 3, 5, 7 will be skipped and then continue
			}
			System.out.println(b);
		}
	
	}

}
