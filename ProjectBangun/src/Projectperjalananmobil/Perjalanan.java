/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projectperjalananmobil;

/**
 *
 * @author Salman
 */
public class Perjalanan {
    public char nama;
    public Mobil jenis_mobil;
    public double jarak;
    public double kecepatan;

    public Perjalanan(char nama, Mobil jenis_mobil, double jarak, double kecepatan) {
        this.nama = nama;
        this.jenis_mobil = jenis_mobil;
        this.jarak = jarak;
        this.kecepatan = kecepatan;
    }

    public char getNama() {
        return nama;
    }

    public void setNama(char nama) {
        this.nama = nama;
    }

    public Mobil getJenis_mobil() {
        return jenis_mobil;
    }

    public void setJenis_mobil(Mobil jenis_mobil) {
        this.jenis_mobil = jenis_mobil;
    }

    public double getJarak() {
        return jarak;
    }

    public void setJarak(double jarak) {
        this.jarak = jarak;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
}
