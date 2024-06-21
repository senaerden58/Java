package artikYilHesaplama;
import java.util.Scanner;
/*Artık Yıl Nedir?
Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl. 
Bu fazladan gün (artık gün), normalde 28 gün olan şubat 
ayına 29 Şubat’ın eklenmesi ile elde edilir.
*/

public class Main {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Yil giriniz: ");
		int yil=input.nextInt();
		
		if(yil>=0 && yil%4==0)
		{
			System.out.print(yil);
			System.out.println(" bir artik yildir.");
		}
		else {
			System.out.print(yil);
			System.out.println(" bir artik yil degildir.");
		}
		
		
		
		
	}

}
