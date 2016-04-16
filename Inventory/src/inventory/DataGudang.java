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

public class DataGudang {
    private ArrayList <Gudang> gudang;
    private ArrayList <Barang> barang;
    private Gudang g;
    private int nBarang=0;
    
    public DataGudang(){
        this.gudang= new ArrayList();
        this.g = new Gudang();
    }
    
    public void editGudang(int lorong, String bagian){
        for (Gudang gudang1 : this.gudang){
            this.g.setLorong(lorong);
            this.g.setBagian(bagian);
        }
    }
    
    public void hapusBarang(int index){
        for(int i= index+1; i<this.nBarang;i++){
           //this.barang.get(i-1)=this.barang.get(i);
       }
       this.nBarang--;   
    }
    
    public int getnBarang(){
        return this.nBarang;
    }
    

    
    public void searchbyLokasi(String l){
       boolean cek= false;
       String tmp="";
       for(int i=0; i>this.nBarang; i++){
           if(l.equals(this.barang.get(i).getLokasi())){
               cek=true;
               tmp=this.barang.get(i).toString();
           }else{
               cek=false;
           }
       }
       if(cek=true){
           System.out.println(tmp);
       }else{
           System.out.println("Barang yang dicari tidak ada");
       }
    }
    
    
    
}
