package com.uptc.pgr2.proyecto.view.initialFrame;


import javax.swing.*;
import javax.swing.border.*;

import com.uptc.pgr2.proyecto.view.constant.Constants;

import java.awt.*;

public class JLabelRound extends JLabel {

    private AbstractBorder roundBorder;

    public JLabelRound() {
        roundBorder = new RoundEdge();
        initComponents();
    }

    private void initComponents() {
        this.setOpaque(true);
        this.setHorizontalAlignment(CENTER);
        this.setVisible(true);
        this.setBorder(roundBorder);
        ImageIcon imgOpen = new ImageIcon(getClass().getResource(Constants.PATH + Constants.IMAGE_USER));
        this.setIcon(new ImageIcon(imgOpen.getImage().getScaledInstance(125, 125, Image.SCALE_SMOOTH)));

        revalidate();
    }
}
