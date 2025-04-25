package calisma;

public class P5_AyniPackagedanKullanma {


    public static void main(String[] args) {

        P4_AccessModifier obj = new P4_AccessModifier();

        //System.out.println(obj.strSPri); // sadece variable'in oldugu class'dan kullanilabilir
        //obj.strSPri = "Hava guzel"; // sadece variable'in oldugu class'dan kullanilabilir

        System.out.println(obj.intSDef);
        obj.intSDef = 89;

        System.out.println(obj.intIPro);
        obj.intIPro = 67;

        obj.strIPub = "Yan";
        System.out.println(obj.strIPub);

        // obj.methodPrivate(); // sadece method'un oldugu class'dan kullanilabilir
        obj.methodDefaultAccMod();
        obj.methodProtected();
        obj.methodPublic();


    }
}