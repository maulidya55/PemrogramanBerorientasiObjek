package Maulidya.dua;

public class Segitiga {

    public void cari(double alas, double tinggi){
        double luas = (alas * tinggi)/ 2;
        double keliling = alas + alas + alas;
        System.out.println("Luas :"+ luas);
        System.out.println("Keliling :"+ keliling);

    }

    public void cari(double alas){
        double tinggi = Math.pow(alas,2) - Math.pow((alas/2), 2);
        double luas = (alas * tinggi)/2;
        double keliling = alas + alas + alas;

        System.out.println("Luas : "+ luas);
        System.out.println("Keliling :"+ keliling);
    }



}

