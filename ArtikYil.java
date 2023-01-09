package Basics.ArtikYil;
import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int year;
        int remain;
        Scanner input=new Scanner(System.in);
        System.out.println("Yil Giriniz:");
        year=input.nextInt();
        remain=year%4;
        if(remain==0 && year%100==0){
            if(year%400==0){
                System.out.println(year+" bir artik yildir");
            }else{
                System.out.println(year+" bir artik yil Degildir");
            }
        }else if(remain==0){
            System.out.println(year+" bir artik yildir");
        }

    }
}
