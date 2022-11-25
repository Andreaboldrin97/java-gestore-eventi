package org.generation.italy.eventi;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class Concert extends Event {
	
	//variabilo d'istanza
	 LocalTime time;
	 BigDecimal price;
	 
	// costrutto
	public Concert(String titleEvent, LocalDate date, int nSeatsInTotal, LocalTime time, BigDecimal price) throws Exception {
		super(titleEvent, date, nSeatsInTotal);
		setTime(time);
		setPrice(price);
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	//metodi
	public String getFormatterTime() {
		
		return time.getHour() + ":" + time.getMinute();
	}
	public String getFormatterPrice() {
		
		return String.format("%.2f", getPrice());
	}
	
	@Override
	public String toString() {
		return  super.dataFormatter() + " " + getFormatterTime() + "-"+ super.getTitleEvent() + "-" + getFormatterPrice()+"€";
	}
	
	
}
