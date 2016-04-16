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

public class DataBarang {
   private ArrayList <Barang> barang;
   private Barang b;
   private int nBarang=0;
   
   public DataBarang(){
       this.barang= new ArrayList();
       this.b= new Barang();
   }
   
   public void createBarang(Barang b, String namaBarang, long idBarang, int hargaBarang, String status, int umurBarang, int nBarang){
       Barang brg= new Barang(b, namaBarang, idBarang, hargaBarang, status, umurBarang, nBarang);
       this.barang.set(nBarang, brg);
       this.nBarang++;
   }
   
   public Barang getBarang(){
       return this.b;
   }
   
   public void addBarang(Barang b){
       this.barang.add(b);
   }
   
   public void hapusBarang(int index){
       for(int i= index+1; i<this.nBarang;i++){
           //this.barang.get(i-1)=this.barang.get(i);
       }
       this.nBarang--;
   }
   
   public void editBarang(String namaBarang,long idBarang, int hargaBarang, String status, int umurBarang, int nBarang){
       for (Barang barang1 : this.barang) {
           this.b.setNamaBarang(namaBarang);
           this.b.setIdBarang(idBarang);
           this.b.setHargaBarang(hargaBarang);
           this.b.setStatus(status);
           this.b.setUmurBarang(umurBarang);
           this.b.setnBarang(nBarang);
           // tanggal masuk dan tanggal keluar belum dimasukkin
       }
   }
   
   public void searchByIdBarang(String x){
       boolean cek=false;
       String tmp="";
       for(int i=0; i>this.nBarang; i++){
           if(x.equals(this.barang.get(i).getIdBarang())){
               cek=true;
               tmp=this.barang.get(i).toString();
           }else{
               cek=false;
           }
       }
       if(cek=true){
           System.out.println(tmp);
       }else {
           System.out.println("Barang yang dicari tidak ada");
       }
   }
   
   public void searchByNamaBarang(String y){
       boolean cek= false;
       String tmp="";
       for(int i=0; i>this.nBarang; i++){
           if(y.equals(this.barang.get(i).getNamaBarang())){
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
   
   @Override
   public String toString(){
       return this.b.toString();
   }
   
   
}
