package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		// apro lo scannere di comunicazione
		Scanner sc = new Scanner(System.in);
		System.out.println("inserisci il nome dell'evento");
		String titleEvent = sc.nextLine();
		
		System.out.println("inserisci la data dell'evento YYYY-MM-dd");
		LocalDate date = LocalDate.parse(sc.next());
		
		System.out.println("inserisci il numero di posti presenti nell'evento dell'evento");
		int nSeatsInTotal = sc.nextInt();
		
		System.out.println("----------------------------");
		Event event1 = null;
		//test evento 
		try {
			event1 = new Event(titleEvent, date, nSeatsInTotal);
			System.out.println(event1);
			
			//controlli disdici e prenota
			System.out.println("inserisci i posti che vuoi prenotare");
			int seatsBooked = sc.nextInt();
			event1.book(seatsBooked);
			
			
			System.out.println("inserisci i posti che vuoi disdire");
			int cancelledPlaces = sc.nextInt();
			event1.cancel(cancelledPlaces);
			System.out.println(event1.getnSeatsBooked());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());;
		}
		//chiudo lo scanner
		sc.close();
		
	
		System.out.println("Posti prenotti : " + event1.getnSeatsBooked());
		System.out.println("Posti disdetti : " + event1.getnSeatsBooked());
		
	//FINE MAIN
	}
}
