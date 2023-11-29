package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.InitialPanel;

import com.uptc.pgr2.proyecto.view.constant.Constants;

import javax.swing.*;
import java.awt.*;

public class JPanelCinemaListings extends JPanel {

    private MyButton btnLeft, btnRight;
    private JPanelGraphicsImage img;

    public JPanelCinemaListings(){
        initComponents();
    }

    private void initComponents() {
        this.setOpaque(false);
        this.setLayout(new GridLayout(1, 3));

        btnLeft = new MyButton(Constants.IMAGE_LEFT);
        add(btnLeft);

//        img = new JPanelGraphicsImage("judaFilm.png");
//        add(img);

        btnRight = new MyButton(Constants.IMAGE_RIGHT);
        add(btnRight);

    }
}
