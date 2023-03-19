
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
//import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author montu
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private String turn="X";
    private  int xCount=0;
    private  int oCount=0;
    private  int occupied=0;
    private boolean active=true;
    
    private void disableButtons(){
        active=false;
        return;
    }
    
    private void throwAlreadyExists(){
        javax.swing.JFrame errorBox=new javax.swing.JFrame("Exit");
        JOptionPane.showMessageDialog(errorBox, "This place already holds a value!", 
                "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
    private void checkDraw(){
        if(occupied==9)
        {
            if(!checkWin("O") && !checkWin("X")){
                JFrame oWin=new JFrame("GAME OVER!");
                JOptionPane.showMessageDialog(oWin, "The Match is a draw!", 
                "Game Over!", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }
    
    private void enableButtons(){
        active=true;
        return;
    }
    
       private boolean checkWin(String a)
    {
        if(ticTac11.getText().equalsIgnoreCase(a) && 
           ticTac12.getText().equalsIgnoreCase(a) &&
           ticTac13.getText().equalsIgnoreCase(a) ){
            ticTac11.setBackground(Color.green);
            ticTac12.setBackground(Color.green);
            ticTac13.setBackground(Color.green);
            
            disableButtons();
            return true;
        }
        
        if(ticTac21.getText().equalsIgnoreCase(a) && 
           ticTac22.getText().equalsIgnoreCase(a) &&
           ticTac23.getText().equalsIgnoreCase(a) ){
            ticTac21.setBackground(Color.green);
            ticTac22.setBackground(Color.green);
            ticTac23.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(ticTac31.getText().equalsIgnoreCase(a) && 
           ticTac32.getText().equalsIgnoreCase(a) &&
           ticTac33.getText().equalsIgnoreCase(a) ){
            ticTac31.setBackground(Color.green);
            ticTac32.setBackground(Color.green);
            ticTac33.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(ticTac11.getText().equalsIgnoreCase(a) && 
           ticTac21.getText().equalsIgnoreCase(a) &&
           ticTac31.getText().equalsIgnoreCase(a) ){
            ticTac11.setBackground(Color.green);
            ticTac21.setBackground(Color.green);
            ticTac31.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(ticTac12.getText().equalsIgnoreCase(a) && 
           ticTac22.getText().equalsIgnoreCase(a) &&
           ticTac32.getText().equalsIgnoreCase(a) ){
            ticTac12.setBackground(Color.green);
            ticTac32.setBackground(Color.green);
            ticTac22.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(ticTac13.getText().equalsIgnoreCase(a) && 
           ticTac23.getText().equalsIgnoreCase(a) &&
           ticTac33.getText().equalsIgnoreCase(a) ){
            ticTac13.setBackground(Color.green);
            ticTac23.setBackground(Color.green);
            ticTac33.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        if(ticTac11.getText().equalsIgnoreCase(a) && 
           ticTac22.getText().equalsIgnoreCase(a) &&
           ticTac33.getText().equalsIgnoreCase(a) ){
            ticTac11.setBackground(Color.green);
            ticTac22.setBackground(Color.green);
            ticTac33.setBackground(Color.green);
            disableButtons();
            return true;
        }
        
        
        if(ticTac13.getText().equalsIgnoreCase(a) && 
           ticTac22.getText().equalsIgnoreCase(a) &&
           ticTac31.getText().equalsIgnoreCase(a) ){
            ticTac13.setBackground(Color.green);
            ticTac31.setBackground(Color.green);
            ticTac22.setBackground(Color.green);
            disableButtons();
            return true;
        }
        return false;
          
    }
       
    private void changeTurn(){
        if(turn.equalsIgnoreCase("X")){
            turn="O";
            displayTurn.setText(turn);
        }
        else
        {
            turn="X";
            displayTurn.setText(turn);
        }
    }
    
    private void xTurn(JButton btn){
        btn.setForeground(Color.red);
        btn.setFont(new Font("Copperplate Gothic Light",Font.PLAIN, 20));
        btn.setText(turn);
        if(checkWin("X"))
        {
            xCount++;
            scoreO.setText(Integer.toString(oCount));
            scoreX.setText(Integer.toString(xCount));
            JFrame xWin=new JFrame("GAME OVER!");
            JOptionPane.showMessageDialog(xWin, "Player 1 has won the match!", 
                "Game Over!", JOptionPane.PLAIN_MESSAGE);
            
        }
        changeTurn();
    }

    
    private void oTurn(JButton btn){
        btn.setForeground(Color.blue);
        btn.setFont(new Font("Copperplate Gothic Light",Font.PLAIN, 20));
        btn.setText(turn);
        if(checkWin("O")){
            oCount++;
            scoreO.setText(Integer.toString(oCount));
            scoreX.setText(Integer.toString(xCount));
            JFrame oWin=new JFrame("GAME OVER!");
            JOptionPane.showMessageDialog(oWin, "Player 2 has won the match!", 
                "Game Over!", JOptionPane.PLAIN_MESSAGE);
        }
        changeTurn();
    }

    
    public NewJFrame() {
        initComponents();
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
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        ticTac12 = new javax.swing.JButton();
        ticTac13 = new javax.swing.JButton();
        ticTac22 = new javax.swing.JButton();
        ticTac23 = new javax.swing.JButton();
        ticTac21 = new javax.swing.JButton();
        ticTac32 = new javax.swing.JButton();
        ticTac33 = new javax.swing.JButton();
        ticTac31 = new javax.swing.JButton();
        ticTac11 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        scoreX = new javax.swing.JLabel();
        scoreO = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        displayTurn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jTextField2.setBackground(new java.awt.Color(153, 255, 255));
        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("TIC TOC TOE");
        jTextField2.setAlignmentX(1.0F);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        ticTac12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticTac12ActionPerformed(evt);
            }
        });

        ticTac13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticTac13ActionPerformed(evt);
            }
        });

        ticTac22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticTac22ActionPerformed(evt);
            }
        });

        ticTac23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticTac23ActionPerformed(evt);
            }
        });

        ticTac21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticTac21ActionPerformed(evt);
            }
        });

        ticTac32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticTac32ActionPerformed(evt);
            }
        });

        ticTac33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticTac33ActionPerformed(evt);
            }
        });

        ticTac31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticTac31ActionPerformed(evt);
            }
        });

        ticTac11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticTac11ActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Player 1 ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Player 2 ");

        scoreX.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        scoreX.setText("...............");

        scoreO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        scoreO.setText("...............");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scoreO, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scoreX, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(scoreX))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(scoreO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("TURN    :");

        displayTurn.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(displayTurn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ticTac31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ticTac32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ticTac33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ticTac21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ticTac22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ticTac23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ticTac11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ticTac12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ticTac13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(reset)
                                .addGap(86, 86, 86)
                                .addComponent(exit))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(118, 118, 118))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(displayTurn))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ticTac11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ticTac12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ticTac13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ticTac21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ticTac22, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ticTac23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ticTac31, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ticTac32, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ticTac33, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(exit))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticTac13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticTac13ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(ticTac13.getText().equalsIgnoreCase("X") || ticTac13.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(ticTac13);
            }
            else
            {
                oTurn(ticTac13);
            }
            occupied++;
            checkDraw();
        }
        
    }//GEN-LAST:event_ticTac13ActionPerformed
    // TODO add your handling code here:
    // TODO add your handling code here:
    // TODO add your handling code here:
    // TODO add your handling code here:

    private void ticTac23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticTac23ActionPerformed
        // TODO add your handling code here:
        
        if(!active)
        {
            return;
        }
        if(ticTac23.getText().equalsIgnoreCase("X") || ticTac23.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(ticTac23);
            }
            else
            {
                oTurn(ticTac23);
            }
            occupied++;
            checkDraw();
        }
        
    }//GEN-LAST:event_ticTac23ActionPerformed
    // TODO add your handling code here:
    // TODO add your handling code here:
    // TODO add your handling code here:

    private void ticTac33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticTac33ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(ticTac33.getText().equalsIgnoreCase("X") || ticTac33.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(ticTac33);
            }
            else
            {
                oTurn(ticTac33);
            }
            occupied++;
            checkDraw();
        }
        
    }//GEN-LAST:event_ticTac33ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        javax.swing.JFrame frame=new javax.swing.JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?", 
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void ticTac11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticTac11ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(ticTac11.getText().equalsIgnoreCase("X") || ticTac11.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(ticTac11);
            }
            else
            {
                oTurn(ticTac11);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_ticTac11ActionPerformed

    private void ticTac12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticTac12ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(ticTac12.getText().equalsIgnoreCase("X") || ticTac12.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(ticTac12);
            }
            else
            {
                oTurn(ticTac12);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_ticTac12ActionPerformed

    private void ticTac21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticTac21ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(ticTac21.getText().equalsIgnoreCase("X") || ticTac21.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(ticTac21);
            }
            else
            {
                oTurn(ticTac21);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_ticTac21ActionPerformed

    private void ticTac22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticTac22ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(ticTac22.getText().equalsIgnoreCase("X") || ticTac22.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(ticTac22);
            }
            else
            {
                oTurn(ticTac22);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_ticTac22ActionPerformed

    private void ticTac31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticTac31ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(ticTac31.getText().equalsIgnoreCase("X") || ticTac31.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(ticTac31);
            }
            else
            {
                oTurn(ticTac31);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_ticTac31ActionPerformed

    private void ticTac32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticTac32ActionPerformed
        // TODO add your handling code here:
        if(!active)
        {
            return;
        }
        if(ticTac32.getText().equalsIgnoreCase("X") || ticTac32.getText().equalsIgnoreCase("O"))
        {
            throwAlreadyExists();
        }
        else{
            if(turn.equalsIgnoreCase("X"))
            {
                xTurn(ticTac32);
            }
            else
            {
                oTurn(ticTac32);
            }
            occupied++;
            checkDraw();
        }
    }//GEN-LAST:event_ticTac32ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        javax.swing.JFrame frame=new javax.swing.JFrame("Reset");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to reset?", 
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            ticTac11.setText("");
            ticTac12.setText("");
            ticTac13.setText("");
            ticTac21.setText("");
            ticTac22.setText("");
            ticTac23.setText("");
            ticTac31.setText("");
            ticTac32.setText("");
            ticTac33.setText("");
            
            ticTac11.setBackground(Color.WHITE);
            ticTac12.setBackground(Color.WHITE);
            ticTac13.setBackground(Color.WHITE);
            ticTac21.setBackground(Color.WHITE);
            ticTac22.setBackground(Color.WHITE);
            ticTac23.setBackground(Color.WHITE);
            ticTac31.setBackground(Color.WHITE);
            ticTac32.setBackground(Color.WHITE);
            ticTac33.setBackground(Color.WHITE);
            
            enableButtons();
            occupied=0;
            JFrame tmp=new JFrame("choice");
                if(JOptionPane.showConfirmDialog(tmp, "Set first turn for Player 1?", 
                "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
                    turn="X";
                }
                else
                {
                    turn="O";
                }
                displayTurn.setText(turn);
        }
    }//GEN-LAST:event_resetActionPerformed

    
    



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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel displayTurn;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton reset;
    private javax.swing.JLabel scoreO;
    private javax.swing.JLabel scoreX;
    private javax.swing.JButton ticTac11;
    private javax.swing.JButton ticTac12;
    private javax.swing.JButton ticTac13;
    private javax.swing.JButton ticTac21;
    private javax.swing.JButton ticTac22;
    private javax.swing.JButton ticTac23;
    private javax.swing.JButton ticTac31;
    private javax.swing.JButton ticTac32;
    private javax.swing.JButton ticTac33;
    // End of variables declaration//GEN-END:variables
}
