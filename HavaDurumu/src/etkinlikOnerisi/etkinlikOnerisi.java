package etkinlikOnerisi;
import java.util.Scanner;

public class etkinlikOnerisi {
		public static void main(String args[]) {
			float sicaklik;
			Scanner input=new Scanner(System.in);
			
			System.out.println("Sicakligi giriniz: ");
			sicaklik=input.nextFloat();
			
			
			if(sicaklik<5)
			{
				System.out.println("Kayak.");
			}
			else if(sicaklik>=5 || sicaklik<=15) {
				System.out.println("Sinema.");
			}
			else if(sicaklik>15 || sicaklik<=25) {
				System.out.println("Piknik.");
			}
			else if(sicaklik>25 ) {
				System.out.println("Yuzme.");
			}
			
		}
}
			
		
