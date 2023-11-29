package com.uptc.pgr2.proyecto.view.frame.MyMainPanel.ReserverPanel;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * Clase planel que contiene la lista de botones silla
 * @author Daniel Gomez
 * dd/mm/aaaa
 * @version 0.1
 */
public class ChairSetPanel extends JPanel {

	private final int COLUMNS = 8;
	private final int ROWS = 10;
	private final String PATH_ICON_CHAIRS = "src/resource/images/icons/chairIcon.png";
	private final int SIZE_BUTTON_CHAIR = 40;
	
	private StandardJButton[] chairs;
	private byte[] dataChair;
	
	/**
	 * Metodo constructor que recibe la informacion de la silla
	 * @param dataChair - informacion de las sillas, 0 si esta libre y 1 si esta reservada
	 */
	public ChairSetPanel(byte[] dataChair) {
		super();
		this.dataChair = dataChair;
		this.chairs = new StandardJButton[dataChair.length];
		init();
	}
	
	/**
	 * Metodo que inicializa el panel
	 */
	private void init() {
		this.setLayout(new GridLayout(ROWS, COLUMNS));
		instanceChairs();
	}
	
	/**
	 * Metodo que instancia las sillas y las inabilita si esta reservada
	 */
	private void instanceChairs() {
		for(int i=0; i< dataChair.length; i++) {
			chairs[i] = new StandardJButton(PATH_ICON_CHAIRS, SIZE_BUTTON_CHAIR);
			if(dataChair[i] == 1)
				chairs[i].setEnabled(false);
			this.add(chairs[i]);
		}
	}
	
	/**
	 * Metodo que resetea los botones al ultimo guardado de acciones hechas
	 * en los botones
	 */
	public void resetChairs() {
		for(int i=0; i< dataChair.length; i++) {
			if(dataChair[i] == 1) {
				chairs[i].setEnabled(false);
			} else {
				chairs[i].setEnabled(true);
			}
		}
	}
	
	/**
	 * Metodo que busca las posiciones de los ultimos botones inhabilitados
	 * @return
	 */
	public ArrayList<Integer> reservedChairs() {
		ArrayList<Integer> positions = new ArrayList<>();
		for(int i=0; i < dataChair.length ; i++) {
			if((dataChair[i] == 0 && !chairs[i].isEnabled()) || ((dataChair[i] == 1 && chairs[i].isEnabled()))) {
				positions.add(i);
			}
		}
		return positions;
	}

	/**
	 * Metodo que guarda las acciones hechas en los botones
	 */
	public void registerChairsReserver() {
		for(int i=0; i< dataChair.length; i++){
			dataChair[i] = (byte) (chairs[i].isEnabled()?0:1);
		}
	}
	
	/**
	 * Metodo que adiciona un escucha a los botones
	 * @param listener - escucha
	 */
	public void addListener(ActionListener listener) {
		for(StandardJButton i: chairs)
			i.setListener(listener);
	}

	/**
	 * Metodo get de los datos de las sillas
	 * @return - arreglo que representa el estado de un silla, 0 libre y 1 reservada
	 */
	public byte[] getDataChair() {
		return dataChair;
	}
}
