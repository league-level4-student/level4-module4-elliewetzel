package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
/*	protected ArrayList<Doctor> doc = new ArrayList<Doctor>();
	protected ArrayList<Patient> pat = new ArrayList<Patient>();

	public void addDoctor(Doctor d) {
	doc.add(d);
	}
	/*public void addDoctor(GeneralPractitioner generalPractitioner) {
		doc.add(generalPractitioner);
	}*/
	
	/*public void addPatient(Patient patient) {
		
			pat.add(patient);
	}	

	public List<Doctor> getDoctors() {
		return doc;
	}

	public List<Patient> getPatients() {
		return pat;
	}

	public void assignPatientsToDoctors() throws DoctorFullException {
		int patIndex = 0;
		for (int i = 0; i < doc.size(); i++) {
			while (patIndex<pat.size()) {
				if(doc.get(i).getPatients().size()<3) {
				doc.get(i).assignPatient(pat.get(patIndex));
				patIndex++;
				}
				else {
					break;
				}
			}
		}
	}
}*/

ArrayList<Doctor> doc = new ArrayList<Doctor>(); 
ArrayList<Patient> pat = new ArrayList<Patient>(); 
public void addDoctor(Doctor d) {
	doc.add(d);
}
public List<Doctor> getDoctors() {
	return doc;
}
public List<Patient> getPatients() {
	return pat;
}
public void addPatient(Patient patient) {
	pat.add(patient);
	
}
public void assignPatientsToDoctors() {
	for (int i = 0; i < pat.size(); i++) {
		for(int j = 0; j < doc.size(); j++) {
			try {
				doc.get(j).assignPatient(pat.get(i));
				break;
			} catch (DoctorFullException e) {
			}
		}
	}
	}
}