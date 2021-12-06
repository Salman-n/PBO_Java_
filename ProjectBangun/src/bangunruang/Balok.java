/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author Salman
 */
public class Balok extends BangunRuang {
    public double tinggi;
    public double panjang;
    public double lebar;

    @Override
    public double hitungVolume() {
        double luas = this.panjang * this.lebar * this.tinggi;
        return luas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double keliling = (4 * this.panjang + this.lebar) + (2 * this.panjang * this.tinggi);
        return keliling;
    }
}