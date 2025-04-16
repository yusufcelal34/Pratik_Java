package Java_Pratik;

public class mEmre_Odev28a {
    public static void main(String[] args) {

         /*28----
    Array içerisindeki tek ve çift sayıların
    kaçar tane olduğunu bulan Java Kodu yazınız.

    Array: [1,2,3,4,5,6,7,8,9]

    Beklenen Çıktı:

    Tek Sayilar: 5
    Cift Sayilar: 4
    */
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int tekSayilar = 0;
        int ciftSayilar = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ciftSayilar++;

            } else {
                tekSayilar++;

            }
        }

        System.out.println("Tek Sayilar: "+ + tekSayilar);

        System.out.println("Cift Sayilar: " + ciftSayilar);
    }
}
