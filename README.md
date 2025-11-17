📚 Sistem Informasi Perpustakaan - Java OOP
Program sederhana Sistem Informasi Perpustakaan yang mengimplementasikan konsep Object-Oriented Programming (OOP) dengan Clean Architecture.
🏗️ Struktur Project
perpustakaan-app/

├── 📄 Main.java

├── 📂 entity/

│ ├── 📄 Buku.java

│ ├── 📄 Kategori.java

│ └── 📄 Penulis.java

├── 📂 repository/

│ └── 📄 DataDummyRepository.java

├── 📂 service/

│ └── 📄 TampilanService.java

└── 📂 app/

└── 📄 Aplikasi.java

📋 Deskripsi Class
🎯 Entity Classes

- Kategori - Representasi kategori buku (Teknologi, Filsafat, dll)

- Penulis - Representasi penulis buku

- Buku - Representasi buku dengan relationship ke Kategori dan Penulis

🗃️ Repository Layer

- DataDummyRepository - Mengelola data dummy dan menyediakan akses ke data

🎨 Service Layer

- TampilanService - Business logic untuk menampilkan data

🚀 Application Layer

- Aplikasi - Mengkoordinasi alur program

Main - Entry point aplikasi

📦 Data Dummy
Program dilengkapi dengan data dummy yang terdiri dari:

7 Kategori: Teknologi, Filsafat, Sejarah, Agama, Psikologi, Politik, Fiksi

10 Penulis

35 Buku (5 buku per kategori)
