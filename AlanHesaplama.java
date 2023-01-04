package Basics.AlanHesapla;
import java.util.Scanner;
public class AlanHesaplama {
    public static void main(String[] args) {
        int a,h;
        Scanner input=new Scanner(System.in);
        System.out.println("Ucgenin Taban Uzunlugunu Giriniz!");
        a=input.nextInt();
        System.out.println("Ucgenin Yuksekligini Giriniz!");
        h=input.nextInt();
        int alan=(a*h)/2;
        System.out.println("Ucgenin alani : "+alan);
    }
}
