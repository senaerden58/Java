package mayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int boyutSatir;
        int boyutSutun;
        
        do {
            System.out.println("Boyutu giriniz.");
            System.out.print("Satır boyutu: ");
            boyutSatir = input.nextInt();
            System.out.print("Sütun boyutu: ");
            boyutSutun = input.nextInt();
        } while (boyutSatir < 2 || boyutSutun < 2);
        
        System.out.println("İşlem tamam");

        int mayinSayisi = (boyutSutun * boyutSatir) / 4;
        String[][] matris = new String[boyutSatir][boyutSutun];
      
        
        for (int i = 0; i < boyutSatir; i++) {
            for (int j = 0; j < boyutSutun; j++) {
                matris[i][j] = "-";
            }
        }
        
        int placedMines = 0;
        while (placedMines < mayinSayisi) {
            int satir = random.nextInt(boyutSatir);
            int sutun = random.nextInt(boyutSutun);
                matris[satir][sutun] = "*";
                placedMines++;
            }
        }
        
        printMatrix(matris);
        
        int secilenSatir;
        int secilenSutun;
        
        do {
            System.out.println("Satır ve sütun seçimi yapınız.");
            System.out.print("Satır: ");
            secilenSatir = input.nextInt();
            System.out.print("Sütun: ");
            secilenSutun = input.nextInt();
            
            if (secilenSatir < 0 || secilenSatir >= boyutSatir || secilenSutun < 0 || secilenSutun >= boyutSutun) {
                System.out.println("Geçersiz seçim. Tekrar deneyin.");
                continue;
            }
            
            if (matris[secilenSatir][secilenSutun].equals("*")) {
                System.out.println("KAYBETTİNİZ.");
                break;
            }
            
            int sayi = 0;
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int newSatir = secilenSatir + i;
                    int newSutun = secilenSutun + j;
                    if (newSatir >= 0 && newSatir < boyutSatir && newSutun >= 0 && newSutun < boyutSutun) {
                        if (matris[newSatir][newSutun].equals("*")) {
                            sayi++;
                        }
                    }
                }
            }
            
            matris[secilenSatir][secilenSutun] = Integer.toString(sayi);
            
            printMatrix(matris);
            
        } while (true);
        
        input.close(); 
    }

    private static void printMatrix(String[][] matris) {
        for (String[] row : matris) {
            for (String cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println("===============================");
    }
}
