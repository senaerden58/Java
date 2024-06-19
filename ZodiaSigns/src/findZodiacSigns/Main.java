package findZodiacSigns;
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		String month;
		String zodiaSign;
		int day;
		
		Scanner input1=new Scanner(System.in);
		System.out.println("Enter the your birth day: ");
		day=input1.nextInt();
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the your birth month: ");
		month=input.next();
		
		switch(month)
		{
			case "January":
				if(day>=1 && day<=31)
				{
					if(day<22)
					{
						zodiaSign="Goat";
					}
					else {
						zodiaSign="Aquarius";
					}
					System.out.println(zodiaSign);
				}
				else
				{
					System.out.println("Not find");
				}
				break;
			case "February":
				if(day>=1 && day<=31)
				{
					if(day<22)
					{
						zodiaSign="Aquarius";
					}
					else {
						zodiaSign="Fish";
					}
					System.out.println(zodiaSign);
				}
				else
				{
					System.out.println("Not find");
				}
				break;
			case "March":
				if(day>=1 && day<=31)
				{
					if(day<22)
					{
						zodiaSign="Fish";
					}
					else {
						zodiaSign="Aries";
					}
					System.out.println(zodiaSign);
				}
				else
				{
					System.out.println("Not find");
				}
				break;
			case "April":
				if(day>=1 && day<=31)
				{
					if(day<22)
					{
						zodiaSign="Aries";
					}
					else {
						zodiaSign="Taurus";
					}
					System.out.println(zodiaSign);
				}
				else
				{
					System.out.println("Not find");
				}
				break;
			case "May":
				if(day>=1 && day<=31)
				{
					if(day<22)
					{
						zodiaSign="Taurus";
					}
					else {
						zodiaSign="Gemini";
					}
					System.out.println(zodiaSign);
				}
				else
				{
					System.out.println("Not find");
				}
				break;
			case "June":
				if(day>=1 && day<=31)
				{
					if(day<22)
					{
						zodiaSign="Gemini";
					}
					else {
						zodiaSign="Cancer";
					}
					System.out.println(zodiaSign);
				}
				else
				{
					System.out.println("Not find");
				}
				break;
			case "July":
				if(day>=1 && day<=31)
				{
					if(day<22)
					{
						zodiaSign="Cancer";
					}
					else {
						zodiaSign="Leo";
					}
					System.out.println(zodiaSign);
				}
				else
				{
					System.out.println("Not find");
				}
				break;
			case "August":
				if(day>=1 && day<=31)
				{
					if(day<22)
					{
						zodiaSign="Leo";
					}
					else {
						zodiaSign="Virgo";
					}
					System.out.println(zodiaSign);
				}
				else
				{
					System.out.println("Not find");
				}
				break;
			case "September":
				if(day>=1 && day<=31)
				{
					if(day<22)
					{
						zodiaSign="Virgo";
					}
					else {
						zodiaSign="Libra";
					}
					System.out.println(zodiaSign);
				}
				else
				{
					System.out.println("Not find");
				}
				break;
			case "October":
				if(day>=1 && day<=31)
				{
					if(day<22)
					{
						zodiaSign="Libra";
					}
					else {
						zodiaSign="Scorpius";
					}
					System.out.println(zodiaSign);
				}
				else
				{
					System.out.println("Not find");
				}
				break;
			case "November":
				if(day>=1 && day<=31)
				{
					if(day<22)
					{
						zodiaSign="Scorpius";
					}
					else {
						zodiaSign="Sagittarius";
					}
					System.out.println(zodiaSign);
				}
				else
				{
					System.out.println("Not find");
				}
				break;
			case "December":
				if(day>=1 && day<=31)
				{
					if(day<22)
					{
						zodiaSign="Sagittarius";
					}
					else {
						zodiaSign="Capricornus ";
					}
					System.out.println(zodiaSign);
				}
				else
				{
					System.out.println("Not find");
				}
				break;
		}

		
	}
}
