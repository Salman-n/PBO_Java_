/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo12salman;

/**
 *
 * @author user
 */
public class Silver {
    protected static int harga = 25000;
    protected  static int diskon = 1;
    protected  static int poinperhari = 1;

    public static long poin(long hari) {
        return poinperhari * hari;
    }
    public static double totalSewa(long hari) {
        return hitungDiskon(harga * hari);
    }

    private static double hitungDiskon(long total) {
        int idiskon = 100 - diskon;
        return total * idiskon / 100;
    }
}
