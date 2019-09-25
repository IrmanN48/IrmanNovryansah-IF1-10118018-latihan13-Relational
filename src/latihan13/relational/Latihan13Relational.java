/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan13.relational;

/**
 *
 * @author Aero
 * NAMA     : Irman Novryansah
 * KELAS    : IF-1
 * NIM      : 10118018
 * Deskripsi Program : Program ini untuk menampilkan relasi dari dua variabel
 */
public class Latihan13Relational {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //Variabel
        int bil1 = 10;
        int bil2 = 20;
        
        //Tampilan
        System.out.println("a == b = " + (bil1 == bil2));
        System.out.println("a != b = " + (bil1 != bil2));
        System.out.println("a > b = " + (bil1 > bil2));
        System.out.println("a < b = " + (bil1 < bil2));
        System.out.println("b >= a = " + (bil2 >= bil1));
        System.out.println("b <= a = " + (bil2 <= bil1));
    }
    
}
