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
public class Platinum extends Gold{
    static {
        harga = 45000;
        diskon = 3;
        cashback = 10000.00;
        poinperhari = 10;
    }
    private static double jmlpulsa = 5000.00;
    public static double pulsa(long hari) {
        return jmlpulsa * hari;
    }
}
