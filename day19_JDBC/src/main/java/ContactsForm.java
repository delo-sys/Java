
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ContactsForm extends javax.swing.JFrame 
{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ContactsForm.class.getName());
    Connection con = null;
    PreparedStatement pstm=null;
    ResultSet rs=null;
    DefaultTableModel dtm;
        public ContactsForm() 
        {
        initComponents();
        con = DBConnection.connect();
        loadData();
        }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContacts = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));

        jLabel2.setText("name");

        jLabel3.setText("phone");

        jLabel4.setText("email");

        jLabel5.setText("address");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                        .addComponent(txtPhone)
                        .addComponent(txtName)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Contacts Form");

        tblContacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "rowid", "name", "phone", "email", "address"
            }
        ));
        tblContacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblContactsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblContacts);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(btnReset))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
                
        try 
        {
            String name=txtName.getText();
            String phone=txtPhone.getText();
            String email=txtEmail.getText();
            String address=txtAddress.getText();
            String sql = "INSERT INTO tblContacts(name,phone,email,address) values(?,?,?,?)";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, name);
        pstm.setString(2, phone);
        pstm.setString(3, email);
        pstm.setString(4, address);
        pstm.executeUpdate();
        JOptionPane.showMessageDialog(this, "Contact added");
        txtName.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        txtName.requestFocus();
        } catch (SQLException ex) 
        {
            System.getLogger(ContactsForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblContactsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblContactsMouseClicked
        dtm = (DefaultTableModel)tblContacts.getModel();
        int selectedIndex=tblContacts.getSelectedRow();
        String rowid=dtm.getValueAt(selectedIndex,0).toString();
        txtName.setText(dtm.getValueAt(selectedIndex,1).toString());
        txtPhone.setText(dtm.getValueAt(selectedIndex,2).toString());
        txtEmail.setText(dtm.getValueAt(selectedIndex,3).toString());
        txtAddress.setText(dtm.getValueAt(selectedIndex,4).toString());
        btnSave.setEnabled(false);

    }//GEN-LAST:event_tblContactsMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        try 
        {
        dtm = (DefaultTableModel)tblContacts.getModel();
        int selectedIndex=tblContacts.getSelectedRow();
        String rowid=dtm.getValueAt(selectedIndex,0).toString();
        
            String name=txtName.getText();
            String phone=txtPhone.getText();
            String email=txtEmail.getText();
            String address=txtAddress.getText();
            String sql = "UPDATE tblContacts SET name=?,phone=?,email=?,address=? WHERE rowid=?";
            pstm = con.prepareStatement(sql);
            pstm.setString(1, name);
            pstm.setString(2, phone);
            pstm.setString(3, email);
            pstm.setString(4, address);
            pstm.setString(5, rowid);
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(this, "Contact updated");
            btnSave.setEnabled(true);
            loadData();
            txtName.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            txtAddress.setText("");
            txtName.requestFocus();
        } catch (SQLException ex) 
        {
            System.getLogger(ContactsForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } 
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
        txtName.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        btnSave.setEnabled(true);
        tblContacts.clearSelection();
        txtName.requestFocus();
    }                                        

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            dtm = (DefaultTableModel) tblContacts.getModel();
            int selectedIndex = tblContacts.getSelectedRow();
            if (selectedIndex == -1) {
                JOptionPane.showMessageDialog(this, "Please select a contact to delete.");
                return;
            }
            String rowid = dtm.getValueAt(selectedIndex, 0).toString();
            int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this contact?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                String sql = "DELETE FROM tblContacts WHERE rowid=?";
                pstm = con.prepareStatement(sql);
                pstm.setString(1, rowid);
                pstm.executeUpdate();
                JOptionPane.showMessageDialog(this, "Contact deleted");
                btnSave.setEnabled(true);
                loadData();
                txtName.setText("");
                txtPhone.setText("");
                txtEmail.setText("");
                txtAddress.setText("");
                txtName.requestFocus();
            }
        } catch (SQLException ex) {
            System.getLogger(ContactsForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }                                         

    public void loadData()
    {
        int c;
        try {
            pstm = con.prepareStatement("Select rowid, name,phone,email,address from tblContacts");
            rs=pstm.executeQuery();
            ResultSetMetaData rsdm = rs.getMetaData();
            c = rsdm.getColumnCount();
            dtm = (DefaultTableModel)tblContacts.getModel();
            dtm.setRowCount(0);
            while(rs.next())
            {
                Vector v = new Vector(); 
                for(int i=1;i<=c;i++)
                {
                    v.add(rs.getString("rowid"));
                    v.add(rs.getString("name"));
                    v.add(rs.getString("phone"));
                    v.add(rs.getString("email"));
                    v.add(rs.getString("address"));
                }
                dtm.addRow(v);
            }
            
        } catch (SQLException ex) {
            System.getLogger(ContactsForm.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ContactsForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblContacts;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
