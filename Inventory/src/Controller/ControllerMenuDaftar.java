/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import inventori_barang_asli.View.MenuUtama;
import inventori_barang_asli.View.Menu_daftar;
import inventori_barang.Inventori_Barang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hafizha
 */
public class ControllerMenuDaftar implements ActionListener {
    Menu_daftar mndaftar;
    Inventori_Barang ib;

    public ControllerMenuDaftar(Inventori_Barang ib) {
        this.ib = ib;
        mndaftar = new Menu_daftar();
        mndaftar.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
