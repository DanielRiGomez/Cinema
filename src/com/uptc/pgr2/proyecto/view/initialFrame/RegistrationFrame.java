package com.uptc.pgr2.proyecto.view.initialFrame;

import javax.swing.*;
import java.awt.*;

public class RegistrationFrame extends JFrame {

    private final JLabelRound lblProfilePicture;
    private final JPanelText txtPanel;
    private final JPanelButtons btnPanel;

    public RegistrationFrame(){
        this.setUndecorated(true);
        this.lblProfilePicture = new JLabelRound();
        this.txtPanel = new JPanelText();
        this.btnPanel = new JPanelButtons();

        initComponents();
    }

    private void initComponents() {
        this.setSize(new Dimension(400, 300));
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.insets = new Insets(20, 10, 5, 10);
        this.add(lblProfilePicture, gbc);
        gbc.gridy = 1;
        this.add(txtPanel, gbc);
        gbc.gridy = 2;
        gbc.insets = new Insets(40, 170, 5, 5);
        this.add(btnPanel, gbc);

        revalidate();
    }

    /*
    public static void main(String[] args) {
        new RegistrationFrame();
    }
    */
}
