
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anishmahto
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }
    
    //this close() method is completely borrowed from the video provided in the announcments page: https://www.youtube.com/watch?v=JW0DDonGqMo
    public void close () {
        WindowEvent winClosingEvent = new WindowEvent (this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent (winClosingEvent);
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
        backgroundPnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        introLbl = new javax.swing.JLabel();
        lessonPartOneBtn = new javax.swing.JButton();
        lessonPartTwoBtn = new javax.swing.JButton();
        LessonPartThreeBtn = new javax.swing.JButton();
        lessonsLbl = new javax.swing.JLabel();
        toolsLbl = new javax.swing.JLabel();
        problemGeneratorBtn = new javax.swing.JButton();
        systemSolverBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(862, 804));

        backgroundPnl.setBackground(new java.awt.Color(255, 255, 255));
        backgroundPnl.setAutoscrolls(true);
        backgroundPnl.setPreferredSize(new java.awt.Dimension(859, 794));

        titleLbl.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        titleLbl.setText("Main Menu");

        introLbl.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        introLbl.setText("<HTML>Welcome to <i>Solve That System</i>! This is a software application designed to teach 9th grade students an important lesson in the Ontario mathematics curriculum - solving systems of linear equations. To begin, simply click on any of the buttons below!<HTML>");

        lessonPartOneBtn.setBackground(new java.awt.Color(52, 152, 219));
        lessonPartOneBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lessonPartOneBtn.setForeground(new java.awt.Color(255, 255, 255));
        lessonPartOneBtn.setText("Part 1 - What Are Linear Systems?");
        lessonPartOneBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lessonPartOneBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lessonPartOneBtnMouseClicked(evt);
            }
        });

        lessonPartTwoBtn.setBackground(new java.awt.Color(52, 152, 219));
        lessonPartTwoBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lessonPartTwoBtn.setForeground(new java.awt.Color(255, 255, 255));
        lessonPartTwoBtn.setText("Part 2 - How To Solve Linear Systems");
        lessonPartTwoBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lessonPartTwoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lessonPartTwoBtnMouseClicked(evt);
            }
        });

        LessonPartThreeBtn.setBackground(new java.awt.Color(52, 152, 219));
        LessonPartThreeBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LessonPartThreeBtn.setForeground(new java.awt.Color(255, 255, 255));
        LessonPartThreeBtn.setText("Part 3 - Applications of Solving Systems");
        LessonPartThreeBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        LessonPartThreeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LessonPartThreeBtnMouseClicked(evt);
            }
        });

        lessonsLbl.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        lessonsLbl.setText("<HTML>Lessons<HTML>");

        toolsLbl.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        toolsLbl.setText("<HTML>Tools<HTML>");

        problemGeneratorBtn.setBackground(new java.awt.Color(46, 203, 114));
        problemGeneratorBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        problemGeneratorBtn.setForeground(new java.awt.Color(255, 255, 255));
        problemGeneratorBtn.setText("Problem Generator");
        problemGeneratorBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        problemGeneratorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                problemGeneratorBtnMouseClicked(evt);
            }
        });

        systemSolverBtn.setBackground(new java.awt.Color(46, 203, 114));
        systemSolverBtn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        systemSolverBtn.setForeground(new java.awt.Color(255, 255, 255));
        systemSolverBtn.setText("System Solver");
        systemSolverBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        systemSolverBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                systemSolverBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundPnlLayout = new javax.swing.GroupLayout(backgroundPnl);
        backgroundPnl.setLayout(backgroundPnlLayout);
        backgroundPnlLayout.setHorizontalGroup(
            backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPnlLayout.createSequentialGroup()
                .addGroup(backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundPnlLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(introLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(backgroundPnlLayout.createSequentialGroup()
                                .addGroup(backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LessonPartThreeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lessonPartTwoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lessonPartOneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)
                                .addGroup(backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(systemSolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(problemGeneratorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundPnlLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(lessonsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(240, 240, 240)
                        .addComponent(toolsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        backgroundPnlLayout.setVerticalGroup(
            backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(introLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lessonsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toolsLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lessonPartOneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(problemGeneratorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lessonPartTwoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(systemSolverBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LessonPartThreeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(backgroundPnl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lessonPartOneBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lessonPartOneBtnMouseClicked
        //create instance of the LessonPartOne JFrame, set it to visible, then close this current JFrame
        LessonPartOne LPO = new LessonPartOne();
        LPO.setVisible(true);
        close();
    }//GEN-LAST:event_lessonPartOneBtnMouseClicked

    private void lessonPartTwoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lessonPartTwoBtnMouseClicked
        //create instance of the LessonPartTwo JFrame, set it to visible, then close this current JFrame
        LessonPartTwo LPT = new LessonPartTwo();
        LPT.setVisible(true);
        close();
    }//GEN-LAST:event_lessonPartTwoBtnMouseClicked

    private void LessonPartThreeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LessonPartThreeBtnMouseClicked
        //create instance of the LessonPartThree JFrame, set it to visible, then close this current JFrame
        LessonPartThree LPT = new LessonPartThree();
        LPT.setVisible(true);
        close();
    }//GEN-LAST:event_LessonPartThreeBtnMouseClicked

    private void problemGeneratorBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_problemGeneratorBtnMouseClicked
        //create instance of the Practice JFrame, set it to visible, then close this current JFrame
        Practice P = new Practice ();
        P.setVisible(true);
        close();
    }//GEN-LAST:event_problemGeneratorBtnMouseClicked

    private void systemSolverBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_systemSolverBtnMouseClicked
        //create instance of the Calculator JFrame, set it to visible, then close this current JFrame
        Calculator C = new Calculator ();
        C.setVisible(true);
        close();
    }//GEN-LAST:event_systemSolverBtnMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LessonPartThreeBtn;
    private javax.swing.JPanel backgroundPnl;
    private javax.swing.JLabel introLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lessonPartOneBtn;
    private javax.swing.JButton lessonPartTwoBtn;
    private javax.swing.JLabel lessonsLbl;
    private javax.swing.JButton problemGeneratorBtn;
    private javax.swing.JButton systemSolverBtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel toolsLbl;
    // End of variables declaration//GEN-END:variables
}
