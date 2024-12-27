public class TypePromotion {
    public static void main(String args[]){
        /*char a = 'a';
        char b = 'b';

        System.out.println((int) (a));
        System.out.println((int)(b));
        System.out.println(b-a);*/

        //Type Promotion
        short a = 5;
        byte b = 25;
        char c = 'c';
        byte bt = (byte) (a + b + c);
        System.out.println(bt);

        //Type Promotion2
        int a1 = 10;
        float b1 = 20.25f;
        long c1 = 25;
        double d1 = 40;
        double answ = a1 + b1 + c1 + d1;
        System.out.println(answ);

        //Type Casting
        byte a2 = 5;
        a2 = (byte) (a2 * 2);
        System.out.println(a2);

        //Type Conversion Extra Works
        int a = sc.nextInt();
        //short c = a; //error, because the short to int conversion is not possible short data type is to small than integer.
        float b = a; /* Type Conversion */
        System.out.println(b);
    }
}
