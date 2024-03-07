package Pisagor;
import java.util.Scanner;

public class Pisagor {
	public static void main(String[] args)
	{
		int a,b;
		double c;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the 1st edge: ");
		a=input.nextInt();
		System.out.print("Enter the 2nd edge: ");
		b=input.nextInt();
		
		c=Math.sqrt((a*a)+(b*b));
		
		System.out.print("3rd edge: " + c);
		System.out.println("End");
		
	}
}
