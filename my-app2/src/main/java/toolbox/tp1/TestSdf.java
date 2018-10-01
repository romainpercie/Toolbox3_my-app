package toolbox.tp1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



public class TestSdf {
	
			
	public Instant parseDatetimestamp(String sDate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		return sdf.parse(sDate).toInstant();		
	}
	
	public String serializeDatetimestamp(Instant instant) throws ParseException {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy").withZone( ZoneId.systemDefault() );
		return formatter.format(instant);		
		
	}
	
}
