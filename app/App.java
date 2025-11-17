package app;

import service.TampilanService;

public class App {

    private TampilanService tampilanService;

    public App() {
        this.tampilanService = new TampilanService();
    }

    public void jalankan() {
        System.out.println(" SISTEM INFORMASI PERPUSTAKAAN ");
        System.out.println("===============================");
        // tampilkan statistik
        tampilanService.tampilkanStatistik();

        System.out.println();

        for (int i = 0; i < 60; i++) {
            System.out.print("=");
        }
        System.out.println();

        // Tampilkan buku per kategori
        tampilanService.tampilkanBukuPerKategori();

        System.out.println();
        for (int i = 0; i < 60; i++) {
            System.out.print("=");
        }
        System.out.println();

        // Tampilkan semua buku (detail lengkap)
        tampilanService.tampilkanSemuaBuku();
    }
}
