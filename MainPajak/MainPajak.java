/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectUTS;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class MainPajak {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pajak smartphone = new Pajak();
        
        System.out.print("masukan vendor: ");
        smartphone.setVendor(input.nextLine());
        
        System.out.print("masukan tipe: ");
        smartphone.setTipe(input.nextLine());
        
        System.out.print("masukan harga: ");
        smartphone.setHarga(input.nextDouble());
        
        smartphone.tampilkanInfo();
    }
}
