package UI.GovtSecretary;

import NUHealthCare.Account.Account;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.JobQueue.GovtFundJob;
import NUHealthCare.JobQueue.JobRequest;
import NUHealthCare.Org.Org;
import NUHealthCare.Org.SecretaryOrg;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class SecretaryWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SecretaryWorkArea
     */
    private JPanel jPanel;
    private Account account;
    private SecretaryOrg secretaryOrg;
    private Enterprise enterprise;

    public SecretaryWorkArea(JPanel jpanel, Account userAccount, Org org, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.jPanel = jpanel;
        this.secretaryOrg = (SecretaryOrg) org;
        this.account = userAccount;

        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnProcessRequest = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblWorkRequest.setBackground(new java.awt.Color(204, 204, 204));
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Location", "Sender", "Receiver", "Status", "Amount", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWorkRequest);

        btnAssign.setBackground(new java.awt.Color(153, 0, 0));
        btnAssign.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcessRequest.setBackground(new java.awt.Color(153, 0, 0));
        btnProcessRequest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnProcessRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnProcessRequest.setText("Process Request");
        btnProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessRequestActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Secretary Work Area");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Assets/NU_Health_footer.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1210, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(223, 223, 223)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(421, 421, 421)
                                        .addComponent(btnAssign)
                                        .addGap(60, 60, 60)
                                        .addComponent(btnProcessRequest)))
                                .addGap(0, 247, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAssign, btnProcessRequest});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcessRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(jLabel2))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAssign, btnProcessRequest});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int selectedRow = tblWorkRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            JobRequest request = (GovtFundJob) tblWorkRequest.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Sent to Secretary")) {
                request.setReceiver(account);
                request.setStatus("Pending on " + request.getReceiver().getEmployee().getEmpName());
                populateTable();
                JOptionPane.showMessageDialog(null, "Success !! Request is assigned to you ");
            } else {
                JOptionPane.showMessageDialog(null, "Can't assign this work request, as the work request is in " + request.getStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblWorkRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            GovtFundJob fundRequest = (GovtFundJob) tblWorkRequest.getValueAt(selectedRow, 0);
            if (fundRequest.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Cannot process a Rejected Request", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (fundRequest.getStatus().equalsIgnoreCase("Sent to Treasurer")) {
                JOptionPane.showMessageDialog(null, "Request already processed", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (fundRequest.getStatus().equalsIgnoreCase("Sent to Secretary")) {
                JOptionPane.showMessageDialog(null, "Please assign selected request first");
                return;
            }
            if (!account.equals(fundRequest.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!account.getEmployee().equals(fundRequest.getReceiver().getEmployee())) {
                JOptionPane.showMessageDialog(null, "Request assigned to other Officer", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }

            SecretaryProcessRequestJPanel panel = new SecretaryProcessRequestJPanel(jPanel, account, fundRequest, enterprise);
            jPanel.add("secretaryProcessWorkRequestJPanel", panel);
            CardLayout layout = (CardLayout) jPanel.getLayout();
            layout.next(jPanel);

        }
    }//GEN-LAST:event_btnProcessRequestActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblWorkRequest.getModel();

        model.setRowCount(0);

        for (JobRequest request : secretaryOrg.getJobQueue().getJobRequestList()) {
            String status = request.getStatus();
            Object[] row = new Object[6];
            row[0] = ((GovtFundJob) request);
            row[1] = request.getSender().getEmployee().getEmpName();
            if (status.equalsIgnoreCase("Sent to Treasurer") || status.equalsIgnoreCase("Sent to Secretary")) {
                row[2] = null;
            } else {
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getEmpName();
            }
            row[3] = status;
            row[4] = ((GovtFundJob) request).getRequestAmount();
            row[5] = ((GovtFundJob) request).getMessage();

            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcessRequest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}
