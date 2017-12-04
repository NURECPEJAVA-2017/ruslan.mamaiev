package ua.nure.mamaiev;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

public class UserTest extends TestCase{

	private static final int ETALONE_AGE = 2018 - 1984;
	private User user;
	private Date dateOfBirthd;
	
	protected void setUp() throws Exception {
		super.setUp();
		user = new User();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1984, Calendar.MAY, 26);
		dateOfBirthd = calendar.getTime();
		
}


	public void testGetFullName() {
		user.setFirstName("Obito");
		user.setLastName("Uchiha");
		assertEquals("Obito Uchiha", user.getFullName() );
	}
	public void testGetAge() {
		user.setDateOfBirth(dateOfBirthd);
		assertEquals(ETALONE_AGE, user.getAge() );
	}
}