package fiyatHesaplama;
import java.util.Scanner;
public class Main {
	public static void main(String args[])
	{
		Scanner input1=new Scanner(System.in);
		System.out.print("Mesafeyi km cinsinden giriniz: ");
		int mesafe=input1.nextInt();
		float normalTutar=mesafe * 0.10f;
		if(mesafe>=0)
		{
			System.out.println();
			
			Scanner input=new Scanner(System.in);
			System.out.print("Yasinizi giriniz: ");
			int yas=input.nextInt();
			float yasIndirimi=0;
			if(yas<12 && yas>0)
			{
				yasIndirimi = normalTutar *0.50f; 
			}
			else if(yas>=12 && yas<=24)
			{
				yasIndirimi=normalTutar *0.10f;
			}
			else if(yas>65)
			{
				yasIndirimi=normalTutar *0.30f;
			}
			else if(yas<0)
			{
				System.out.println("Hatali veri girdiniz.");
			}
			float indirimliTutar=normalTutar - yasIndirimi;
			float gidisDonusBiletIndirimi=0;
			float toplamTutar=0;
			System.out.print("Yolculuk tipini giriniz. (1=>Tek Yon ,2=>Gidis Yonu): ");
			Scanner input3=new Scanner(System.in);
			int yolculukTipi=input3.nextInt();
			
			if(yolculukTipi==1)
			{
				toplamTutar=indirimliTutar;
			}
			else if(yolculukTipi==2)
			{
				gidisDonusBiletIndirimi = indirimliTutar * 0.20f; 
				toplamTutar=(indirimliTutar-gidisDonusBiletIndirimi)*2;
			}
			else {
				System.out.println("Hatali veri girdiniz.");
			}
			
			
			System.out.println(toplamTutar);

		}
		else {
			System.out.println("Hatali Veri Girdiniz!");
		}
		
		
		
	}

}
