package maulidya;

public class Main {

    public static void main(String[] args) {
        int angka = 1;
        Jurusan D3IF = new Jurusan("D3IF", "Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Mahasiswa rendi = new Mahasiswa("6701", "Rendi");
        Mahasiswa chacha = new Mahasiswa("6702", "Chaha");
        Mahasiswa agus = new Mahasiswa("6703", "Agus");
        D3IF.addMhs(rendi);
        D3IF.addMhs(chacha);
        D3IF.addMhs(agus);
        System.out.println("kode: "+ D3IF.getKode());
        System.out.println("nama: "+ D3IF.getNama());
        System.out.println("daftar mahasiswa ");
        for (Mahasiswa mhs: D3IF.getMhs()
        ) {
            System.out.println((angka++)+". "+ mhs.getNim()+ "-"+mhs.getNama());
        }
        System.out.println();
        angka =1;
        Jurusan D3SI = new Jurusan("D3SI", "Diploma 3 Sistem Informasi");
        Mahasiswa ridwan = new Mahasiswa("6301", "Ridwan");
        Mahasiswa siska = new Mahasiswa("6302", "Siska");
        Mahasiswa zayn = new Mahasiswa("6303", "Zayn");
        Mahasiswa rahmat = new Mahasiswa("6304", "Rahmat");
        D3SI.addMhs(ridwan);
        D3SI.addMhs(siska);
        D3SI.addMhs(zayn);
        D3SI.addMhs(rahmat);
        System.out.println("kode: "+ D3SI.getKode());
        System.out.println("nama: "+ D3SI.getNama());
        System.out.println("daftar mahasiswa ");
        for (Mahasiswa mhs: D3SI.getMhs()
        ) {
            System.out.println((angka++)+". "+ mhs.getNim()+ "-"+mhs.getNama());

        }

    }
}


