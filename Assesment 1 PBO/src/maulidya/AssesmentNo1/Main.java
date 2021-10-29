package maulidya.AssesmentNo1;

public class Main {
    public static void main(String[] args) {
        MarketPlace asuransidanDropshipper = new MarketPlace(
                "Asuransi dan Dropship",
                1,
                "N0001",
                "JNE",
                "Dropship1",
                "Surabaya",
                "Bejo",
                "Dayeuhkolot",
                40000.0f,
                "Bagas",
                "Surabaya",
                "Pakai",
                "Dropshipper",
                21000.0f);
        asuransidanDropshipper.printAsuransidanDropship();

        MarketPlace asuransi = new MarketPlace(
                "Asuransi",
                2,
                "N0003",
                "J&T",
                "Eiger",
                "Bandung Kopo",
                "Tini",
                "DayeuhKolot",
                40000.0f,
                "Pakai",
                16000.0f);
        asuransi.printAsuransi();

        MarketPlace normal = new MarketPlace (
                "Normal",
                3,
                "N0004",
                "Pos Indonesia",
                "Eiger",
                "Bandung Kopo",
                "Bambang",
                "DayeuhKolot",
                23000.0f);
        normal.printNormal();

        MarketPlace dropshipper = new MarketPlace(
                "Dropshipper",
                4,
                "N0002",
                "SiCepat",
                "Dropship2",
                "Bandung Kopo",
                "Joko",
                "Dayeuhkolot",
                "Maw",
                "Pontianak",
                "pakai",
                24000.0f);
        dropshipper.printDropship();





    }
}

