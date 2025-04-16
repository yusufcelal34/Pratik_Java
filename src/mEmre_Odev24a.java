package Java_Pratik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mEmre_Odev24a {
    public static void main(String[] args) {

        /*24----
    Yazılan değerin array içerisinde arayan Java Kodu yazınız.

    Array: [1551,1223,1443,1267,1789,1023,2020]

    Aranan Değer:2020
    Beklenen Çıktı:True

    Aranan Değer:2010
    Beklenen Çıktı :False
    */

        int[] array = {1551, 1223, 1443, 1267, 1789, 1023, 2020}; // int[] array = {...}
        //Arama yapılacak olan dizi tanımlanır. İçinde 7 tane sayı var:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir değer giriniz...");
        int arananDeger = scanner.nextInt();
        
        // int arananDeger = 2020;  // Dizide aramak istediğimiz değer buraya yazılır.
        boolean bulundu = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == arananDeger) { // Dizi elemanları tek tek kontrol edilir.
                bulundu = true;
                break; // Değer bulunduysa daha fazla aramaya gerek yok
            }
        }

        System.out.println("Beklenen Çıktı: " + bulundu);
    }
}
