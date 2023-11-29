package com.uptc.pgr2.proyecto.view.cinemaFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.uptc.pgr2.proyecto.view.constant.Command;
import com.uptc.pgr2.proyecto.view.frame.MyMainPanel.MyMainPanel;
import com.uptc.pgr2.proyecto.view.frame.MyMainPanel.PremierePanel.PremierePanel;
import com.uptc.pgr2.proyecto.view.frame.MyMenu.MyMenu;

public class MainFrame extends JFrame implements ActionListener{

	private MyMenu myMenu;
	private JPanel informationPanel;
	private MyMainPanel mainPanel;
	
	public MainFrame(MyMainPanel mainPanel, MyMenu menuBar, JPanel informationPanel) {
		super();
		this.myMenu = menuBar;
		this.mainPanel = mainPanel;
		this.informationPanel = informationPanel;
		init();
	}
	
	private void init() {
	    this.setExtendedState(MAXIMIZED_BOTH); 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        myMenu.addListener(this);
        this.add(myMenu, BorderLayout.NORTH);
        this.add(mainPanel, BorderLayout.CENTER);
        this.add(informationPanel, BorderLayout.EAST);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case Command.COMMAND_INIT_PANEL:
			mainPanel.setBackground(Color.RED);
			myMenu.getPremieresButt().setEnabled(true);
			myMenu.getInitialButt().setEnabled(false);
			break;
			
		case Command.COMMAND_PREMIERS_PANEL:
			//PremierePanel premiers = new PremierePanel();
			//premiers.instanceFilmPanels("");
			//mainPanel.changePanel(premiers);
			mainPanel.setBackground(Color.GREEN);
			myMenu.getPremieresButt().setEnabled(false);
			myMenu.getInitialButt().setEnabled(true);
			break;
			
		default:
			break;
		
		}
	}
	
}
