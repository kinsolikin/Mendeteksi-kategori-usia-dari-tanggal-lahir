/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;
import java.util.Scanner;
/**
 *
 * @author Core I3-3110M
 */
public class Uts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input = new java.util.Scanner (System.in);
        
        String Nama;
        int NIM;
        
        System.out.println("Masukkan nama mahasiswa : ");
        Nama = input.nextLine();
        System.out.println("Masukkan NIM mahasiswa : ");
        NIM = input.nextInt();
        
        System.out.println("Data Mahasiswa");
        System.out.println("Hallo "+Nama+" NIM mahasiswa "+NIM);
    }
    
}
