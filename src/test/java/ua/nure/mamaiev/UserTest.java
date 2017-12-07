package ua.nure.mamaiev;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase;

public class UserTest extends TestCase {
	// Тест для 7.12.17
	private static final int DAY_OF_BIRTH = 7;
	private static final int DAY_OF_BIRTH_1 = 8;
	private static final int MONTH_OF_BIRTH = Calendar.DECEMBER;
	private static final int MONTH_OF_BIRTH_1 = Calendar.NOVEMBER;
	private static final int YEAR_OF_BIRTH = 2000;
	private static final int CURRENT_YEAR = 2017;

	// Константа которая определяет по текущему году и году рождения
	private static final int ETALONE_AGE = CURRENT_YEAR - YEAR_OF_BIRTH;
	private static final int ETALONE_AGE_1 = CURRENT_YEAR - YEAR_OF_BIRTH - 1;

	private User user;
	private Date dateOfBirthd;

	protected void setUp() throws Exception {
		super.setUp();
		user = new User();
	}

	// Test 1
	public void testGetAge() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DAY_OF_BIRTH);
		dateOfBirthd = calendar.getTime();
		user.setDateOfBirth(dateOfBirthd);
		assertEquals(ETALONE_AGE, user.getAge());
	}

	// Test 2
	public void testGetAge1() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH_1, DAY_OF_BIRTH_1);
		dateOfBirthd = calendar.getTime();
		user.setDateOfBirth(dateOfBirthd);
		assertEquals(ETALONE_AGE_1+1, user.getAge());
	}

	// Test 3
	public void testGetAge2() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DAY_OF_BIRTH);
		dateOfBirthd = calendar.getTime();
		user.setDateOfBirth(dateOfBirthd);
		assertEquals(ETALONE_AGE, user.getAge());
	}

	// Test 4
	public void testGetAge3() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DAY_OF_BIRTH);
		dateOfBirthd = calendar.getTime();
		user.setDateOfBirth(dateOfBirthd);
		assertEquals(ETALONE_AGE, user.getAge());
	}

	// Test 5
	public void testGetAge4() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(YEAR_OF_BIRTH, MONTH_OF_BIRTH, DAY_OF_BIRTH);
		dateOfBirthd = calendar.getTime();
		user.setDateOfBirth(dateOfBirthd);
		assertEquals(ETALONE_AGE, user.getAge());
	}

	public void testGetFullName() {
		user.setFirstName("Obito");
		user.setLastName("Uchiha");
		assertEquals("Obito Uchiha", user.getFullName());
	}
}