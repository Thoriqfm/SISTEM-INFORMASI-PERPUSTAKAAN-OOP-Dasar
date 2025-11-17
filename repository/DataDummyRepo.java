package repository;

import entity.Buku;
import entity.Kategori;
import entity.Penulis;

public class DataDummyRepo {

    private Kategori[] kategoriList;
    private Buku[] bukuList;
    private Penulis[] penulisList;
    private int jumlahKategori;
    private int jumlahBuku;
    private int jumlahPenulis;

    public DataDummyRepo() {
        this.kategoriList = new Kategori[10];
        this.bukuList = new Buku[50];
        this.penulisList = new Penulis[20];
        this.jumlahKategori = 0;
        this.jumlahBuku = 0;
        this.jumlahPenulis = 0;

        initiateDummy();

    }

    private void initiateDummy() {
        makeKategoriDummy();
        makePenulisDummy();
        makeBukuDummy();
    }

    private void makeKategoriDummy() {
        tambahKategori(new Kategori("A01", "Teknologi"));
        tambahKategori(new Kategori("A02", "Filsafat"));
        tambahKategori(new Kategori("A03", "Sejarah"));
        tambahKategori(new Kategori("A04", "Agama"));
        tambahKategori(new Kategori("A05", "Psikologi"));
        tambahKategori(new Kategori("A06", "Politik"));
        tambahKategori(new Kategori("A07", "Fiksi"));
    }

    private void makePenulisDummy() {
        tambahPenulis(new Penulis("P01", "Thoriq Farrel"));
        tambahPenulis(new Penulis("P02", "Budi Wicaksono"));
        tambahPenulis(new Penulis("P03", "Scarya Haldis"));
        tambahPenulis(new Penulis("P04", "James Bond"));
        tambahPenulis(new Penulis("P05", "Xavier Jase"));
        tambahPenulis(new Penulis("P06", "Max Xavier"));
        tambahPenulis(new Penulis("P07", "Hercules Charles"));
        tambahPenulis(new Penulis("P08", "Pedri Jose"));
        tambahPenulis(new Penulis("P09", "Bortotelo Xavier"));
        tambahPenulis(new Penulis("P10", "Mark Jarvis"));
    }

    private void makeBukuDummy() {
        // Buku Teknologi 5 buku
        buatBuku("B-001", "Introducing to Java", 2020, "A01", new String[]{"P01"});
        buatBuku("B-002", "Tutorial SQL", 2021, "A01", new String[]{"P01", "P02"});
        buatBuku("B-003", "How to Compile My Golang?", 2023, "A01", new String[]{"P03"});
        buatBuku("B-004", "Backend Tutorial for Beginner", 2018, "A01", new String[]{"P01", "P04"});
        buatBuku("B-005", "Node JS Tutorial", 2023, "A01", new String[]{"P05"});
        // Buku Filsafat 5 buku
        buatBuku("B-006", "Filsafat Barat Klasik", 2015, "A02", new String[]{"P02"});
        buatBuku("B-007", "Etika dan Moral", 2017, "A02", new String[]{"P03"});
        buatBuku("B-008", "Pemikiran Modern", 2019, "A02", new String[]{"P04", "P05"});
        buatBuku("B-009", "Filsafat Timur", 2016, "A02", new String[]{"P01"});
        buatBuku("B-010", "Logika Filosofis", 2020, "A02", new String[]{"P02"});
        // Buku Sejarah 5 buku
        buatBuku("B-011", "Sejarah Indonesia Kuno", 2014, "A03", new String[]{"P06"});
        buatBuku("B-012", "Perang Dunia II", 2018, "A03", new String[]{"P07"});
        buatBuku("B-013", "Sejarah Eropa Abad Pertengahan", 2016, "A03", new String[]{"P08"});
        buatBuku("B-014", "Revolusi Industri", 2019, "A03", new String[]{"P06", "P09"});
        buatBuku("B-015", "Sejarah Asia Tenggara", 2017, "A03", new String[]{"P10"});
        // Buku Agama 5 buku
        buatBuku("B-016", "Studi Al-Quran", 2015, "A04", new String[]{"P08"});
        buatBuku("B-017", "Filsafat Agama", 2018, "A04", new String[]{"P09"});
        buatBuku("B-018", "Sejarah Peradaban Islam", 2016, "A04", new String[]{"P10"});
        buatBuku("B-019", "Etika dalam Agama", 2019, "A04", new String[]{"P07"});
        buatBuku("B-020", "Tasawuf Modern", 2020, "A04", new String[]{"P06"});
        // Buku Psikologi 5 buku
        buatBuku("B-021", "Psikologi Perkembangan", 2017, "A05", new String[]{"P04"});
        buatBuku("B-022", "Teori Kepribadian", 2018, "A05", new String[]{"P05"});
        buatBuku("B-023", "Psikologi Sosial", 2019, "A05", new String[]{"P03", "P02"});
        buatBuku("B-024", "Kesehatan Mental", 2020, "A05", new String[]{"P01"});
        buatBuku("B-025", "Psikologi Kognitif", 2021, "A05", new String[]{"P10"});
        // Buku Politik 5 buku
        buatBuku("B-026", "Sistem Politik Indonesia", 2016, "A06", new String[]{"P07"});
        buatBuku("B-027", "Teori Politik Modern", 2018, "A06", new String[]{"P08"});
        buatBuku("B-028", "Demokrasi dan Masyarakat", 2019, "A06", new String[]{"P09"});
        buatBuku("B-029", "Kebijakan Publik", 2020, "A06", new String[]{"P06"});
        buatBuku("B-030", "Hubungan Internasional", 2021, "A06", new String[]{"P05"});
        // Buku Fiksi 5 buku
        buatBuku("B-031", "Negeri 5 Menara", 2015, "A07", new String[]{"P10"});
        buatBuku("B-032", "Laskar Pelangi", 2014, "A07", new String[]{"P09"});
        buatBuku("B-033", "Bumi Manusia", 2016, "A07", new String[]{"P08"});
        buatBuku("B-034", "Perahu Kertas", 2017, "A07", new String[]{"P07"});
        buatBuku("B-035", "Sang Pemimpi", 2018, "A07", new String[]{"P06"});
    }

    private void buatBuku(String isbn, String judul, int tahunTerbit, String kategoriID, String[] penulisIds) {
        Kategori kategori = getKategoriByID(kategoriID);
        if (kategori != null) {
            Buku buku = new Buku(isbn, judul, tahunTerbit, kategori, penulisIds.length);

            for (String penulisID : penulisIds) {
                Penulis penulis = getPenulisByID(penulisID);
                if (penulis != null) {
                    buku.tambahPenulis(penulis);
                }

            }
            tambahBuku(buku);
        }
    }

    private void tambahKategori(Kategori kategori) {
        if (jumlahKategori < kategoriList.length) {
            kategoriList[jumlahKategori] = kategori;
            jumlahKategori++;
        }
    }

    private void tambahBuku(Buku buku) {
        if (jumlahBuku < bukuList.length) {
            bukuList[jumlahBuku] = buku;
            jumlahBuku++;
        }
    }

    private void tambahPenulis(Penulis penulis) {
        if (jumlahPenulis < penulisList.length) {
            penulisList[jumlahPenulis] = penulis;
            jumlahPenulis++;
        }
    }

    private Kategori getKategoriByID(String id) {
        for (int i = 0; i < jumlahKategori; i++) {
            if (kategoriList[i].getID().equals(id)) {
                return kategoriList[i];
            }
        }
        return null;
    }

    private Penulis getPenulisByID(String id) {
        for (int i = 0; i < jumlahPenulis; i++) {
            if (penulisList[i].getID().equals(id)) {
                return penulisList[i];
            }
        }
        return null;
    }

    public Kategori[] getAllKategori() {
        Kategori[] result = new Kategori[jumlahKategori];
        for (int i = 0; i < jumlahKategori; i++) {
            result[i] = kategoriList[i];
        }
        return result;
    }

    public Buku[] getAllBuku() {
        Buku[] result = new Buku[jumlahBuku];
        for (int i = 0; i < jumlahBuku; i++) {
            result[i] = bukuList[i];
        }
        return result;
    }

    public Penulis[] getAllPenulis() {
        Penulis[] result = new Penulis[jumlahPenulis];
        for (int i = 0; i < jumlahPenulis; i++) {
            result[i] = penulisList[i];
        }
        return result;
    }

    public Buku[] getBukubyKategori(String kategoriID) {
        Buku[] temp = new Buku[jumlahBuku];
        int count = 0;

        for (int i = 0; i < jumlahBuku; i++) {
            if (bukuList[i].getKategori().getID().equals(kategoriID)) {
                temp[count] = bukuList[i];
                count++;
            }
        }

        Buku[] result = new Buku[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }
}
