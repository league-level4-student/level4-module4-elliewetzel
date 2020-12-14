package _04_hospital;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.List;

import junit.framework.TestCase;

/* requirements:
 * 1. hospital has doctors and patients
 * 2. doctors can be GeneralPractictioner or Surgeon
 * 3. patients can be assigned to doctors
 * 4. doctors can have no more than 3 patients
 */

public class HospitalTest extends TestCase {

	Hospital testHospital = new Hospital();
//something wrong here
	public void testAddDoctor() {
		testHospital.addDoctor(new GeneralPractitioner());
		testHospital.addDoctor(new GeneralPractitioner());
		testHospital.addDoctor(new Surgeon());
		assertEquals(3, testHospital.getDoctors().size());
	}

	public void testAddPatient() throws Exception {
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		testHospital.addPatient(new Patient());
		assertEquals(3, testHospital.getPatients().size());
	}

	/* Fix asserts one at a time */
	public void testDoctorsHaveSpecialties() throws Exception {
		Doctor testDoctor = new Doctor();
		assertEquals(false, testDoctor.performsSurgery());

		Doctor testSurgeon = new Surgeon();
		assertEquals(true, testSurgeon.performsSurgery());

		GeneralPractitioner testGP = new GeneralPractitioner();
		assertEquals(true, testGP.makesHouseCalls());
		assertEquals(false, testSurgeon.makesHouseCalls());
		assertEquals(false, testDoctor.makesHouseCalls());
	}

	/* A doctor has a list of patients */
	public void testAssignDoctor() throws Exception {
		//check out variable type
		//re-read input before method
		Doctor testDoctor = new Doctor(); /*GeneralPractitioner();*/
		testDoctor.assignPatient(new Patient());
		assertEquals(1, testDoctor.getPatients().size());
		testDoctor.assignPatient(new Patient());
		assertEquals(2, testDoctor.getPatients().size());
		testDoctor.assignPatient(new Patient());
		assertEquals(3, testDoctor.getPatients().size());
	}

	/* When you check a patient's pulse, they feel cared for */
	public void testCheckPulse() throws Exception {
		Patient testPatient = new Patient();
		assertEquals(false, testPatient.feelsCaredFor());
		testPatient.checkPulse();
		assertEquals(true, testPatient.feelsCaredFor());
	}

	/* Doctors work on their Patients by checking their pulses. */
	public void testDoctorsWork() throws Exception {
		Doctor testDoctor = new Doctor(); /*GeneralPractitioner();*/
		Patient max = new Patient();
		Patient macky = new Patient();
		testDoctor.assignPatient(max);
		testDoctor.assignPatient(macky);
		assertEquals(false, max.feelsCaredFor());
		assertEquals(false, macky.feelsCaredFor());
		testDoctor.doMed();
		assertEquals(true, max.feelsCaredFor());
		assertEquals(true, macky.feelsCaredFor());
	}

	/* test calling assignPatient when doctor is full throws exception */
	public void testDoctorsCanOnlyHandle3Patients() throws Exception {
		Doctor testDoctor = new Doctor();
		testDoctor.assignPatient(new Patient());
		testDoctor.assignPatient(new Patient());
		testDoctor.assignPatient(new Patient());
		try {
			testDoctor.assignPatient(new Patient());
			assertTrue(false);
		} catch (DoctorFullException dfe) {
			assertTrue(true);
		}
assertTrue(testDoctor.getPatients().size() == 3);
	}

	public void test8Patients() throws Exception {
		// TODO: add 3 doctors to hospital
		Doctor one = new Doctor();
		Doctor two = new Doctor();
		Doctor three = new Doctor();
		
		testHospital.addDoctor(one);
		testHospital.addDoctor(two);
		testHospital.addDoctor(three);
		// TODO: add 8 patients to hospital
		Patient pat1 = new Patient();
		Patient pat2 = new Patient();
		Patient pat3 = new Patient();
		Patient pat4 = new Patient();
		Patient pat5 = new Patient();
		Patient pat6 = new Patient();
		Patient pat7 = new Patient();
		Patient pat8 = new Patient();
		
		testHospital.addPatient(pat1);
		testHospital.addPatient(pat2);
		testHospital.addPatient(pat3);
		testHospital.addPatient(pat4);
		testHospital.addPatient(pat5);
		testHospital.addPatient(pat6);
		testHospital.addPatient(pat7);
		testHospital.addPatient(pat8);
		// hospital assigns patients to doctors
		testHospital.assignPatientsToDoctors();
		// hospital.getDoctors shows doctors have 3, 3, 2 patients
		List<Doctor> testDoctors = testHospital.getDoctors();
		assertEquals(3, testDoctors.get(0).getPatients().size());
		assertEquals(3, testDoctors.get(1).getPatients().size());
		assertEquals(2, testDoctors.get(2).getPatients().size());
	}



}
