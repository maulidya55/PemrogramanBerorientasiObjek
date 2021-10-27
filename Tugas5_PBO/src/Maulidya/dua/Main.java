package Maulidya.dua;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        double alas = 0;
        double tinggi = 0;

        do {
            System.out.println("--Mengetahui Luas dan Keliling Segitiga--");
            System.out.println("Pilihan : ");
            System.out.println("1. Informasi berupa alas dan tinggi segitiga");
            System.out.println("2. Informasi berupa alas dan sisi segitiga");
            System.out.println("3. Keluar");
            System.out.println("pilih : ");
            pilih = input.nextInt();

            switch (pilih){
                case 1:
                    System.out.println("Masukan Alas :");
                    alas = input.nextDouble();
                    System.out.println("Masukan Tinggi :");
                    tinggi = input.nextDouble();
                    segitiga.cari(alas, tinggi);
                    break;

                case 2:
                    System.out.println("Masukan Alas :");
                    alas = input.nextDouble();
                    segitiga.cari(alas);
                    break;
                case 3:
                    System.out.println("Tutup");
                    break;
                default:
                    System.out.println("Input Salah");
                    break;
            }
        }while (pilih != 3);
    }

}

