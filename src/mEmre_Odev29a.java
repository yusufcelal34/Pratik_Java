package Java_Pratik;

import java.util.Arrays;

public class mEmre_Odev29a {
    public static void main(String[] args) {

      /*29----
    Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.

    Test Data:
    sentence -> "Java is fun"
    reversed -> "fun is Java"
    */

        String sentence = "Java is fun";

        // Cümleyi kelimelere ayır
        String[] kelimeler = sentence.split(" ");

        // Ters sıralı birleştirme için StringBuilder
        StringBuilder reversed = new StringBuilder();

        // Diziyi tersten döngü ile dolaş
        for (int i = kelimeler.length - 1; i >= 0; i--) {
            reversed.append(kelimeler[i]);

            // Son kelimeye gelinmediyse boşluk ekle
            if (i != 0) {
                reversed.append(" ");
            }
        }

        // Sonucu yazdır
        System.out.println("Girilmiş olan cümle: "+ sentence);
        System.out.println("Ters çevrilmiş cümle: " + reversed.toString());

    }
}
