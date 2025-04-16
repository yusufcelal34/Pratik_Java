package Java_Pratik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class mEmre_Odev26a {
    public static void main(String[] args) {

        /*26-----Array i ARRAYLIST e çeviren Java Kodunu yazınız.
    Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
    Beklenen Çıktı:  [Python, JAVA, PHP, Perl, C#, C++]    */


        int[] array = {12, 15, 43, 23, 56, 76, 78, 90, 77, 43};

        // Scanner scan = new Scanner(System.in);
        // System.out.println("Aramak istediğinizi değeri giriniz: ");
        // int arananDeger =scan.nextInt();

        int arananDeger = 56;

        boolean bulundu = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == arananDeger) {
                System.out.println(arananDeger + " sayısı arrayin " + i + ". elemanı");
                bulundu = true;
                break; // Değeri bulduktan sonra döngüden çık
            }
        }

        if (!bulundu) {
            System.out.println(arananDeger + " sayısı arrayde bulunamadı.");
        }
    }
}

