package org.generation.italy.eventi;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
//		es1();
	//-------------------------------------------
//		es2();
	//--------------------------------------------
//		es3();
	//--------------------------------------------	
		//MAILSTONE BONUS
		
		try {
			Event event1 = new Event("poyo", LocalDate.of(2023, 06, 24), 50);
			Event event2 = new Event("poyo2", LocalDate.of(2023, 06, 24), 50);
			Event event3 = new Event("poyo3", LocalDate.of(2023, 06, 25), 50);
			Event event4 = new Event("poyo4", LocalDate.of(2022, 12, 24), 50);
			Event event5 = new Event("poyo5", LocalDate.of(2023, 04, 24), 50);
			Event event6 = new Event("poyo6", LocalDate.of(2023, 02, 25), 50);
			
			//creiamo ProgrammEvent
			ProgrammEvent eventsScheduled = new ProgrammEvent("poyoEvent");
			eventsScheduled.addEvent(event1);
			eventsScheduled.addEvent(event2);
			eventsScheduled.addEvent(event3);
			eventsScheduled.addEvent(event4);
			eventsScheduled.addEvent(event5);
			eventsScheduled.addEvent(event6);
			
			System.out.println("-----------------------");
			System.out.println("Eventi in data 2023-06-24");
			eventsScheduled.filterByDate(LocalDate.of(2023, 06, 24));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		//FINE MAIN
	}
		
	//***********************************************************
		private static void es1(){
			//MILESTONE 1 e 2
			
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
				
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());;
			}
			//chiudo lo scanner
			sc.close();
			
		
			System.out.println("Posti prenotti : " + event1.getSeatsReserveds());
			System.out.println("Posti disdetti : " + event1.getCancelledPlaces());
			
		}
		
	//***********************************************************
		private static void es2() {
			//MILESTONE 3
			try {
				Event event1 = new Event("poyo", LocalDate.of(2023, 06, 24), 50);
				Event event2 = new Event("poyo2", LocalDate.of(2023, 06, 24), 50);
				Event event3 = new Event("poyo3", LocalDate.of(2023, 06, 25), 50);
				Event event4 = new Event("poyo4", LocalDate.of(2022, 12, 24), 50);
				Event event5 = new Event("poyo5", LocalDate.of(2023, 04, 24), 50);
				Event event6 = new Event("poyo6", LocalDate.of(2023, 02, 25), 50);
				
				//creiamo ProgrammEvent
				ProgrammEvent eventsScheduled = new ProgrammEvent("poyoEvent");
				eventsScheduled.addEvent(event1);
				eventsScheduled.addEvent(event2);
				eventsScheduled.addEvent(event3);
				eventsScheduled.addEvent(event4);
				eventsScheduled.addEvent(event5);
				eventsScheduled.addEvent(event6);
				
				
				System.out.println(eventsScheduled);
				
				System.out.println("-----------------------");
				System.out.println("Eventi in data 2023-06-24");
				eventsScheduled.filterByDate(LocalDate.of(2023, 06, 24));
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println(e.getMessage());;
			}
		}
	
	//***********************************************************
		private static void es3() {
			//MILESTONE 4
			//creaiamo un concerto
			try {
				Concert concert1 = new Concert("poyo", LocalDate.of(2023, 02, 25), 100, LocalTime.of(20,30), BigDecimal.valueOf(55.3));
				System.out.println(concert1);
			} catch (Exception err) {
				// TODO Auto-generated catch block
				System.err.println(err.getMessage());
			}
			
		}
	
}
