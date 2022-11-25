package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgrammEvent{
	
	//variabili d'istanza
	String titleProgrammEvent;
	List<Event> eventsScheduled;
	
	//costruttore ProgrammEvent 
	public ProgrammEvent(String titleProgrammEvent) {
		
		setTitleProgrammEvent(titleProgrammEvent);
		eventsScheduled = new ArrayList<Event>();
		
		}

	public String getTitleProgrammEvent() {
		return titleProgrammEvent;
	}
	public void setTitleProgrammEvent(String titleProgrammEvent) {
		this.titleProgrammEvent = titleProgrammEvent;
	}
	
	public String getEventsScheduled(){	
		
		String orderEventsScheduled = "";
		
		compare();
		
		//ad ogni ciclo assoccio una scritta in modo da andare a capo 
		for (Event event : eventsScheduled) {
			orderEventsScheduled += event.dataFormatter() + " - " + event.getTitleEvent() + "\n";
		}
		return orderEventsScheduled;
	}
	
	//metodi
	public void addEvent(Event eventAdd) throws Exception {
		if (!(eventAdd instanceof Event)) {
			throw new Exception("l'evento indicato non è un evento");
		}
		eventsScheduled.add(eventAdd);
	}
	
	
	public int getNumberOfScheduledEvents() {
		return eventsScheduled.size();
	}
	
	public void cancelTheScheduledEvents() {
		eventsScheduled.clear();
	}
	
	public void filterByDate(LocalDate filterDate) {
		//creiamo un nuovo array
		List<Event> filteredEvent = new ArrayList<Event>();
		
		 for (Event event : eventsScheduled) {
		        	
		            if (event.getDate().equals(filterDate)) {
		            	filteredEvent.add(event);
		                // break;
		            }
		    }
		System.out.println(filteredEvent);
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "nome evento : " + getTitleProgrammEvent() 
				+ "\n" + getEventsScheduled();
	}

	public void compare() {
		//creo un 
		eventsScheduled.sort(
				//inserisco una expression Lambda per far in modo di ritornare un singolo valore
				(event1, event2) -> 
				//Il compareTo()è un metodo confronta lessicograficamente due stringhe.
				event1.getDate().compareTo( event2.getDate() ) 
				);
	}
}
