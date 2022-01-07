package maulidya;

public class Kontrak extends Karyawan{
    private int waktu;

    public Kontrak(String nama, double gaDas, int waktu) {
        super(nama, gaDas);
        this.waktu = waktu;
    }

    public  void display() {
        super.display();
        System.out.println("Waktu :" + waktu);
    }
}
