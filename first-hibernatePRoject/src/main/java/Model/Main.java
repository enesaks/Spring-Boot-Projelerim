package Model;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("sayı gir ");

        int a = 0;
        a = sc.nextInt();
        switch (a){
            case 0 -> System.out.println("hello");
            case 1 -> System.out.println("1");
        }
    }
}
