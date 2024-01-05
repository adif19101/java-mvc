/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani.awalia.view;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.*;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import nani.awalia.controller.controllerTransaksi;
import nani.awalia.db.KoneksiDatabase;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class viewTransaksi extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewTransaksi
     */
    
    private DefaultTableModel model;
    private controllerTransaksi cT;
    public LocalDate sekarang = LocalDate.now();
    
    public viewTransaksi() {
        initComponents();
        
        model = new DefaultTableModel();
        tabelTransaksi.setModel(model);
        model.addColumn("Nama Barang");
        model.addColumn("Harga Barang");
        model.addColumn("QTY Barang");
        model.addColumn("Sub Total Bayar");
        totalBayar.setText("0");
        
        cT = new controllerTransaksi(this);
    }

    public JTextArea getAlamatPelanggan() {
        return alamatPelanggan;
    }

    public void setAlamatPelanggan(JTextArea alamatPelanggan) {
        this.alamatPelanggan = alamatPelanggan;
    }

    public JTextField getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(JTextField hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public JTextField getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(JTextField idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public JTextField getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JTextField jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public JTextField getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(JTextField namaBarang) {
        this.namaBarang = namaBarang;
    }

    public JTextField getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(JTextField namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public JTextField getNomorHp() {
        return nomorHp;
    }

    public void setNomorHp(JTextField nomorHp) {
        this.nomorHp = nomorHp;
    }

    public JTextField getQty() {
        return qty;
    }

    public void setQty(JTextField qty) {
        this.qty = qty;
    }

    public JTextField getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(JTextField totalBayar) {
        this.totalBayar = totalBayar;
    }

    public JTextField getUangBayar() {
        return uangBayar;
    }

    public void setUangBayar(JTextField uangBayar) {
        this.uangBayar = uangBayar;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idPelanggan = new javax.swing.JTextField();
        namaPelanggan = new javax.swing.JTextField();
        jenisKelamin = new javax.swing.JTextField();
        nomorHp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatPelanggan = new javax.swing.JTextArea();
        cariDataPelanggan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        namaBarang = new javax.swing.JTextField();
        hargaBarang = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        tambahbarang = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        totalBayar = new javax.swing.JTextField();
        uangBayar = new javax.swing.JTextField();
        batalTransaksi = new javax.swing.JButton();
        prosesTransaksi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel3.setText("id Pelanggan");

        jLabel4.setText("Nama Pelanggan");

        jLabel5.setText("Alamat");

        jLabel6.setText("Nomor HP");

        jLabel7.setText("Jenis Kelamin");

        namaPelanggan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaPelangganFocusGained(evt);
            }
        });

        alamatPelanggan.setColumns(20);
        alamatPelanggan.setRows(5);
        jScrollPane1.setViewportView(alamatPelanggan);

        cariDataPelanggan.setText("Cari Data Pelanggan");
        cariDataPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariDataPelangganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(namaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomorHp, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cariDataPelanggan))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(idPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomorHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(namaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(cariDataPelanggan)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel1.setText("Form Transaksi Barang");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Data Pelanggan - Pembelian");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Data Barang - Transaksi");

        jLabel9.setText("Nama Barang");

        jLabel10.setText("Harga Barang");

        jLabel11.setText("Qty Beli");

        namaBarang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                namaBarangFocusGained(evt);
            }
        });

        tambahbarang.setText("Tambah Barang");
        tambahbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahbarangActionPerformed(evt);
            }
        });

        jButton1.setText("Cari Barang");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(44, 44, 44)
                        .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(tambahbarang)))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(hargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahbarang)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("Total Bayar");

        jLabel13.setText("Uang Bayar");

        batalTransaksi.setText("BATAL TRANSAKSI");
        batalTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalTransaksiActionPerformed(evt);
            }
        });

        prosesTransaksi.setText("PROSES TRANSAKSI");
        prosesTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesTransaksiActionPerformed(evt);
            }
        });

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tabelTransaksi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(197, 197, 197)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel8)))
                            .addGap(256, 256, 256))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uangBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(batalTransaksi)
                .addGap(18, 18, 18)
                .addComponent(prosesTransaksi)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(totalBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(uangBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(batalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prosesTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prosesTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesTransaksiActionPerformed
        // TODO add your handling code here:
        int jumlahRow = tabelTransaksi.getRowCount();
        Object[][] hasil;
        hasil = new Object[4][4];
        
        for (int x = 0; x < jumlahRow; x++) {
            hasil[x][0] = tabelTransaksi.getValueAt(x, 0).toString();
            hasil[x][1] = tabelTransaksi.getValueAt(x, 1).toString();
            hasil[x][2] = tabelTransaksi.getValueAt(x, 2).toString();
            hasil[x][3] = tabelTransaksi.getValueAt(x, 3).toString();
            
            String sql = "INSERT INTO transaksiDetail (namaBarang"
                    +", qty, subTotal, tanggal) VALUES ('"+hasil[x][0]+"','"+hasil[x][2]+"','"+hasil[x][3]+"'"
                    +", '"+sekarang+"')";
            
            try {
                PreparedStatement eksekusi = KoneksiDatabase.getKoneksi().prepareStatement(sql);
                eksekusi.execute();
                
                JOptionPane.showMessageDialog(null, "data berhasil disimpan");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "data transaksi gagal disimpan \n" +e);
            }
        }
        cT.simpanTranskasi();
    }//GEN-LAST:event_prosesTransaksiActionPerformed

    private void namaPelangganFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaPelangganFocusGained
        // TODO add your handling code here:
//        viewListDataPelanggan vldp = new viewListDataPelanggan(this);
//        vldp.setVisible(true);
    }//GEN-LAST:event_namaPelangganFocusGained

    private void namaBarangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaBarangFocusGained
        // TODO add your handling code here:
        viewListDataBarang vld = new viewListDataBarang(this);
        vld.setVisible(true);
    }//GEN-LAST:event_namaBarangFocusGained

    private void tambahbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahbarangActionPerformed
        // TODO add your handling code here:
        Object[] hasil;
        hasil = new Object[4];
        hasil[0] = namaBarang.getText();
        hasil[1] = hargaBarang.getText();
        hasil[2] = qty.getText();
        hasil[3] = Integer.parseInt(qty.getText()) * Integer.parseInt(hargaBarang.getText());
        
        model.addRow(hasil);
        Integer total = 0;
        if (Integer.parseInt(totalBayar.getText()) == 0) {
            int subtotal = Integer.parseInt(tabelTransaksi.getValueAt(0, 3).toString());
            total = subtotal;
            totalBayar.setText(String.valueOf(total));
        }else{
            for (int index = 0; index < model.getRowCount(); index++) {
                int subtotal = Integer.parseInt(tabelTransaksi.getValueAt(index, 3).toString());
                total = total + subtotal;
            }
            totalBayar.setText(String.valueOf(total));
        }
        
    }//GEN-LAST:event_tambahbarangActionPerformed

    private void cariDataPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariDataPelangganActionPerformed
        // TODO add your handling code here:
        viewListDataPelanggan vldp = new viewListDataPelanggan(this);
        vldp.setVisible(true);
    }//GEN-LAST:event_cariDataPelangganActionPerformed

    private void batalTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalTransaksiActionPerformed
        // TODO add your handling code here:
        cT.bersihkan();
        model.setRowCount(0);
    }//GEN-LAST:event_batalTransaksiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        viewListDataBarang vld = new viewListDataBarang(this);
        vld.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatPelanggan;
    private javax.swing.JButton batalTransaksi;
    private javax.swing.JButton cariDataPelanggan;
    private javax.swing.JTextField hargaBarang;
    private javax.swing.JTextField idPelanggan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jenisKelamin;
    private javax.swing.JTextField namaBarang;
    private javax.swing.JTextField namaPelanggan;
    private javax.swing.JTextField nomorHp;
    private javax.swing.JButton prosesTransaksi;
    private javax.swing.JTextField qty;
    private javax.swing.JTable tabelTransaksi;
    private javax.swing.JButton tambahbarang;
    private javax.swing.JTextField totalBayar;
    private javax.swing.JTextField uangBayar;
    // End of variables declaration//GEN-END:variables
}