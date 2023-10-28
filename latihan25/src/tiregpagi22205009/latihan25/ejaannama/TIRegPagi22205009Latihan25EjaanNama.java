/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiregpagi22205009.latihan25.ejaannama;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Asmalik Hudri
 * Prodi    : Teknik Informatika
 * NIM      : 22205009
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 * ejaan nama yang inputannya berasal dari user
 * 
 */
public class TIRegPagi22205009Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = scanner.next();
        System.out.println("\nEjaan untuk \""+nama+ "\" adalah : ");
        int panjangNama = nama.length();
        for (int i = 0; i < panjangNama; i++){
            char huruf = nama.charAt(i);
            System.out.println("Huruf ke-"+(i+1)+" :"+huruf);  
        }
    }
}
