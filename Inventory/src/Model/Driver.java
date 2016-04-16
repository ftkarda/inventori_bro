/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.ControllerMenuUtama;
import inventori_barang.Inventori_Barang;

/**
 *
 * @author hafizha
 */
public class Driver {
    public static void main(String[] args) {
        Inventori_Barang ib = new Inventori_Barang();
        ControllerMenuUtama menu = new ControllerMenuUtama(ib);
    }
}
