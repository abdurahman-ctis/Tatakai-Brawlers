
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aatak
 */
public class Battle extends javax.swing.JFrame {
    private Player p;
    private Enemy e;
    
    /**
     * Creates new form Battle
     */
    public Battle(Player p, Enemy e) {
        initComponents();
        this.p = p;
        this.e = e;
        ImageIcon i = new ImageIcon(getClass().getResource(p.getImg()));
        Image im = i.getImage().getScaledInstance(playerPic.getWidth(), playerPic.getHeight(), Image.SCALE_SMOOTH);
        playerPic.setIcon(new ImageIcon(im));
        atk1.setText(p.getPowerList().get(0).getName());
        atk2.setText(p.getPowerList().get(1).getName());
        i = new ImageIcon(getClass().getResource(e.getImg()));
        im = i.getImage().getScaledInstance(enemyPic.getWidth(), enemyPic.getHeight(), Image.SCALE_SMOOTH);
        enemyPic.setIcon(new ImageIcon(im));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        message = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        atk1 = new javax.swing.JRadioButton();
        atk2 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        enemyPic = new javax.swing.JLabel();
        playerPic = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.red);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        message.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        message.setText("Tatakai that Brawler !!!");

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(105, 144));

        buttonGroup1.add(atk1);
        atk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atk1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(atk2);
        atk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atk2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atk2)
                    .addComponent(atk1))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(atk1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(atk2)
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("     ATTACK     ", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("     ACTION     ", jPanel3);

        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.setBackground(Color.BLACK);
        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 385, 640, 208);
        getContentPane().add(enemyPic);
        enemyPic.setBounds(410, 90, 220, 180);
        getContentPane().add(playerPic);
        playerPic.setBounds(10, 180, 270, 200);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/bg1.png"))); // NOI18N
        background.setIconTextGap(0);
        getContentPane().add(background);
        background.setBounds(0, 0, 640, 400);

        setSize(new java.awt.Dimension(656, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void atk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atk1ActionPerformed
        Power pow = p.getPowerList().get(0);
        text.setText("Description: "+pow.getPowerInfo()+"\nDamage: "+ pow.getDamage()+"\nAccuracy: "+pow.getAccuracy());
    }//GEN-LAST:event_atk1ActionPerformed

    private void atk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atk2ActionPerformed
        Power pow = p.getPowerList().get(1);
        text.setText("Description: "+pow.getPowerInfo()+"\nDamage: "+ ((pow.getDamage())>0?pow.getDamage():"???")+"\nAccuracy: "+pow.getAccuracy());
    }//GEN-LAST:event_atk2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton atk1;
    private javax.swing.JRadioButton atk2;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel enemyPic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel message;
    private javax.swing.JLabel playerPic;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
