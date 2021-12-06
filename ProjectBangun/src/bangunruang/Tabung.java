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
public class Tabung extends BangunRuang {
    public double jari;
    public double tinggi;

    @Override
    public double hitungVolume() {
        double luas = 3.14 * this.jari * this.jari * this.tinggi;
        return luas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double keliling = (2 * this.jari + this.tinggi) + (2 * 3.14 * this.jari);
        return keliling;
    }
}

