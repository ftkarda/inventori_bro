/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

/**
 *
 * @author hafizha
 */
import java.util.*;

public class DataPetugas {
    private ArrayList<Petugas> petugas;
    private ArrayList<Barang> barang;
    private Petugas p;
    
    public DataPetugas(){
        this.petugas= new ArrayList();
        this.p= new Petugas("");
    }
    
    public void editPetugas(String nama, long idPetugas, String alamatPetugas, long telpPetugas, int thnMasukPetugas){
        for (Petugas petugas1: this.petugas){
            this.p.setNama(nama);
            this.p.setIdPetugas(idPetugas);
            this.p.setAlamatPetugas(alamatPetugas);
            this.p.setTelpPetugas(telpPetugas);
            this.p.setThnMasukPetugas(thnMasukPetugas);
        }
    }
    
    public void hapusPetugas(){
          
    }

    
    
}
