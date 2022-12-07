/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DoctorRole;

import NUHealthCare.Account.Account;
import NUHealthCare.Ecosystem;
import NUHealthCare.Enterprise.Enterprise;
import NUHealthCare.JobQueue.AccountsBillingJob;
import NUHealthCare.JobQueue.PatientVisitJob;
import NUHealthCare.Org.AccountantOrg;
import NUHealthCare.Org.Org;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rishabh,Uday,Aditi
 */
public class RequestBillingsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestBillingsJPanel
     */
    
    private JPanel userProcessContainer;
    private Account userAccount;
    private Enterprise enterprise;
    private PatientVisitJob patientTreatmentWorkRequest;
    private Ecosystem ecoSystem;
    private double consultationCharges = 50;
    
    public RequestBillingsJPanel(JPanel userProcessContainer, Account userAccount, Enterprise enterprise, PatientVisitJob workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.patientTreatmentWorkRequest = workRequest;
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

        txtPatientId = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        lblBillintInformationTitle = new javax.swing.JLabel();
        lblConsulationCharges = new javax.swing.JLabel();
        txtConsultationCharges = new javax.swing.JTextField();
        lblMedicationCharges = new javax.swing.JLabel();
        txtMedicationCharges = new javax.swing.JTextField();
        lblLabTest = new javax.swing.JLabel();
        lblBillingRequest = new javax.swing.JLabel();
        txtLabCharges = new javax.swing.JTextField();
        lblSubTitle = new javax.swing.JLabel();
        lblMiscellaneousCharges = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtMiscellaneousCharges = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        btnSendBillingRequest = new javax.swing.JButton();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblAssignedDoctor = new javax.swing.JLabel();
        txtAssignedDoctor = new javax.swing.JTextField();
        lblPatientId = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        txtPatientId.setEditable(false);

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("<<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        lblBillintInformationTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBillintInformationTitle.setText("BILLING INFORMATION");

        lblConsulationCharges.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblConsulationCharges.setText("Consultaion Charges (USD) :");

        txtConsultationCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultationChargesActionPerformed(evt);
            }
        });

        lblMedicationCharges.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMedicationCharges.setText("Medication Charges (USD):");

        lblLabTest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLabTest.setText("Lab Test Charges (USD) :");

        lblBillingRequest.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblBillingRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBillingRequest.setText("Billing Request");

        txtLabCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabChargesActionPerformed(evt);
            }
        });

        lblSubTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubTitle.setText("PATIENT INFORMATION");

        lblMiscellaneousCharges.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMiscellaneousCharges.setText("Miscellaneous Charges (USD):");

        txtFirstName.setEditable(false);

        lblFirstName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFirstName.setText("First Name :");

        btnSendBillingRequest.setBackground(new java.awt.Color(153, 0, 0));
        btnSendBillingRequest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSendBillingRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnSendBillingRequest.setText("Send Billing Request");
        btnSendBillingRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendBillingRequestActionPerformed(evt);
            }
        });

        lblLastName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLastName.setText("Last Name :");

        txtLastName.setEditable(false);

        lblAssignedDoctor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAssignedDoctor.setText("Assigned Doctor :");

        txtAssignedDoctor.setEditable(false);

        lblPatientId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatientId.setText("Patient Id:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Assets/Invoice.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(lblSubTitle))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(btnSendBillingRequest))
                                    .addComponent(lblBillintInformationTitle)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(lblLabTest)
                                    .addGap(10, 10, 10)
                                    .addComponent(txtLabCharges))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(lblMedicationCharges)
                                    .addGap(10, 10, 10)
                                    .addComponent(txtMedicationCharges))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblMiscellaneousCharges)
                                    .addGap(10, 10, 10)
                                    .addComponent(txtMiscellaneousCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(lblConsulationCharges)
                                    .addGap(10, 10, 10)
                                    .addComponent(txtConsultationCharges, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAssignedDoctor)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtAssignedDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFirstName)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblLastName)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPatientId)
                                        .addGap(6, 6, 6)
                                        .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBillingRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)))
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(backBtn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBillingRequest)
                        .addGap(59, 59, 59)
                        .addComponent(lblSubTitle)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblFirstName)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblLastName)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAssignedDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblAssignedDoctor)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblPatientId)))
                        .addGap(43, 43, 43)
                        .addComponent(lblBillintInformationTitle)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConsulationCharges)
                            .addComponent(txtConsultationCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblLabTest))
                            .addComponent(txtLabCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblMedicationCharges))
                            .addComponent(txtMedicationCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblMiscellaneousCharges))
                            .addComponent(txtMiscellaneousCharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(btnSendBillingRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DoctorWorkArea dwjp = (DoctorWorkArea) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void txtConsultationChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultationChargesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultationChargesActionPerformed

    private void txtLabChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabChargesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabChargesActionPerformed

    private void btnSendBillingRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendBillingRequestActionPerformed

        String consultationCharge = txtConsultationCharges.getText().trim();
        String labChargesStr = txtLabCharges.getText();
        String miscellaneouschargesStr = txtMiscellaneousCharges.getText();
        String medicationChargesStr = txtMedicationCharges.getText();
        if (consultationCharge.equals("") || labChargesStr.equals("") || miscellaneouschargesStr.equals("") || medicationChargesStr.equals("")) {
            JOptionPane.showMessageDialog(null, "All fields are mandatory");
        } else {
            
            try {
                Double.parseDouble(consultationCharge);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please provide a Numeric value for Consultation Charges");
                return;
            }
            
            try {
                Integer.parseInt(labChargesStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type a Numeric value for Lab Charges");
                return;
            }
            try {
                Integer.parseInt(miscellaneouschargesStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type a Numeric value for Miscellaneous charges");
                return;
            }
            try {
                Integer.parseInt(medicationChargesStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please type a Numeric value for Medication charges");
                return;
            }
            double labCharges = Double.parseDouble(labChargesStr);
            double miscellaneouscharges = Double.parseDouble(miscellaneouschargesStr);
            double medicationCharges = Double.parseDouble(medicationChargesStr);
            double billingAmount = labCharges + consultationCharges + medicationCharges + miscellaneouscharges;
            //request.setBillAmount(billingAmount);

            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to proceed?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                patientTreatmentWorkRequest.setStatus("Consultation Completed");
                patientTreatmentWorkRequest.setBillAmount(billingAmount);

                AccountsBillingJob accountantBillingRequest = new AccountsBillingJob();
                accountantBillingRequest.setBillingAmt(billingAmount);

                accountantBillingRequest.setSender(userAccount);
                accountantBillingRequest.setStatus("Sent");
                accountantBillingRequest.setPatient(patientTreatmentWorkRequest.getPatient());
                accountantBillingRequest.setVisitRequest(patientTreatmentWorkRequest);

                Org org = null;
                for (Org organization : enterprise.getOrgDirectory().getOrganizations()) {
                    if (organization instanceof AccountantOrg) {
                        org = organization;
                        break;
                    }
                }
                if (org != null) {
                    org.getJobQueue().getJobRequestList().add(accountantBillingRequest);
                    userAccount.getJobQueue().getJobRequestList().add(accountantBillingRequest);
                }

                JOptionPane.showMessageDialog(null, "Prescription submitted successfully");
                btnSendBillingRequest.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnSendBillingRequestActionPerformed

    private void populateTable() {

        txtFirstName.setText(patientTreatmentWorkRequest.getPatient().getPatientFName());
        txtLastName.setText(patientTreatmentWorkRequest.getPatient().getPatientLName());
        txtPatientId.setText(String.valueOf(patientTreatmentWorkRequest.getPatient().getPatientID()));
        txtAssignedDoctor.setText(patientTreatmentWorkRequest.getAssignedDoctor().getEmployee().getEmpName());
        txtConsultationCharges.setText(String.valueOf(consultationCharges));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnSendBillingRequest;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblAssignedDoctor;
    private javax.swing.JLabel lblBillingRequest;
    private javax.swing.JLabel lblBillintInformationTitle;
    private javax.swing.JLabel lblConsulationCharges;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLabTest;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMedicationCharges;
    private javax.swing.JLabel lblMiscellaneousCharges;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JTextField txtAssignedDoctor;
    private javax.swing.JTextField txtConsultationCharges;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLabCharges;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMedicationCharges;
    private javax.swing.JTextField txtMiscellaneousCharges;
    private javax.swing.JTextField txtPatientId;
    // End of variables declaration//GEN-END:variables
}