/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3.msim4301;

/**
 *
 * @author agus
 */
public class Bus extends Kendaraan {
    int kapasitas;

    public Bus(String nama, double hargaSewa, int kapasitas) {
        super(nama, hargaSewa, "Bus", true);
        this.kapasitas = kapasitas;
    }

    @Override
    public void tampilKendaraan() {
        System.out.println("[Bus] " + getNama() + " | Kapasitas: " + kapasitas + " org | Harga: Rp" + getHargaSewa() + ", Status: " + (isTersedia() ? "Tersedia" : "Disewa"));
    }
}