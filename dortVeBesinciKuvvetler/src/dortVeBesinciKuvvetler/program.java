package dortVeBesinciKuvvetler;
import java.util.Scanner;

public class program {
    public static void main(String args[]) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi girin: ");
        sayi = input.nextInt();
        int dorduncu = (int) Math.pow(sayi, 4);
        int besinci = (int) Math.pow(sayi, 5);
        System.out.println("Dorduncu kuvvet: " + dorduncu);
        System.out.println("Besinci kuvvet: " + besinci);
    }
}
