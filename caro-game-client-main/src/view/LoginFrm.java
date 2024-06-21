package view;

import controller.Client;
import controller.PasswordUtils;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class LoginFrm extends javax.swing.JFrame {

    public LoginFrm() {
        initComponents();
        this.setTitle("Caro Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public LoginFrm(String taiKhoan, String matKhau) {
        initComponents();

        txtPassword.setText(matKhau);
        txtUsername4.setText(taiKhoan);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    public void showError(String message) {
        JOptionPane.showMessageDialog(rootPane, message);
    }

    public void log(String message) {
        JOptionPane.showMessageDialog(rootPane, "ID của server thread là:" + message);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        logo4 = new javax.swing.JLabel();
        lblLogin4 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lblUsername4 = new javax.swing.JLabel();
        txtUsername4 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jPanel15 = new javax.swing.JPanel();
        btnDangKy = new javax.swing.JButton();
        btnDangNhap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(400, 400));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(360, 600));
        jPanel13.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 16));

        logo4.setFont(new java.awt.Font("Segoe Print", 1, 32)); // NOI18N
        logo4.setForeground(new java.awt.Color(0, 183, 183));
        logo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo4.setText("Caro Game");
        logo4.setPreferredSize(new java.awt.Dimension(360, 120));
        jPanel13.add(logo4);

        lblLogin4.setFont(new java.awt.Font("Roboto Mono SemiBold", 0, 24)); // NOI18N
        lblLogin4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin4.setText("ĐĂNG NHẬP");
        lblLogin4.setToolTipText("");
        lblLogin4.setPreferredSize(new java.awt.Dimension(360, 60));
        jPanel13.add(lblLogin4);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(360, 80));
        jPanel14.setLayout(new java.awt.GridLayout(2, 0));

        lblUsername4.setFont(new java.awt.Font("Roboto Mono", 0, 16)); // NOI18N
        lblUsername4.setText("Tài khoản");
        jPanel14.add(lblUsername4);

        txtUsername4.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        txtUsername4.setPreferredSize(new java.awt.Dimension(350, 27));
        txtUsername4.setSelectionColor(new java.awt.Color(0, 153, 153));
        txtUsername4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsername4ActionPerformed(evt);
            }
        });
        txtUsername4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsername4KeyPressed(evt);
            }
        });
        jPanel14.add(txtUsername4);

        jPanel13.add(jPanel14);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMinimumSize(new java.awt.Dimension(360, 80));
        jPanel3.setPreferredSize(new java.awt.Dimension(360, 80));
        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        lblPassword.setFont(new java.awt.Font("Roboto Mono", 0, 16)); // NOI18N
        lblPassword.setText("Mật khẩu");
        jPanel3.add(lblPassword);

        txtPassword.setFont(new java.awt.Font("Roboto Mono", 0, 14)); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(90, 40));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel3.add(txtPassword);

        jPanel13.add(jPanel3);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 8, 5));

        btnDangKy.setBackground(new java.awt.Color(255, 102, 102));
        btnDangKy.setFont(new java.awt.Font("Roboto Mono Medium", 0, 16)); // NOI18N
        btnDangKy.setForeground(new java.awt.Color(255, 255, 255));
        btnDangKy.setText("Đăng ký");
        btnDangKy.setBorderPainted(false);
        btnDangKy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangKy.setFocusPainted(false);
        btnDangKy.setFocusable(false);
        btnDangKy.setPreferredSize(new java.awt.Dimension(200, 40));
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });
        jPanel15.add(btnDangKy);

        btnDangNhap.setBackground(new java.awt.Color(0, 204, 102));
        btnDangNhap.setFont(new java.awt.Font("Roboto Mono Medium", 0, 16)); // NOI18N
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setBorderPainted(false);
        btnDangNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangNhap.setFocusPainted(false);
        btnDangNhap.setFocusable(false);
        btnDangNhap.setPreferredSize(new java.awt.Dimension(200, 40));
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        jPanel15.add(btnDangNhap);

        jPanel13.add(jPanel15);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel12, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsername4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsername4ActionPerformed

    }//GEN-LAST:event_txtUsername4ActionPerformed

    private void txtUsername4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsername4KeyPressed

    }//GEN-LAST:event_txtUsername4KeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed

    }//GEN-LAST:event_txtPasswordKeyPressed

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        Client.openView(Client.View.REGISTER);
        dispose(); // Đóng cửa sổ hiện tại sau khi mở cửa sổ đăng ký

    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        try {
            String taiKhoan = txtUsername4.getText();
            if (taiKhoan.isEmpty()) {
                throw new Exception("Vui lòng nhập tên tài khoản");
            }
            String matKhau = String.copyValueOf(txtPassword.getPassword());
            if (matKhau.isEmpty()) {
                throw new Exception("Vui lòng nhập mật khẩu");
            }
            // Mã hóa mật khẩu trước khi gửi đến server
            String encryptedPassword = PasswordUtils.encrypt(matKhau);
            Client.closeAllViews();
            Client.openView(Client.View.GAME_NOTICE, "Đăng nhập", "Đang xác thực thông tin đăng nhập");
            Client.socketHandle.write("client-verify," + taiKhoan + "," + encryptedPassword);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LoginFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblLogin4;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername4;
    private javax.swing.JLabel logo4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername4;
    // End of variables declaration//GEN-END:variables
}
