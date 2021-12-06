/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import Projectperjalananmobil.MPV;
import Projectperjalananmobil.Perjalanan;
import Projectperjalananmobil.SUV;
import Projectperjalananmobil.Sedan;
import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangunruang.Bola;
import bangunruang.Tabung;

/**
 *
 * @author Salman
 */
public class MainClass {

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jari = 10;
        print("Lingkaran (Jari = 7)");
        lingkaran.tampilHasil();
        Persegi persegi = new Persegi();
        persegi.sisi = 420;
        print("Persegi (Sisi = 420)");
        persegi.tampilHasil();
        Bola bola = new Bola();
        bola.jari = 100;
        print("Bola (Jari = 100)");
        bola.tampilHasil();
        Tabung tabung = new Tabung();
        tabung.jari = 10;
        tabung.tinggi = 10;
        print("Tabung (Jari = 10 , tinggi = 10)");
        tabung.tampilHasil();

        mobil();
    };

    public static void mobil() {
    Perjalanan[] perjalanans = {new Perjalanan('A',new Sedan() , 169 , 60.0),new Perjalanan('B',new Sedan() , 538 , 65.0),new Perjalanan('C',new SUV() , 662 , 57.0),new Perjalanan('D',new SUV() , 534.0 , 62.0),new Perjalanan('E',new MPV() , 541.0 , 64.0),new Perjalanan('F',new MPV() , 433.0 , 53.0) };
        for (Perjalanan perjalanan : perjalanans) {
            print("Mobil " + perjalanan.getNama());
            print("Bahan Bakar Minimal  : " + perjalanan.getJenis_mobil().konsumsiBahanBakar(perjalanan.getJarak()) + " Liter");
            print("Kecepatan            : " + (int) ( perjalanan.getJarak() / perjalanan.getKecepatan()) + " jam ");
        }

    }

    public static void print(String string) {
       System.out.println(string);
    }
}

