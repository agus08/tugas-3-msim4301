/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3.msim4301;

/**
 *
 * @author agus
 */
public class Motor extends Kendaraan {
    int cc;

    public Motor(String nama, double hargaSewa, int cc) {
        super(nama, hargaSewa, "Motor", true);
        this.cc = cc;
    }

    @Override
    public void tampilKendaraan() {
        System.out.println("[Motor] " + getNama() + " | " + cc + "cc | Harga: Rp" + getHargaSewa() + ", Status: " + (isTersedia() ? "Tersedia" : "Disewa"));
    }
}