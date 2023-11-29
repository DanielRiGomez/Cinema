package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.InitialPanel;

import com.uptc.pgr2.proyecto.view.constant.Constants;

import javax.swing.*;
import java.awt.*;

public class JPanelLogo extends JPanel {

    private static final long serialVersionUID = 1L;
    private JLabel imgLogo;

    public JPanelLogo(){
        imgLogo = new JLabel();
        initComponents();
    }

    private void initComponents() {
        this.setOpaque(false);
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        ImageIcon logo = new ImageIcon(getClass().getResource(Constants.PATH + Constants.PATH_LOGO));
        imgLogo.setIcon(new ImageIcon(logo.getImage().getScaledInstance(800, 600, Image.SCALE_SMOOTH)));
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(imgLogo, gbc);

        revalidate();
    }
}
