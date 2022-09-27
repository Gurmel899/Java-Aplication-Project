

package form_data;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class biodata extends javax.swing.JFrame {
    private void load_table(){
        DefaultTableModel setTabel = new DefaultTableModel();
        setTabel.addColumn("npm");
        setTabel.addColumn("nama");
        setTabel.addColumn("prodi");
        try{
            String sql  = "SELECT * FROM biodata";
            java.sql.Connection con = (Connection)koneksi.mysqltojava();
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet res  = stat.executeQuery(sql);
            while (res.next()){
                setTabel.addRow(new Object[]{res.getString(1), res.getString(2), res.getString(3)});
            }
            tbl_tampil.setModel(setTabel);
        } catch (Exception e){
            
        }
    }
    
    public void input_data(){
        try{
            String sql  = "INSERT INTO biodata VALUES " + "('"+txt_npm.getText()+"','"+txt_nama.getText()+"','"+cb_prodi.getSelectedItem()+"')";
            java.sql.Connection  con  = (Connection)koneksi.mysqltojava();
            java.sql.PreparedStatement  pstat   = con.prepareStatement(sql);
            pstat.execute();
            JOptionPane.showMessageDialog(null, "INPUT DATA BERHASIL !!!");
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }


    
    public biodata() {
        initComponents();
        load_table();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tampil = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_npm = new javax.swing.JTextField();
        txt_nama = new javax.swing.JTextField();
        cb_prodi = new javax.swing.JComboBox<>();
        btn_input = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_tampil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NPM", "NAMA", "PRODI"
            }
        ));
        tbl_tampil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tampilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_tampil);

        jLabel1.setText("BIODATA MAHASISWA");

        jLabel2.setText("NPM :");

        jLabel3.setText("NAMA :");

        jLabel4.setText("PRODI :");

        cb_prodi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TEKNIK INFORMATIKA", "SISTEM INFORMATIKA" }));

        btn_input.setText("INPUT");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });

        btn_update.setText("UPDATE");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setText("CLEAR");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_prodi, 0, 397, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_npm)
                                    .addComponent(txt_nama, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btn_input)
                        .addGap(55, 55, 55)
                        .addComponent(btn_update)
                        .addGap(62, 62, 62)
                        .addComponent(btn_delete)
                        .addGap(73, 73, 73)
                        .addComponent(btn_clear)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_npm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_prodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_input)
                    .addComponent(btn_update)
                    .addComponent(btn_delete)
                    .addComponent(btn_clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        input_data();
        load_table();

    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       try{
           
                   java.sql.Connection con = (Connection)koneksi.mysqltojava();String sql ="update biodata set nama_mhs ='"+txt_nama.getText()+"',prodi ='"+cb_prodi.getSelectedItem()+"' "+"where npm_mhs ='"+txt_npm.getText()+"'";
                   java.sql.PreparedStatement pst = con.prepareStatement(sql);
                      pst.execute();
            JOptionPane.showMessageDialog(null, "DATA BERHASIL DI UPDATE !");
       }catch (Exception e){
                  JOptionPane.showMessageDialog(this, "UPDATE DATA GAGAL ! "+e.getMessage());
                  
       }
       load_table();

    }//GEN-LAST:event_btn_updateActionPerformed

    private void tbl_tampilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tampilMouseClicked
        int baris = tbl_tampil.rowAtPoint(evt.getPoint());
        String npm = tbl_tampil.getValueAt(baris, 0).toString();
        txt_npm.setText(npm);
        String nama = tbl_tampil.getValueAt(baris, 1).toString();
        txt_nama.setText(nama);
        String prodi = tbl_tampil.getValueAt(baris, 2).toString();
        cb_prodi.setSelectedItem(prodi);

    }//GEN-LAST:event_tbl_tampilMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try{
            String sql ="delete from biodata  where npm_mhs ='"+txt_npm.getText()+"'";
            java.sql.Connection con =(Connection)koneksi.mysqltojava();
            java.sql.PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
              JOptionPane.showMessageDialog(null, "DATA BERHASIL DI HAPUS !");
        }catch (Exception e){
               JOptionPane.showMessageDialog(this, "HAPUS DATA GAGAL ! "+e.getMessage());
            
        }
        load_table();

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txt_npm.setText(null);
        txt_nama.setText(null);
        cb_prodi.setSelectedItem(null);
    }//GEN-LAST:event_btn_clearActionPerformed

   
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
            java.util.logging.Logger.getLogger(biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(biodata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new biodata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_prodi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_tampil;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_npm;
    // End of variables declaration//GEN-END:variables

}
