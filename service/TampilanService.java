package service;

import entity.*;
import repository.DataDummyRepo;

public class TampilanService {

    private DataDummyRepo repository;

    public TampilanService() {
        this.repository = new DataDummyRepo();
    }

    public void tampilkanSemuaBuku() {
        Buku[] semuaBuku = repository.getAllBuku();

        System.out.println("=== DAFTAR SEMUA BUKU PERPUSTAKAAN ===");
        System.out.println("Total: " + semuaBuku.length + " buku\n");

        for (Buku buku : semuaBuku) {
            tampilkanDetailBuku(buku);
        }
    }

    public void tampilkanBukuPerKategori() {
        Kategori[] semuKategori = repository.getAllKategori();

        System.out.println("=== BUKU BERDASARKAN KATEGORI ===");

        for (Kategori kategori : semuKategori) {
            Buku[] bukuKategori = repository.getBukubyKategori(kategori.getID());

            System.out.println("\n" + kategori.getName().toUpperCase() + " (" + bukuKategori.length + " buku)");

            for (Buku buku : bukuKategori) {
                System.out.println(" - " + buku.getJudul() + " (" + buku.getTahunTerbit() + ")");
                System.out.print("Penulis : ");
                Penulis[] penulis = buku.getPenulis();
                for (int i = 0; i < buku.getJumlahPenulis(); i++) {
                    System.out.print(penulis[i].getName());
                    if (i < buku.getJumlahPenulis() - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
    }

    public void tampilkanStatistik() {
        Kategori[] semuaKategori = repository.getAllKategori();
        Penulis[] semuaPenulis = repository.getAllPenulis();
        Buku[] semuaBuku = repository.getAllBuku();

        System.out.println("=== STATISTIK PERPUSTAKAAN ===");
        System.out.println("Jumlah Kategori : " + semuaKategori.length);
        System.out.println("Jumlah Penulis : " + semuaPenulis.length);
        System.out.println("Jumlah Buku : " + semuaBuku.length);

        System.out.println("\nKategori yang tersedia");
        for (Kategori kategori : semuaKategori) {
            Buku[] bukuKategori = repository.getBukubyKategori(kategori.getID());
            System.out.println(" ." + kategori.getName() + ": " + bukuKategori.length + " buku");
        }
    }

    private void tampilkanDetailBuku(Buku buku) {
        System.out.println("- " + buku.getJudul() + " (" + buku.getTahunTerbit() + ")");
        System.out.println("   ISBN: " + buku.getIsbn());
        System.out.println("   Kategori: " + buku.getKategori().getName());
        System.out.print("   Penulis: ");
        Penulis[] penulis = buku.getPenulis();
        for (int i = 0; i < buku.getJumlahPenulis(); i++) {
            System.out.print(penulis[i].getName());
            if (i < buku.getJumlahPenulis() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Garis pemisah antar buku
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
