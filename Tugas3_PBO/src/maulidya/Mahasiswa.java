package maulidya;

public class Mahasiswa {
    private String nim;
    private String nama;

    public Mahasiswa(String nim, String nama) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }
}

