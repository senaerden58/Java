package kullanicidanVeriAlma;
import java.util.Scanner; //kullanicidan veri alailmek için bu zorunlu.

public class Kullanici {
	public static void main(String[] args) {
		String a;
		Scanner input=new Scanner(System.in); //scanner sınıfından nesne ürettik
		System.out.print("isminizi giriniz:  ");
		a=input.nextLine();

		System.out.print("isminiz:");
		System.out.print(a);

	}
}
