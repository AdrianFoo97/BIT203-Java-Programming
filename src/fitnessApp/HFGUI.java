package fitnessApp;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * The main class to launch HELPFit application which allow the user 
 * to load, save data and sign in
 * @author Adrian Foo
 */
public class HFGUI extends javax.swing.JFrame {
    /**
     * Internal attributes of HFGUI
     */
    private HELPFit HF;
    int xMouse;
    int yMouse;
    /**
     * This is the constructor for HFGUI
     */
    public HFGUI() {
        initComponents();
        HF = new HELPFit();
        // This two line will display the window on the center of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userNameTF1 = new javax.swing.JTextField();
        passwordTF1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userNameTF2 = new javax.swing.JTextField();
        passwordTF2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        HELPFitLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        saveLbl = new javax.swing.JLabel();
        uploadLbl = new javax.swing.JLabel();
        minimizeBtn = new javax.swing.JLabel();
        closeBtn = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userNameTF = new javax.swing.JTextField();
        logInBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        signUpLbl = new javax.swing.JLabel();
        passwordTF = new javax.swing.JPasswordField();

        jPanel5.setBackground(new java.awt.Color(33, 45, 68));

        jLabel4.setForeground(new java.awt.Color(236, 240, 241));
        jLabel4.setText("User Name: ");

        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("Password: ");

        userNameTF1.setBackground(new java.awt.Color(93, 97, 125));
        userNameTF1.setBorder(null);

        passwordTF1.setBackground(new java.awt.Color(93, 97, 125));
        passwordTF1.setBorder(null);

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(userNameTF1)
                    .addComponent(jLabel5)
                    .addComponent(passwordTF1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(33, 45, 68));

        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("User Name: ");

        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Password: ");

        userNameTF2.setBackground(new java.awt.Color(93, 97, 125));
        userNameTF2.setBorder(null);

        passwordTF2.setBackground(new java.awt.Color(93, 97, 125));
        passwordTF2.setBorder(null);

        jButton3.setText("Login");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(userNameTF2)
                    .addComponent(jLabel7)
                    .addComponent(passwordTF2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userNameTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton3)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(33, 45, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HELPFitLabel.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 48)); // NOI18N
        HELPFitLabel.setForeground(new java.awt.Color(236, 240, 241));
        HELPFitLabel.setText("HELP Fit");
        jPanel1.add(HELPFitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 79, -1, -1));

        jPanel2.setBackground(new java.awt.Color(33, 45, 68));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/Save_24px.png"))); // NOI18N
        saveLbl.setToolTipText("Load Data");
        saveLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveLblMouseClicked(evt);
            }
        });
        jPanel2.add(saveLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        uploadLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/Upload_24px.png"))); // NOI18N
        uploadLbl.setToolTipText("Save Data");
        uploadLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadLblMouseClicked(evt);
            }
        });
        jPanel2.add(uploadLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        minimizeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/Minus_24px.png"))); // NOI18N
        minimizeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeBtnMouseClicked(evt);
            }
        });
        jPanel2.add(minimizeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/Delete_24px.png"))); // NOI18N
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });
        jPanel2.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        frameDrag.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameDragMouseDragged(evt);
            }
        });
        frameDrag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameDragMousePressed(evt);
            }
        });
        jPanel2.add(frameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 44));

        jPanel4.setBackground(new java.awt.Color(33, 45, 68));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(236, 240, 241));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/User_24px.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 74, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(236, 240, 241));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/Password_24px.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 154, -1, 30));

        userNameTF.setBackground(new java.awt.Color(33, 45, 68));
        userNameTF.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        userNameTF.setForeground(new java.awt.Color(255, 255, 255));
        userNameTF.setBorder(null);
        userNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTFActionPerformed(evt);
            }
        });
        jPanel4.add(userNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 70, 280, 37));

        logInBtn.setBackground(new java.awt.Color(83, 197, 185));
        logInBtn.setFont(new java.awt.Font("Ubuntu Mono", 0, 14)); // NOI18N
        logInBtn.setText("Log In");
        logInBtn.setBorder(null);
        logInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInBtnActionPerformed(evt);
            }
        });
        jPanel4.add(logInBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 248, 309, 44));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 111, 314, 10));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 313, 10));

        signUpLbl.setForeground(new java.awt.Color(255, 255, 255));
        signUpLbl.setText("Sign Up for free account!");
        signUpLbl.setToolTipText("Click to sign up!");
        signUpLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpLblMouseClicked(evt);
            }
        });
        jPanel4.add(signUpLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 298, -1, -1));

        passwordTF.setBackground(new java.awt.Color(33, 45, 68));
        passwordTF.setForeground(new java.awt.Color(255, 255, 255));
        passwordTF.setBorder(null);
        jPanel4.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 280, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 149, 410, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * This function will save the HELPFit controller when the save label
     * is clicked
     * @param evt 
     */
    private void saveLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveLblMouseClicked
        FileHandling.saveToFile(this, HF);
    }//GEN-LAST:event_saveLblMouseClicked
    /**
     * This function will allow the user to choose a file to load
     * when the user click on the upload label
     * @param evt 
     */
    private void uploadLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadLblMouseClicked
        if (HF != null) {
            int n = JOptionPane.showConfirmDialog(this,
                "Would you like to save your changes first",
                "Warning", JOptionPane.YES_NO_CANCEL_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                FileHandling.saveToFile(this, HF);
            }
        }
        HF = (HELPFit) FileHandling.readFromFile(this);
        HF.updateSequences();
    }//GEN-LAST:event_uploadLblMouseClicked
    /**
     * This function will create a new user when the sign up label is 
     * clicked
     * @param evt 
     */
    private void signUpLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpLblMouseClicked
        String[] options = {
            "Trainer", "Member"
        };
        userNameTF.setText("");
        passwordTF.setText("");
        int opt = JOptionPane.showOptionDialog(this,
            "What would you wish to sign up as? ",
            "Trainer or Member?",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[1]);
        this.setVisible(false);
        if(opt == 0){
            SignUpDialogTrainer tDialog = new SignUpDialogTrainer(this, true);
            tDialog.setVisible(true);
        }
        else if(opt == 1){
            SignUpDialogMember mDialog = new SignUpDialogMember(this, true);
            mDialog.setVisible(true);
        }
        this.setVisible(true);
    }//GEN-LAST:event_signUpLblMouseClicked
    /**
     * This function will pass the user into the main menu frame if the 
     * username and password that is entered is matched when the sign
     * in button is clicked
     * @param evt 
     */
    private void logInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInBtnActionPerformed
        User theUser = null;
        String[] options = {"OK"};
        String userName = userNameTF.getText();
        String password = passwordTF.getText();

        theUser = HF.findUser(userName);

        if (userNameTF.getText().equals("") || passwordTF.getText().equals("")){
            JOptionPane.showOptionDialog(this, "Please fill in your username "
                + "and password!",
                "", JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0] );
        }
        else if (theUser == null) {
            JOptionPane.showOptionDialog(this, "No such username!",
                "", JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0] );
        }
        else if (!theUser.getPassword().equals(password)) {
            JOptionPane.showOptionDialog(this, "Invalid password!",
                "", JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0] );
        }
        else {
            if (theUser instanceof Trainer){
                TrainerMenu tm = new TrainerMenu(this, (Trainer)theUser);
                tm.setVisible(true);
                this.setVisible(false);
            }
            else if (theUser instanceof Member){
                MemberMenu mm = new MemberMenu(this, (Member)theUser);
                mm.setVisible(true);
                this.setVisible(false);
            }
            userNameTF.setText("");
            passwordTF.setText("");
        }
    }//GEN-LAST:event_logInBtnActionPerformed
    /**
     * This function will exit the program when the close label 
     * is clicked
     * @param evt 
     */
    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeBtnMouseClicked
    /**
     * This function will minimize the window when the minimize label
     * is clicked
     * @param evt 
     */
    private void minimizeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeBtnMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeBtnMouseClicked
    /**
     * This function will allow the user to drag the dragFrame when the user
     * dragging the frame
     * @param evt 
     */
    private void frameDragMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMouseDragged
         int x = evt.getXOnScreen();
         int y = evt.getYOnScreen();
         
         this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameDragMouseDragged
    /**
     * This function will get the location of the mouse when the user 
     * click on the dragFrame
     * @param evt 
     */
    private void frameDragMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDragMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_frameDragMousePressed

    private void userNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTFActionPerformed
    /**
     * This function will is used to get the HF controller
     * @return HELPFit controller HF
     */
    public HELPFit getHF(){
        return HF;
    }
    /**
     * This is the main function that will be run when the program
     * is executed.
     * @param args 
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
            java.util.logging.Logger.getLogger(HFGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HFGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HFGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HFGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HFGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HELPFitLabel;
    private javax.swing.JLabel closeBtn;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton logInBtn;
    private javax.swing.JLabel minimizeBtn;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JTextField passwordTF1;
    private javax.swing.JTextField passwordTF2;
    private javax.swing.JLabel saveLbl;
    private javax.swing.JLabel signUpLbl;
    private javax.swing.JLabel uploadLbl;
    private javax.swing.JTextField userNameTF;
    private javax.swing.JTextField userNameTF1;
    private javax.swing.JTextField userNameTF2;
    // End of variables declaration//GEN-END:variables
}
