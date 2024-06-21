package dordunKatları;
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		int sayi;
		Scanner input=new Scanner(System.in);

		int toplam=0;
		do {
			System.out.print("Bir sayı giriniz: ");
			sayi=input.nextInt();
			if(sayi%4==0)
			{
				toplam+=sayi;
			}
				
			
			System.out.println(toplam);
			
		}while(sayi%2==0);
		System.out.println("4'ün katı olan sayıların toplamı: " + toplam);
	}

}
