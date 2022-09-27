package konsumen;

import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.koneksi;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class barang extends javax.swing.JFrame {

    private void load_tabel() {
        DefaultTableModel setTabel = new DefaultTableModel();
        setTabel.addColumn("id");
        setTabel.addColumn("namakonsumen");
        setTabel.addColumn("namabarang");
        setTabel.addColumn("jumlah");
        setTabel.addColumn("hargasatuan");
        setTabel.addColumn("diskon");
        setTabel.addColumn("totalbayar");
        tbl_tampil.setModel(setTabel);
        try {

            String sql = "SELECT * FROM tbpenjualan ";
            java.sql.Connection con = (Connection) koneksi.koneksi();
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                setTabel.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7)});
            }
            tbl_tampil.setModel(setTabel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "INPUT DATA GAGAL ! " + e.getMessage());
        }
    }

    public void input_data() {
        try {
            String sql = "INSERT INTO tbpenjualan VALUES " + "('" + txtid.getText() + "','" + txtkonsumen.getText() + "','" + txtbarang.getText() + "','" + txtjumlah.getText()
                    + "','" + txtsatuan.getText() + "','" + txtdiskon.getText() + "','" + txtbayar.getText() + "')";
            java.sql.Connection con = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pstat = con.prepareStatement(sql);
            pstat.execute();
            JOptionPane.showMessageDialog(null, "INPUT DATA BERHASIL !!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    public void total() {
        int jumlah, total, hsatuan, tbayar, diskon;

        jumlah = Integer.parseInt(txtjumlah.getText());
        hsatuan = Integer.parseInt(txtsatuan.getText());
        tbayar = Integer.parseInt(txtbayar.getText());
        diskon = Integer.parseInt(txtdiskon.getText());
        total = (jumlah * hsatuan);
        tbayar = total - ((total * diskon) / 100);
        txtbayar.setText(Integer.toString(tbayar));

    }

    public barang() {
        initComponents();
        load_tabel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnhapus = new javax.swing.JButton();
        btninput = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btncari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtkonsumen = new javax.swing.JTextField();
        txtbarang = new javax.swing.JTextField();
        txtjumlah = new javax.swing.JTextField();
        txtdiskon = new javax.swing.JTextField();
        txtsatuan = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_tampil = new javax.swing.JTable();
        txtok = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btninput.setText("INPUT");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });

        btnubah.setText("UBAH");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        btncari.setText("CARI");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("ID :");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("NAMA BARANG :");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("NAMA KONSUMEN :");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("JUMLAH :");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("HARGA SATUAN:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("DISKON  :");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("TOTAL BAYAR :");

        tbl_tampil.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_tampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tampilMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_tampil);

        txtok.setText("OK");
        txtok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtokActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btninput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnubah, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btncari, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(txtok))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkonsumen, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(650, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(txtkonsumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtbayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnhapus)
                    .addComponent(btnubah)
                    .addComponent(btninput)
                    .addComponent(btncari))
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(396, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        input_data();
        load_tabel();
        total();
    }//GEN-LAST:event_btninputActionPerformed

    private void tbl_tampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tampilMouseClicked
        int index = tbl_tampil.rowAtPoint(evt.getPoint());
        String id = tbl_tampil.getValueAt(index, 0).toString();
        txtid.setText(id);

        String namakonsumen = tbl_tampil.getValueAt(index, 1).toString();
        txtkonsumen.setText(namakonsumen);

        String namabarang = tbl_tampil.getValueAt(index, 2).toString();
        txtbarang.setText(namabarang);

        String jumlah = tbl_tampil.getValueAt(index, 3).toString();
        txtjumlah.setText(jumlah);

        String hargasatuan = tbl_tampil.getValueAt(index, 4).toString();
        txtsatuan.setText(hargasatuan);

        String diskon = tbl_tampil.getValueAt(index, 5).toString();
        txtbayar.setText(diskon);

        String totalbayar = tbl_tampil.getValueAt(index, 6).toString();
        txtbayar.setText(totalbayar);
    }//GEN-LAST:event_tbl_tampilMouseClicked

    private void txtokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtokActionPerformed
             total();
    }//GEN-LAST:event_txtokActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        try {
            String sql = "DELETE from tbpenjualan where id = '" + txtid.getText() + "'";
            java.sql.Connection con = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DI HAPUS !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "HAPUS DATA GAGAL ! " + e.getMessage());
        }
        load_tabel();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
         try {
            String sql = "UPDATE tbpenjualan SET id='" + txtid.getText() + "',namakonsumen ='" + txtkonsumen.getText()
                    + "',namabarang='" + txtbarang.getText() + "',jumlah ='" + txtjumlah.getText() + "',hargasatuan='" + txtsatuan.getText()
                    + "',diskon='" +txtdiskon.getText() + "',totalbayar='" + txtbayar.getText()+ "' WHERE id ='" + txtid.getText() + "'";
            java.sql.Connection con = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Berhasil Di Edit !!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Proses Edit Data Gagal !!" + e.getMessage());
        }
        load_tabel();
    }//GEN-LAST:event_btnubahActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        
    }//GEN-LAST:event_btncariActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btninput;
    private javax.swing.JButton btnubah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_tampil;
    private javax.swing.JTextField txtbarang;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtdiskon;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtjumlah;
    private javax.swing.JTextField txtkonsumen;
    private javax.swing.JButton txtok;
    private javax.swing.JTextField txtsatuan;
    // End of variables declaration//GEN-END:variables
}
