package sayiSirala;
import java.util.Scanner;

public class sayiSirala {
	public static void main(String args[])
	{
		int a,b,c;
		Scanner input=new Scanner(System.in); 
		System.out.println("Birinci sayiyi giriniz: ");
		a=input.nextInt();
		System.out.println("Ikinci sayiyi giriniz: ");
		b=input.nextInt();
		System.out.println("Ucuncu sayiyi giriniz: ");
		c=input.nextInt();
		
		
		if (a < b) {
			if(b<c)
			{
		    System.out.print("Kucukten buyuge siralama: a: " + a + ", b: " + b + ", c: " + c);
			}
			else if(b>c)
			{
				if(a<c)
				{
				    System.out.print("Kucukten buyuge siralama: a: " + a + ", c: " + c + ", b: " + b);
				}
				else {
				    System.out.print("Kucukten buyuge siralama: c: " + c + ", a: " + a + ", b: " + b);
				}
			}
		}
		else if (a > b) {
			if(a<c)
			{
		    System.out.print("Kucukten buyuge siralama: b: " + b + ", a: " + a + ", c: " + c);
			}
			else if(a>c)
			{
				if(b<c)
				{
				    System.out.print("Kucukten buyuge siralama: b: " + b + ", c: " + c + ", a: " + a);
				}
				else {
				    System.out.print("Kucukten buyuge siralama: c: " + c + ", b: " + b + ", a: " + a);
				}
			}
		}
		

		
	}

}
