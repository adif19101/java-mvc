/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani.awalia.controller;

import nani.awalia.model.modelBarang;
import nani.awalia.view.viewBarangInternal;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class controllerBarang {
    private modelBarang mB;
    private viewBarangInternal vB;

    public controllerBarang(viewBarangInternal vB) {
        this.vB = vB;
    }
    
    public void bersihkan(){
        vB.getIdBarangView().setText("");
        vB.getNamaBarangView().setText("");
        vB.getHargaBarangView().setText("");
        vB.getJumlahView().setText("");
    }
    
    public void kontrolButton(){
        vB.getTombolSimpan().setEnabled(true);
        vB.getTombolEdit().setEnabled(true);
        vB.getTombolHapus().setEnabled(true);
        vB.getTombolBatal().setEnabled(true);
    }
    
    public void kontrolButtonDua(){
        vB.getTombolSimpan().setEnabled(false);
        vB.getTombolEdit().setEnabled(true);
        vB.getTombolHapus().setEnabled(true);
        vB.getTombolBatal().setEnabled(true);
    }
    
    public void deleteData(){
        mB = new modelBarang();
        mB.setIdBarangModel(vB.getIdBarangView().getText());
        
        mB.hapusDataBarang();
        bersihkan();
        kontrolButton();
    }
    
    public void updateData(){
        mB = new modelBarang();
        mB.setIdBarangModel(vB.getIdBarangView().getText());
        mB.setNamaBarangModel(vB.getNamaBarangView().getText());
        mB.setHargaBarangModel(vB.getHargaBarangView().getText());
        mB.setJumlah(Integer.parseInt(vB.getJumlahView().getText()));
        
        mB.updateDataBarang();
        kontrolButton();
    }
    
    public void simpan(){
        mB = new modelBarang();
        mB.setIdBarangModel(vB.getIdBarangView().getText());
        mB.setNamaBarangModel(vB.getNamaBarangView().getText());
        mB.setHargaBarangModel(vB.getHargaBarangView().getText());
        mB.setJumlah(Integer.parseInt(vB.getJumlahView().getText()));
        
        mB.simpanDataBarang();
        bersihkan();
    }
}
