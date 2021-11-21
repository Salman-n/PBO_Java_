/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpbo12salman;

/**
 *
 * @author Salman Wiryansyah
 */
public class Gold extends Silver {
    static {
        harga = 35000;
        diskon = 2;
        poinperhari = 5;
    }
    protected static double cashback = 5000.00;

    public double cabe() {
        return cashback;
    }
}

