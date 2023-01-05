package Basics.Calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        double a,b;
        int select;
        Scanner input=new Scanner(System.in);
        System.out.println("ilk rakami giriniz:");
        a=input.nextDouble();
        System.out.println("ikici rakami giriniz");
        b=input.nextDouble();
        System.out.println("1-toplama\n2-cikarma\n3-carpma\n4-bolme");
        select=input.nextInt();

        switch (select){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("hatali giris yaptiniz");
        }
    }
}
