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
public class UmurBarang {
   private int tanggal;
    private int bulan;
    private int tahun;
    
    public UmurBarang(int tanggal, int bulan, int tahun){
        this.tanggal= tanggal;
        this.bulan= bulan;
        this.tahun=tahun;
    }
    
    public int getUmurBarang() {
        return tanggal+ (bulan*30)+ ((tahun-1990)*365);
}

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    public String toStrings(){
        return this.toString()+"-"+this.bulan+"-"+this.tahun;
    }  

}