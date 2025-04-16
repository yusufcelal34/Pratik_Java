package Java_Pratik;

public class mEmre_Odev21a {

       /*21----
    Array deki sayıları tolpayan Java kodunu yazınız.

    array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    Beklenen Çıktı:
    Array toplamı: 55
    */

    // for-each Döngüsü ile

            public static void main(String[] args) {
                int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
                int toplam = 0;

                for (int sayi : array) {
                    toplam += sayi;
                }

                System.out.println("Array toplamı: " + toplam);
            }
        }


