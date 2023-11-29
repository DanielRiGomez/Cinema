package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.MoviePanel;

import com.toedter.calendar.JCalendar;
import com.uptc.pgr2.proyecto.view.constant.Constants;

import javax.swing.*;
import java.awt.*;

public class JPanelSchedule extends JPanel {

    private JLabel lblSchedule;
    private JCalendar calendar;
    private JButton btnReserve;

    public  JPanelSchedule(){
        lblSchedule = new JLabel();
        calendar = new JCalendar();
        btnReserve = new JButton();
        initComponents();
    }

    private void initComponents() {
        this.setVisible(true);
        this.setOpaque(false);
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        lblSchedule.setText(Constants.SCHEDULE);
        lblSchedule.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 20, 0);
        add(lblSchedule, gbc);

        gbc.gridy = 1;
        gbc.insets = new Insets(5, 0, 5, 0);
        add(calendar, gbc);

        btnReserve.setText(Constants.BTN_RESERVE);
        btnReserve.setContentAreaFilled(false);
        gbc.gridx = 4;
        gbc.gridy = 2;
        add(btnReserve, gbc);

        revalidate();
    }
}