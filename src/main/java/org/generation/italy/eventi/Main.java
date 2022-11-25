package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
//		// apro lo scannere di comunicazione
//		Scanner sc = new Scanner(System.in);
//		System.out.println("inserisci il nome dell'evento");
//		String titleEvent = sc.nextLine();
//		
//		System.out.println("inserisci la data dell'evento YYYY-MM-dd");
//		LocalDate date = LocalDate.parse(sc.next());
//		
//		System.out.println("inserisci il numero di posti presenti nell'evento dell'evento");
//		int nSeatsInTotal = sc.nextInt();
//		
//		System.out.println("----------------------------");
//		Event event1 = null;
//		//test evento 
//		try {
//			event1 = new Event(titleEvent, date, nSeatsInTotal);
//			System.out.println(event1);
//			
//			//controlli disdici e prenota
//			System.out.println("inserisci i posti che vuoi prenotare");
//			int seatsBooked = sc.nextInt();
//			event1.book(seatsBooked);
//			
//			
//			System.out.println("inserisci i posti che vuoi disdire");
//			int cancelledPlaces = sc.nextInt();
//			event1.cancel(cancelledPlaces);
//			
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.err.println(e.getMessage());;
//		}
//		//chiudo lo scanner
//		sc.close();
//		
//	
//		System.out.println("Posti prenotti : " + event1.getSeatsReserveds());
//		System.out.println("Posti disdetti : " + event1.getCancelledPlaces());
		
		//-------------------------------------------
		
		try {
			Event event1 = new Event("poyo", LocalDate.of(2023, 06, 24), 50);
			Event event2 = new Event("poyo2", LocalDate.of(2023, 06, 24), 50);
			Event event3 = new Event("poyo3", LocalDate.of(2023, 06, 25), 50);
			
			//creiamo ProgrammEvent
			ProgrammEvent eventsScheduled = new ProgrammEvent("poyoEvent");
			eventsScheduled.addEvent(event1);
			eventsScheduled.addEvent(event2);
			eventsScheduled.addEvent(event3);
			System.out.println(eventsScheduled);
			
			System.out.println("-----------------------");
			eventsScheduled.filterByDate(LocalDate.of(2023, 06, 24));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());;
		}
		
		
	//FINE MAIN
	}
}
