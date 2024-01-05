/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani.awalia.model;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import nani.awalia.db.KoneksiDatabase;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class modelPelanggan {
    private String idPelangganModel;
    private String namaPelangganModel;
    private String nomorHpModel;
    private String jenisKelaminModel;
    private int umur;
    private String alamat;

    public modelPelanggan() {
    }
    
    public String getNamaPelangganModel() {
        return namaPelangganModel;
    }

    public void setNamaPelangganModel(String namaPelangganModel) {
        this.namaPelangganModel = namaPelangganModel;
    }

    public String getNomorHpModel() {
        return nomorHpModel;
    }

    public void setNomorHpModel(String nomorHpModel) {
        this.nomorHpModel = nomorHpModel;
    }

    public String getJenisKelaminModel() {
        return jenisKelaminModel;
    }

    public void setJenisKelaminModel(String jenisKelaminModel) {
        this.jenisKelaminModel = jenisKelaminModel;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getIdPelangganModel() {
        return idPelangganModel;
    }

    public void setIdPelangganModel(String idPelangganModel) {
        this.idPelangganModel = idPelangganModel;
    }
    
    KoneksiDatabase koneksi = new KoneksiDatabase();
    
    public void simpanDataPelanggan(){
        String sql = ("INSERT INTO pelanggan (namaPelanggan,noHp,jenisKelamin,umur,alamat)"
                + "VALUES ('"+getNamaPelangganModel()+"','"+getNomorHpModel()+"'"
                +",'"+getJenisKelaminModel()+"','"+getUmur()+"','"+getAlamat()+"')");
        
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal disimpan \n" + e);
        }
    }
    
    public void hapusDataPelanggan(){
        String sql = "DELETE FROM pelanggan WHERE idPelanggan = "
                + "'"+getIdPelangganModel()+"'";
        
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "data berhasil dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal dihapus \n" + e);
        }
    }
    
    public void updateDataPelanggan(){
        String sql = "UPDATE pelanggan SET namaPelanggan = '"+getNamaPelangganModel()+"'"
                +" ,noHp = '"+getNomorHpModel()+"'"
                +" ,jenisKelamin = '"+getJenisKelaminModel()+"'"
                +" ,umur = '"+getUmur()+"'"
                +" ,alamat = '"+getAlamat()+"' WHERE idPelanggan = '"+getIdPelangganModel()+"'";
               
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "data berhasil diupdate");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "data gagal diupdate \n" + e);
        }
    }
    
}
