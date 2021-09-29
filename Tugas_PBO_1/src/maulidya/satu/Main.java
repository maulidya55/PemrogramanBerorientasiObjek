package maulidya.satu;

public class Main{
    public static void main(String[] args){
        Barang barang1=new Barang("BRG-001","Tas Gucci");
        Barang barang2=new Barang("BRG-002","Printer Epson L355");
        barang1.setHarga(1200.0);
        barang2.setHarga(200.0);
        Barang barang3=new Barang("BRG-003","Koper",150.0);
        Barang barang4=new Barang("BRG-004","Helm",20.0);
        System.out.println(barang1.getidProduk());
        System.out.println(barang1.getNama());
        System.out.println(barang1.getharga());
        System.out.println();
        System.out.println(barang2.getidProduk());
        System.out.println(barang2.getNama());
        System.out.println(barang2.getharga());
        System.out.println();
        System.out.println(barang3.getidProduk());
        System.out.println(barang3.getNama());
        System.out.println(barang3.getharga());
        System.out.println();
        System.out.println(barang4.getidProduk());
        System.out.println(barang4.getNama());
        System.out.println(barang4.getharga());
        System.out.println();
        Double total=barang1.getharga()+barang3.getharga()+barang4.getharga();
        System.out.println("total BRG-001,BRG-002,BRG-003: "+total);


    }
}

