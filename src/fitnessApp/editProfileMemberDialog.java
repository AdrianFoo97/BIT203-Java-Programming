package fitnessApp;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 * This class will create a JDialog that will allow the member to modify 
 * their profile details
 * @author Adrian Foo
 */
public class editProfileMemberDialog extends javax.swing.JDialog {
    private Member theMember;
    private Frame parent;
    int xMouse;
    int yMouse;
    
    /**
     * This is the constructor that will create a dialog that display all 
     * the original details of the member and allow the member to modify
     * it and save it
     */
    public editProfileMemberDialog(java.awt.Frame parent, boolean modal, 
            Member theMember) {
        super(parent, modal);
        initComponents();
        this.theMember = theMember;
        this.parent = parent;
        userNameLbl.setText(theMember.getUsername());
        passwordTF.setText(theMember.getPassword());
        fullNameTF.setText(theMember.getFullName());
        emailTF.setText(theMember.getPassword());
        levelCombo.setSelectedItem(theMember.getLevel().toString());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        fullNameTF = new javax.swing.JTextField();
        levelCombo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        saveBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        passwordTF = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        editProfileLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        userNameLbl = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 49, 67));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Level: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        emailTF.setBackground(new java.awt.Color(36, 49, 67));
        emailTF.setForeground(new java.awt.Color(255, 255, 255));
        emailTF.setBorder(null);
        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });
        jPanel1.add(emailTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 274, 30));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Full Name: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        fullNameTF.setBackground(new java.awt.Color(36, 49, 67));
        fullNameTF.setForeground(new java.awt.Color(255, 255, 255));
        fullNameTF.setBorder(null);
        jPanel1.add(fullNameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 274, 30));

        levelCombo.setBackground(new java.awt.Color(83, 197, 185));
        levelCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BEGINNER", "ADVANCED", "EXPERT" }));
        levelCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelComboActionPerformed(evt);
            }
        });
        jPanel1.add(levelCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 274, 34));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 270, 10));

        saveBtn.setBackground(new java.awt.Color(83, 197, 185));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 101, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 270, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 270, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 270, 10));

        passwordTF.setBackground(new java.awt.Color(36, 49, 67));
        passwordTF.setForeground(new java.awt.Color(255, 255, 255));
        passwordTF.setBorder(null);
        jPanel1.add(passwordTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 470, 520));

        jPanel2.setBackground(new java.awt.Color(83, 197, 185));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editProfileLabel.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        editProfileLabel.setForeground(new java.awt.Color(255, 255, 255));
        editProfileLabel.setText("Edit Profile");
        jPanel2.add(editProfileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/Registration_96px.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/Delete_24px.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        userNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        userNameLbl.setText("UserName");
        jPanel2.add(userNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

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
        jPanel2.add(frameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/User_24px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTFActionPerformed

    private void levelComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_levelComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_levelComboActionPerformed
    /**
     * This function will reset all the details of the member to the details
     * that has been entered when the save button is clicked
     * @param evt 
     */
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String[] options = {"OK"};
        if (passwordTF.getText().equals("") || fullNameTF.getText().equals("") || 
                emailTF.getText().equals("")){
            JOptionPane.showOptionDialog(this, "Please fill in the required "
                + "information!", 
                    "", JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0] );
        }
        else {
            System.out.println(theMember);
            theMember.setPassword(passwordTF.getText());
            theMember.setFullName(fullNameTF.getText());
            theMember.setEmail(emailTF.getText());
            String level = (String)levelCombo.getSelectedItem();
            theMember.setLevel(MemberLevel.valueOf(level));
            JOptionPane.showOptionDialog(this, "Profile Details have been "
                    + "updated!", 
                        "", JOptionPane.ERROR_MESSAGE, JOptionPane.INFORMATION_MESSAGE,
                        null, options, options[0] );
            this.dispose();
            parent.setVisible(true);
        }
        
    }//GEN-LAST:event_saveBtnActionPerformed
    /**
     * This function will close the window when the close label 
     * is clicked
     * @param evt 
     */
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        this.dispose();
        parent.setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel editProfileLabel;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JTextField fullNameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JComboBox<String> levelCombo;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel userNameLbl;
    // End of variables declaration//GEN-END:variables
}