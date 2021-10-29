package maulidya.AssesmentNo1;

public class MarketPlace {
    private String namaPengirim = "Eiger";
            String alamatPengirim = "Bandung Kopo";
            String namaPenerima;
            String alamatPenerima;
            String jenisPemesanan;
            String noResi;
            String namaEkspedisi;
            String namaDropship;
            String alamatDropship;
            String statusDropship;
            String statusAsuransi;
    private int noTransaksi;
    private float ongkosKirim, nominalAsuransi;

    // Konstruktor Utama
    public MarketPlace(String jenisPemesanan, int noTransaksi,
                       String noResi, String namaEkspedisi,
                       String namaPengirim, String alamatPengirim,
                       String namaPenerima, String alamatPenerima ,
                       float ongkosKirim) {

        this.jenisPemesanan = jenisPemesanan;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.ongkosKirim = ongkosKirim;
    }

    //Konstruktor Utama, Asuransi
    public MarketPlace(String jenisPemesanan, int noTransaksi,
                       String noResi, String namaEkspedisi,
                       String namaPengirim, String alamatPengirim,
                       String namaPenerima, String alamatPenerima,
                       float nominalAsuransi, String statusAsuransi,
                       float ongkosKirim) {

        this.jenisPemesanan = jenisPemesanan;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = statusAsuransi;
        this.ongkosKirim = ongkosKirim;
    }

    //Konstruktor Utama, Dropshipper
    public MarketPlace(String jenisPemesanan, int noTransaksi,
                       String noResi, String namaEkspedisi,
                       String namaPengirim, String alamatPengirim,
                       String namaPenerima, String alamatPenerima,
                       String namaDropship, String alamatDropship,
                       String statusDropship, float ongkosKirim) {

        this.jenisPemesanan = jenisPemesanan;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.namaDropship = namaDropship;
        this.alamatDropship = alamatDropship;
        this.statusDropship = statusDropship;
        this.ongkosKirim = ongkosKirim;
    }

    //Konstruktor Utama, Asuransi, Dropshipper
    public MarketPlace(String jenisPemesanan, int noTransaksi,
                       String noResi, String namaEkspedisi,
                       String namaPengirim, String alamatPengirim,
                       String namaPenerima, String alamatPenerima,
                       float nominalAsuransi, String namaDropship,
                       String alamatDropship, String statusAsuransi,
                       String statusDropship, float ongkosKirim) {

        this.jenisPemesanan = jenisPemesanan;
        this.noTransaksi = noTransaksi;
        this.noResi = noResi;
        this.namaEkspedisi = namaEkspedisi;
        this.namaPengirim = namaPengirim;
        this.alamatPengirim = alamatPengirim;
        this.namaPenerima = namaPenerima;
        this.alamatPenerima = alamatPenerima;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = statusAsuransi;
        this.namaDropship = namaDropship;
        this.alamatDropship = alamatDropship;
        this.statusDropship = statusDropship;
        this.ongkosKirim = ongkosKirim;
    }


    public void printNormal() {
        System.out.println(jenisPemesanan);
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + noResi);
        System.out.println("Nama Ekspedisi :" + namaEkspedisi);
        System.out.println("Ongkos Kirim : " + ongkosKirim);
        System.out.println("Nama Pengirim : " + namaPengirim);
        System.out.println("Alamat Pengirim : " + alamatPengirim);
        System.out.println("Nama Penerima : " + namaPenerima);
        System.out.println("Alamat Penerima : " + alamatPenerima);
        System.out.println();
    }

    public void printAsuransi() {
        System.out.println(jenisPemesanan);
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + noResi);
        System.out.println("Nama Ekspedisi :" + namaEkspedisi);
        System.out.println("Ongkos Kirim : " + ongkosKirim);
        System.out.println("Nama Pengirim : " + namaPengirim);
        System.out.println("Alamat Pengirim : " + alamatPengirim);
        System.out.println("Nama Penerima : " + namaPenerima);
        System.out.println("Alamat Penerima : " + alamatPenerima);
        System.out.println("Nominal Asuransi : " + nominalAsuransi);
        System.out.println();
    }

    public void printDropship() {
        System.out.println(jenisPemesanan);
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + noResi);
        System.out.println("Nama Ekspedisi : " + namaEkspedisi);
        System.out.println("Ongkos Kirim : " + ongkosKirim);
        System.out.println("Nama Pengirim : " + namaDropship);
        System.out.println("Alamat Pengirim : " + alamatDropship);
        System.out.println("Nama Penerima : " + namaPenerima);
        System.out.println("Alamat Penerima : " + alamatPenerima);
        System.out.println();
    }

    public void printAsuransidanDropship() {
        System.out.println(jenisPemesanan);
        System.out.println("No Transaksi : " + noTransaksi);
        System.out.println("No Resi : " + noResi);
        System.out.println("Nama Ekspedisi : " + namaEkspedisi);
        System.out.println("Ongkos Kirim : " + ongkosKirim);
        System.out.println("Nama Pengirim : " + namaDropship);
        System.out.println("Alamat Pengirim : " + alamatDropship);
        System.out.println("Nama Penerima : " + namaPenerima);
        System.out.println("Alamat Penerima : " + alamatPenerima);
        System.out.println("Nominal Asuransi : " + nominalAsuransi);
        System.out.println();
    }
}


