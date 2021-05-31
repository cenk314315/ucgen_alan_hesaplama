import java.util.Scanner;



public class alan {

    public static void main(String[] args) {

    double a, b , c;
    Scanner deger = new Scanner(System.in);
    System.out.print("1. Kenar uzunluğunu giriniz: ");
    a = deger.nextInt();
        System.out.print("2. Kenar uzunluğunu giriniz: ");
        b = deger.nextInt();
        System.out.print("3. Kenar uzunluğunu giriniz: ");
        c = deger.nextInt();

    double u  = (a + b + c) / 2;
    double alan = u*(u-a)*(u-b)*(u-c);
    System.out.print("Üçgenin alanı: " + Math.sqrt(alan));


    }
}
