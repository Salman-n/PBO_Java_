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
public class MPV  extends Mobil{

    @Override
    public double konsumsiBahanBakar(double jarak) {
        return (int) jarak / 14;
    }
}

