/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.percabangan1;

import java.util.Scanner;

/**
 *
 * @author Lab Aplikasi
 */
public class PERCABANGAN1 {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukan Angka = ");
        int angka = masukan.nextInt();
        
        if (angka%2==0){
            if (angka>10){
            System.out.println("Angka"+angka + "adalah");
            System.out.println("Bilangan genap");
        }else {
            System.out.println("Angka"+ angka + "adalah");
            System.out.println("Bilangan ganjil");
        }
    }
}
}
            
//        }String hasil;
//        hasil = angka%2==0 ?"Bilangan genap";"bilangan ganjil";
//        System.out.println("hasil");
//    }
//}
