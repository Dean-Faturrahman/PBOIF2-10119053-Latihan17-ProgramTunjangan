/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program untuk menghitung tunjangan
 */
public class PBOIF210119053Latihan17ProgramTunjangan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
            String status;
            int gajiPokok;
            double tunjangan, totalGaji;
                    
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");                
        gajiPokok = input.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        status = input.next();
        
        if ("Menikah".equals(status)){
            tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0;
        }
        totalGaji = gajiPokok + tunjangan;
        
        System.out.println("");
        System.out.println("========Hasil Perhitungan Gaji========");
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan  : " + tunjangan);
        System.out.println("Total Gaji : " + totalGaji);
    }
    
}
