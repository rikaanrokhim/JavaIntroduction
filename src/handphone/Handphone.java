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
public class Handphone {

    private int pixelKamera;
    private int kapasitasBatrai;
    public String merk;
    public int lebarLayar;
    private int harga; 
    
    
    // cod for setting pixel kamera
    public void setPixelKamera(int val) {
        pixelKamera = val;
    }
    public Integer getPixelKamera() {
        return pixelKamera;
    }
    public void setKapasitasBatrai(int val) {
        kapasitasBatrai = val;
    }
    public Integer getKapasitasBatrai() {
        return kapasitasBatrai;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setHarga(int val) {
        harga = val;
    }
    
    // code for getter harga
    public Integer getHarga() {
        return harga;
    }
    
    // code for output penghitungan
    public void harga(int duwit) {
        System.out.println("Handphone bermerk " + merk + "harganya Rp." + harga);
    }
}
