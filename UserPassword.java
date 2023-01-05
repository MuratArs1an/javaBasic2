package Basics.UserPassWord;
import java.util.Scanner;

public class UserPassword {
    public static void main(String[] args) {
        String userName,password,newPassword;
        int answer;
        Scanner input =new Scanner(System.in);
        System.out.println("Kullanici Adini Giriniz:");
        userName=input.nextLine();
        System.out.println("Sifrenizi Giriniz");
        password= input.nextLine();
        if(userName.equals("patika") && password.equals("java1234")){
            System.out.println("Giris Basarili");
        }else if(userName.equals("patika") && !password.equals("java1234")){
            System.out.println("Parola Yanlis, sifirlamak istermisiniz? 1-Evet\n2-Hayir");
            answer=input.nextInt();
            if(answer==1) {
                System.out.println("Yeni Parolayi giriniz");
                newPassword=input.nextLine();
                if(newPassword.equals("java1234")){
                    System.out.println("Girilen Sifre Eskisi ile ayni");
                }else{
                    System.out.println("Sifreniz Basarili bir sekilde digistirildi");
                }
            }else{
                System.out.println("Cikis Yapildi");
            }
        }else{
            System.out.println("Kullanici adi veya parola hatali");
        }
    }
}
