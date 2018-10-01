/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan25_ejaannama;

import java.util.Scanner;

/**
 *
 *@author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Mengeja nama yang dimasukkan
 */
public class PBO2_10117081_Latihan25_EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        String namaDepan;
        int i = 0;
        int j = 1;
        
        Scanner nama = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk dieja\t : ");
        namaDepan = nama.next();
        String[] panjangNama = namaDepan.split("");
        
        System.out.println("");
        System.out.println("Ejaan untuk " + namaDepan + " adalah : ");
        while (i < panjangNama.length){
            System.out.println("Huruf ke-" + j + " : " + panjangNama[i]);
            j = j + 1;
            i = i + 1;
        }
        
        
    }
    
}
