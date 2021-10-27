package Maulidya.satu;

public class Lingkaran {
    // jejari r = float diameter d = double

    static float luas(float r){

        return (float) (Math.PI * r * r);
    }

    static double luas(double d){
        double jejari = d/2;
        return (Math.PI * jejari * jejari);
    }

    static float keliling(float r){
        return (float) (2 * Math.PI * r);
    }

    static double keliling(double d){
        double jejari = d/2;
        return (Math.PI * jejari * jejari);
    }
}

