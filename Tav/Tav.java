package Tav;
import java.util.Scanner;
public class Tav {
	public static void main(String[] args)
	{
		double money,tav;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your amount of money: ");
		money=input.nextDouble();
		
		double newAmount;
		
		if (money>=0 && money <= 1000) {
			tav=18;
			newAmount=money+(money*(tav/100));
			System.out.print(newAmount);
        }
        else if (money>1000) { 
        	tav=8;
        	newAmount=money+(money*(tav/100));
			System.out.print(newAmount);
        }
        else {
            System.out.println("Enter a value within the specified limits.");
        }
	}
}

