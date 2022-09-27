package UAS_NO2;

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

public class gaji extends javax.swing.JFrame {

    private void load_tabel() {
        DefaultTableModel setTabel = new DefaultTableModel();
        setTabel.addColumn("nip");
        setTabel.addColumn("nama");
        setTabel.addColumn("gol");
        setTabel.addColumn("gapok");
        setTabel.addColumn("tunj");
        setTabel.addColumn("gaber");
        tbl_tampil.setModel(setTabel);
        try {

            String sql = "SELECT * FROM gaji";
            java.sql.Connection con = (Connection) koneksi.koneksi();
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                setTabel.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6)});
            }
            tbl_tampil.setModel(setTabel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "INPUT DATA GAGAL ! " + e.getMessage());
        }
    }

    public void input_data() {
        try {
            String sql = "INSERT INTO gaji VALUES " + "('" + txtnip.getText() + "','" + txtnama.getText() + "','" + txtgol.getText() + "','" + txtgapok.getText()
                    + "','" + txttunjangan.getText() + "','" + txtgaber.getText() + "')";
            java.sql.Connection con = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pstat = con.prepareStatement(sql);
            pstat.execute();
            JOptionPane.showMessageDialog(null, "INPUT DATA BERHASIL !!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }

    public void clear() {
        txtnip.setText("");
        txtnama.setText("");
        txtgol.setText("");
        txtgapok.setText("");
        txttunjangan.setText("");
        txtgaber.setText("");
    }

    public void golongan() {
        int gol, gp, gt, total;

        gol = Integer.parseInt(txtgol.getText());
        if (gol == 1) {
            txtgapok.setText("500000");
            txttunjangan.setText("50000");
        } else if (gol == 2) {
            txtgapok.setText("700000");
            txttunjangan.setText("70000");
        } else if (gol == 3) {
            txtgapok.setText("1000000");
            txttunjangan.setText("100000");
        }
        gp = Integer.parseInt(txtgapok.getText());
        gt = Integer.parseInt(txttunjangan.getText());
        total = (gp + gt);
        txtgaber.setText(Integer.toString(total));
    }

    public gaji() {
        initComponents();

        load_tabel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txtnip = new javax.swing.JTextField();
        txtgol = new javax.swing.JTextField();
        txtgapok = new javax.swing.JTextField();
        txttunjangan = new javax.swing.JTextField();
        txtgaber = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_tampil = new javax.swing.JTable();
        OK = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gurmel Singh");

        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("Nip : ");

        jLabel2.setText("Nama :");

        jLabel3.setText("Golongan :");

        jLabel4.setText("Gaji Pokok :");

        jLabel5.setText("Tunjangan :");

        jLabel6.setText("Gaber :");

        txtgol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgolActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        tbl_tampil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Golongan", "Gaji Pokok", "Tunjangan", "Gaji Bersih"
            }
        ));
        tbl_tampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tampilMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_tampil);

        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 102, 255));
        jLabel7.setText("Aplikasii Pengajian");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnClear)
                        .addGap(76, 76, 76)
                        .addComponent(btnAdd)
                        .addGap(66, 66, 66)
                        .addComponent(btnEdit)
                        .addGap(69, 69, 69)
                        .addComponent(btnDelete)
                        .addGap(67, 67, 67)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)))
                        .addGap(124, 124, 124)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnip)
                            .addComponent(txtnama)
                            .addComponent(txtgol)
                            .addComponent(txtgapok)
                            .addComponent(txttunjangan)
                            .addComponent(txtgaber, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(OK))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(91, 266, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtgol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OK))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtgapok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttunjangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtgaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnExit))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void tbl_tampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tampilMouseClicked
        int index = tbl_tampil.rowAtPoint(evt.getPoint());
        String nip = tbl_tampil.getValueAt(index, 0).toString();
        txtnip.setText(nip);

        String nama = tbl_tampil.getValueAt(index, 1).toString();
        txtnama.setText(nama);

        String gol = tbl_tampil.getValueAt(index, 2).toString();
        txtgol.setText(gol);

        String gp = tbl_tampil.getValueAt(index, 3).toString();
        txtgapok.setText(gp);

        String tunjangan = tbl_tampil.getValueAt(index, 4).toString();
        txttunjangan.setText(tunjangan);

        String gaber = tbl_tampil.getValueAt(index, 5).toString();
        txtgaber.setText(gaber);
    }//GEN-LAST:event_tbl_tampilMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        input_data();
        load_tabel();
        golongan();

    }//GEN-LAST:event_btnAddActionPerformed

    private void txtgolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgolActionPerformed

    }//GEN-LAST:event_txtgolActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String sql = "DELETE from gaji where nip = '" + txtnip.getText() + "'";
            java.sql.Connection con = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DI HAPUS !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "HAPUS DATA GAGAL ! " + e.getMessage());
        }
        load_tabel();
        clear();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        golongan();
    }//GEN-LAST:event_OKActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            String sql = "UPDATE gaji SET nip='" + txtnip.getText() + "',nama ='" + txtnama.getText()
                    + "',gol='" + txtgol.getText() + "',gapok ='" + txtgapok.getText() + "',tunj='" + txttunjangan.getText()
                    + "',gaber='" + txtgaber.getText() + "' WHERE nip ='" + txtnip.getText() + "'";
            java.sql.Connection con = (Connection) koneksi.koneksi();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Berhasil Di Edit !!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Proses Edit Data Gagal !!" + e.getMessage());
        }
        load_tabel();  
        clear();
    }//GEN-LAST:event_btnEditActionPerformed

    public static void main(String args[]) {
//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gaji().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OK;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_tampil;
    private javax.swing.JTextField txtgaber;
    private javax.swing.JTextField txtgapok;
    private javax.swing.JTextField txtgol;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnip;
    private javax.swing.JTextField txttunjangan;
    // End of variables declaration//GEN-END:variables
}
