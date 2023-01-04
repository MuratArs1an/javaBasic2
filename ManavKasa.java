package Basics.ManavKasa;
import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double armut=25;
        double elma=20;
        double muz=35;
        double domates=27;
        double patlican=32;
        System.out.println("Kac Kilo armut?:");
        armut=input.nextInt()*armut;
        System.out.println("Kac Kilo elma?:");
        elma=input.nextInt()*elma;
        System.out.println("Kac Kilo muz?:");
        muz=input.nextInt()*muz;
        System.out.println("Kac Kilo domates?:");
        domates=input.nextInt()*domates;
        System.out.println("Kac Kilo patlican?:");
        patlican=input.nextInt()*patlican;
        double total=armut+elma+muz+domates+patlican;
        System.out.println("Toplam Borcunuz : "+ total +" Turk Lirasidir");
    }
}
