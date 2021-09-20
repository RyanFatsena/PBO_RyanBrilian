/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author ryanbrilianfatsena
 */
public class Lingkaran {
    
    // atribut
    public String namaLingkaran;
    public int r;
    
    // methods
    public void hitungLuasLingkaran(){
        double luas = 3.14 * r * r;
        System.out.println("Hasil Luas Lingkaran " + namaLingkaran + " yaitu: " + luas);
    }
    
    public void hitungKelilingLingkaran(){
        double keliling = 3.14 * 2 * r;
        System.out.println("Hasil Keliling Lingkaran " + namaLingkaran + " yaitu: " + keliling);
    }
}
