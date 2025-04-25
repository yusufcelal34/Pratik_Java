package pratik;

public class mEmre_Odev27a {
    public static void main(String[] args) {

        /*27----
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

    Array: [1232,2345,5467,678,3454,2312,3451]
    */
        int[] array = {1232, 2345, 5467, 678, 3454, 2312, 3451};

        int enBuyuk = Integer.MIN_VALUE; // Java’daki en küçük int değeri
        int ikinciEnBuyuk = Integer.MIN_VALUE;

        for (int sayi : array) {
            if (sayi > enBuyuk) {
                ikinciEnBuyuk = enBuyuk;
                enBuyuk = sayi;
                /* Ne demek bu? Eğer şu anki sayi, elimizdeki enBuyuk'tan büyükse: Eski enBuyuk, artık ikinci en büyük olur
                (ikinciEnBuyuk = enBuyuk) Yeni enBuyuk, şu anki sayı olur (enBuyuk = sayi)
🔁 Örnek: İlk sayı: 1232 enBuyuk = 1232 Sonraki sayı: 2345 → daha büyük: ikinciEnBuyuk = 1232 enBuyuk = 2345
    Sonraki sayı: 5467 → daha büyük: ikinciEnBuyuk = 2345 enBuyuk = 5467 */

            } else if (sayi > ikinciEnBuyuk && sayi != enBuyuk) {
                ikinciEnBuyuk = sayi; /* Ne yapıyor? Eğer sayı: enBuyuk değilse (aynı değeri tekrar saymamak için),
Ve şu anki ikinciEnBuyuk'tan büyükse, O zaman bu sayı artık ikinci en büyük olur!
Örnek: enBuyuk = 5467, ikinciEnBuyuk = 2345 Yeni sayı: 3454 → 3454 > 2345 ve 3454 != 5467 O zaman: ikinciEnBuyuk = 3454 */
            }
        }

        System.out.println("2. en büyük sayı: " + ikinciEnBuyuk);

    }
}
