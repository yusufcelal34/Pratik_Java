package pratik;

public class mEmre_Odev28c {
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

        StringBuilder tekListe = new StringBuilder();
        StringBuilder ciftListe = new StringBuilder();

        // Tek ve çift sayıların kendilerini tutacak yapılar. Neden StringBuilder kullanıyoruz?
        // Çünkü çok fazla metin birleştirmesi yaparken daha verimli çalışır.
        // .append() metodu ile sayıların üzerine yazabiliriz.

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                ciftSayilar++;
                ciftListe.append(array[i]).append(" "); // Sayıyı metne ekler
            } else {
                tekSayilar++;
                tekListe.append(array[i]).append(" "); // StringBuilder.append()
                                                        // Sayıları bir metin olarak listelemeye yarar
            }
        }

        System.out.println("Tek Sayilar (" + tekSayilar + " adet): " + tekListe.toString());
        System.out.println("Çift Sayilar (" + ciftSayilar + " adet): " + ciftListe.toString());
    }
}
