package Java_Pratik;

public class mEmre_Odev22 {
    public static void main(String[] args) {

         /*22----
    Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

    Array =  [20, 30, 25, 35, -16, 60, -100 ]

    Beklenen Çıktı:
    Array Sayılarının ortalaması: 7....
    */

        double arr[] = {20, 30, 25, 35, -16, 60, -100};

        double toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i];
        }

        System.out.println("Tum elementlerin toplami : " + (toplam / arr.length));
        System.out.println("===============================");
        double ortalama = (double) toplam / arr.length;

        System.out.println("Array Sayılarının ortalaması: " + Math.round(ortalama * 10.0) / 10.0);
    }
}

