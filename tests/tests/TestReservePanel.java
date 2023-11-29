package tests;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.uptc.pgr2.proyecto.view.frame.MyMainPanel.ReserverPanel.ReservePanel;

public class TestReservePanel extends JFrame{
	
	private ImageIcon image;

	public TestReservePanel() throws HeadlessException {
		super();
		image = new ImageIcon("src/resource/images/pictures/backgroundFrame1.png");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBackground(Color.BLUE);
	}

	
	public static void main(String[] args) {
		TestReservePanel frame = new TestReservePanel();

		
		byte[] chairs = new byte[80];
		chairs[0] = 1;
		chairs[21] = 1;
		chairs[12] = 1;
		chairs[3] = 1;
		chairs[15] = 1;
		chairs[11] = 1;
		chairs[21] = 1;
		chairs[25] = 1;
		chairs[35] = 1;
		chairs[30] = 1;
		
		ReservePanel panel = new ReservePanel(chairs, "Nombre de la pelicula..", "Fecha", "Hora", "Sala");
		
		frame.add(panel);
		frame.setVisible(true);
	}
}
