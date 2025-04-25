package pratik;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Bir metin giriniz: ");
        String metin = scan.nextLine();

        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);
        }

        System.out.println("Ters hali: " + tersMetin);


    }
}