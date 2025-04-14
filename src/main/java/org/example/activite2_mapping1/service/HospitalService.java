package org.example.activite2_mapping1.service;

import org.example.activite2_mapping1.entities.Consultation;
import org.example.activite2_mapping1.entities.Medecin;
import org.example.activite2_mapping1.entities.Patient;
import org.example.activite2_mapping1.entities.RendezVous;

public interface HospitalService {
     Patient savePatient(Patient patient);
     Medecin saveMedecin(Medecin medecin);
     RendezVous saveRDV(RendezVous rendezVous);
     Consultation saveConsultation(Consultation consultation);

}
