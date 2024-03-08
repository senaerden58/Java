package TaximeterCalculation;
import java.util.Scanner;

public class TaximeterCalculation {
	public static void main(String[] args)
	{
		int km;
		double perKm=2.20;
		int startPrice=10;
		double total=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the distance in kilometres.");
		km=input.nextInt();
		
		total=(km+perKm);
		total+=startPrice;
		
		total=(total<20)? 20:total;
		
		System.out.println("Total: "+ total);
		
		
		
		
	}
}
