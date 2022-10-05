/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversi;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class Konversi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nim, nama, prodi, matkul;
    int nilai;
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan nim = ");
        nim = masukan.nextLine();
        System.out.println("Masukan nama = ");
        nama = masukan.nextLine();
        System.out.println("Masukan matkul= ");
        matkul= masukan.nextLine();
        System.out.println("Masukan Nilai Angka = ");
        nilai= masukan.nextInt();
//    ===Mengambil jurusan dari nim substring
//        prodi= nim.substring(3);
//        System.out.println("prodi");
//    ====MENGAMBIL JURUSAN DARI NIM
prodi =nim.substring(3, 5);
//        if (prodi.equals("51")){
//            System.out.println("program study= S-1 SI ");
//        }else if (prodi.equals("52")) {
//            System.out.println("program study= S-1 TI");
//        }else if(prodi.equals("31")) {
//            System.out.println("program study= D-3 SI");
//        }else {
//            System.out.println("progres tidak tersedia ");
//      }
        switch (prodi) {
            case "52":
                System.out.println("program study 5-2 TI");
                break;
            case"51":
                System.out.println("program study 5-1 SI");
                break;
            case"31":
                System.out.println("program study D-3 SI");
                break;
            default :
                System.out.println("prodi tidak tersedia");
                break;
                
        }
 
    }
   
    
}
