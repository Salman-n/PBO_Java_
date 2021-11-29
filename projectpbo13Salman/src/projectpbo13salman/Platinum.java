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
public class Platinum extends Gold{

    private double jmlpulsa = 5000.00;
    public  void setPulsa(double pulsa) {
        this.jmlpulsa = pulsa;
    }
    public  double pulsa(long hari) {
        return this.jmlpulsa * hari;
    }
}
