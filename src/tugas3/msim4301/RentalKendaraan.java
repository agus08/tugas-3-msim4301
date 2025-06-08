/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3.msim4301;
import java.io.*;
import java.util.*;

/**
 *
 * @author agus
 */
public class RentalKendaraan {
    private final ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();

    public void tambahKendaraan(Kendaraan k) {
        daftarKendaraan.add(k);
    }

    public void tampilkanKendaraanTersedia() {
        for (Kendaraan k : daftarKendaraan) {
            if (k.isTersedia()) k.tampilKendaraan();
        }
    }

    public Kendaraan cariKendaraan(String nama) {
        for (Kendaraan k : daftarKendaraan) {
            if (k.getNama().equalsIgnoreCase(nama)) return k;
        }
        return null;
    }

    public void simpanKeFile(String filename) throws IOException {
        BufferedWriter writer;
        writer = new BufferedWriter(new FileWriter(filename));
        for (Kendaraan k : daftarKendaraan) {
            writer.write(k.getJenis() + "," + k.getNama() + "," + k.getHargaSewa() + "," + (k.isTersedia() ? "true" : "false"));
            if (k instanceof Mobil mobil) writer.write("," + mobil.transmisi);
            if (k instanceof Motor motor) writer.write("," + motor.cc);
            if (k instanceof Bus bus) writer.write("," + bus.kapasitas);
            writer.newLine();
        }
        writer.close();
    }
}