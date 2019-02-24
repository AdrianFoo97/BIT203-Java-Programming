package fitnessApp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * This is function that will display all the training session that 
 * has been registered or created by the user either trainer or
 * member
 * @author foo
 */
public class TrainingHistoryWindow extends javax.swing.JFrame {
    private User theUser;
    private TrainingHistoryModel thm;
    int xMouse;
    int yMouse;
    /**
     * This is a constructor that creates a window to diaplay all the training
     * session that has been created and registered by the user
     */
    public TrainingHistoryWindow(User theUser) {
        initComponents();
        this.theUser = theUser;
        setupHistoryModel();
        if(theUser instanceof Member){
            updateBtn.setText("Review");
        }
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    /**
     * This is a function to setup the table model for the JTable
     */
    public void setupHistoryModel(){
        thm = new TrainingHistoryModel(theUser.getTrainingSessions());
        trainingHistoryTable.setModel(thm);
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
        jLabel2 = new javax.swing.JLabel();
        sortCombo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        trainingHistoryTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 45, 68));
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sort by: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, 30));

        sortCombo.setBackground(new java.awt.Color(83, 197, 185));
        sortCombo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sortCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "default", "date", "class type" }));
        sortCombo.setBorder(null);
        sortCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sortComboItemStateChanged(evt);
            }
        });
        sortCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortComboActionPerformed(evt);
            }
        });
        jPanel1.add(sortCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 100, 30));

        trainingHistoryTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        trainingHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        trainingHistoryTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        trainingHistoryTable.setGridColor(new java.awt.Color(255, 255, 255));
        trainingHistoryTable.setRowHeight(20);
        trainingHistoryTable.setSelectionBackground(new java.awt.Color(33, 45, 68));
        trainingHistoryTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        trainingHistoryTable.getTableHeader().setResizingAllowed(false);
        trainingHistoryTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(trainingHistoryTable);
        if (trainingHistoryTable.getColumnModel().getColumnCount() > 0) {
            trainingHistoryTable.getColumnModel().getColumn(0).setResizable(false);
            trainingHistoryTable.getColumnModel().getColumn(1).setResizable(false);
            trainingHistoryTable.getColumnModel().getColumn(2).setResizable(false);
            trainingHistoryTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 576, 420));

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Training History");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        updateBtn.setBackground(new java.awt.Color(83, 197, 185));
        updateBtn.setText("Update ");
        updateBtn.setBorder(null);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, 87, 30));

        closeBtn.setBackground(new java.awt.Color(83, 197, 185));
        closeBtn.setText("Close");
        closeBtn.setBorder(null);
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 87, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/Minus_24px.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/Delete_24px.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 30, -1));

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
        jPanel1.add(frameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sortComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sortComboActionPerformed
    /**
     * This function will sort the session history table by getting the value
     * from the combo box 
     * @param evt 
     */
    private void sortComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sortComboItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(sortCombo.getSelectedItem().equals("date")){
                thm.setTrainingSession(thm.sortByDate(theUser.getTrainingSessions()));
                thm.fireTableDataChanged();
            }
            else if(sortCombo.getSelectedItem().equals("class type")){
                thm.setTrainingSession(thm.sortByType(theUser.getTrainingSessions()));
                thm.fireTableDataChanged();
            }
            else if(sortCombo.getSelectedItem().equals("default")){
                thm.setTrainingSession(theUser.getTrainingSessions());
                thm.fireTableDataChanged();
            }
        }
    }//GEN-LAST:event_sortComboItemStateChanged
    /**
     * This function will close the window when the close label 
     * is clicked
     * @param evt 
     */
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed
    /**
     * This function will allow the user to update the selected training session 
     * if the user is a trainer or allow the user to review the selected 
     * training session if the user is a member when the update/review 
     * button is clicked
     * @param evt 
     */
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int row = trainingHistoryTable.getSelectedRow();
        TrainingSession theSession = null;
        String[] options = {"OK"};
        
        if (row < 0 && theUser instanceof Trainer){
            JOptionPane.showOptionDialog(this, "Please select a training "
                    + "session to update!",
                "", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0] );
        }
        else if (row < 0 && theUser instanceof Member){
            JOptionPane.showOptionDialog(this, "Please select a training "
                    + "session to review!",
                "", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0] );
        }
        else{
            theSession = thm.getSessionAt(row);
        }
        if(theSession instanceof GroupTraining && row >= 0 && 
                theUser instanceof Trainer){
            this.setVisible(false);
            UpdateGroupSessionWindow ugsw = new UpdateGroupSessionWindow(
                    this, (GroupTraining)theSession);
            ugsw.setVisible(true);
        }
        else if(theSession instanceof PersonalTraining && row >= 0 &&
                theUser instanceof Trainer){
            this.setVisible(false);
            UpdatePersonalSessionWindow upsw = new UpdatePersonalSessionWindow(
                this, (PersonalTraining)theSession);
                upsw.setVisible(true);
        }
        else if(theSession instanceof PersonalTraining && row >= 0 &&
                theUser instanceof Member){
            this.setVisible(false);
            ReviewTrainerP_Dialog rtpd = new ReviewTrainerP_Dialog(
            this, true, (PersonalTraining)theSession, 
            (Member)theUser);
            rtpd.setVisible(true);
        }
        else if(theSession instanceof GroupTraining && row >= 0 &&
                theUser instanceof Member){
            this.setVisible(false);
            ReviewTrainerG_Dialog rtgd = new ReviewTrainerG_Dialog(
            this, true, (Member)theUser, (GroupTraining)theSession);
            rtgd.setVisible(true);
        }
    }//GEN-LAST:event_updateBtnActionPerformed
    /**
     * This function will minimize the window when the minimize label
     * is clicked
     * @param evt 
     */
    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel15MouseClicked
    /**
     * This function will close the window when the close label 
     * is clicked
     * @param evt 
     */
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        this.dispose();
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
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sortCombo;
    private javax.swing.JTable trainingHistoryTable;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
