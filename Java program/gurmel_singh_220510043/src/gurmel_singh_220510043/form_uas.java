
package gurmel_singh_220510043;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class form_uas extends javax.swing.JFrame {
private void load_table(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("npm");
        model.addColumn("nama");
        model.addColumn("jenkel");
        model.addColumn("prodi");
        model.addColumn("peminatan");
        model.addColumn("tugas");
        model.addColumn("uts");
        model.addColumn("uas");
        model.addColumn("na");
        
        try{
            String sql  = "SELECT * FROM data_mahasiswa";
            java.sql.Connection con = (Connection)koneksi.mysqltojava();
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet res  = stat.executeQuery(sql);
            while (res.next()){
                model.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3), res.getString(4),
                res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9)});
            }
            tbl_tampil.setModel(model);
        } catch (Exception e){
            
        }
    }
    
 public void input_data(){
      String jk = null;
        if(rb_lk.isSelected()){
            jk = "Laki-Laki";
        }else if(rb_pr.isSelected()){
            jk = "Perempuan";
        }else{
            
        }
        try{
            String sql  = "INSERT INTO data_mahasiswa VALUES"+ "('"+txt_npm.getText()+"','"+txt_nama.getText()+"', '"+jk+"', "+ "'"+cb_prodi.getSelectedItem()+"', '"+cb_peminatan.getSelectedItem()+"', '"+txt_tugas.getText()+"', '"+txt_uts.getText()+"', '"+txt_uas.getText()+"', '"+txt_akhir.getText()+"')";
            java.sql.Connection  con  = (Connection)koneksi.mysqltojava();
            java.sql.PreparedStatement  pstat   = con.prepareStatement(sql);
            pstat.execute();
            JOptionPane.showMessageDialog(null, "INPUT DATA BERHASIL !!!");
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
 public void kosongkan(){
        txt_npm.setText(null);
        txt_nama.setText(null);
        rb_lk.getSelectedObjects();
        rb_pr.getSelectedObjects();
        txt_tugas.setText(null);
        txt_uts.setText(null);
        txt_uas.setText(null);
        txt_akhir.setText(null);
        cb_prodi.setSelectedIndex(0);
        cb_peminatan.setSelectedIndex(0);
    }
    public form_uas() {
        initComponents();
        load_table();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_npm = new javax.swing.JTextField();
        cb_peminatan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cb_prodi = new javax.swing.JComboBox<>();
        grup_jenkel = new javax.swing.JLabel();
        rb_lk = new javax.swing.JRadioButton();
        rb_pr = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_tugas = new javax.swing.JTextField();
        txt_uts = new javax.swing.JTextField();
        txt_uas = new javax.swing.JTextField();
        txt_akhir = new javax.swing.JTextField();
        btn_input = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tampil = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FORM DATA MAHASISWA");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("NPM :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabel3.setText("NAMA :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 79, -1, -1));

        txt_nama.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 77, 394, -1));

        jLabel4.setText("Prodi :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 164, 37, -1));

        txt_npm.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.add(txt_npm, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 38, 394, -1));

        cb_peminatan.setBackground(new java.awt.Color(0, 153, 153));
        cb_peminatan.setForeground(new java.awt.Color(0, 0, 0));
        cb_peminatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---PILIH---", "Analisis Sistem , Perancangan Sistem", "Sistem Cerdas , Jaringan" }));
        cb_peminatan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 102), 2, true));
        jPanel1.add(cb_peminatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 197, 394, -1));

        jLabel5.setText("Peminatan :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 204, -1, -1));

        cb_prodi.setBackground(new java.awt.Color(0, 204, 204));
        cb_prodi.setForeground(new java.awt.Color(0, 0, 0));
        cb_prodi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---PILIH---", "Sistem Informatika", "Teknik Informatika" }));
        cb_prodi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 153), 2, true));
        jPanel1.add(cb_prodi, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 157, 394, -1));

        grup_jenkel.setText("Jenkel :");
        jPanel1.add(grup_jenkel, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 118, 37, -1));

        rb_lk.setBackground(new java.awt.Color(0, 153, 153));
        rb_lk.setText("Laki - Laki");
        rb_lk.setDisplayedMnemonicIndex(1);
        rb_lk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_lkActionPerformed(evt);
            }
        });
        jPanel1.add(rb_lk, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 114, -1, -1));

        rb_pr.setBackground(new java.awt.Color(0, 153, 153));
        rb_pr.setText("Perempuan");
        rb_pr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_prActionPerformed(evt);
            }
        });
        jPanel1.add(rb_pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 114, -1, -1));

        jLabel6.setText("Nilai Tugas :");

        jLabel7.setText("Nilai Uts :");

        jLabel8.setText("Nilai Uas :");

        jLabel9.setText("Nilai Akhir :");

        txt_tugas.setBackground(new java.awt.Color(0, 153, 153));

        txt_uts.setBackground(new java.awt.Color(0, 153, 153));

        txt_uas.setBackground(new java.awt.Color(0, 153, 153));

        txt_akhir.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_akhir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_uas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_uts, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tugas, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_tugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_uts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_uas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_akhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        btn_input.setBackground(new java.awt.Color(153, 204, 0));
        btn_input.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        btn_input.setText("INPUT");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(51, 51, 255));
        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(0, 0, 153));
        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(204, 0, 51));
        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        tbl_tampil.setBackground(new java.awt.Color(153, 0, 153));
        tbl_tampil.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 255, 255)));
        tbl_tampil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "NAMA", "JENKEL", "PRODI", "PEMINATAN", "TUGAS", "UTS", "UAS", "NA"
            }
        ));
        tbl_tampil.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_tampil.getTableHeader().setReorderingAllowed(false);
        tbl_tampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tampilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_tampil);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btn_input, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addGap(96, 96, 96)
                .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(69, 69, 69)
                .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addGap(70, 70, 70)
                .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addGap(84, 84, 84))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 542, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 542, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_input)
                    .addComponent(btn_update)
                    .addComponent(btn_clear)
                    .addComponent(btn_delete))
                .addGap(194, 194, 194))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 255, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(255, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(320, 320, 320)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        double ntugas,nuts,nuas,nakhir;
        ntugas=Double.parseDouble(txt_tugas.getText());
        nuts=Double.parseDouble(txt_uts.getText());
        nuas=Double.parseDouble(txt_uas.getText());

        nakhir = ((2*ntugas) + (3*nuts)+(5*nuas))/10;
        txt_akhir.setText(String.valueOf(nakhir));
        input_data();
        load_table();
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        String jk = "";
        if(rb_lk.isSelected()){
            jk = "Laki-Laki";
        }if(rb_pr.isSelected()){
            jk = "Perempuan";
        }
        try{
            String sql  = "UPDATE data_mahasiswa SET nama = '"+txt_nama.getText()+"', jenkel ='"+jk+"'," +"prodi= '"+cb_prodi.getSelectedItem()+"',peminatan = '"+cb_peminatan.getSelectedItem()+"',"+"tugas = '"+txt_tugas.getText()+"',uts= '"+txt_uts.getText()+"'"+",uas = '"+txt_uas.getText()+"'"+",na = '"+txt_akhir.getText()+"' "+ "WHERE nim = '"+txt_npm.getText()+"'";
            java.sql.Connection         con = (Connection)koneksi.mysqltojava();
            java.sql.PreparedStatement  pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil di UPDATE");
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, "UPDATE GAGAL"+e.getMessage());
        }
        load_table();
        kosongkan();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        kosongkan();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try{
            String sql = "DELETE from data_mahasiswa WHERE nim = '"+txt_npm.getText()+"'";
            java.sql.Connection con = (Connection)koneksi.mysqltojava();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Berhasil di DIHAPUS");
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "HAPUS DATA GAGAL !! "+e.getMessage());
        }
        load_table();
        kosongkan();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tbl_tampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tampilMouseClicked
        int baris = tbl_tampil.rowAtPoint(evt.getPoint());
        String npm = tbl_tampil.getValueAt(baris, 0).toString();
        txt_npm.setText(npm);
        String nama = tbl_tampil.getValueAt(baris, 1).toString();
        txt_nama.setText(nama);
        String jk = tbl_tampil.getValueAt(baris, 2).toString();
        if(jk.equals("Laki-Laki")){
            rb_lk.setSelected(true);
        }if(jk.equals("Perempuan")){
            rb_pr.setSelected(true);
        }else{}
        String prodi = tbl_tampil.getValueAt(baris, 3).toString();
        cb_prodi.setSelectedItem(prodi);
        String peminatan = tbl_tampil.getValueAt(baris, 4).toString();
        cb_peminatan.setSelectedItem(peminatan);
        String tugas = tbl_tampil.getValueAt(baris, 5).toString();
        txt_tugas.setText(tugas);
        String uts = tbl_tampil.getValueAt(baris, 6).toString();
        txt_uts.setText(uts);
        String uas = tbl_tampil.getValueAt(baris, 7).toString();
        txt_uas.setText(uas);
        String nilai_akhir = tbl_tampil.getValueAt(baris, 8).toString();
        txt_akhir.setText(nilai_akhir);
    }//GEN-LAST:event_tbl_tampilMouseClicked

    private void rb_lkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_lkActionPerformed
        if (rb_lk.isEnabled()) {
            rb_pr.setSelected(false);
        }
    }//GEN-LAST:event_rb_lkActionPerformed

    private void rb_prActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_prActionPerformed
        if (rb_pr.isEnabled()) {
            rb_lk.setSelected(false);
        }
    }//GEN-LAST:event_rb_prActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(form_uas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_uas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_uas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_uas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_uas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_peminatan;
    private javax.swing.JComboBox<String> cb_prodi;
    private javax.swing.JLabel grup_jenkel;
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
    private javax.swing.JRadioButton rb_lk;
    private javax.swing.JRadioButton rb_pr;
    private javax.swing.JTable tbl_tampil;
    private javax.swing.JTextField txt_akhir;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_npm;
    private javax.swing.JTextField txt_tugas;
    private javax.swing.JTextField txt_uas;
    private javax.swing.JTextField txt_uts;
    // End of variables declaration//GEN-END:variables
}
