package org.generation.italy.eventi;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EventTest {

	//creo un instanza di Event
	Event event = null;
	
	//TEST EQUALS
	
	
	//TEST ECCEZZIONI
	
	@Test
	@DisplayName("test posti disponibili eccezzioni")
	public void controlnSeatsInTotalTest() throws Exception {
		
		//controlliamo se l'errore ci riporta un eccezzione
		assertThrows(Exception.class, () -> event = new Event ("poyo", LocalDate.of(2023, 06, 24), 0) );
		
	}
	@Test
	@DisplayName("test data eccezzioni")
	public void setDateTest() throws Exception {
		
		//controlliamo se l'errore ci riporta un eccezzione
		assertThrows(Exception.class, () -> event = new Event ("poyo", LocalDate.of(1997, 06, 24), 0) );
		
	}
	
	
}
