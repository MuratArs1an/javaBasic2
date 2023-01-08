package Basics.SinifGecme;
import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat, fiz, kim, tar, turk;
        int total=0;
        int num=0;

        Scanner input =new Scanner(System.in);

        System.out.println("Mateamtik Notunuzu Giriniz");
        mat=input.nextInt();
        if(0<mat && mat<100){
            total+=mat;
            num++;
        };

        System.out.println("Fizik Notunuzu Giriniz");
        fiz=input.nextInt();
        if(0<fiz && fiz<100){
            total+=fiz;
            num++;
        };

        System.out.println("Kimya Notunuzu Giriniz");
        kim=input.nextInt();
        if(0<kim && kim<100){
            total+=kim;
            num++;
        };

        System.out.println("Tarih Notunuzu Giriniz");
        tar=input.nextInt();
        if(0<tar && tar<100){
            total+=tar;
            num++;
        };

        System.out.println("Turkce Notunuzu Giriniz");
        turk=input.nextInt();
        if(0<turk && turk<100){
            total+=turk;
            num++;
        };
        double ortalama=total/num;
        if(ortalama>=50){
            System.out.println("Ortalamaniz "+ ortalama+ " Sinifi Gectiniz");
        }else{
            System.out.println("Ortalamaniz "+ ortalama+ " Sinifi Gecemediniz");
        }
    }
}
