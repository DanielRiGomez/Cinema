package com.uptc.pgr2.proyecto.view.initialFrame;

import com.uptc.pgr2.proyecto.view.constant.Constants;

import javax.swing.*;

public class JPanelText extends JPanel {

    private JLabel lblUser;
    private JTextField txtUsername;

    public JPanelText(){
        this.lblUser = new JLabel();
        this.txtUsername = new JTextField(20);

        initComponents();
    }

    private void initComponents() {
        this.lblUser.setText(Constants.LBL_USER);
        this.add(lblUser);

        txtUsername.setEditable(true);
        this.add(txtUsername);

        revalidate();
    }
}
