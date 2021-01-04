package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
ArrayList<Doctor> doc = new ArrayList<Doctor>(); 
ArrayList<Patient> pat = new ArrayList<Patient>(); 

public List<Doctor> getDoctors() {
	return doc;
}
public List<Patient> getPatients() {
	return pat;
}
public void addDoctor(GeneralPractitioner generalPractitioner) {
	doc.addAll(generalPractitioner);
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
public void addDoctor(Surgeon surgeon) {
	doc.addAll(surgeon);	
}
public void addDoctor(Doctor doctor) {
	doc.addAll(doctor);
}
}