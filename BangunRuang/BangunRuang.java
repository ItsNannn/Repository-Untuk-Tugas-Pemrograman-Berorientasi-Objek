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
public class BangunRuang { 

    //kubus
    public BangunRuang (int rusuk) {
        int volume = rusuk * rusuk * rusuk;
        int luas = rusuk * rusuk * 6;

        System.out.println("Volume dari kubus adalah: ");
        System.out.println(volume);
        System.out.println("Luas permukaan dari kubus adalah: ");
        System.out.println(luas);
    }
    
    //balok
    public BangunRuang (double panjang, double lebar, double tinggi) {
        double volume = panjang * lebar * tinggi;
        double luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        
        System.out.println("Volume dari balok adalah: ");
        System.out.println(volume);
        System.out.println("Luas permukaan dari balok adalah: ");
        System.out.println(luas);
    }
    
    //silinder
    public BangunRuang (double jari, double tinggi) {
        double volume = 3.14 * jari * jari * tinggi;
        double luas = 2 * 3.14 * jari * (jari * tinggi);
        
        System.out.println("Volume dari silinder adalah: ");
        System.out.println(volume);
        System.out.println("Luas permukaan dari silinder adalah: ");
        System.out.println(luas);
    }
    
    // bola
    public BangunRuang (double jari) {
        double volume = (4/3) * jari * jari * jari * 3.14;
        double luas = 4 * 3.14 * jari * jari;
        
        System.out.println("volume dari bola adalah: ");
        System.out.println(volume);
        System.out.println("Luas permukaan dari bola adalah: ");
        System.out.println(luas);
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // proses untuk penghitungan volume dan luas permukaan kubus
        System.out.println("masukkan nilai rusuk : ");
        int rusuk = input.nextInt();
        BangunRuang kubus = new BangunRuang(rusuk);
        
        System.out.println("----------------------------");
        
        // proses untuk penghitungan volume dan luas permukaan balok
        System.out.println("masukkan nilai panjang : ");
        double panjang = input.nextInt();
        System.out.println("masukkan nilai lebar : ");
        double lebar = input.nextInt();
        System.out.println("masukkan nilai tinggi : ");
        double tinggi = input.nextInt();
        BangunRuang balok = new BangunRuang(panjang, lebar, tinggi);
        
        System.out.println("----------------------------");
        
        // proses untuk penghitungan volume dan luas permukaan silinder
        System.out.println("masukkan nilai jari : ");
        double jari = input.nextInt();
        System.out.println("masukkan nilai tinggi : ");
        double tinggi2 = input.nextInt();
        BangunRuang silinder = new BangunRuang(jari, tinggi2);
        
        System.out.println("----------------------------");
        
        // proses untuk penghitungan volume dan luas permukaan bola
        System.out.println("masukkan nilai jari-jari : ");
        double jari2 = input.nextInt();
        BangunRuang bola = new BangunRuang(jari2);
    }
    
}
