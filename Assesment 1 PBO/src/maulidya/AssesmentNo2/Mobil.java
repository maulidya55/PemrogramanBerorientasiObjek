package maulidya.AssesmentNo2;

public class Mobil {
    private String merk, tahunKeluaran;
    private double harga;
    private int stok;

    public Mobil(String merk, double harga, String tahunKeluaran, int stok) {
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stok = stok;
    }

    public String getMerk(){
        return merk;
    }

    public String getTahunKeluaran(){
        return tahunKeluaran;
    }

    public double getHarga(){
        return harga;
    }

    public int getStok(){
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void displayInfo() {
        System.out.println("Merk           : " + this.getMerk());
        System.out.println("Harga          : " + this.getHarga());
        System.out.println("Tahun Keluaran : " + this.getTahunKeluaran());
        System.out.println("Sisa Stok      : " + this.getStok());

    }

}

