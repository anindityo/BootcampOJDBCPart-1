/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controller.RegionController;
import entities.Region;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import tools.MyConnection;

/**
 *
 * @author Gusma
 */
public class RegionView extends javax.swing.JInternalFrame {

    private RegionController regionController;
    /**
     * Creates new form RegionView
     */
    public RegionView() {
        initComponents();
        this.regionController = new RegionController(new MyConnection().getConnection());
        bindingTable();
        
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
        TblRegion = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textid = new javax.swing.JTextField();
        textName = new javax.swing.JTextField();
        btDrop = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        cbregion = new javax.swing.JComboBox<>();
        textFind = new javax.swing.JTextField();
        btFind = new javax.swing.JButton();

        setTitle("Region");

        TblRegion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TblRegion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TblRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblRegionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblRegion);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Region Details"));
        jPanel1.setToolTipText("");
        jPanel1.setName(""); // NOI18N

        jLabel1.setText("Region ID");

        jLabel2.setText("Region Name");

        textid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textidActionPerformed(evt);
            }
        });

        btDrop.setText("Drop");
        btDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDropActionPerformed(evt);
            }
        });

        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btDrop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSave))
                    .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDrop)
                    .addComponent(btEdit)
                    .addComponent(btSave))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        cbregion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "region_id", "region_name" }));

        btFind.setText("Find");
        btFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbregion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(textFind, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btFind)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFind, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFind)
                    .addComponent(cbregion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textidActionPerformed

    private void btFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindActionPerformed
        //searchTable(cbregion.getSelectedItem().toString(), textFind.getText());
        String category = cbregion.getSelectedItem().toString();
        String data = textFind.getText();
        searchTable(category, data);
    }//GEN-LAST:event_btFindActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        boolean flag = this.regionController.save(textid.getText(),textName.getText());
        String message = "Failed to save data..";
        if(flag){
            message= "Success to save data";
        }
        JOptionPane.showMessageDialog(this, message,"Notification", JOptionPane.INFORMATION_MESSAGE);
        bindingTable();
        reset();
    }//GEN-LAST:event_btSaveActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        String message = "Failed to edit data..";
        if( regionController.edit(textid.getText(),textName.getText())){
            message = "Success to edit data..";
        }
        JOptionPane.showMessageDialog(this, message, "Notification", JOptionPane.INFORMATION_MESSAGE);
        bindingTable();
        reset();
    }//GEN-LAST:event_btEditActionPerformed

    private void TblRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblRegionMouseClicked
        int row = TblRegion.getSelectedRow();
        textid.setText(TblRegion.getValueAt(row, 0).toString());
        textName.setText(TblRegion.getValueAt(row, 1).toString());
    }//GEN-LAST:event_TblRegionMouseClicked

    private void btDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDropActionPerformed
        String message = "Failed to drop data..";
        int flag = JOptionPane.showConfirmDialog(this, "Really?","DELETE?",JOptionPane.YES_NO_OPTION);
        if(flag == 0){
            if(regionController.drop(Integer.parseInt(textid.getText()))){
                message = "Success to drop data";
            }
            JOptionPane.showMessageDialog(this, message, "Notification", JOptionPane.QUESTION_MESSAGE);
        }
        bindingTable();
        reset();
    }//GEN-LAST:event_btDropActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblRegion;
    private javax.swing.JButton btDrop;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btFind;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbregion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textFind;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textid;
    // End of variables declaration//GEN-END:variables
    public void bindingTable(){
        String[] header = {"Region ID","Region Name"};
        DefaultTableModel defaultTableModel = new DefaultTableModel(header, 0);
        for (Region region : regionController.bindingsort("region_id", "asc")) {
        //for (Region region : regionController.binding("region_id","asc")) {
            Object[] region1 = {region.getRegionId(),region.getRegionName()
            };
            defaultTableModel.addRow(region1);
        }
        TblRegion.setModel(defaultTableModel);
    }
    public void searchTable(String category, String data){
        String[] header = {"Region ID","Region Name"};
        DefaultTableModel defaultTableModel = new DefaultTableModel(header, 0);
        for (Region region : regionController.find (category, data)) {
            Object[] region1 = {
                region.getRegionId(),region.getRegionName()
            };
            defaultTableModel.addRow(region1);
        }
        TblRegion.setModel(defaultTableModel);
    }
    
    public void reset(){
        textid.setText("");
        textName.setText("");
        textFind.setText("");
    }
}