package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	protected ArrayList<Patient> p = new ArrayList<Patient>();
	
	public boolean performsSurgery() {
		return false;
	}
	public boolean makesHouseCalls() {
		return false;
	}
	public void assignPatient(Patient patient) throws DoctorFullException{
		if(p.size()>=3) {
			throw new DoctorFullException();
			
		}
		else {
			p.add(patient);
		}
	}
	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return p;
	}

	public void doMed() {
		// TODO Auto-generated method stub
		for (int i = 0; i < p.size(); i++) {
			p.get(i).checkPulse();
		}
	}
	
}
