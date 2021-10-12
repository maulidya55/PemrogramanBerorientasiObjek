package maulidya.satu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Buku> dataBuku = new ArrayList<>();

    public static void main(String[] args) {

        int menu;
        do {
            System.out.println("1. Input Buku");
            System.out.println("2. Cetak Semua Buku");
            System.out.println("3. Cetak Berdasarkan ISBN");
            System.out.println("4. Edit Data");
            System.out.println("5. Hapus Data");
            System.out.println("6. Keluar");

            System.out.print("pilih : ");
            menu = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch (menu){
                case 1:
                    inputBuku();
                    break;
                case 2:
                    displayBuku();
                    break;
                case 3:
                    displayISBN();
                    break;
                case 4:
                    editBuku();
                    break;
                case 5:
                    deleteBuku();
                    break;
                default:
                    System.out.println("pilih menu yang ada");
                    break;
            }

        } while (menu != 0);
    }

    private static void deleteBuku() {
        System.out.println("-Delete Buku-");
        System.out.println("Masukan ISBN : ");
        String isbn = scanner.next();

        if (dataBuku.size() == 0) {
            System.out.println("tidak ditemukan");
        } else {

            Buku i = searchByISBN(isbn);

            if (i != null) {
                dataBuku.removeIf(x -> x.getIsbn().equalsIgnoreCase(isbn));
                System.out.println("berhasil dihapus");
            } else {
                System.out.println("tidak ditemukan");
            }
        }

    }

    private static void displayISBN() {
        System.out.println("-Cetak Berdasarkan ISBN-");
        System.out.println("Masukan ISBN : ");
        String isbn = scanner.next();
        if (dataBuku.size() == 0) {
            System.out.println("tidak ditemukan");
        } else {
            Buku i = searchByISBN(isbn);
            if (i != null) {
                display(i);
                System.out.println();
            } else {
                System.out.println("tidak ditemukan");
            }
        }
    }

    private static void displayBuku() {
        System.out.println("-Cetak semua data-");
        if (dataBuku.size() == 0) {
            System.out.println("tidak ditemukan");
        } else {
            for (Buku i : dataBuku) {
                display(i);
            }
        }
    }

    private static void editBuku() {
        System.out.println("-Edit buku-");
        System.out.println("Masukan ISBN : ");
        String isbn = scanner.next();

        if (dataBuku.size() == 0) {
            System.out.println("tidak ditemukan");
        } else {
            Buku i = searchByISBN(isbn);
            if (i != null) {
                display(i);

                System.out.println("-Masukan Data Baru-");

                System.out.println("ISBN : " + i.getIsbn());

                System.out.println("Judul Buku : ");
                String judulbuku = scanner.nextLine();

                System.out.println("Pengarang : ");
                String pengarang = scanner.nextLine();

                System.out.println("Tahun Terbit : ");
                String tahunTerbit = scanner.nextLine();

                System.out.println("Harga : ");
                float harga = scanner.nextFloat();

                System.out.println("Rating : ");
                float rating = scanner.nextFloat();

                i.setJudulbuku(judulbuku);
                i.setPengarang(pengarang);
                i.setTahunTerbit(tahunTerbit);
                i.setHarga(harga);
                i.setRating(rating);
            } else {
                System.out.println("tidak ditemukan");
            }
        }
    }

    private static void inputBuku() {
        System.out.println("-input data buku-");

        System.out.println("ISBN : ");
        String isbn = scanner.nextLine();

        System.out.println("Judul Buku : ");
        String judulbuku = scanner.nextLine();

        System.out.println("Pengarang : ");
        String pengarang = scanner.nextLine();

        System.out.println("Tahun Terbit : ");
        String tahunTerbit = scanner.nextLine();

        System.out.println("Harga : ");
        float harga = scanner.nextFloat();

        System.out.println("Rating : ");
        float rating = scanner.nextFloat();

        Buku i = searchByISBN(isbn);

        if (i == null) {
            Buku buku = new Buku(isbn, judulbuku, pengarang, tahunTerbit, harga, rating);
            dataBuku.add(buku);
            System.out.println("data behasil disimpan");
        } else {
            System.out.println("data dengan isbn" + isbn + "sudah ada");
        }

    }

    private static Buku searchByISBN(String isbn) {
        Buku buku = null;
        for (Buku b : dataBuku){
            if (b.getIsbn().equalsIgnoreCase(isbn)){
                buku = b;
            }
        }
        return buku;
    }

    private static void display(Buku i){
        System.out.println("ISBN  :" + i.getIsbn());
        System.out.println("Judul Buku  :" + i.getJudulbuku());
        System.out.println("Pengarang  :" + i.getPengarang());
        System.out.println("Tahun Terbit  :" + i.getTahunTerbit());
        System.out.println("Harga  :" + i.getHarga());
        System.out.println("Rating  :" + i.getRating());
        System.out.println();
    }

}

