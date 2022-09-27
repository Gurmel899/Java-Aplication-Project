/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biaya_inap;

/**
 *
 * @author User
 */
public class biaya_kamar extends javax.swing.JFrame {

    /**
     * Creates new form biaya_kamar
     */
    public biaya_kamar() {
        initComponents();
    }
    
    public void hitung () {
    int kelas, lama_inap, biaya_perhari, biaya_inap, diskon, total_biaya;
    
    kelas = Integer.parseInt(txt_kelas.getText());
    lama_inap = Integer.parseInt(txt_inap.getText());
    
    if (kelas == 1){
        biaya_perhari = 300000;
        biaya_inap = biaya_perhari * lama_inap;
        
        if (lama_inap >=5){
            diskon = (5 * biaya_inap)/100;
        }else{
            diskon = 0;
        }
        total_biaya = biaya_inap - diskon;
        txt_biaya.setText(Integer.toString(biaya_perhari));
        txt_biayainap.setText(Integer.toString(biaya_inap));
        txt_diskon.setText(Integer.toString(diskon));
        txt_bayar.setText(Integer.toString(total_biaya));
        txt_fasilitas.setText("breankfast & Dinner");
        
    }else if(kelas == 2){
        biaya_perhari = 200000;
        biaya_inap = biaya_perhari * lama_inap;
        
        if (lama_inap >=5){
            diskon = (5 * biaya_inap)/100;
        }else{
            diskon = 0;
        }
        total_biaya = biaya_inap - diskon;
        txt_biaya.setText(Integer.toString(biaya_perhari));
        txt_biayainap.setText(Integer.toString(biaya_inap));
        txt_diskon.setText(Integer.toString(diskon));
        txt_bayar.setText(Integer.toString(total_biaya));
        txt_fasilitas.setText("breakfast");
    
    }else if(kelas == 3){
        biaya_perhari = 100000;
        biaya_inap = biaya_perhari * lama_inap;
        
        if (lama_inap >=5){
            diskon = (5 * biaya_inap)/100;
        }else{
            diskon = 0;
        }
        total_biaya = biaya_inap - diskon;
        txt_biaya.setText(Integer.toString(biaya_perhari));
        txt_biayainap.setText(Integer.toString(biaya_inap));
        txt_diskon.setText(Integer.toString(diskon));
        txt_bayar.setText(Integer.toString(total_biaya));
        txt_fasilitas.setText("None");
        
    }else{
        txt_biaya.setText(" ");
        txt_biayainap.setText(" ");
        txt_diskon.setText(" ");
        txt_bayar.setText(" ");
        txt_fasilitas.setText(" ");
    }
   }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_kelas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_inap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_biaya = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_biayainap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_diskon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_fasilitas = new javax.swing.JTextField();
        btn_hitung = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_bayar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("KELAS :");

        txt_kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kelasActionPerformed(evt);
            }
        });

        jLabel2.setText("LAMA INAP :");

        jLabel3.setText("Biaya Inap Per Hari :");

        txt_biaya.setEditable(false);

        jLabel4.setText("Biaya Inap :");

        txt_biayainap.setEditable(false);

        jLabel5.setText("Diskon :");

        txt_diskon.setEditable(false);

        jLabel6.setText("Fasilitas :");

        txt_fasilitas.setEditable(false);

        btn_hitung.setText("HITUNG");
        btn_hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hitungActionPerformed(evt);
            }
        });

        jLabel7.setText("Total Bayar :");

        txt_bayar.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_kelas)
                    .addComponent(txt_inap, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_biayainap, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_hitung, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_inap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_biayainap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hitungActionPerformed
        hitung (); 
            
    }//GEN-LAST:event_btn_hitungActionPerformed

    private void txt_kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kelasActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(biaya_kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(biaya_kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(biaya_kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(biaya_kamar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new biaya_kamar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txt_bayar;
    private javax.swing.JTextField txt_biaya;
    private javax.swing.JTextField txt_biayainap;
    private javax.swing.JTextField txt_diskon;
    private javax.swing.JTextField txt_fasilitas;
    private javax.swing.JTextField txt_inap;
    private javax.swing.JTextField txt_kelas;
    // End of variables declaration//GEN-END:variables
}
