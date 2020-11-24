package _04_hospital;

import java.util.ArrayList;

public class Surgeon extends Doctor {
	protected ArrayList<Patient> p = new ArrayList<Patient>();
	
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
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
	public ArrayList<Patient> getPatients() {
		return p;
	}
	public void doMed() {
		for(int i = 0; i < p.size(); i++) {
			p.get(i).checkPulse();
		}
	}
}