/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani.awalia.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import nani.awalia.db.KoneksiDatabase;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class modelBarang {
    private String namaBarangModel;
    private String hargaBarangModel;
    private int jumlah;
    private String idBarangModel;
    
    KoneksiDatabase koneksi = new KoneksiDatabase();

    public String getNamaBarangModel() {
        return namaBarangModel;
    }

    public void setNamaBarangModel(String namaBarangModel) {
        this.namaBarangModel = namaBarangModel;
    }

    public String getHargaBarangModel() {
        return hargaBarangModel;
    }

    public void setHargaBarangModel(String hargaBarangModel) {
        this.hargaBarangModel = hargaBarangModel;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getIdBarangModel() {
        return idBarangModel;
    }

    public void setIdBarangModel(String idBarangModel) {
        this.idBarangModel = idBarangModel;
    }
    
    public void simpanDataBarang(){
        //inisialisasi query untuk insert ke dalam database
        String sql = ("INSERT INTO barang (namaBarang,hargaBarang,jumlahBarang)" 
                + "VALUES ('"+getNamaBarangModel()+"','"+getHargaBarangModel()+"'"
                +",'"+getJumlah()+"')");
    
        
        //inisialisasi preparedstatement
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
        } catch (SQLException ex) {
            //Logger.getLogger(modelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan \n" +ex);
        }
    }
    
     public void hapusDataBarang(){
        String sql = "DELETE FROM barang WHERE idBarang = "
                + "'"+getIdBarangModel()+"'";
        
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        } catch (SQLException ex) {
            //Logger.getLogger(modelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus \n" +ex);
        }
    }
    public void updateDataBarang(){
        //inisialisasi query untuk insert ke dalam database
        String sql = "UPDATE barang SET namaBarang = '"+getNamaBarangModel()+"'"
                +" ,hargaBarang = '"+getHargaBarangModel()+"'"
                +" ,jumlahBarang = '"+getJumlah()+"' WHERE idBarang = '"+getIdBarangModel()+"'";
               
    
        //inisialisasi preparedstatement
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            //pemberitahuan jika data berhasil disimpan
            JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
        } catch (SQLException ex) {
            //Logger.getLogger(modelPelanggan.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Data Gagal Diupdate \n" +ex);
        }
    }
}
