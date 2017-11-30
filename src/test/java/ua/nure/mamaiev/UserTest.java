package ua.nure.mamaiev;

import org.junit.Test;

import junit.framework.TestCase;

public class UserTest extends TestCase {
	@Test
	public void testFullName() {
		User user = new User();
		user.setFirstName("Kakashi");
		user.setLastName("Hatake");
		String fullName = 
		user.getFullName();
		assertEquals("Kakashi Hatake", fullName);
		
	}
}
