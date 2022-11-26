package org.generation.italy.eventi;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProgrammEventUnique {
	//variabili d'istanza
	private String titleProgrammEvent;
	private Set<Event> eventsScheduled;
		
	//costrutto
	public ProgrammEventUnique(String titleProgrammEvent) {
		setTitleProgrammEvent(titleProgrammEvent);
		setEventsScheduled(new HashSet<>());
	}

	//metodi get e set
	public String getTitleProgrammEvent() {
		return titleProgrammEvent;
	}
	public void setTitleProgrammEvent(String titleProgrammEvent) {
		this.titleProgrammEvent = titleProgrammEvent;
	}

	public Set<Event> getEventsScheduled() {
		return eventsScheduled;
	}
	public void setEventsScheduled(Set<Event> eventsScheduled) {
		this.eventsScheduled = eventsScheduled;
	}
	
	//metodi
	public void addEvent(Event event) throws Exception {
		if (!(event instanceof Event)) {
			throw new Exception("l'evento indicato non è un evento");
		}
		eventsScheduled.add(event);
	}
	
	public int getNumberOfScheduledEvents() {
		return eventsScheduled.size();
	}
	
	public void cancelTheScheduledEvents() {
		eventsScheduled.clear();
	}
	
	public void filterByDate(LocalDate filterDate) {
		List<Event> filteredEvent = new ArrayList<Event>();
		
		filteredEvent.stream().filter(e -> e.getDate().equals(filterDate));
		
		System.out.println(filteredEvent);
	}
	
	//metodi bonus
	public void getMaxNumberOfSeats() {
		//variabile di assegnazione
		Event eventMaxNumberOfSeats = null;
		int maxNumberOfSeats = Integer.MIN_VALUE;
		
		for(Event e : eventsScheduled) {
			
			if(maxNumberOfSeats < e.getnSeatsInTotal()) {
				
				maxNumberOfSeats = e.getnSeatsInTotal();
				eventMaxNumberOfSeats = e;
			}
		}
		System.out.println(eventMaxNumberOfSeats);
		
	}
	public void getMinNumberOfSeats() {
		//variabile di assegnazione
		Event eventMinNumberOfSeats = null;
		int minNumberOfSeats = Integer.MAX_VALUE;
		
		for(Event e : eventsScheduled) {
			
			if(minNumberOfSeats > e.getnSeatsInTotal()) {
				
				minNumberOfSeats = e.getnSeatsInTotal();
				eventMinNumberOfSeats = e;
			}
		}
		System.out.println(eventMinNumberOfSeats);
	}
	
	//creo il comparatore
		public static class ComparoterOfLengths implements Comparator<Event>{

		@Override
		public int compare(Event o1, Event o2) {
			// TODO Auto-generated method stub
			return o2.getTitleEvent().length() - o1.getTitleEvent().length();
		}
			
		}
	public void orderedPrint() {
		//creo il comparatore
		ComparoterOfLengths comparoterOfLengths = new ComparoterOfLengths();
		//creo la List collection dove assegno la Collection Set
		List<Event> eventsScheduledList = new ArrayList<>(eventsScheduled);
		//faccio il sort per ordinarli in base alla lunghezza
		eventsScheduledList.sort(comparoterOfLengths);
		System.out.println(eventsScheduledList);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String res = getTitleProgrammEvent() + "\n";
		
		for (Event e : getEventsScheduled()) 
			res += e.toString() + "\n";
		
		return res;
	}
	
}
