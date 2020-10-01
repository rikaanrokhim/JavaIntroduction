/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handphone;

/**
 *
 * @author lenovo
 */

// deklarasi isi dari class handphone
public class HandphoneMain {
    public static void main(String[] args) {
        Handphone xiaomi = new Handphone();
        xiaomi.merk = "Xiaomi Mi7";
        xiaomi.setPixelKamera(13);
        xiaomi.setKapasitasBatrai(3100);
        xiaomi.lebarLayar = 15;
        xiaomi.setHarga(7000000);
        
        System.out.println("Merk Handphone : " + xiaomi.merk);
        System.out.println("Jumlah pixel kamera : " + xiaomi.getPixelKamera());
        System.out.println("Kapasitas batrai : " + xiaomi.getKapasitasBatrai());
        System.out.println("Lebar layar : " + xiaomi.lebarLayar);
        System.out.println("Harganya : " + xiaomi.getHarga());
        
    }
}
