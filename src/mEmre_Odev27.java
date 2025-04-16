package Java_Pratik;

import java.util.Arrays;

public class mEmre_Odev27 {
    public static void main(String[] args) {

        /*27----
    Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

    Array: [1232,2345,5467,678,3454,2312,3451]
    */

        int arr[] = {1232, 2345, 5467, 678, 3454, 2312, 3451};
        Arrays.sort(arr); // Bu satır, diziyi küçükten büyüğe sıralar.

        System.out.println(arr[arr.length - 2]); // Bu ifade dizinin sondan bir önceki elemanını alır.

    }
}
