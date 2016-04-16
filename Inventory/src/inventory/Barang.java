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
public class Barang {
    private String namaBarang;
    private long idBarang;
    private int hargaBarang;
    private String status;
    private UmurBarang tglMsk;
    private UmurBarang tglKlr;
    private int umurBarang;
    private int nBarang;
    private int lokasi;
    
    public Barang() {
    }
    
    public Barang(String namaBarang, long idBarang, int hargaBarang, String status, int umurBarang, int nBarang){
        this.namaBarang= namaBarang;
        this.idBarang= idBarang;
        this.hargaBarang= hargaBarang;
        this.status= status;
        this.umurBarang= umurBarang;
        this.nBarang= nBarang;
    }

    Barang(Barang b, String namaBarang, long idBarang, int hargaBarang, String status, int umurBarang, int nBarang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public long getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(long idBarang) {
        this.idBarang = idBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getUmurBarang() {
        return umurBarang;
    }

    public void setUmurBarang(int umurBarang) {
        this.umurBarang = umurBarang;
    }

    public int getnBarang() {
        return nBarang;
    }

    public void setnBarang(int nBarang) {
        this.nBarang = nBarang;
    }

    public void setLokasi(int lokasi) {
        this.lokasi = lokasi;
    }

    public int getLokasi() {
        return lokasi;
    }

    public int getTglMsk() {
        return tglMsk.getUmurBarang();
    }
    
    public int getTglKlr(){
       return tglKlr.getUmurBarang();
   }

    public void setTglMsk(int tanggal, int bulan, int tahun) {
        tglMsk = new UmurBarang(tanggal, bulan, tahun);
    }

    public void setTglKlr(int tanggal, int bulan, int tahun) {
        tglKlr = new UmurBarang(tanggal, bulan, tahun);
    }
    
    public UmurBarang getTglMasuk(){
        return tglMsk;
    }
    
    public UmurBarang getTglKeluar(){
        return tglKlr;
    }
    
    public int getumurBrg(){
       return tglKlr.getUmurBarang()-tglMsk.getUmurBarang();
   }
    
    public String getTanggalMasuk(){
        return this.tglMsk.toStrings();
   }
    
    public String getTanggalKeluar(){
        return this.tglKlr.toStrings();
   }
    // umur barang belum dieksekusi
    
    @Override
    public String toString(){
        String x="Barang "+
                "\nNama Barang  : "+ this.getNamaBarang()+
                "\nID Barang    : "+ this.getIdBarang()+
                "\nHarga Barang : "+ this.getHargaBarang()+
                "\nTanggal Masuk: "+ this.getTglMasuk()+
                "\nTanggal Keluar: "+ this.getTglKeluar()+
                "\nUmur Barang  : "+ this.getUmurBarang();
        return x;
    }  
}
