/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import inventori_barang_asli.View.MenuUtama;
import inventori_barang.Inventori_Barang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hafizha
 */
public class ControllerMenuUtama implements ActionListener{
    MenuUtama menu;
    Inventori_Barang ib;

    public ControllerMenuUtama(Inventori_Barang ib) {
        this.ib = ib;
        menu=new MenuUtama();
        menu.setActionListener(this);
        menu.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource();
        if(obj.equals(menu.getButtonOK())){
            if (menu.getButtonDaftar().isSelected()){
               ControllerMenuDaftar menu = new ControllerMenuDaftar(ib);
            }else{
                
            }
        }
    }

    
    
}
