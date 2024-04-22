package dmaf_daily;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtn_FBCTrack = new javax.swing.JButton();
        jBtn_WorkTrack = new javax.swing.JButton();
        jBtn_ViewFBC = new javax.swing.JButton();
        jBtn_ViewWork = new javax.swing.JButton();
        jBtn_Exit = new javax.swing.JButton();
        jLable_Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jBtn_FBCTrack.setBackground(new java.awt.Color(153, 153, 153));
        jBtn_FBCTrack.setText("F.B.C Tracker");
        jBtn_FBCTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_FBCTrackActionPerformed(evt);
            }
        });

        jBtn_WorkTrack.setBackground(new java.awt.Color(153, 153, 153));
        jBtn_WorkTrack.setText("Workout Tracker");
        jBtn_WorkTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_WorkTrackActionPerformed(evt);
            }
        });

        jBtn_ViewFBC.setBackground(new java.awt.Color(153, 153, 153));
        jBtn_ViewFBC.setText("View F.B.C");
        jBtn_ViewFBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ViewFBCActionPerformed(evt);
            }
        });

        jBtn_ViewWork.setBackground(new java.awt.Color(153, 153, 153));
        jBtn_ViewWork.setText("View Workouts");
        jBtn_ViewWork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ViewWorkActionPerformed(evt);
            }
        });

        jBtn_Exit.setBackground(new java.awt.Color(255, 102, 102));
        jBtn_Exit.setText("Exit");
        jBtn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ExitActionPerformed(evt);
            }
        });

        jLable_Title.setText("DMAF DAILY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtn_Exit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtn_FBCTrack, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn_WorkTrack)
                            .addComponent(jBtn_ViewFBC, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn_ViewWork, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 138, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLable_Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLable_Title)
                .addGap(18, 18, 18)
                .addComponent(jBtn_FBCTrack)
                .addGap(18, 18, 18)
                .addComponent(jBtn_WorkTrack)
                .addGap(18, 18, 18)
                .addComponent(jBtn_ViewFBC)
                .addGap(18, 18, 18)
                .addComponent(jBtn_ViewWork)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jBtn_Exit)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_WorkTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_WorkTrackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_WorkTrackActionPerformed

    private void jBtn_FBCTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_FBCTrackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_FBCTrackActionPerformed

    private void jBtn_ViewFBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ViewFBCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_ViewFBCActionPerformed

    private void jBtn_ViewWorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ViewWorkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_ViewWorkActionPerformed

    private void jBtn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_ExitActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Exit;
    private javax.swing.JButton jBtn_FBCTrack;
    private javax.swing.JButton jBtn_ViewFBC;
    private javax.swing.JButton jBtn_ViewWork;
    private javax.swing.JButton jBtn_WorkTrack;
    private javax.swing.JLabel jLable_Title;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
