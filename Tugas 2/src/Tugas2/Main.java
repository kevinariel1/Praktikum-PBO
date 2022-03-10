package Tugas2;

import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    public static double panjang,lebar,tinggi,jari2;

    public static void main(String[] args) {
        boolean loop = true;
        int y;
        int menu;
        while (loop){
            menu = menu();
            switch (menu){
                case 1:
                    balok();
                    System.out.print("Ulangi? (Ya : 1 || Tidak : 0) ?");
                    y = input.nextInt();
                    loop = (y == 1);
                    break;
                case 2:
                    tabung();
                    System.out.print("Ulangi? (Ya : 1 || Tidak : 0) ?");
                    y = input.nextInt();
                    loop = (y == 1);
                    break;
                case 0:
                    System.out.println("Terima Kasih");
                    loop = false;
                    break;
            }
        }
    }
    
    public static int menu(){
        System.out.println("===========");
        System.out.println("MENU UTAMA");
        System.out.println("==================");
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. Exit");
        System.out.println("Pilih : ");
                        
        return input.nextInt();
    }

    public static void balok(){
        System.out.print("Input Panjang: " );
        panjang = input.nextDouble();
        System.out.print("Input Lebar: ");
        lebar = input.nextDouble();
        System.out.print("Input Tinggi: ");
        tinggi = input.nextDouble();
        Balok balok = new Balok(panjang,lebar,tinggi);

        balok.display();
    }

    public static void tabung(){
        System.out.print("Input Jari-Jari: " );
        jari2 = input.nextDouble();
        System.out.print("Input Tinggi: ");
        tinggi = input.nextDouble();
        Tabung tabung = new Tabung(jari2,tinggi);
        
        tabung.display();
    }
}