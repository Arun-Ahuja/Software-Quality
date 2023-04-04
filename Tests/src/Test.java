import static org.junit.Assert.*;
import org.junit.Test;


import org.junit.Test;


public class Test {
	
	@Test

	public  void testdateobj()
	
		{ 
		DateObj t1 = new DateObj(2020,11,29); //  print valid next date
		DateObj t2 = new DateObj(2021,2,28); // changes to the next month i.e march month 2021 is not leap year
		DateObj t3 = new DateObj(2018,12,31); // changes to the next year
		DateObj t4 = new DateObj(2018,5,20); 
		DateObj t5 = new DateObj(2020,5,35); // invalid date
		DateObj t6 = new DateObj(2020,5,31);
		DateObj t7 = new DateObj(2019,10,-2);
		DateObj t8 = new DateObj(2005,13,30); // invalid month
		DateObj t9 = new DateObj(2006,-1,30);
		DateObj t18 = new DateObj(2020,2,28);
		DateObj t20 = new DateObj(1992,2,28);
		DateObj t22 = new DateObj(1600,2,28); // valid date, leap year
		DateObj t24 = new DateObj(1800,2,28);
		// DateObj t25 = new DateObj(-1,12,31);   //call invalid year
		
		
		assertEquals(t1.nextDate().toString());
		assertEquals(t2.nextDate().toString());
		assertEquals(t3.nextDate().toString());
		assertEquals(t4.nextDate().toString());
		assertEquals(t18.nextDate().toString());
		assertEquals(t20.nextDate().toString());
		assertEquals(t22.nextDate().toString());
		assertEquals(t24.nextDate().toString());
	
		
	}

	private void assertEquals(String string) {
		// TODO Auto-generated method stub
		
	}

}
