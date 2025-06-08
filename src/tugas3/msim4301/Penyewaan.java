/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3.msim4301;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author agus
 */
public class Penyewaan {
    private final ArrayList<Kendaraan> kendaraanDisewa = new ArrayList<>();

    public void sewa(Kendaraan k) throws Exception {
        if (!k.isTersedia()) throw new Exception("Kendaraan tidak tersedia untuk disewa.");
        kendaraanDisewa.add(k);
        k.setTersedia(false);
    }

    public double totalBiaya() {
        double total = 0;
        for (Kendaraan k : kendaraanDisewa) total += k.getHargaSewa();
        return total;
    }

    public void cetakStruk(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("===== STRUK PENYEWAAN =====\n");
            for (Kendaraan k : kendaraanDisewa) {
                writer.write(k.getJenis() + " - " + k.getNama() + " - Rp" + k.getHargaSewa() + "\n");
            }
            writer.write("Total Biaya: Rp" + totalBiaya() + "\n");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
