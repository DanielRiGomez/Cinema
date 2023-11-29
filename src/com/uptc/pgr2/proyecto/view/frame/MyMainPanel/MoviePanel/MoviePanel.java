package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.MoviePanel;

import com.uptc.pgr2.proyecto.view.constant.Constants;

import javax.swing.*;
import java.awt.*;

public class MoviePanel extends JPanel {

    private JLabel lblImage;
    private JPanelInformation information;
    private JPanelSchedule schedule;

    public MoviePanel(String pathImage, String title, String deliveries, String synopsis, String classification, String director){
        lblImage = new JLabel();
        schedule = new JPanelSchedule();
        initComponents(pathImage, title, deliveries, synopsis, classification, director);
    }

    private void initComponents(String pathImage, String title, String deliveries, String synopsis, String classification, String director) {
        this.setLayout(new FlowLayout(1, 20, 10));
        this.setVisible(true);
        this.setOpaque(false);

        ImageIcon logo = new ImageIcon(getClass().getResource(Constants.PATH + pathImage));
        lblImage.setIcon(new ImageIcon(logo.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        this.add(lblImage);

        information = new JPanelInformation(title, deliveries, synopsis, classification, director);
        this.add(information);

        this.add(schedule);

        revalidate();
    }
}
