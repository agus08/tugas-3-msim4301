/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3.msim4301;

import java.util.Scanner;

/**
 *
 * @author agus
 */
public class Tugas3Msim4301 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RentalKendaraan rental = new RentalKendaraan();
        Penyewaan penyewaan = new Penyewaan();

        while (true) {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tambah Kendaraan");
            System.out.println("2. Tampilkan Kendaraan Tersedia");
            System.out.println("3. Sewa Kendaraan");
            System.out.println("4. Cetak Struk");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");

            int pilihan = input.nextInt(); input.nextLine();
            try {
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Jenis (Mobil/Motor/Bus): ");
                        String jenis = input.nextLine();
                        System.out.print("Nama: ");
                        String nama = input.nextLine();
                        System.out.print("Harga Sewa: ");
                        double harga = input.nextDouble(); input.nextLine();

                        if (jenis.equalsIgnoreCase("Mobil")) {
                            System.out.print("Transmisi: ");
                            String transmisi = input.nextLine();
                            rental.tambahKendaraan(new Mobil(nama, harga, transmisi));
                        } else if (jenis.equalsIgnoreCase("Motor")) {
                            System.out.print("CC Mesin: ");
                            int cc = input.nextInt(); input.nextLine();
                            rental.tambahKendaraan(new Motor(nama, harga, cc));
                        } else if (jenis.equalsIgnoreCase("Bus")) {
                            System.out.print("Kapasitas Penumpang: ");
                            int kapasitas = input.nextInt(); input.nextLine();
                            rental.tambahKendaraan(new Bus(nama, harga, kapasitas));
                        }
                    }
                    case 2 -> rental.tampilkanKendaraanTersedia();
                    case 3 -> {
                        System.out.print("Masukkan nama kendaraan: ");
                        String nama = input.nextLine();
                        Kendaraan k = rental.cariKendaraan(nama);
                        if (k == null) throw new Exception("Kendaraan tidak ditemukan.");
                        penyewaan.sewa(k);
                        System.out.println("Kendaraan berhasil disewa.");
                    }
                    case 4 -> {
                        penyewaan.cetakStruk("struk.txt");
                        System.out.println("Struk disimpan di 'struk.txt'");
                    }
                    case 5 -> System.exit(0);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
    
}
