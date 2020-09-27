package _01_introduction_to_encapsulation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//items received
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	int itemsReceivedGet() {
		return itemsReceived;
	}
	void itemsReceivedSet(int items) {
		if(items <= 0) {
			itemsReceived = 0;
			System.out.println("itemsReceived cannot be negative. It has been set to 0.");
		}
		else {
			itemsReceived = items;
		}
	}
	//degrees turned
	float degreesTurnedGet() {
		return degreesTurned;
	}
	void degreesTurnedSet(float degrees) {
		if(degrees <= 0) {
			degreesTurned = 0;
			System.out.println("degreesTurned cannot be negative. It has been set to 0.");
		}
		else if(degrees > 360){
			degreesTurned = 360;
			System.out.println("degreesTurned cannot be more than 360 degrees. It has been set to 360.");
		}
		else {
			degreesTurned = degrees;
		}
	}
	//nomenclature
	String nomenclatureGet() {
		return nomenclature;
	}
	void nomenclatureSet(String stuff) {
		if(stuff.equals("")) {
			nomenclature = " ";
			System.out.println("nomenclature cannot be blank. It has been set to a space.");
		}
		else {
			nomenclature = stuff;
		}
	}
	//member object
	Object memberObjGet() {
		return memberObj;
	}
	void memberObjSet(Object stuff) {
		if(stuff instanceof String) {
			memberObj = new Object();
			System.out.println("memberObject cannot be a string. It has been set to a new Object.");
		}
		else {
			memberObj = stuff;
		}
	}
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	@Test
	public void EncapTest() {
		EncapsulateTheData e = new EncapsulateTheData();
		e.itemsReceivedSet(-1);
		assertEquals(0,e.itemsReceivedGet());
		e.degreesTurnedSet(500);
		assertEquals(360, e.degreesTurnedGet());
		e.degreesTurnedSet(-1111111);
		assertEquals(0, e.degreesTurnedGet());
		e.nomenclatureSet("");
		assertEquals(" ", e.nomenclatureGet());
		e.memberObjSet("ea sports");
		assertFalse(e.memberObjGet() instanceof String);
	}
}