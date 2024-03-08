package CalculateBodyMassIndex;
import java.util.Scanner;
public class CalculateBodyMassIndex {
	public static void main(String[] args)
	{
		float kg;
		double m;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Please enter your height (in metres): ");
		kg=input.nextFloat();
		
		System.out.print("Please enter your weight: ");
		m=input.nextDouble();
		
		double bodyMassIndex=kg/(m*m);
		
		System.out.print("Your Body Mass Index: "+bodyMassIndex);
		
		
	}

}
