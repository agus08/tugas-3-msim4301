/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3.msim4301;

/**
 *
 * @author agus
 */
public class Mobil extends Kendaraan {
    String transmisi;

    public Mobil(String nama, double hargaSewa, String transmisi) {
        super(nama, hargaSewa, "Mobil", true);
        this.transmisi = transmisi;
    }

    @Override
    public void tampilKendaraan() {
        System.out.println("[Mobil] " + getNama() + " | Transmisi: " + transmisi + " | Harga: Rp" + getHargaSewa() + ", Status: " + (isTersedia() ? "Tersedia" : "Disewa"));
    }
}
