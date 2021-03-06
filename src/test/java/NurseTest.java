import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NurseTest {

	Nurse testN = new Nurse("1", "TestN", true, null);
	
	@Test
	public void empIDshouldReturnNum() {
		String answer = testN.getEmpID();
		assertEquals(answer, "1"); 
		
	}

	@Test
	public void empIDNameReturnName() {
		String answer = testN.getEmpName();
		assertEquals(answer, "TestN"); 
		
	}
	
	@Test
	public void AvailableShouldReturnFalse() {
		testN.busy();
		boolean answer = testN.getIsAvailable();
		assertEquals(answer, false); 
		
	}
	
	@Test
	public void bloodLevelShouldReturn30() {
		testN.isBitten();
		int answer = testN.getBloodLevel();
		assertEquals(answer, 30); 
		
	}

	
	@Test
	public void BusyStatusShouldReturnSout() {
		testN.busyStatus();
		testN.busy();
		testN.busyStatus();
		
	}
}