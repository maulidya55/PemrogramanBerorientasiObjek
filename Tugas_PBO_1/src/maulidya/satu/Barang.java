package maulidya.satu;

public class Barang{
    private String idProduk;
    private String nama;
    private Double harga;

    public Barang (String idProduk, String nama, Double harga){
        this.idProduk=idProduk;
        this.nama=nama;
        this.harga=harga;
    }
    public Barang (String idProduk, String nama){
        this.idProduk=idProduk;
        this.nama=nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return this.nama;
    }
    public void setHarga(Double harga){
        this. harga=harga;
    }
    public Double getharga(){
        return this.harga;
    }
    public String getidProduk(){
        return this.idProduk;
    }
}
