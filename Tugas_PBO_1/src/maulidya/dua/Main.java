package maulidya.dua;

public class Main {
    public static void main(String[] args){
        Buku buku1=new Buku("Harry Potter","J.K. Rowling",300000.0);
        Buku buku2=new Buku("UML","Ivar Jacobson",400000.0);
        System.out.println(buku1.getjudul());
        System.out.println(buku1.getpengarang());
        System.out.println(buku1.getHarga());
        System.out.println();
        System.out.println(buku2.getjudul());
        System.out.println(buku2.getpengarang());
        System.out.println(buku2.getHarga());
    }
}

