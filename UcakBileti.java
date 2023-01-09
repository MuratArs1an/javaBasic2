package Basics.UcakBileti;
import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int km;
        int age;
        int direction;
        double total;
        System.out.println("Ucus Km sini Giriniz:");
        km=input.nextInt();
        System.out.println("Yasinizi Giriniz:");
        age=input.nextInt();
        System.out.println("1-Tek Yon\n2-Gidis Donus");
        direction=input.nextInt();

        if((direction==1 || direction==2) && km>=1 && age>0){
            total=km*0.10;
            if(direction==2){
                total=(total-(total/5))*2;
                if(age<12){
                    total=total/2;
                }else if(age>12 && age<24){
                    total=total-(total/10);
                }else if(age>65){
                    total=total-((total*30)/100);
                }
            }
            System.out.println("Bilet Tutariniz: "+total);
        }else{
            System.out.println("Girilen Bilgiler Hatali");
        }
    }
}
