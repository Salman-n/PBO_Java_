/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author Salman
 */
public class Lingkaran extends BangunDatar {
    // atribut jari-jari
    public double jari;

    // method untuk hitung luas lingkaran
    @Override
    public double hitungLuas(){
        double luas = this.jari * this.jari * 3.14;
        return luas;
    }

    // method untuk hitung keliling
    @Override
    public double hitungKeliling(){
        double keliling = 2 * 3.14 * this.jari;
        return keliling;
    }
}
