package tugas3.msim4301;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author agus
 */
public abstract class Kendaraan {
    private final String nama;
    private final double hargaSewa;
    private final String jenis;
    private boolean tersedia;

    public Kendaraan(String nama, double hargaSewa, String jenis, boolean tersedia) {
        this.nama = nama;
        this.hargaSewa = hargaSewa;
        this.jenis = jenis;
        this.tersedia = tersedia;
    }

    public String getNama() { return nama; }
    public double getHargaSewa() { return hargaSewa; }
    public String getJenis() { return jenis; }
    public boolean isTersedia() { return tersedia; }

    public void setTersedia(boolean tersedia) { this.tersedia = tersedia; }

    public abstract void tampilKendaraan();
}