package maulidya;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner user = new Scanner(System.in);
    static ArrayList<Driver> drivers = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
	int pilih;
	do {
        System.out.println("Aplikasi Ojek");
        System.out.println();
        System.out.println("1. Input Driver");
        System.out.println("2. Input Customer");
        System.out.println("3. Info Drivers");
        System.out.println("4. Info Customer");
        System.out.println("5. Topup Saldo Customer");
        System.out.println("6. Transaksi Jasa Pengantaran");
        System.out.println("Pilih :");
        pilih = user.nextInt();

        switch (pilih){
            case 1 :
                inputDvr();
                break;
            case 2:
                inputCsr();
                break;
            case 3:
                infoMemberDvr();
                break;
            case 4:
                infoMemberCsr();
                break;
            case 5:
                topUpSaldoCsr();
                break;
            case 6:
                pembayaranDvr();
                break;
            case 7:
            default:

        }
    }while (pilih != 7);
    }

    static void inputDvr(){
        String nik, nama, no, platMotor, jenisMotor;
        double saldo;

        System.out.println("NIK :");
        nik = user.next();
        System.out.println("Nama :");
        nama = user.next();
        System.out.println("Nomor telf:");
        no = user.next();
        System.out.println("Plat :");
        platMotor = user.next();
        System.out.println("Jenis Motor :");
        jenisMotor = user.next();
        System.out.println("Saldo :");
        saldo = user.nextDouble();

        drivers.add(new Driver(nik, nama, no, platMotor,jenisMotor, saldo));

        System.out.println();

    }

    static void inputCsr(){
        String nik, nama, no;
        double saldo;

        System.out.println("NIK :");
        nik = user.next();
        System.out.println("Nama :");
        nama = user.next();
        System.out.println("Nomor telf:");
        no = user.next();
        System.out.println("Saldo :");
        saldo = user.nextDouble();

        customers.add(new Customer(nik, nama, no,saldo));

        System.out.println();
    }


    static void infoMemberDvr(){
        for (Driver driver : drivers){
            System.out.println("NiK : "+ driver.getNik());
            System.out.println("Nama : "+ driver.getNama());
            System.out.println("Nomer telf : "+ driver.getNo());
            System.out.println("Plat : "+ driver.getPlatMotor());
            System.out.println("Jenis : "+ driver.getJenisMotor());
            System.out.println("Saldo : "+ driver.getSaldo());
        }
        System.out.println();
    }

    static void infoMemberCsr(){
        for (Customer customer : customers){
            System.out.println("NiK : "+ customer.getNik());
            System.out.println("Nama : "+ customer.getNama());
            System.out.println("Nomer telf : "+ customer.getNo());
            System.out.println("Saldo : "+ customer.getSaldo());
        }

        System.out.println();
    }

    static void topUpSaldoCsr(){
        int noCustomer, noDriver;
        double topUp;

        System.out.println("Masukan no customers : ");
        noCustomer = user.nextInt();
        System.out.println("Masukan no drivers : ");
        noDriver = user.nextInt();
        System.out.println("Jumlah topup saldo : ");
        topUp = user.nextDouble();

        drivers.get(noDriver).saldo -= topUp;
        customers.get(noCustomer).saldo += topUp;

        System.out.println("Transaksi Berhasil");
    }

    static void pembayaranDvr(){
        int noDriver, noCustomer;
        double bayar;

        System.out.println("Masukan nomor driver : ");
        noDriver = user.nextInt();
        System.out.println("Masukan nomor customer : ");
        noCustomer = user.nextInt();
        System.out.println("Jumlah bayar driver : ");
        bayar = user.nextDouble();

        customers.get(noCustomer).saldo -= bayar;
        drivers.get(noDriver).saldo += bayar;
        System.out.println("Transaksi Berhasil");
    }

}
