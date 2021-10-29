package maulidya.AssesmentNo2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowroomJaya {
    private static ArrayList<Mobil> arrMobil = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pilihan, tahunKeluaran, merk ;
        double harga;
        int jumlahBeli, stok;

        while (true) {
            System.out.println("--Showroom Jaya-- :");
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Beli Mobil");
            System.out.println("3. View Stok");
            System.out.println("4. Keluar");

            pilihan = input.next();
            switch (pilihan) {
                case "1" :
                    System.out.println("--Tambah Mobil--");
                    System.out.println("Merk :");
                    merk = input.next();
                    System.out.println("Harga : ");
                    harga = input.nextDouble();
                    System.out.println("Tahun Keluaran :");
                    tahunKeluaran = input.next();
                    System.out.println("Stok :");
                    stok = input.nextInt();
                    tambahMobil(merk, harga, tahunKeluaran, stok);
                    break;

                case "2" :
                    System.out.println("--Beli Mobil--");
                    System.out.println("Merk :");
                    merk = input.next();
                    System.out.println("Tahun Keluaran :");
                    tahunKeluaran = input.next();
                    System.out.println("Jumlah Pembelian :");
                    jumlahBeli = input.nextInt();
                    beliMobil(merk, tahunKeluaran, jumlahBeli);
                    break;

                case "3" :
                    System.out.println("--View Stok--");
                    viewStok();
                    break;

                case "4" :
                    System.exit(0);
                    break;


            }
        }

    }

    public static void tambahMobil(String merk, double harga, String tahunKeluaran, int stok){
        arrMobil.add(new Mobil(merk, harga, tahunKeluaran, stok));
        System.out.println("Mobil berhasil ditambahkan");
    }

    public static void beliMobil(String merk, String tahunKeluaran, int jumlahBeli){
        ArrayList<Mobil> demMobil = new ArrayList<>();
        double diskon = 0.0, totalDiskon, totalBayar;
        String pesanan = null;
        boolean nol = true;

        for (Mobil mobil : arrMobil) {
            if (mobil.getMerk().equalsIgnoreCase(merk)) {
                demMobil.add(mobil);
                nol = false;
            }
        }
        if (nol){
            System.out.println("Tidak ditemukan");
            return;
        }
        for (Mobil mobil : demMobil) {
            if (mobil.getTahunKeluaran().equals(tahunKeluaran)) {
                if (mobil.getStok() > jumlahBeli) {
                    if (jumlahBeli == 2) {
                        diskon = 10.0;
                    } else if (jumlahBeli > 2){
                        diskon = 20.0;
                    }

                    mobil.setStok(mobil.getStok()-jumlahBeli);
                    totalDiskon = (mobil.getHarga()*diskon)/100;
                    totalBayar = mobil.getHarga()* jumlahBeli-totalDiskon;
                    System.out.println("Merk : " + mobil.getMerk());
                    System.out.println("Harga Satuan : " + mobil.getHarga());
                    System.out.println("Tahun Keluaran : " + mobil.getTahunKeluaran());
                    System.out.println("Jumlah Beli : " + jumlahBeli);
                    System.out.println("Total Harga : " + (mobil.getHarga()* jumlahBeli));
                    System.out.println("Diskon : " + diskon +" persen");
                    System.out.println("Total Diskon : " + totalDiskon);
                    System.out.println("Total Bayar : " + totalBayar);
                } else {
                    System.out.println("Jumlah stok tidak cukup");
                }
                return;
            } else {
                pesanan = "Tahun mobil tidak ada";
            }
        }
        System.out.println(pesanan);


    }

    public static void viewStok(){
        for ( Mobil mobil : arrMobil){
            mobil.displayInfo();

        }

    }

}
