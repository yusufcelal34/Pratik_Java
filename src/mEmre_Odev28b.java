package Java_Pratik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mEmre_Odev28b {
    public static void main(String[] args) {

         /*28----
    Array içerisindeki tek ve çift sayıların
    kaçar tane olduğunu bulan Java Kodu yazınız.

    Array: [1,2,3,4,5,6,7,8,9]

    Beklenen Çıktı:

    Tek Sayilar: 5
    Cift Sayilar: 4
    */
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizi boyutu al
        System.out.print("Kaç sayı gireceksiniz? ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Dizi elemanlarını kullanıcıdan al
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı girin: ");
            array[i] = scanner.nextInt();
        }

        // Tek ve çift sayılar için ayrı listeler
        List<Integer> tekSayilar = new ArrayList<>();
        List<Integer> ciftSayilar = new ArrayList<>();

        // Dizi taranıyor
        for (int sayi : array) {
            if (sayi % 2 == 0) {
                ciftSayilar.add(sayi);
            } else {
                tekSayilar.add(sayi);
            }
        }

        // Sonuçlar
        System.out.println("\nTek Sayılar (" + tekSayilar.size() + " adet): " + tekSayilar);
        System.out.println("Çift Sayılar (" + ciftSayilar.size() + " adet): " + ciftSayilar);
    }
}
