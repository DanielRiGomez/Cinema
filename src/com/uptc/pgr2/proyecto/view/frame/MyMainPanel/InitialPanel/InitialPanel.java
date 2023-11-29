package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.InitialPanel;

import javax.swing.*;
import java.awt.*;

public class InitialPanel extends JPanel {

    private JPanelLogo logoPanel;
    private JPanelCinemaListings cinema;

    public InitialPanel(){
        logoPanel = new JPanelLogo();
        cinema = new JPanelCinemaListings();

        initComponents();
    }

    private void initComponents() {
        this.setVisible(true);
        this.setOpaque(false);
        this.setLayout(new GridLayout(2, 1));

        this.add(logoPanel);
        this.add(cinema);

        revalidate();
    }
}
