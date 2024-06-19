package kosullar;
import java.util.Scanner;

public class SinifGecmeDurumu {
	public static void main(String args[]) {
		int matematik, fizik, turkce, kimya, muzik;
		Scanner input=new Scanner(System.in);
		
		System.out.println("Mat notunuz: ");
		matematik=input.nextInt();
		
		System.out.println("Fizik notunuz: ");
		fizik=input.nextInt();
		
		System.out.println("Turkce notunuz: ");
		turkce=input.nextInt();
		
		System.out.println("Kimya notunuz: ");
		kimya=input.nextInt();
		
		System.out.println("Muzik notunuz: ");
		muzik=input.nextInt();
		
		double average=(matematik+ fizik+ turkce+ kimya+ muzik)/5;
		if(average<=50)
		{
			System.out.println("Kaldi.");
		}
		else {
			System.out.println("Gecti.");
		}
		
	}


}
