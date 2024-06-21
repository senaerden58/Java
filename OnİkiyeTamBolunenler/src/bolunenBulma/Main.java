package bolunenBulma;
import java.util.Scanner;

public class Main {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		int sayi=input.nextInt();
		int toplam=0;
		int adet=0;
		for(int i=1;i<sayi;i++)
		{
			if(sayi%12==0)
			{
				toplam+=i;
				adet++;
			}
		}
		float ort=toplam/adet;
		System.out.println(ort);
	}

}
