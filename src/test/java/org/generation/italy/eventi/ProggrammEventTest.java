package org.generation.italy.eventi;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProggrammEventTest {
	
	ProgrammEvent eventsScheduled = null;
	
	//TEST ECCEZZIONI
	
		@Test
		@DisplayName("test posti disponibili eccezzioni")
		public void controlnSeatsInTotalTest() throws Exception {
			
			eventsScheduled = new ProgrammEvent("eventsTest");
			
			Concert event = new Concert ("poyo", LocalDate.of(2023, 02, 25), 100, LocalTime.of(20,30), BigDecimal.valueOf(55.3));
			//controlliamo se l'errore ci riporta un eccezzione
			assertDoesNotThrow(() -> eventsScheduled.addEvent(event) );
		}
}
