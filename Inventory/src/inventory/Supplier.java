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
public class Supplier extends Orang {
    private long idSupplier;
    private String alamatSupplier;
    private long telpSupplier;
    private int thnMasukSupplier;
    
    
    public Supplier(String nama) {
        super(nama);
    }

    public long getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(long idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getAlamatSupplier() {
        return alamatSupplier;
    }

    public void setAlamatSupplier(String alamatSupplier) {
        this.alamatSupplier = alamatSupplier;
    }

    public long getTelpSupplier() {
        return telpSupplier;
    }

    public void setTelpSupplier(long telpSupplier) {
        this.telpSupplier = telpSupplier;
    }

    public int getThnMasuk() {
        return thnMasukSupplier;
    }

    public void setThnMasuk(int thnMasukSupplier) {
        this.thnMasukSupplier = thnMasukSupplier;
    }
    
 
    
    
}