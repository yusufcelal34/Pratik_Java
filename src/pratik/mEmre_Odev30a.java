package pratik;

import java.util.Scanner;

public class mEmre_Odev30a {
    public static void main(String[] args) {

          /*30---
    Kullanıcının gireceği iki binary sayıyı toplayan  Java kodunu yazınız.

    Test Data:
    birinci binary number: 100010
    ikinci  binary number: 110010

    Beklenen Çıktı:
    1010100
    */
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan binary sayıları al
        System.out.print("Birinci binary sayıyı girin: ");
        String binary1 = scanner.nextLine();

        System.out.print("İkinci binary sayıyı girin: ");
        String binary2 = scanner.nextLine();

        // Binary string'leri decimal (10'luk) sayıya çevir
        int sayi1 = Integer.parseInt(binary1, 2); // 2 tabanında çözüm
        int sayi2 = Integer.parseInt(binary2, 2);

        // Toplamı hesapla
        int toplam = sayi1 + sayi2;

        // Sonucu binary (2 tabanlı) string olarak yazdır
        String sonucBinary = Integer.toBinaryString(toplam);

        System.out.println("Toplam (binary): " + sonucBinary);

    }
}
