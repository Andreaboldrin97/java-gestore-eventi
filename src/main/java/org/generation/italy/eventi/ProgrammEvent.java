package org.generation.italy.eventi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProgrammEvent {

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
	
	public List<Event> getEventsScheduled(){
		return eventsScheduled;
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
}
