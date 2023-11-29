package tests;

import com.uptc.pgr2.proyecto.view.frame.ticket.Ticket;

public class TestTicketPanel {

	public static void main(String[] args) {
		
		Ticket ticket = new Ticket("Alien", "2020/05/06", "10:00", "1", "User", new int[]{10, 25, 60, 35});
		ticket.showSplashAMoment(10000);
	}
}
