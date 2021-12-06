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
public class Bola extends BangunRuang {
    public double jari;

    @Override
    public double hitungVolume() {
        double luas = 4/3 * 3.14 * this.jari * this.jari * this.jari ;
        return luas;
    }

    @Override
    public double hitungLuasPermukaan() {
        double keliling = 4 * 3.14 * this.jari * this.jari;
        return keliling;
    }
}