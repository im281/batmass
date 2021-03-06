/* 
 * Copyright 2016 Dmitry Avtonomov.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package umich.ms.batmass.db.options;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.util.Exceptions;
import org.openide.util.NbPreferences;
import umich.ms.batmass.db.manager.DBManager;

final class DBMySQLOptionsPanel extends javax.swing.JPanel {

    private final DBMySQLOptionsOptionsPanelController controller;

    DBMySQLOptionsPanel(DBMySQLOptionsOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conParamsPanel = new javax.swing.JPanel();
        dbNameLabel = new javax.swing.JLabel();
        dbUserNameLabel = new javax.swing.JLabel();
        dbUserPasswordLabel = new javax.swing.JLabel();
        dbNameTextField = new javax.swing.JTextField();
        dbUserNameTextField = new javax.swing.JTextField();
        dbUserPasswordPasswordField = new javax.swing.JPasswordField();
        serverPanel = new javax.swing.JPanel();
        serverHostNameTextField = new javax.swing.JTextField();
        serverHostNameLabel = new javax.swing.JLabel();
        serverPortLabel = new javax.swing.JLabel();
        serverPortTextField = new javax.swing.JTextField();
        btnTest = new javax.swing.JButton();

        conParamsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(DBMySQLOptionsPanel.class, "DBMySQLOptionsPanel.conParamsPanel.border.title"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(dbNameLabel, org.openide.util.NbBundle.getMessage(DBMySQLOptionsPanel.class, "DBMySQLOptionsPanel.dbNameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(dbUserNameLabel, org.openide.util.NbBundle.getMessage(DBMySQLOptionsPanel.class, "DBMySQLOptionsPanel.dbUserNameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(dbUserPasswordLabel, org.openide.util.NbBundle.getMessage(DBMySQLOptionsPanel.class, "DBMySQLOptionsPanel.dbUserPasswordLabel.text")); // NOI18N

        dbNameTextField.setText(org.openide.util.NbBundle.getMessage(DBMySQLOptionsPanel.class, "DBMySQLOptionsPanel.dbNameTextField.text")); // NOI18N
        dbNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbNameTextFieldActionPerformed(evt);
            }
        });

        dbUserNameTextField.setText(org.openide.util.NbBundle.getMessage(DBMySQLOptionsPanel.class, "DBMySQLOptionsPanel.dbUserNameTextField.text")); // NOI18N

        dbUserPasswordPasswordField.setText(org.openide.util.NbBundle.getMessage(DBMySQLOptionsPanel.class, "DBMySQLOptionsPanel.dbUserPasswordPasswordField.text")); // NOI18N

        javax.swing.GroupLayout conParamsPanelLayout = new javax.swing.GroupLayout(conParamsPanel);
        conParamsPanel.setLayout(conParamsPanelLayout);
        conParamsPanelLayout.setHorizontalGroup(
            conParamsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conParamsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conParamsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dbUserPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(dbUserNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dbNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(conParamsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dbNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addComponent(dbUserNameTextField)
                    .addComponent(dbUserPasswordPasswordField))
                .addContainerGap())
        );
        conParamsPanelLayout.setVerticalGroup(
            conParamsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conParamsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(conParamsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbNameLabel)
                    .addComponent(dbNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conParamsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbUserNameLabel)
                    .addComponent(dbUserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(conParamsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dbUserPasswordLabel)
                    .addComponent(dbUserPasswordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        serverPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(DBMySQLOptionsPanel.class, "DBMySQLOptionsPanel.serverPanel.border.title"))); // NOI18N

        serverHostNameTextField.setText(org.openide.util.NbBundle.getMessage(DBMySQLOptionsPanel.class, "DBMySQLOptionsPanel.serverHostNameTextField.text")); // NOI18N
        serverHostNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverHostNameTextFieldActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(serverHostNameLabel, org.openide.util.NbBundle.getMessage(DBMySQLOptionsPanel.class, "DBMySQLOptionsPanel.serverHostNameLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(serverPortLabel, org.openide.util.NbBundle.getMessage(DBMySQLOptionsPanel.class, "DBMySQLOptionsPanel.serverPortLabel.text")); // NOI18N

        serverPortTextField.setText(org.openide.util.NbBundle.getMessage(DBMySQLOptionsPanel.class, "DBMySQLOptionsPanel.serverPortTextField.text")); // NOI18N
        serverPortTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverPortTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout serverPanelLayout = new javax.swing.GroupLayout(serverPanel);
        serverPanel.setLayout(serverPanelLayout);
        serverPanelLayout.setHorizontalGroup(
            serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(serverHostNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(serverPortLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serverHostNameTextField)
                    .addComponent(serverPortTextField))
                .addContainerGap())
        );
        serverPanelLayout.setVerticalGroup(
            serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serverPanelLayout.createSequentialGroup()
                .addGroup(serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverHostNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serverHostNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(serverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverPortLabel)
                    .addComponent(serverPortTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        org.openide.awt.Mnemonics.setLocalizedText(btnTest, org.openide.util.NbBundle.getMessage(DBMySQLOptionsPanel.class, "DBMySQLOptionsPanel.btnTest.text")); // NOI18N
        btnTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serverPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(conParamsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTest)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(serverPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conParamsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTest)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void serverHostNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverHostNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serverHostNameTextFieldActionPerformed

    private void serverPortTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverPortTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serverPortTextFieldActionPerformed

    private void dbNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dbNameTextFieldActionPerformed

    private void btnTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestActionPerformed
        store();
        Connection con = DBManager.getDefault().getConnection();
        if (con == null) {
            String confirmationMessage = "Somethign is wrong with parameters.";
            NotifyDescriptor.Message notice = new NotifyDescriptor.Message(
                        confirmationMessage);
            DialogDisplayer.getDefault().notify(notice);
            return;
        }
        try {
            boolean isValid = con.isValid(5);
            if (isValid) {
                // if we could get a connection and it is even valid, then
                // we'll display the list of all tables in this database
                // using a dialog window
                Statement sql = con.createStatement();
                ResultSet resultSet = sql.executeQuery("SHOW TABLES;");
                List<String> resStr = new ArrayList<String>();
                StringBuilder sb = new StringBuilder();
                sb.append("Connection seems to be ok.\n");
                sb.append("Tables:\n");
                while (resultSet.next()) {
                    sb.append(resultSet.getString(1));
                    sb.append("\n");
                    resStr.add(sb.toString());
                }

                String confirmationMessage = sb.toString();
                NotifyDescriptor.Message notice = new NotifyDescriptor.Message(
                        confirmationMessage);
                DialogDisplayer.getDefault().notify(notice);

            }
            con.close();
        } catch (SQLException ex) {
            Exceptions.printStackTrace(ex);
        }

    }//GEN-LAST:event_btnTestActionPerformed

    void load() {
        // TODO read settings and initialize GUI
        // Example:
        // someCheckBox.setSelected(Preferences.userNodeForPackage(DBMySQLOptionsPanel.class).getBoolean("someFlag", false));
        // or for org.openide.util with API spec. version >= 7.4:
        // someCheckBox.setSelected(NbPreferences.forModule(DBMySQLOptionsPanel.class).getBoolean("someFlag", false));
        // or:
        // someTextField.setText(SomeSystemOption.getDefault().getSomeStringProperty());
        serverHostNameTextField.setText(NbPreferences.forModule(DBManager.class).get("host", ""));
        serverPortTextField.setText(NbPreferences.forModule(DBManager.class).get("port", ""));
        dbNameTextField.setText(NbPreferences.forModule(DBManager.class).get("dbname", ""));
        dbUserNameTextField.setText(NbPreferences.forModule(DBManager.class).get("username", ""));
        dbUserPasswordPasswordField.setText(NbPreferences.forModule(DBManager.class).get("password", ""));
    }

    void store() {
        // TODO store modified settings
        // Example:
        // Preferences.userNodeForPackage(DBMySQLOptionsPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or for org.openide.util with API spec. version >= 7.4:
        // NbPreferences.forModule(DBMySQLOptionsPanel.class).putBoolean("someFlag", someCheckBox.isSelected());
        // or:
        // SomeSystemOption.getDefault().setSomeStringProperty(someTextField.getText());

        NbPreferences.forModule(DBManager.class).put("host", serverHostNameTextField.getText());
        NbPreferences.forModule(DBManager.class).put("port", serverPortTextField.getText());
        NbPreferences.forModule(DBManager.class).put("dbname", dbNameTextField.getText());
        NbPreferences.forModule(DBManager.class).put("username", dbUserNameTextField.getText());
        NbPreferences.forModule(DBManager.class).put("password", new String(dbUserPasswordPasswordField.getPassword()));
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTest;
    private javax.swing.JPanel conParamsPanel;
    private javax.swing.JLabel dbNameLabel;
    private javax.swing.JTextField dbNameTextField;
    private javax.swing.JLabel dbUserNameLabel;
    private javax.swing.JTextField dbUserNameTextField;
    private javax.swing.JLabel dbUserPasswordLabel;
    private javax.swing.JPasswordField dbUserPasswordPasswordField;
    private javax.swing.JLabel serverHostNameLabel;
    private javax.swing.JTextField serverHostNameTextField;
    private javax.swing.JPanel serverPanel;
    private javax.swing.JLabel serverPortLabel;
    private javax.swing.JTextField serverPortTextField;
    // End of variables declaration//GEN-END:variables
}
