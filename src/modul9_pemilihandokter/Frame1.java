/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul9_pemilihandokter;

/**
 *
 * @author asus
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtspesial = new javax.swing.JTextField();
        jtxtnama = new javax.swing.JTextField();
        jtxtusia = new javax.swing.JTextField();
        jtxtjenis = new javax.swing.JTextField();
        jtxtgol = new javax.swing.JTextField();
        jtxtstatus = new javax.swing.JTextField();
        jtxtkewar = new javax.swing.JTextField();
        jtxtwaktu = new javax.swing.JTextField();
        jconadokt = new javax.swing.JComboBox<>();
        jtxtalamat = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("NewsGoth BT", 1, 36)); // NOI18N
        jLabel1.setText("Pemilihan Dokter");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 310, 40);

        jLabel2.setText("Pilih Dokter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 60, 14);

        jLabel3.setText("Dokter Spesialis");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 520, 160, 14);

        jLabel4.setText("Nama");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 120, 100, 14);

        jLabel5.setText("Alamat");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 170, 140, 14);

        jLabel6.setText("Usia");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 220, 120, 14);

        jLabel7.setText("Jenis Kelamin");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 270, 70, 14);

        jLabel8.setText("Golongan Darah");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 320, 170, 14);

        jLabel9.setText("Status");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 370, 150, 14);

        jLabel10.setText("Kewarganegaraan");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 420, 170, 14);

        jLabel11.setText("Waktu Praktek");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 470, 160, 14);

        jtxtspesial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtspesialActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtspesial);
        jtxtspesial.setBounds(240, 510, 240, 30);

        jtxtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtnama);
        jtxtnama.setBounds(240, 110, 240, 30);

        jtxtusia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtusiaActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtusia);
        jtxtusia.setBounds(240, 210, 240, 30);

        jtxtjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtjenisActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtjenis);
        jtxtjenis.setBounds(240, 260, 240, 30);

        jtxtgol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtgolActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtgol);
        jtxtgol.setBounds(240, 310, 240, 30);

        jtxtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtstatusActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtstatus);
        jtxtstatus.setBounds(240, 360, 240, 30);

        jtxtkewar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtkewarActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtkewar);
        jtxtkewar.setBounds(240, 410, 240, 30);

        jtxtwaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtwaktuActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtwaktu);
        jtxtwaktu.setBounds(240, 460, 240, 30);

        jconadokt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Salah Satu --", "Dr. Farras Yassar", "Dr. Anisa Putri", "Dr. Harun Fajar" }));
        jconadokt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconadoktActionPerformed(evt);
            }
        });
        getContentPane().add(jconadokt);
        jconadokt.setBounds(120, 60, 200, 20);

        jtxtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtalamatActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtalamat);
        jtxtalamat.setBounds(240, 160, 240, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identitas"));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 90, 500, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtspesialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtspesialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtspesialActionPerformed

    private void jtxtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnamaActionPerformed

    private void jtxtusiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtusiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtusiaActionPerformed

    private void jtxtjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtjenisActionPerformed

    private void jtxtgolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtgolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtgolActionPerformed

    private void jtxtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtstatusActionPerformed

    private void jtxtkewarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtkewarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtkewarActionPerformed

    private void jtxtwaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtwaktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtwaktuActionPerformed

    private void jconadoktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconadoktActionPerformed
        // TODO add your handling code here:
        if(jconadokt.getSelectedItem().equals("Dr. Farras Yassar")){
            jtxtnama.setText("Dr. Farras Yassar ");
            jtxtalamat.setText("Jl. Surabaya 16, Malang");
            jtxtusia.setText("20 Tahun");
            jtxtjenis.setText("Laki Laki");
            jtxtgol.setText("A");
            jtxtstatus.setText("Belum Menikah");
            jtxtkewar.setText("Indonesia");
            jtxtspesial.setText("Dokter Umum");
            jtxtwaktu.setText("Pagi (07.00 - 15.00)");
            
        }
        else
            if(jconadokt.getSelectedItem().equals("Dr. Anisa Putri")){
                jtxtnama.setText("Dr. Anisa Putri ");
                jtxtalamat.setText("Jl. Veteran 3, Malang");
                jtxtusia.setText("20 Tahun");
                jtxtjenis.setText("Perempuan"); 
                jtxtgol.setText("O");
                jtxtstatus.setText("Belum Menikah");
                jtxtkewar.setText("Indonesia");
                jtxtspesial.setText("Dokter Gigi");
                jtxtwaktu.setText("Pagi (16.00 - 22.00)");
            }
        else
                if(jconadokt.getSelectedItem().equals("Dr. Harun Fajar")){
                    jtxtnama.setText("Dr. Harn Fajar ");
                    jtxtalamat.setText("Jl. Bandung 9, Malang");
                    jtxtusia.setText("20 Tahun");
                    jtxtjenis.setText("Laki - Laki"); 
                    jtxtgol.setText("B");
                    jtxtstatus.setText("Belum Menikah");
                    jtxtkewar.setText("Indonesia");
                    jtxtspesial.setText("Dokter Gizi");
                    jtxtwaktu.setText("Pagi (22.00 - 06.00)");
                }
    }//GEN-LAST:event_jconadoktActionPerformed

    private void jtxtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtalamatActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jconadokt;
    private javax.swing.JTextField jtxtalamat;
    private javax.swing.JTextField jtxtgol;
    private javax.swing.JTextField jtxtjenis;
    private javax.swing.JTextField jtxtkewar;
    private javax.swing.JTextField jtxtnama;
    private javax.swing.JTextField jtxtspesial;
    private javax.swing.JTextField jtxtstatus;
    private javax.swing.JTextField jtxtusia;
    private javax.swing.JTextField jtxtwaktu;
    // End of variables declaration//GEN-END:variables
}
