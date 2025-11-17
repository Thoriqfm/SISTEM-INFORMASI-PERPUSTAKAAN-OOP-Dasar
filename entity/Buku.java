package entity;

public class Buku {

    private String isbn;
    private String judul;
    private int tahunTerbit;
    private Kategori kategori;
    private Penulis[] penulis;
    private int jumlahPenulis;

    public Buku(String isbn, String judul, int tahunTerbit, Kategori kategori, int maxPenulis) {
        this.isbn = isbn;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.kategori = kategori;
        this.penulis = new Penulis[maxPenulis];
        this.jumlahPenulis = 0;
    }

    // Getter
    public String getIsbn() {
        return isbn;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public Penulis[] getPenulis() {
        return penulis;
    }

    public int getJumlahPenulis() {
        return jumlahPenulis;
    }

    // Tambah jumlah penulis
    public void tambahPenulis(Penulis penulisBaru) {
        if (jumlahPenulis < penulis.length) {
            penulis[jumlahPenulis] = penulisBaru;
            jumlahPenulis++;
        }
    }
}
