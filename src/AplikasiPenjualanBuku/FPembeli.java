/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AplikasiPenjualanBuku;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import koneksi.koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author User
 */
public class FPembeli extends javax.swing.JFrame {

    /**
     * Creates new form FPembeli1
     */
    public FPembeli() throws SQLException {
        initComponents();
        setLocationRelativeTo(this);
        load_data();
       IDOtomatis();
    }
    public void load_data() throws SQLException{
            Connection kon = koneksi.koneksiDb();
            Object header []={"ID PEMBELI", "NAMA", "ALAMAT"};
            DefaultTableModel data=new DefaultTableModel(null, header);
            tpembeli.setModel(data);
            String sql_data="SELECT * FROM pembeli";
            try
           { 
                Statement st=kon.createStatement();
                ResultSet rs=st.executeQuery(sql_data);
                while (rs.next())
                {
                String d1=rs.getString(1);
                String d2=rs.getString(2);
                String d3=rs.getString(3);
                
         
                String d[]={d1, d2, d3};
                data.addRow(d);
                }

            }
            catch(Exception e)
            { 
                JOptionPane.showMessageDialog(null, e);
            }           
}
    public void IDOtomatis() {
    try {
        Connection kon = koneksi.koneksiDb();
        Statement st = kon.createStatement();

        String sql_id = "SELECT MAX(id_pembeli) FROM pembeli"; // Mengambil nilai maksimum dari ID buku
        ResultSet rs = st.executeQuery(sql_id);
        if (rs.next()) {
            int id_pembeli = rs.getInt(1); // Mengambil nilai ID buku maksimum sebagai integer
            if (id_pembeli > 0) {
                int idNumber = id_pembeli + 1;
                String AN = String.format("%05d", idNumber); // Format ID buku dengan 5 digit
                
                // Lakukan sesuatu dengan AN, misalnya, atur nilainya ke suatu field teks atau gunakan di tempat lain
            } else {
                // Handle kasus ketika nilai id_pembeli tidak valid
            }
        }
    } catch (SQLException | NumberFormatException e) {
        JOptionPane.showMessageDialog(null, e);
    }  
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtALAMAT = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpembeli = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIDPEMBELI = new javax.swing.JTextField();
        txtNAMA = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtALAMAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtALAMATActionPerformed(evt);
            }
        });
        getContentPane().add(txtALAMAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 134, 30));

        tpembeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID PEMBELI", "NAMA ", "ALAMT"
            }
        ));
        tpembeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tpembeliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tpembeli);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 430, 231));

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ID PEMBELI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("NAMA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("ALAMAT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        getContentPane().add(txtIDPEMBELI, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 134, 30));

        txtNAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNAMAActionPerformed(evt);
            }
        });
        getContentPane().add(txtNAMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 134, 30));

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pencil_edit.png"))); // NOI18N
        jButton1.setText("EDIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 90, 40));

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Hapus.png"))); // NOI18N
        jButton2.setText("HAPUS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/save-48.png"))); // NOI18N
        jButton3.setText("SIMPAN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 40));

        jButton6.setBackground(new java.awt.Color(204, 255, 204));
        jButton6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/CETAK.png"))); // NOI18N
        jButton6.setText("Cetak");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 110, 40));

        jButton4.setBackground(new java.awt.Color(204, 255, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/kembali.png"))); // NOI18N
        jButton4.setText("KELUAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pexels-ivo-rainha-1290141.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 524, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtALAMATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtALAMATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtALAMATActionPerformed

    private void txtNAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNAMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNAMAActionPerformed

    private void tpembeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tpembeliMouseClicked
           int selectedRow = tpembeli.getSelectedRow();

// Pemeriksaan apakah baris yang dipilih valid
if (selectedRow >= 0 && selectedRow < tpembeli.getRowCount()) {
    // Pastikan bahwa kolom yang Anda akses ada dalam batas indeks yang valid
    int id_pembeliColumnIndex = 0;
    int nama_pembeliColumnIndex = 1;
    int alamat_pembeliColumnIndex = 2;

    if (id_pembeliColumnIndex < tpembeli.getColumnCount()) {
        txtIDPEMBELI.setText(tpembeli.getModel().getValueAt(selectedRow, id_pembeliColumnIndex).toString());
    }

    if (nama_pembeliColumnIndex < tpembeli.getColumnCount()) {
        txtNAMA.setText(tpembeli.getModel().getValueAt(selectedRow, nama_pembeliColumnIndex).toString());
    }

    if (alamat_pembeliColumnIndex < tpembeli.getColumnCount()) {
        txtALAMAT.setText(tpembeli.getModel().getValueAt(selectedRow, alamat_pembeliColumnIndex).toString());
    }
} else {
    // Tindakan yang sesuai jika baris yang dipilih tidak valid
    // Misalnya, menampilkan pesan kesalahan atau melakukan tindakan lainnya.
}
    }//GEN-LAST:event_tpembeliMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     int selectedRow = tpembeli.getSelectedRow();

if (selectedRow != -1) {
    String idp = tpembeli.getValueAt(selectedRow, 0).toString();
    String nmp = tpembeli.getValueAt(selectedRow, 1).toString();
    String amp = tpembeli.getValueAt(selectedRow, 2).toString();

    // Menggunakan input dialog untuk memperbarui nilai
    idp = JOptionPane.showInputDialog(null, "Masukkan Pembeli", idp);
    nmp = JOptionPane.showInputDialog(null, "Masukkan Nama", nmp);
    amp = JOptionPane.showInputDialog(null, "Masukkan Alamat", amp);

    // Menyimpan perubahan ke dalam tabel
    tpembeli.setValueAt(idp, selectedRow, 0);
    tpembeli.setValueAt(nmp, selectedRow, 1);
    tpembeli.setValueAt(amp, selectedRow, 2);

    // Update data ke dalam database
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/buku", "root", "");

        String sql = "UPDATE pembeli SET id_pembeli=?, nama_pembeli=?, alamat_pembeli=? WHERE id_pembeli=?";
        try (java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, idp);
            preparedStatement.setString(2, nmp);
            preparedStatement.setString(3, amp);
            preparedStatement.setString(4, idp);

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil diupdate");
            } else {
                JOptionPane.showMessageDialog(null, "Gagal mengupdate data.");
            }
        }

        connection.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex.getMessage());
    }
} else {
    JOptionPane.showMessageDialog(null, "Pilih data yang akan diupdate", "Peringatan", JOptionPane.WARNING_MESSAGE);
}
 // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     int selectedRow = tpembeli.getSelectedRow();

if (selectedRow != -1) {
    int konfirmasi = JOptionPane.showConfirmDialog(
        null,
        "Apakah Anda yakin ingin menghapus data ini?",
        "Konfirmasi Hapus",
        JOptionPane.YES_NO_OPTION);

    if (konfirmasi == JOptionPane.YES_OPTION) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/buku", "root", "");

            // Mendapatkan nilai ID pembeli dari baris terpilih
            String idPembeli = tpembeli.getValueAt(selectedRow, 0).toString();

            // Menghapus data dari database
            String sql = "DELETE FROM pembeli WHERE id_pembeli=?";
            try (PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(sql)) {
                preparedStatement.setString(1, idPembeli);

                int affectedRows = preparedStatement.executeUpdate();
                if (affectedRows > 0) {
                    // Menghapus baris dari tabel
                    DefaultTableModel model = (DefaultTableModel) tpembeli.getModel();
                    model.removeRow(selectedRow);

                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                } else {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data.");
                }
            }

            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex.getMessage());
        }
    }
} else {
    JOptionPane.showMessageDialog(null, "Pilih data yang akan dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String idp = txtIDPEMBELI.getText();   
String nmp = txtNAMA.getText();
String amp = txtALAMAT.getText();

// Validasi data
if (idp.isEmpty() || nmp.isEmpty() || amp.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Semua data wajib diisi!", "Peringatan", JOptionPane.WARNING_MESSAGE);
} else {
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/buku", "root", "");

        String sql = "INSERT INTO pembeli (id_pembeli, nama_pembeli, alamat_pembeli) VALUES (?, ?, ?)";
        try (java.sql.PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, idp);
            preparedStatement.setString(2, nmp);
            preparedStatement.setString(3, amp);

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan.");

                // Setelah penyimpanan berhasil, tampilkan data baru di tabel
                load_data();  // Panggil metode load_data() untuk memperbarui tabel
            } else {
                JOptionPane.showMessageDialog(null, "Gagal menyimpan data.");
            }
        }

        connection.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex.getMessage());
    }
}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {
            String reportPath = "src/Report/Laporan_Data_Pembeli.jasper";
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/buku", "root", "");

            HashMap<String, Object> parameters = new HashMap<>();

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error displaying report: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       new Utama().show();
       this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(FPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FPembeli().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FPembeli.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tpembeli;
    private javax.swing.JTextField txtALAMAT;
    private javax.swing.JTextField txtIDPEMBELI;
    private javax.swing.JTextField txtNAMA;
    // End of variables declaration//GEN-END:variables
}
