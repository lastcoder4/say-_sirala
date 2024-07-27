import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int adet;
        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen girmek istediğiniz sayı adedini yazınız:");
        adet = inp.nextInt();

        ArrayList<Integer> sayilar = new ArrayList<>();

        for(int i = 0; i < adet; i++) {
            System.out.println((i+1) + ". sayıyı giriniz:");
            int sayi = inp.nextInt();
            sayilar.add(sayi);
        }

        Collections.sort(sayilar);

        System.out.println("Sayılar küçükten büyüğe sıralandı:");
        for(int sayi : sayilar) {
            System.out.println(sayi);
        }
    }
}
5