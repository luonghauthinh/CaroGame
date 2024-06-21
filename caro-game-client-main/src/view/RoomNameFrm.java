package view;

import controller.Client;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class RoomNameFrm extends javax.swing.JFrame {


    public RoomNameFrm() {
        initComponents();
        this.setTitle("Caro Game Nhóm 5");
        this.setIconImage(new ImageIcon("assets/image/caroicon.png").getImage());
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        findingRoomLabel.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        findingRoomLabel = new javax.swing.JLabel();
        passwordValue = new javax.swing.JTextField();
        passwordNotificationLabl = new javax.swing.JLabel();
        findingRoomLabel1 = new javax.swing.JLabel();
        roomIdValue = new javax.swing.JTextField();
        roomIdLabel = new javax.swing.JLabel();
        goToRoomButton = new javax.swing.JButton();
        frameTitle4 = new javax.swing.JLabel();
        lblLogin4 = new javax.swing.JLabel();
        roomIdLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        findingRoomLabel.setForeground(new java.awt.Color(0, 51, 255));
        findingRoomLabel.setText("Đang tìm kiếm phòng");

        passwordNotificationLabl.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        passwordNotificationLabl.setText("Nếu phòng không có mật khẩu hãy để trống");

        findingRoomLabel1.setForeground(new java.awt.Color(0, 51, 255));
        findingRoomLabel1.setText("Đang tìm kiếm phòng");

        roomIdValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomIdValueActionPerformed(evt);
            }
        });

        roomIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        roomIdLabel.setText("Nhập mã phòng");

        goToRoomButton.setBackground(new java.awt.Color(0, 204, 102));
        goToRoomButton.setText("Vào phòng");
        goToRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToRoomButtonActionPerformed(evt);
            }
        });

        frameTitle4.setBackground(new java.awt.Color(102, 204, 0));
        frameTitle4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        frameTitle4.setForeground(new java.awt.Color(255, 255, 255));
        frameTitle4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frameTitle4.setText("Vào phòng");

        lblLogin4.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 24)); // NOI18N
        lblLogin4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin4.setText("VÀO PHÒNG");
        lblLogin4.setToolTipText("");
        lblLogin4.setPreferredSize(new java.awt.Dimension(360, 60));

        roomIdLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        roomIdLabel1.setText("Mật khẩu phòng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(roomIdLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(roomIdValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(roomIdLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordValue, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(lblLogin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(goToRoomButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(passwordNotificationLabl)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(findingRoomLabel1)
                            .addComponent(findingRoomLabel))
                        .addGap(122, 122, 122))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(frameTitle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(lblLogin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomIdValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomIdLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomIdLabel1))
                .addGap(18, 18, 18)
                .addComponent(passwordNotificationLabl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(goToRoomButton)
                .addGap(18, 18, 18)
                .addComponent(findingRoomLabel)
                .addGap(18, 18, 18)
                .addComponent(findingRoomLabel1)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(frameTitle4)
                    .addContainerGap(194, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomIdValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomIdValueActionPerformed

    }//GEN-LAST:event_roomIdValueActionPerformed

    private void goToRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToRoomButtonActionPerformed
        String roomName = roomIdValue.getText();
        if (roomName.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập mã phòng");
            return;
        }
        try {
            String password = " ";
            if (!passwordValue.getText().isEmpty()) {
                password = passwordValue.getText();
            }
            Client.socketHandle.write("go-to-room," + roomName + "," + password);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_goToRoomButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel findingRoomLabel;
    private javax.swing.JLabel findingRoomLabel1;
    private javax.swing.JLabel frameTitle;
    private javax.swing.JLabel frameTitle1;
    private javax.swing.JLabel frameTitle2;
    private javax.swing.JLabel frameTitle3;
    private javax.swing.JLabel frameTitle4;
    private javax.swing.JButton goToRoomButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblLogin4;
    private javax.swing.JLabel passwordNotificationLabl;
    private javax.swing.JTextField passwordValue;
    private javax.swing.JLabel roomIdLabel;
    private javax.swing.JLabel roomIdLabel1;
    private javax.swing.JTextField roomIdValue;
    // End of variables declaration//GEN-END:variables
}
