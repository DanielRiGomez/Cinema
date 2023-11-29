package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.InitialPanel;

import java.awt.*;
import javax.swing.*;

public class JPanelGraphicsImage extends JPanel {

    private static final long serialVersionUID = 1L;
    private Image background;

    public JPanelGraphicsImage(String img) {
        this.setOpaque(false);
        this.setImage(img);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(background, 100, 20, this.getWidth() - 300, this.getHeight(), null);
    }

    public void setImage(String image) {
        if (image != null) {
            background = new ImageIcon(getClass().getResource(image)).getImage();
        }
    }
}
