package controller;

import model.Kitap;
import model.Yazar;
import service.KitapService;
import service.YazarService;

import java.util.Scanner;

public class KitapController {


    private static Scanner sc = new Scanner(System.in);
    private static KitapService ks=new KitapService();
    public static void anaMenu(){
        System.out.println("İşlem seçiniz");
        System.out.println("1- Yeni Kayıt");
        System.out.println("2- Güncelle");
        System.out.println("3- Listele");
        System.out.println("4- Tek Kayıt");
        int islem=sc.nextInt();
        switch (islem){
            case 1:{
                create();
                break;
            }
            case 2 :{
                guncelle();
                break;
            }
            case 3 :{
                listele();
                break;
            }
            case 4 :{
                getById();
                break;
            }
            default :{
                System.out.println( "Çıkış yapılıyor");
            }
        }
    }

    private static void getById() {
    }

    private static void guncelle() {
        System.out.println("Kitap Id si giriniz");
        int id=sc.nextInt();
        Kitap k=ks.getById(id);
        System.out.println("Yazar idsi giriniz");
        int yId=sc.nextInt();
        Yazar y=YazarService.getById(yId);
        k.setYazar(y);
        ks.update(k);


    }
    private static void listele() {
    }
    private static void create() {
        Kitap k=new Kitap();
        sc.nextLine();
        System.out.println("Kitap Adı Giriniz" );
        k.setName(sc.nextLine());
        System.out.println("İSBN NO Giriniz");
        k.setIsbnNo(sc.next());
        System.out.println("Sayfa Sayısı Giriniz");
        k.setSayfaSayisi(sc.nextInt());
        ks.create(k);

    }
}
