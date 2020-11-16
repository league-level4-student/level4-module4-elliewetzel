package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	protected ArrayList<Doctor> doc = new ArrayList<Doctor>();
	protected ArrayList<Patient> pat = new ArrayList<Patient>();
	
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
			doc.add(doctor);
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
			pat.add(patient);
	}

	

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doc;
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return pat;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		// TODO Auto-generated method stub
		int patIndex = 0;
		for (int i = 0; i < doc.size(); i++) {
			while (patIndex<pat.size()) {
				if(doc.get(i).getPatients().size()<3) {
				doc.get(i).assignPaitent(pat.get(patIndex));
				patIndex++;
				}
				else {
					break;
				}
			}
		}
	}
}
