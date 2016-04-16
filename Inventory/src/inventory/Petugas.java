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
public class Petugas extends Orang {
    private long idPetugas;
    private String alamatPetugas;
    private long telpPetugas;
    private int thnMasukPetugas;
   
    
    public Petugas(String nama) {
        super(nama);
    }


    public long getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(long idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getAlamatPetugas() {
        return alamatPetugas;
    }

    public void setAlamatPetugas(String alamatPetugas) {
        this.alamatPetugas = alamatPetugas;
    }

    public long getTelpPetugas() {
        return telpPetugas;
    }

    public void setTelpPetugas(long telpPetugas) {
        this.telpPetugas = telpPetugas;
    }

    public int getThnMasukPetugas() {
        return thnMasukPetugas;
    }

    public void setThnMasukPetugas(int thnMasukPetugas) {
        this.thnMasukPetugas = thnMasukPetugas;
    }
    
    
    
    
}