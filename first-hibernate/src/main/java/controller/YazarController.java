package controller;

import model.Yazar;
import service.YazarService;

import java.util.Scanner;

public class YazarController {
    private static Scanner sc = new Scanner(System.in);
    private static YazarService ys = new YazarService();

    public static void anaMenu() {
        System.out.println("İşlem seçiniz");
        System.out.println("1- Yeni Kayıt");
        System.out.println("2- Güncelle");
        System.out.println("3- Listele");
        System.out.println("4- Tek Kayıt");
        int islem = sc.nextInt();
        switch (islem) {
            case 1: {
                create();
                break;
            }
            case 2: {
                guncelle();
                break;
            }
            case 3: {
                listele();
                break;
            }
            case 4: {
                getById();
                break;
            }
            default: {
                System.out.println("Çıkış yapılıyor");
            }
        }
    }

    private static void getById() {
    }

    private static void guncelle() {
    }

    private static void listele() {
    }

    private static void create() {
        Yazar y = new Yazar();
        sc.nextLine();
        System.out.println("Yazar Adı Giriniz");
        y.setName(sc.nextLine());
        ys.create(y);

    }
}
