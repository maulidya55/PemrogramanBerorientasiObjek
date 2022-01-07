package maulidya;

public class Main {
    public static void main(String [] args ){
        Departemen dpn1 = new Departemen("Pemasaran");
        System.out.println("Departemen Pemasaran");
        System.out.println("");
        Karyawan krn1 = new Tetap("Rein", 4000000, 500000);
        Karyawan krn2 = new Kontrak("Angga", 2500000, 180);

        dpn1.addKaryawan(krn1);
        dpn1.addKaryawan(krn2);

        System.out.println("1. Karyawan tetap");
        dpn1. displayTetap();
        System.out.println();
        System.out.println("2. Karyawan Kontrak");
        dpn1.displayKontrak();
        System.out.println();
        System.out.println("................");

        Departemen dpn2 = new Departemen("Keuangan");
        System.out.println("Departemen Keuangan");
        System.out.println("");
        Karyawan krn3 = new Tetap("Iqbal", 5000000, 700000);
        Karyawan krn4 = new Kontrak("Zidny", 300000, 180);
        Karyawan krn5 = new Kontrak("Stella", 3000000, 180);


        dpn2.addKaryawan(krn3);
        dpn2.addKaryawan(krn4);
        dpn2.addKaryawan(krn5);

        System.out.println("1. Karyawan tetap");
        dpn2. displayTetap();
        System.out.println();
        System.out.println("2. Karyawan Kontrak");
        dpn2.displayKontrak();
        System.out.println();
        System.out.println("................");

        Departemen dpn3 = new Departemen("IT");
        System.out.println("Departemen IT");
        System.out.println("");
        Karyawan krn6 = new Tetap("Naufal", 8000000, 700000);
        Karyawan krn7 = new Tetap("Maudy", 8000000, 700000);

        dpn3.addKaryawan(krn6);
        dpn3.addKaryawan(krn7);

        System.out.println("1. Karyawan tetap");
        dpn3. displayTetap();
        System.out.println();
        System.out.println("2. Karyawan Kontrak");
        dpn3.displayKontrak();
        System.out.println();
        System.out.println("................");

        System.out.println("Karyawan Keseluruhan");
        dpn1.displayAll();
        dpn2.displayAll();
        dpn3.displayAll();
    }
}



