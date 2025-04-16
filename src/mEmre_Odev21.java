package Java_Pratik;

public class mEmre_Odev21 {
    public static void main(String[] args) {

       /*21----
    Array deki sayıları tolpayan Java kodunu yazınız.
    array  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    Beklenen Çıktı:
    Array toplamı: 55
    */

        int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            /* int i = 0	Sayaç (index) 0’dan başlar (dizinin ilk elemanı için).
        i < array.length	i, dizinin uzunluğundan küçük olduğu sürece döngü devam eder. array.length = 10
        olduğu için i değeri 0'dan 9'a kadar gider.
        i++	Her döngü sonunda i bir artırılır (bir sonraki elemana geçmek için).
            */

            toplam+=arr[i];
        }
        System.out.println("Tum elementlerin toplami : " + toplam);
    }
}
