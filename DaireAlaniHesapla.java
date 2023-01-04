package Basics.DaireAlani;
import java.util.Scanner;

public class DaireAlaniHesapla {
    public static void main(String[] args) {
        double pi=3.14;
        int aci,r;

        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin Yaricapini giriniz:");
        r=input.nextInt();
        System.out.println("Dairenin acisini giriniz:");
        aci=input.nextInt();

        double alan=(pi * (r*r) * aci)/360;
        System.out.println("Daire Dilimin alani : " + alan);


    }
}
