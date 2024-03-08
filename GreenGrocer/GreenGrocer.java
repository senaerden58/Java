package GreenGrocer;
import java.util.Scanner;
public class GreenGrocer {
	public static void main(String[] args)
	{
		double pear=2.14;
		double apple=3.67;
		double tomato=1.11;
		double banana=0.95;
		double aubergine=5.0;
		double total=0;
		
		Scanner input=new Scanner(System.in);
		
		double pearKg;
		double appleKg;
		double tomatoKg;
		double bananaKg;
		double aubergineKg;
		
	
		System.out.println("How many kilos of pears do you want?");
		pearKg=input.nextDouble();
		
		
		System.out.println("How many kilos of apples do you want?");
		appleKg=input.nextDouble();
		
		System.out.println("How many kilos of tomatoes do you want?");
		tomatoKg=input.nextDouble();
		
		System.out.println("How many kilos of bananas do you want?");
		bananaKg=input.nextDouble();
		
		System.out.println("How many kilos of aubergine do you want?");
		aubergineKg=input.nextDouble();
		
		total=(apple*appleKg)+(pear*pearKg)+(tomato*tomatoKg)+(banana*bananaKg)+(aubergine*aubergineKg);
		System.out.println("Total:" +total);
		
		
		
	}

}
