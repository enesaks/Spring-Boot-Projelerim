import controller.KitapController;
import controller.YazarController;

import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("İşlem seçiniz");
        System.out.println("1- Yazar İşlemleri");
        System.out.println("2- Kitap İşlemleri");
        System.out.println("3- Yayınevi İşlemleri");
       int islem=sc.nextInt();
       switch (islem) {
           case 1:{
              YazarController.anaMenu();
              break;
           } case 2:{
               KitapController.anaMenu();
           }
       }


    }
}
