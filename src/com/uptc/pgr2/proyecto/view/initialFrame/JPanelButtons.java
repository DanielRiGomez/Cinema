package com.uptc.pgr2.proyecto.view.initialFrame;

import com.uptc.pgr2.proyecto.view.constant.Constants;

import javax.swing.*;
public class JPanelButtons extends JPanel {

    private JButton btnContinue, btnExit;

    public JPanelButtons(){
        this.btnContinue = new JButton();
        this.btnExit = new JButton();

        initComponents();
    }

    private void initComponents() {
        btnExit.setText(Constants.EXIT);
        btnExit.setContentAreaFilled(false);
        this.add(btnExit);

        btnContinue.setText(Constants.CONTINUE);
        btnContinue.setContentAreaFilled(false);
        this.add(btnContinue);

        revalidate();
    }

}
