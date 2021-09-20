/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ryanbrilianfatsena
 */
public class Kerucut {
    
    // atribut
    public int r;
    public int s;
    public int t;
    
    // methods
    public void hitungVolumeKerucut(){
        double vol = ((3.14 * r * r) * t) / 3;
        System.out.println("Hasil Volume Kerucut yaitu :" + vol);
    }
    
    public void hitungSelimutKerucut(){
        double selimut = 3.14 * r * (r + s);
        System.out.println("Hasil Selimut Kerucut yaitu :" + selimut);
    }
}
