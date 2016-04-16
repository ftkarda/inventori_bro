/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

/**
 *
 * @author ardaf
 */
public class Perusahaan {
 private String namaPerusahaan;
    private ArrayList<Petugas> petugas;
    private ArrayList<Barang> barang;
    private ArrayList<Gudang> gudang;
    
    public Perusahaan(){
    }
    
    public Perusahaan(String namaPerusahaan){
        this.namaPerusahaan= namaPerusahaan;
    }

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }
    
    
    
    
}