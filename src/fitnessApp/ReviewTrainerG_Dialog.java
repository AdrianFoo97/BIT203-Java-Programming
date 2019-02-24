package fitnessApp;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 * This class will display a review form for the member to review for 
 * group training session
 * @author foo
 */
public class ReviewTrainerG_Dialog extends javax.swing.JDialog {
    private Member theMember;
    private GroupTraining theSession;
    int xMouse;
    int yMouse;
    /**
     * This is the constructor that creates a form for the member to 
     * review a trainer based on the group training session
     */
    public ReviewTrainerG_Dialog(java.awt.Frame parent, boolean modal, 
            Member theMember, GroupTraining theSession) {
        super(parent, modal);
        initComponents();
        this.theMember = theMember;
        this.theSession = theSession;
        titleLabel.setText(theSession.getTitle());
        dateLabel.setText(theSession.getDate().toString());
        timeLabel.setText(theSession.getTime().toString());
        feeLabel.setText(String.valueOf(theSession.getFee()));
        statusLabel.setText(theSession.getStatus().toString());
        classTypeLabel.setText(theSession.getClassType().toString());
        maxParticipantsLabel.setText(
        String.valueOf(theSession.getMaxParticipants()));
        participantsNumLabel.setText(
        String.valueOf(theSession.getNumParticipants()));
        trainerNameLabel.setText(theSession.getTrainer().getFullName());
        specialtyLabel.setText(theSession.getTrainer().getSpecialty());
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
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        dateLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        dateLabel6 = new javax.swing.JLabel();
        specialtyLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        dateLabel3 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        dateLabel2 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        dateLabel4 = new javax.swing.JLabel();
        feeLabel = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        dateLabel5 = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        dateLabel7 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        dateLabel8 = new javax.swing.JLabel();
        classTypeLabel = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        dateLabel9 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        dateLabel10 = new javax.swing.JLabel();
        maxParticipantsLabel = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        dateLabel11 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        dateLabel12 = new javax.swing.JLabel();
        participantsNumLabel = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        dateLabel13 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        dateLabel14 = new javax.swing.JLabel();
        trainerNameLabel = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        frameDrag = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        commentsTA = new javax.swing.JTextArea();
        ratingCombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 49, 67));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Status: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Time: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fee: ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Class Type: ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Max Participants: ");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Num Participants: ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Trainer: ");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Trainer specialty: ");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, -1, -1));

        jPanel2.setBackground(new java.awt.Color(83, 197, 185));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel1.setText("12/12/2222");
        jPanel3.add(dateLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        jPanel12.setBackground(new java.awt.Color(83, 197, 185));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel6.setText("12/12/2222");
        jPanel13.add(dateLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 230, 30));

        specialtyLabel.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        specialtyLabel.setForeground(new java.awt.Color(255, 255, 255));
        specialtyLabel.setText("MMA");
        jPanel2.add(specialtyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 230, 30));

        jPanel4.setBackground(new java.awt.Color(83, 197, 185));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel3.setText("12/12/2222");
        jPanel5.add(dateLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        dateLabel.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("12/12/2222");
        jPanel4.add(dateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 230, 30));

        jPanel6.setBackground(new java.awt.Color(83, 197, 185));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel2.setText("12/12/2222");
        jPanel7.add(dateLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        timeLabel.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(255, 255, 255));
        timeLabel.setText("12:12 AM");
        jPanel6.add(timeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 230, 30));

        jPanel8.setBackground(new java.awt.Color(83, 197, 185));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel4.setText("12/12/2222");
        jPanel9.add(dateLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        feeLabel.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        feeLabel.setForeground(new java.awt.Color(255, 255, 255));
        feeLabel.setText("RM 34");
        jPanel8.add(feeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 230, 30));

        jPanel10.setBackground(new java.awt.Color(83, 197, 185));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel5.setText("12/12/2222");
        jPanel11.add(dateLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        statusLabel.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setText("COMPLETED");
        jPanel10.add(statusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 230, 30));

        jPanel14.setBackground(new java.awt.Color(83, 197, 185));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel7.setText("12/12/2222");
        jPanel15.add(dateLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        jPanel16.setBackground(new java.awt.Color(83, 197, 185));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel8.setText("12/12/2222");
        jPanel17.add(dateLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 230, 30));

        classTypeLabel.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        classTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        classTypeLabel.setText("MMA");
        jPanel14.add(classTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 230, 30));

        jPanel18.setBackground(new java.awt.Color(83, 197, 185));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel9.setText("12/12/2222");
        jPanel19.add(dateLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        jPanel20.setBackground(new java.awt.Color(83, 197, 185));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel10.setText("12/12/2222");
        jPanel21.add(dateLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        jPanel18.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 230, 30));

        maxParticipantsLabel.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        maxParticipantsLabel.setForeground(new java.awt.Color(255, 255, 255));
        maxParticipantsLabel.setText("23");
        jPanel18.add(maxParticipantsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 230, 30));

        jPanel22.setBackground(new java.awt.Color(83, 197, 185));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel11.setText("12/12/2222");
        jPanel23.add(dateLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        jPanel24.setBackground(new java.awt.Color(83, 197, 185));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel12.setText("12/12/2222");
        jPanel25.add(dateLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        jPanel22.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 230, 30));

        participantsNumLabel.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        participantsNumLabel.setForeground(new java.awt.Color(255, 255, 255));
        participantsNumLabel.setText("23");
        jPanel22.add(participantsNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel1.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 230, 30));

        jPanel26.setBackground(new java.awt.Color(83, 197, 185));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel13.setText("12/12/2222");
        jPanel27.add(dateLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        jPanel28.setBackground(new java.awt.Color(83, 197, 185));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dateLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dateLabel14.setText("12/12/2222");
        jPanel29.add(dateLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel28.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 230, 30));

        jPanel26.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 230, 30));

        trainerNameLabel.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        trainerNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        trainerNameLabel.setText("Trainer's name");
        jPanel26.add(trainerNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 30));

        jPanel1.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 230, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 600, 540));

        jPanel30.setBackground(new java.awt.Color(83, 197, 185));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Ubuntu Mono", 0, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Training Session Title");
        jPanel30.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Session ID");
        jPanel30.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 14, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/List View_24px.png"))); // NOI18N
        jPanel30.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/Delete_24px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel30.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, -1));

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
        jPanel30.add(frameDrag, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessApp/img/People_96px.png"))); // NOI18N
        jPanel30.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 134, -1));

        getContentPane().add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 150));

        jPanel31.setBackground(new java.awt.Color(36, 49, 67));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        commentsTA.setBackground(new java.awt.Color(83, 197, 185));
        commentsTA.setColumns(20);
        commentsTA.setRows(5);
        jScrollPane2.setViewportView(commentsTA);

        jPanel31.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 275, 220));

        ratingCombo.setBackground(new java.awt.Color(83, 197, 185));
        ratingCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        ratingCombo.setBorder(null);
        jPanel31.add(ratingCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 270, 30));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Rating: ");
        jPanel31.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Comments: ");
        jPanel31.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        submitBtn.setBackground(new java.awt.Color(83, 197, 185));
        submitBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.setBorder(null);
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        jPanel31.add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 100, 40));

        getContentPane().add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 370, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * This function will create a review for the trainer based on 
     * the group training session and add the review to the trainer 
     * @param evt 
     */
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String[] options = {"OK"};
        String comment = commentsTA.getText();
        Trainer theTrainer = theSession.getTrainer();
        int rating = Integer.parseInt((String)ratingCombo.getSelectedItem());
        boolean check = false;
        for(int i = 1; i <= 5; i++){
            if(rating == i){
                check = true;
            }
        }
        if(check){
            boolean isAdded = theTrainer.addReview(
                new Review(rating, comment, theMember));
            if(isAdded){
                JOptionPane.showOptionDialog(this, "Your review has been "
                    + "submitted! Thank You!",
                    "", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE,
                    null, options, options[0] );
                this.dispose();
            }
            else{
                JOptionPane.showOptionDialog(this, "Review can't be submitted!"
                    + "Please try again!",
                    "", JOptionPane.OK_OPTION, JOptionPane.ERROR,
                    null, options, options[0] );
                this.dispose();
            }

        }
        else{
            JOptionPane.showOptionDialog(this, "Please select rating for "
                + "the training session!",
                "", JOptionPane.OK_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, options, options[0] );
        }
    }//GEN-LAST:event_submitBtnActionPerformed
    /**
     * This function will close the window when the close label 
     * is clicked
     * @param evt 
     */
    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked
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
    private javax.swing.JLabel classTypeLabel;
    private javax.swing.JTextArea commentsTA;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel dateLabel1;
    private javax.swing.JLabel dateLabel10;
    private javax.swing.JLabel dateLabel11;
    private javax.swing.JLabel dateLabel12;
    private javax.swing.JLabel dateLabel13;
    private javax.swing.JLabel dateLabel14;
    private javax.swing.JLabel dateLabel2;
    private javax.swing.JLabel dateLabel3;
    private javax.swing.JLabel dateLabel4;
    private javax.swing.JLabel dateLabel5;
    private javax.swing.JLabel dateLabel6;
    private javax.swing.JLabel dateLabel7;
    private javax.swing.JLabel dateLabel8;
    private javax.swing.JLabel dateLabel9;
    private javax.swing.JLabel feeLabel;
    private javax.swing.JLabel frameDrag;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel maxParticipantsLabel;
    private javax.swing.JLabel participantsNumLabel;
    private javax.swing.JComboBox<String> ratingCombo;
    private javax.swing.JLabel specialtyLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel trainerNameLabel;
    // End of variables declaration//GEN-END:variables
}
