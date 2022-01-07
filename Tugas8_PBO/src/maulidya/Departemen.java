package maulidya;

import java.util.ArrayList;

public class Departemen {
    private String nama;

    private ArrayList<Karyawan> krn = new ArrayList<>();

    public Departemen (String nama) {
        this.nama=nama;
    }

    public void addKaryawan(Karyawan k){
        krn.add(k);
    }

    public void displayAll(){
        for(int i =0; i < krn.size(); i++){
            krn.get(i).display();
        }
    }

    public void displayKontrak(){
        for (Karyawan k: krn){
            if (k instanceof Kontrak){
                k.display();
            }
        }
    }
    public void displayTetap(){
        for (Karyawan k : krn){
            if(k instanceof Tetap){
                k.display();
            }
        }
    }
}


