package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.InitialPanel;

import com.uptc.pgr2.proyecto.view.constant.Constants;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {

    public MyButton(String nameImage) {
        initComponents(nameImage);
    }

    private void initComponents(String nameImage) {
        this.setOpaque(true);
        this.setHorizontalAlignment(CENTER);
        this.setVisible(true);
        ImageIcon imgOpen = new ImageIcon(getClass().getResource(Constants.PATH + nameImage));
        this.setIcon(new ImageIcon(imgOpen.getImage().getScaledInstance(125, 125, Image.SCALE_SMOOTH)));
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);

        revalidate();
    }
}