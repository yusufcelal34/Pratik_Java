package Java_Pratik;

public class mEmre_Odev28 {
    public static void main(String[] args) {

         /*28----
    Array içerisindeki tek ve çift sayıların
    kaçar tane olduğunu bulan Java Kodu yazınız.

    Array: [1,2,3,4,5,6,7,8,9]

    Beklenen Çıktı:

    Tek Sayilar: 5
    Cift Sayilar: 4
    */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int teksayi = 0; // Tek sayıları saymak için: teksayi
        int ciftsayi = 0; // Çift sayıları saymak için: ciftsayi
        /*for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                teksayi++;
            } else {
                ciftsayi++;*/
        for (int i = 1; i <= arr.length; i++) { //Döngü 1’den başlıyor ve arr.length (yani 9) dahil olmak üzere 1–9 arasında döner.
            // Dikkat! Bu döngü dizideki sayıların kendisini değil, 1'den 9'a kadar olan
            // döngü sayısını kontrol ediyor.
            // NOT: //  Ama Dikkat: Bu döngü dizinin elemanlarına bakmıyor! Yani sadece 1–9 arası sayıları tek–çift olarak sayıyor.
            // Dizide farklı sayılar olsaydı (örneğin negatif, 0, tekrar eden), bu kod onları dikkate almazdı.


            if (i % 2 == 1) { // Eğer i tek ise teksayi++
                teksayi++;
            } else {
                ciftsayi++;
            }
        }

        System.out.println("Teksayılar : " + teksayi);
        System.out.println("Ciftsayılar : " + ciftsayi);

    }
}
