package tests;

import com.uptc.pgr2.proyecto.view.cinemaFrame.*;
import com.uptc.pgr2.proyecto.view.frame.MyInformationPanel.MyInformationPanel;
import com.uptc.pgr2.proyecto.view.frame.MyMainPanel.MyMainPanel;
import com.uptc.pgr2.proyecto.view.frame.MyMenu.MyMenu;

public class TestFrame {
	
	public static void main(String[] args) {
		String [] languages = {"Ingles", "Frances", "Español"};
		 MyMenu menu = new MyMenu(languages);
		 MyInformationPanel panelProm = new MyInformationPanel("Usuario");
		 MyMainPanel mainPanel = new MyMainPanel();
		 MainFrame frame = new MainFrame(mainPanel, menu, panelProm);
		 frame.setVisible(true);
	}

}
