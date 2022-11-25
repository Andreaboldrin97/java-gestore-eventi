package org.generation.italy.eventi;

import java.time.LocalDate;

public class Event {
	
	///variabili d'istanza
	private String titleEvent;
	private LocalDate date;
	private int nSeatsInTotal;
	private int nSeatsBooked;
	
	
	//costrutture evento
	public Event(String titleEvent, LocalDate date, int nSeatsInTotal) throws Exception {
		
		setTitleEvent(titleEvent);
		setDate(date);
		if(nSeatsInTotal < 0) {
			throw new Exception("i posti inseriti sono minori di 1");
		}
		this.nSeatsInTotal = nSeatsInTotal;
		this.nSeatsBooked = 0;
	}

	// get e set
	public String getTitleEvent() {
		return titleEvent;
	}
	public void setTitleEvent(String titleEvent) {
		this.titleEvent = titleEvent;
	}

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) throws Exception {
		if(date.isBefore(LocalDate.now())) {
			throw new Exception("la data selezionata non è corretta");
		}
		this.date = date;
	}

	public int getnSeatsInTotal() {
		return nSeatsInTotal;
	}

	public int getnSeatsBooked() {
		return nSeatsBooked;
	}
	
	//altri metodi
	public void book() throws Exception {
		if(date.isBefore(LocalDate.now())) {
			throw new Exception("l'evento selezionato è scaduto");
		}
		nSeatsBooked ++;
	}
	public void cancel() throws Exception {
		if(date.isBefore(LocalDate.now())) {
			throw new Exception("l'evento selezionato è scaduto");
		}
		nSeatsBooked --;
	}
	
	private String dataFormatter() {
		return date.getDayOfMonth() + "/" + date.getMonth() + "/" + date. getYear();	
		}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return dataFormatter() + "-" + getTitleEvent();
	}
	
	
	
}
