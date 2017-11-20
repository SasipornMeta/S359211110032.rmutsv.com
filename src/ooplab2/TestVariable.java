package ooplab2;

public class TestVariable {

    public static void main(String[] args) {

//        Integer   เก็บค่าข้อมูลจำนวนเต็ม
        int i;
        i = 10;
        System.out.println("i = " +i);

        int j = 20;
        System.out.println("j = " +j);
        System.out.println("i+j = " +(i+j));

//        Double    เก็บค่าตัวเลขที่เป็นทศนิยม
        double v;
        v = 5.5;
        System.out.println("v = " +v);


        i = (int) v;                                     // Cast to int
        System.out.println("i = " +i);

//        Char  เก็บค่าข้อมูลได้เพืยง 1 อักขระเท่านั้น
        char c = 'x';
        System.out.println("c = " +c);

//        String
        String s;
        String s1 = "Hello world";
        System.out.println(s1+ " I'm Gift");

        int x = s1.length();                // length ทำการนับจำนวนความยาวของอัชระ
        System.out.println(x);
        System.out.println(s1.toUpperCase());       // toUpperCase คือการเปลี่ยนตัวอักษรให้เป็นพิมพ์ใหญ่ทั้งหมด
        System.out.println(s1.toLowerCase());       // toLowerCase คือการเปลี่ยนตัวอักษรให้เป็นพิมพ์เล็กทั้งหมด
        System.out.println(s1.concat(" Sasiporn"));

//        String to int
        String number = "50";
        int y = Integer.parseInt(number);           // การแปลงจากข้อความเป็นตัวเลข
        System.out.println(y);

//        Boolean
        boolean b = true;
        System.out.println(b);
        b = false;
        System.out.println(b);


//        short cut operator
        int z = 10;
        int t = ++z;
        System.out.println(z);
        System.out.println(t);




    }   // main
}   // class
