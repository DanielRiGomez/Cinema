package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.MoviePanel;

import com.uptc.pgr2.proyecto.view.constant.Constants;

import javax.swing.*;
import java.awt.*;

public class JPanelInformation extends JPanel {

    private JLabel lblTitle, lblDeliveries, lblSynopsis, lblClassification, lblDirector;

    public JPanelInformation(String title, String deliveries, String synopsis, String classification, String director){
        lblTitle = new JLabel();
        lblDeliveries = new JLabel();
        lblSynopsis = new JLabel();
        lblClassification = new JLabel();
        lblDirector = new JLabel();

        initComponents(title, deliveries, synopsis, classification, director);
    }

    public void initComponents(String title, String deliveries, String synopsis, String classification, String director) {
        this.setVisible(true);
        this.setOpaque(false);
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        lblTitle.setText(Constants.LBL_TITLE + title);
        add(lblTitle);

        add(Box.createRigidArea(new Dimension(0, 15)));

        lblDeliveries.setText(Constants.LBL_DELIVERIES + deliveries);
        add(lblDeliveries);

        add(Box.createRigidArea(new Dimension(0, 15)));

        lblSynopsis.setText(Constants.LBL_SYNOPSIS + synopsis);
        add(lblSynopsis);

        add(Box.createRigidArea(new Dimension(0, 15)));

        lblClassification.setText(Constants.LBL_CLASSIFICATION + classification);
        add(lblClassification);

        add(Box.createRigidArea(new Dimension(0, 15)));

        lblDirector.setText(Constants.LBL_DIRECTOR + director);
        add(lblDirector);

        revalidate();
    }
}
