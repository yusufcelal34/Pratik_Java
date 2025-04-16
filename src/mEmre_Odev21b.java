package Java_Pratik;

public class mEmre_Odev21b {
    public static void main(String[] args) {
       /*21----
    Array deki sayıları tolpayan Java kodunu yazınız.

    array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    Beklenen Çıktı:
    Array toplamı: 55
    */

    // while Döngüsü ile

    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int toplam = 0; //Toplamı hesaplamak için başlangıç değeri 0 olan bir değişken tanımlanmış.

        int i = 0;  // Dizi içindeki elemanları gezerken kullanmak için bir sayaç (index) oluşturulmuş.
                    // Başlangıç değeri 0, çünkü Java dizilerinde indeksleme 0’dan başlar.

        while (i < array.length) {  //while döngüsü, i değişkeni dizinin uzunluğundan küçük olduğu sürece çalışır.
                                    // array.length değeri 10’dur, çünkü dizide 10 eleman vardır.
        toplam += array[i];
        i++;
    }

        System.out.println("Array toplamı: " + toplam);
            }
        }


