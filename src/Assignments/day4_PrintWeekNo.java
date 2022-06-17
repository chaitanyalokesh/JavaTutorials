package Assignments;

public class day4_PrintWeekNo {

	public static void main(String[] args) {

		String weekname="friday";
		
		switch(weekname)
		{
		case "sunday":System.out.println("Weekno is 1"); break;
		case "monday":System.out.println("Weekno is 2"); break;
		case "tuesday":System.out.println("Weekno is 3"); break;
		case "wenesday":System.out.println("Weekno is 4"); break;
		case "thrusday":System.out.println("Weekno is 5"); break;
		case "friday":System.out.println("Weekno is 6"); break;
		case "saturday":System.out.println("Weekno is 7"); break;
		default:System.out.println("Invalid week name");

		}
	}
}
