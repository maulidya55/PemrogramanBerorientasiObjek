package maulidya.dua;

public class Buku{
    private String judul;
    private String pengarang;
    private Double harga;

    public Buku (String judul, String pengarang, Double harga){
        this.judul=judul;
        this.pengarang=pengarang;
        this.harga=harga;
    }
    public void judul(String judul){
        this.judul=judul;
    }
    public String pengarang(){
        return this.pengarang;
    }
    public void setHarga(Double harga){
        this. harga=harga;
    }
    public String getjudul(){
        return this.judul;
    }
    public String getpengarang(){
        return this.pengarang;
    }
    public Double getHarga(){
        return this.harga;
    }
}
