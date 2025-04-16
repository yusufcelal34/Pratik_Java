package Java_Pratik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mEmre_Odev26 {
    public static void main(String[] args) {

        /*26-----Array i ARRAYLIST e çeviren Java Kodunu yazınız.
    Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]
    Beklenen Çıktı:  [Python, JAVA, PHP, Perl, C#, C++]    */

        String arr[]={"Python", "JAVA", "PHP", "Perl", "C#", "C++"}; // Bu satırda bir String dizisi (array) oluşturuluyor.
                                                                     // arr adındaki dizide 6 adet programlama dili var:
        /*
        Index:    0        1       2       3       4      5
        İçerik: "Python", "JAVA", "PHP", "Perl", "C#", "C++"
        */

        List<String> list=new ArrayList<>(Arrays.asList(arr));

        /*Arrays.asList(arr) Bu kısım, arr dizisini List’e çevirmek için kullanılır. Arrays.asList(...) metodu, verilen
        diziden sabit uzunluklu bir liste oluşturur. Ama dikkat: Arrays.asList(...) doğrudan ArrayList değildir. Sabit
        boyutludur (ekleme/çıkarma yapılamaz).*/

        System.out.println("Beklenen Cikti: \n"+list);


    }
}
