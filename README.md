# Aplikasi Manajemen Rental Kendaraan

Repositori ini berisi implementasi program Java sederhana untuk manajemen penyewaan kendaraan berbasis console. Program ini dikembangkan sebagai bagian dari tugas kuliah *Pemrograman Berbasis Objek*.

## 🎯 Fitur Utama

- Menambahkan data kendaraan (Mobil, Motor, Bus)
- Menampilkan daftar kendaraan yang tersedia
- Menyewa kendaraan (dengan validasi ketersediaan)
- Menghitung total biaya sewa
- Mencetak struk penyewaan ke file teks
- Menyimpan data kendaraan ke file

## 📚 Konsep OOP yang Diimplementasikan

- **Abstraksi**: Menggunakan kelas abstrak `Kendaraan`
- **Inheritance**: `Mobil`, `Motor`, dan `Bus` mewarisi dari `Kendaraan`
- **Encapsulation**: Atribut dibuat private dan diakses lewat getter/setter
- **Polymorphism**: Method `tampilKendaraan()` di-override sesuai jenis kendaraan
- **Exception Handling**: Menangani kasus kendaraan tidak tersedia atau input salah
- **I/O dan File Operation**: Menyimpan data kendaraan dan struk penyewaan ke file `.txt`

## 🛠️ Cara Menjalankan

1. Clone repositori ini
2. Buka project di **NetBeans** atau IDE Java lainnya
3. Jalankan file `Main.java`
4. Ikuti instruksi menu di terminal

## 📁 Struktur File

├── Main.java
├── Kendaraan.java
├── Mobil.java
├── Motor.java
├── Bus.java
├── RentalKendaraan.java
├── Penyewaan.java
├── struk.txt (output struk)
