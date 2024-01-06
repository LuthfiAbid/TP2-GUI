/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class FormInput extends javax.swing.JFrame {

    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = koneksi.Koneksi.Koneksi();

    /**
     * Creates new form FormInput
     */
    public FormInput() {
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

        panel_form_input = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_alamat = new javax.swing.JLabel();
        input_nik = new javax.swing.JTextField();
        input_nama = new javax.swing.JTextField();
        txt_tgl_lahir = new javax.swing.JLabel();
        txt_nik = new javax.swing.JLabel();
        txt_nama = new javax.swing.JLabel();
        input_tgl_lahir = new com.toedter.calendar.JDateChooser();
        btn_form_list = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        input_alamat = new javax.swing.JTextArea();
        btn_keluar = new javax.swing.JButton();
        panel_button_form_input = new javax.swing.JPanel();
        btn_reset = new javax.swing.JButton();
        btn_simpan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Input Data Pasien");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        txt_alamat.setText("Alamat");

        input_nik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                input_nikKeyTyped(evt);
            }
        });

        txt_tgl_lahir.setText("Tanggal Lahir");

        txt_nik.setText("NIK");

        txt_nama.setText("Nama Pasien");

        btn_form_list.setText("Lihat Daftar");
        btn_form_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_form_listActionPerformed(evt);
            }
        });

        input_alamat.setColumns(10);
        input_alamat.setRows(5);
        input_alamat.setTabSize(2);
        input_alamat.setToolTipText("");
        input_alamat.setWrapStyleWord(true);
        input_alamat.setAutoscrolls(false);
        input_alamat.setMaximumSize(new java.awt.Dimension(13, 20));
        jScrollPane1.setViewportView(input_alamat);

        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_form_inputLayout = new javax.swing.GroupLayout(panel_form_input);
        panel_form_input.setLayout(panel_form_inputLayout);
        panel_form_inputLayout.setHorizontalGroup(
            panel_form_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_form_inputLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(panel_form_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_form_inputLayout.createSequentialGroup()
                        .addComponent(btn_form_list)
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(btn_keluar))
                    .addGroup(panel_form_inputLayout.createSequentialGroup()
                        .addGroup(panel_form_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nik)
                            .addComponent(txt_tgl_lahir)
                            .addComponent(txt_nama)
                            .addComponent(txt_alamat))
                        .addGap(32, 32, 32)
                        .addGroup(panel_form_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input_nik)
                            .addComponent(input_nama)
                            .addComponent(input_tgl_lahir, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panel_form_inputLayout.setVerticalGroup(
            panel_form_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_form_inputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_form_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_form_list)
                    .addComponent(btn_keluar))
                .addGap(30, 30, 30)
                .addGroup(panel_form_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_form_inputLayout.createSequentialGroup()
                        .addGroup(panel_form_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(input_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nama))
                        .addGap(27, 27, 27)
                        .addGroup(panel_form_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nik)
                            .addComponent(input_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(input_tgl_lahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_tgl_lahir))
                .addGroup(panel_form_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_form_inputLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(txt_alamat))
                    .addGroup(panel_form_inputLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(panel_form_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 350));

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_button_form_inputLayout = new javax.swing.GroupLayout(panel_button_form_input);
        panel_button_form_input.setLayout(panel_button_form_inputLayout);
        panel_button_form_inputLayout.setHorizontalGroup(
            panel_button_form_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_button_form_inputLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(btn_reset)
                .addGap(88, 88, 88)
                .addComponent(btn_simpan)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        panel_button_form_inputLayout.setVerticalGroup(
            panel_button_form_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_button_form_inputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_button_form_inputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reset)
                    .addComponent(btn_simpan))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(panel_button_form_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 640, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        input_nama.setText("");
        input_nik.setText("");
        input_alamat.setText("");
        input_tgl_lahir.setCalendar(null);
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        try {
            st = cn.createStatement();

            if (input_nama.getText() == "") {
                JOptionPane.showMessageDialog(null, "Nama pasien tidak boleh kosong!");
            } else if (input_nik.getText() == "") {
                JOptionPane.showMessageDialog(null, "NIK tidak boleh kosong!");
            } else if (input_tgl_lahir.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Nama pasien tidak boleh kosong!");
            } else if (input_alamat.getText() == "") {
                JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong!");
            } else {
                rs = st.executeQuery("SELECT * FROM data_pasien WHERE nik = " + input_nik.getText() + "");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "NIK : '" + input_nik.getText() + "' sudah terpakai!");
                    input_nik.setText("");
                } else {
                    st.executeUpdate("INSERT INTO data_pasien (nama, nik, alamat, tgl_lahir) VALUES('"
                            + input_nama.getText() + "','"
                            + input_nik.getText() + "','"
                            + input_alamat.getText() + "','"
                            + new SimpleDateFormat("yyyy-MM-dd").format(input_tgl_lahir.getDate()) + "')");

                    JOptionPane.showMessageDialog(null, "Simpan Berhasil");

                    FormList fl = new FormList();
                    fl.show();
                    dispose();
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void input_nikKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_nikKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_input_nikKeyTyped

    private void btn_form_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_form_listActionPerformed
        FormList fl = new FormList();
        fl.show();
        dispose();
    }//GEN-LAST:event_btn_form_listActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(FormInput.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormInput.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormInput.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormInput.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormInput().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_form_list;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JTextArea input_alamat;
    public javax.swing.JTextField input_nama;
    public javax.swing.JTextField input_nik;
    public com.toedter.calendar.JDateChooser input_tgl_lahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_button_form_input;
    private javax.swing.JPanel panel_form_input;
    private javax.swing.JLabel txt_alamat;
    private javax.swing.JLabel txt_nama;
    private javax.swing.JLabel txt_nik;
    private javax.swing.JLabel txt_tgl_lahir;
    // End of variables declaration//GEN-END:variables
}