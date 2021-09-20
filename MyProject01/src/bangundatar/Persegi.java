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
public class Persegi {
    
    // atribut
    public String namaPersegi;
    public int sisi;
    
    // methods
    public void hitungLuasPersegi(){
        int luas = sisi * sisi;
        System.out.println("Hasil Luas Persegi " + namaPersegi + " yaitu: " + luas);
    }
    
    public void hitungKelilingPersegi(){
        int keliling = 4 * sisi;
        System.out.println("Hasil Keliling Persegi " + namaPersegi + " yaitu: " + keliling);
    }
}
