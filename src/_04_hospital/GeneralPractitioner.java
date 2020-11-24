package _04_hospital;

import java.util.ArrayList;

public class GeneralPractitioner {

	protected ArrayList<Patient> p = new ArrayList<Patient>();
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}
	public void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
		if(p.size()>3) {
			System.out.println("Full on patients");
		}
		else {
			p.add(patient);
		}
	}
}
