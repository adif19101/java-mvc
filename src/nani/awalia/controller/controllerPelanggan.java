/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani.awalia.controller;

import nani.awalia.model.modelPelanggan;
import nani.awalia.view.viewPelangganInternal;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class controllerPelanggan {
    private modelPelanggan mP;
    private viewPelangganInternal vP;

    public controllerPelanggan(viewPelangganInternal vP) {
        this.vP = vP;
    }
    
    public void bersihkan(){
        vP.getIdPelanggan().setText("");
        vP.getNamaPelanggan().setText("");
        vP.getNomorHpView().setText("");
        vP.getAlamat().setText("");
        vP.getUmur().setText("");
    }
    
    public void kontrolButton(){
        vP.getTombolSimpan().setEnabled(true);
        vP.getTombolUbah().setEnabled(true);
        vP.getTombolHapus().setEnabled(true);
        vP.getTombolBatal().setEnabled(true);
    }
    
    public void kontrolButtonDua(){
        vP.getTombolSimpan().setEnabled(false);
        vP.getTombolUbah().setEnabled(true);
        vP.getTombolHapus().setEnabled(true);
        vP.getTombolBatal().setEnabled(true);
    }
    
    public void deleteData(){
        mP = new modelPelanggan();
        mP.setIdPelangganModel(vP.getIdPelanggan().getText());
        
        mP.hapusDataPelanggan();
        bersihkan();
        kontrolButton();
    }
    
    public void updateData(){
        mP = new modelPelanggan();
        mP.setIdPelangganModel(vP.getIdPelanggan().getText());
        mP.setNamaPelangganModel(vP.getNamaPelanggan().getText());
        mP.setNomorHpModel(vP.getNomorHpView().getText());
        
        if (vP.getPria().isSelected()) {
            mP.setJenisKelaminModel("Pria");
        }else if (vP.getWanita().isSelected()) {
            mP.setJenisKelaminModel("Wanita");
        }
        
        mP.setUmur(Integer.parseInt(vP.getUmur().getText()));
        mP.setAlamat(vP.getAlamat().getText());
        
        mP.updateDataPelanggan();
        kontrolButton();
    }
    
    public void simpan(){
        mP = new modelPelanggan();
        mP.setNamaPelangganModel(vP.getNamaPelanggan().getText());
        mP.setNomorHpModel(vP.getNomorHpView().getText());
        
        if (vP.getPria().isSelected()) {
            mP.setJenisKelaminModel("Pria");
        }else if (vP.getWanita().isSelected()) {
            mP.setJenisKelaminModel("Wanita");
        }
        
        mP.setUmur(Integer.parseInt(vP.getUmur().getText()));
        mP.setAlamat(vP.getAlamat().getText());
        mP.simpanDataPelanggan();
        bersihkan();
    }
    
}
