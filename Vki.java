package Basics.Vki;
import java.util.Scanner;

public class Vki {
    public static void main(String[] args) {
        double boy;
        int kilo;
        Scanner input=new Scanner(System.in);
        System.out.println("Boyunuz Metre cinsinden giriniz:");
        boy=input.nextDouble();
        System.out.println("kilonuzu giriniz:");
        kilo=input.nextInt();
        double vki=kilo/(boy*boy);
        System.out.println("Vucut Kitle Endeksiniz : "+ vki);
    }
}
