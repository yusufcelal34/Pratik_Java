package pratik;

public class calisma {


    public static class C05_staticBlocks {
        // constructor olusturun
        C05_staticBlocks() {
            System.out.println("Constructor calisti");

        }

        // main method
        public static void main(String[] args) {
            System.out.println("main method calisti");

            C05_staticBlocks obj = new C05_staticBlocks();
            method1();

        }

        // method olusturun
        public static void method1() {
            System.out.println("method1 calisti");
        }

// 2-constructor obje olusturuldugunda,
// method ise method call oldugunda calisir
// yoksa calismaz


        /*
        static blocklar classdaki her seyden once calisir
        eger class calismaya baslamadan Once yapilmasi gereken bir ayar varsa
        veya deger atanmasi gereken bir variable varsa ( pre-condition)
        bunları yapabilmek icin static block kullanilir.
        eger birden fazla static block varsa tum static blocklar main methoddan once calisir
        static bloklar kendi aralarinda ustteki once calisacak sekilde siralanir
        */
// static blok olusturun
        static {
            System.out.println("static blok calisti");
        }
    }
}


/*
SON SIRALAMA:
static block calisti
asagidaki static blok calisti
main method calsti
Constructor calisti
method calisti
*/



