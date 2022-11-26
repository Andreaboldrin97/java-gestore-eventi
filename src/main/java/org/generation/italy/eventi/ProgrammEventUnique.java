package org.generation.italy.eventi;


import java.time.LocalDate;
import java.util.ArrayList;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String res = getTitleProgrammEvent() + "\n";
		
		for (Event e : getEventsScheduled()) 
			res += e.toString() + "\n";
		
		return res;
	}
	
}
