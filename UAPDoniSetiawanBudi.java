/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uap;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class UAPDoniSetiawanBudi {
    public static void main(String[] args) {
         Scanner masukan = new Scanner(System.in);
            int tahun;
            String nim, nama;
            String jurusan = "";
            String pilihan;
        do{
            
            System.out.print("Masukan NIM : ");
             nim = masukan.nextLine();

            System.out.print("Masukan NAMA : ");
            nama = masukan.nextLine();


            System.out.println();
            
            System.out.println("NIM         = "+ nim);
            System.out.println("NAMA       = "+ nama);

            String[] character = nim.split("\\.");

            tahun = Integer.parseInt(character[0]);
            

            System.out.println("Tahun Ajaran : " + "20" + tahun + " - 20" + (tahun + 1));

            switch (character[1])
            {
                case "31":
                    jurusan = "D3 - Sistem Informasi";
                    break;
                case "51":
                    jurusan = "S1 - Sistem Informasi";
                    break;
                case "52":
                    jurusan = "S1 - Teknologi Informasi";
                    break;
                default:
                    jurusan = "Jurusan anda tidak diketahui";
                    break;
            }

            System.out.println("Jurusan     = " + jurusan);
            System.out.println("No urut masuk   = " + character[2].replaceFirst("^0+(?!$)", ""));
            
            System.out.print("Apakah Anda ingin memasukkan data lagi [ya/tidak] : ");
            pilihan = masukan.nextLine();   
        } while (pilihan.equals("ya"));
        System.exit(0);
    }
    
}
   
    
