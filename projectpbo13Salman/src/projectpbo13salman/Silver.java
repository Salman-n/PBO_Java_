/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo13salman;

/**
 *
 * @author Salman
 */
public class Silver {
  private static int harga ;
    private   static int diskon;
    private   static int poinperhari;

    public static long poin(long hari) {
        return poinperhari * hari;
    }
    public static double totalSewa(long hari) {
        return hitungDiskon(harga * hari);
    }

    public static void setHarga(int inputharga) {
     harga = inputharga;
    }
    public  void setDiskon(int inputdiskon) {
        diskon = inputdiskon;
    }
    public  void setPoinPerHari(int inputpoin) {
        poinperhari = inputpoin;
    }

    private static double hitungDiskon(long total) {
        int idiskon = 100 - diskon;
        return total * idiskon / 100;
    }
}
