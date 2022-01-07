package maulidya;


public class Tetap extends Karyawan {
    private double tuDas;

    public Tetap(String nama, double gaDas, double tuDas) {
        super(nama, gaDas);
        this.tuDas = tuDas;
    }

    public void display(){
        super.display();
        System.out.println("Tunjungan Dasar : " + tuDas);
    }
}

