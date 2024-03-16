package calculator;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args)
	{
		int n1,n2;
		int operation;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("First number: ");
		n1=input.nextInt();
		
		System.out.print("Second number: ");
		n2=input.nextInt();
		
		System.out.print("1-Addition\n2-Substraction\n3-Multiplication\n4-Division\n");
		System.out.println("Enter the operation number.");
		operation=input.nextInt();
	
		switch(operation)
		{
			case 1:
				int addition=n1+n2;
				System.out.print(addition);
				break;
			case 2:
				int substration=n1-n2;
				System.out.print(substration);
				break;
			case 3:
				int multiplication=n1*n2;
				System.out.print(multiplication);
				break;
			case 4:
				int division=n1/n2;
				System.out.print(division);
				break;
		}
		
		
		
	}
}
