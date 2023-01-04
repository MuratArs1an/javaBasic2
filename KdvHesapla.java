package Basics.KdvHesapla;
import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {
        double tutar;
        double kdv;
        Scanner input=new Scanner(System.in);
        System.out.println("tutar giriniz : ");
        tutar=input.nextDouble();
        if(tutar>1000){
            kdv=0.08;

        }else{
            kdv=0.18;
        }
        double kdvTutar=tutar*kdv;
        double total=tutar+kdvTutar;
        System.out.println("Kdvli Tutar : "+total);
    }
}
