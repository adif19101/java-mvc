/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani.awalia.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import nani.awalia.controller.controllerBarang;
import nani.awalia.db.KoneksiDatabase;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class viewBarangInternal extends javax.swing.JInternalFrame {
    private controllerBarang cB;

    /**
     * Creates new form viewBarangInternal
     */
    
    private DefaultTableModel model;
    public viewBarangInternal() {
        initComponents();
        
        cB = new controllerBarang(this);
        model = new DefaultTableModel();
        tabelBarang.setModel(model);
        model.addColumn("ID");
        //model.addColumn("JENIS");
        //model.addColumn("NAMA");
        //model.addColumn("JUMLAH");
        model.addColumn("NAMA");
        model.addColumn("HARGA");
        model.addColumn("QTY");
        idBarang.disable();
      
        tampilDataBarang();
        cB.kontrolButton();
    }
    
    public JTextField getIdBarangView(){
        return idBarang;
    }
    
    public JTextField getNamaBarangView(){
        return namaBarangView;
    }
    
    public JTextField getHargaBarangView(){
        return hargaBarangView;
    }
    
    public JTextField getJumlahView(){
        return jumlahView;
    }
    
    public JButton getTombolSimpan(){
        return tombolSimpan;
    }
    
    public JButton getTombolHapus(){
        return tombolHapus;
    }
    
    public JButton getTombolEdit(){
        return tombolUbah;
    }
    
    public JButton getTombolBatal(){
        return tombolBatal;
    }

    public void setHargaBarangView(JTextField hargaBarangView) {
        this.hargaBarangView = hargaBarangView;
    }

    public void setIdBarang(JTextField idBarang) {
        this.idBarang = idBarang;
    }

    public void setJumlahView(JTextField jumlahView) {
        this.jumlahView = jumlahView;
    }

    public void setNamaBarangView(JTextField namaBarangView) {
        this.namaBarangView = namaBarangView;
    }
    
    
    private void tampilDataBarang(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        String sql = "SELECT * FROM barang";
        
        try {
            Statement stat = (Statement) KoneksiDatabase.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql);
            
            while(res.next()){
                //mengambil hasil query variable sql
                Object[] hasil;
                hasil = new Object[6]; //ada 6 field ditabel pelanggan
                hasil[0] = res.getString("idBarang");
                hasil[1] = res.getString("namaBarang");
                hasil[2] = res.getString("hargaBarang");
                hasil[3] = res.getString("jumlahBarang");
                
                model.addRow(hasil);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(viewPelangganInternal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void ambilDataTabel(){
        int index = tabelBarang.getSelectedRow();
        
        String id = String.valueOf(tabelBarang.getValueAt(index, 0));
        String nama = String.valueOf(tabelBarang.getValueAt(index, 1));
        String harga = String.valueOf(tabelBarang.getValueAt(index, 2));
        String jml = String.valueOf(tabelBarang.getValueAt(index, 3));
        
        //mengisi nilai kedalam textfield
        idBarang.setText(id);
        namaBarangView.setText(nama);
        hargaBarangView.setText(harga);
        jumlahView.setText(jml);
       
        cB.kontrolButtonDua();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idBarang = new javax.swing.JTextField();
        namaBarangView = new javax.swing.JTextField();
        hargaBarangView = new javax.swing.JTextField();
        jumlahView = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBarang = new javax.swing.JTable();
        tombolBatal = new javax.swing.JButton();
        tombolHapus = new javax.swing.JButton();
        tombolUbah = new javax.swing.JButton();
        tombolSimpan = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Modul Barang");

        jLabel1.setText("ID Barang");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Harga Barang");

        jLabel4.setText("Jumlah");

        tabelBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBarang);

        tombolBatal.setText("BATAL");
        tombolBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolBatalActionPerformed(evt);
            }
        });

        tombolHapus.setText("HAPUS");
        tombolHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolHapusActionPerformed(evt);
            }
        });

        tombolUbah.setText("UBAH");
        tombolUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolUbahActionPerformed(evt);
            }
        });

        tombolSimpan.setText("SIMPAN");
        tombolSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolSimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(namaBarangView, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hargaBarangView)
                                .addComponent(jumlahView, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tombolBatal)
                        .addGap(18, 18, 18)
                        .addComponent(tombolHapus)
                        .addGap(18, 18, 18)
                        .addComponent(tombolUbah)
                        .addGap(18, 18, 18)
                        .addComponent(tombolSimpan))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(idBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(namaBarangView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hargaBarangView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlahView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tombolBatal)
                            .addComponent(tombolHapus)
                            .addComponent(tombolUbah)
                            .addComponent(tombolSimpan)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBarangMouseClicked
        // TODO add your handling code here:
        ambilDataTabel();
    }//GEN-LAST:event_tabelBarangMouseClicked

    private void tombolUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolUbahActionPerformed
        // TODO add your handling code here:
        cB.updateData();
        tampilDataBarang(); //merefresh*
    }//GEN-LAST:event_tombolUbahActionPerformed

    private void tombolSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolSimpanActionPerformed
        // TODO add your handling code here:
        cB.simpan();
        tampilDataBarang();
    }//GEN-LAST:event_tombolSimpanActionPerformed

    private void tombolHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolHapusActionPerformed
        // TODO add your handling code here:
        cB.deleteData();
        tampilDataBarang();
    }//GEN-LAST:event_tombolHapusActionPerformed

    private void tombolBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBatalActionPerformed
        // TODO add your handling code here:
        cB.kontrolButton();
        cB.bersihkan();
    }//GEN-LAST:event_tombolBatalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hargaBarangView;
    private javax.swing.JTextField idBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlahView;
    private javax.swing.JTextField namaBarangView;
    private javax.swing.JTable tabelBarang;
    private javax.swing.JButton tombolBatal;
    private javax.swing.JButton tombolHapus;
    private javax.swing.JButton tombolSimpan;
    private javax.swing.JButton tombolUbah;
    // End of variables declaration//GEN-END:variables
}