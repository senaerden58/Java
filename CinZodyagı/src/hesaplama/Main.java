package hesaplama;
import java.util.Scanner;
/*4000 bin yıldır kullanılan bir astroloji çeşididir
 *  Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. 
 *  Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır 
 *  ve yıldızlarla pek bir ilgisi yoktur.
 */
public class Main {
	public static void main(String args[])
	{
		//Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
		Scanner input=new Scanner(System.in);
		System.out.print("Dogum yilinizi giriniz: ");
		int dogumYili=input.nextInt();
		
		if(dogumYili>0)
		{
			int sonuc=dogumYili%12;
			if(sonuc==0)
			{
				System.out.println("Maymun");
			}
			else if(sonuc==1)
			{
				System.out.println("Horoz");

			}
			else if(sonuc==2)
			{
				System.out.println("Kopek");

			}
			else if(sonuc==3)
			{
				System.out.println("Domuz");

			}
			else if(sonuc==4)
			{
				System.out.println("Fare");

			}
			else if(sonuc==5)
			{
				System.out.println("Okuz");

			}
			else if(sonuc==6)
			{
				System.out.println("Kaplan");

			}
			else if(sonuc==7)
			{
				System.out.println("Tavsan");

			}
			else if(sonuc==8)
			{
				System.out.println("Ejderha");

			}
			else if(sonuc==9)
			{
				System.out.println("Yilan");

			}
			else if(sonuc==10)
			{
				System.out.println("At");

			}
			else if(sonuc==11)
			{
				System.out.println("Koyun");

			}
			
		}
		else {
			System.out.println("Hatali veri.");
		}
		
		
		
		
		
	}

}
