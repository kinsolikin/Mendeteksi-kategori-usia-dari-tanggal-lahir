/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectjava1;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Projectjava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nama;
        int nim;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap Mahasiswa : ");
        nama = keyboard.nextLine();
        System.out.print("Masukkan NIM  Mahasiswa : ");
        nim = keyboard.nextInt();
        System.out.println("Data Yang Anda Masukkan :");
        System.out.println("Halllo " + nama + " Nim Mahasiswa anda adalah " + nim);
        
    }
    
}
