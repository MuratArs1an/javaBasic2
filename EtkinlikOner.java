package Basics.EtkinlikOner;
import java.util.Scanner;
public class EtkinlikOner {
    public static void main(String[] args) {
        int tempature;
        Scanner input=new Scanner(System.in);
        System.out.println("Hava Sicakligini Giriniz");
        tempature=input.nextInt();
        if(tempature<5){
            System.out.println("Kayak Yapmaya Git");
        }else if(tempature<=15){
            System.out.println("Sinemaya Git");
        }else if(tempature<=25){
            System.out.println("Piknige Git");
        }else if(tempature>25){
            System.out.println("Yuzmeye Git");
        }
    }
}
