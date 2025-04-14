package org.example.activite2_mapping1.service;

import jakarta.transaction.Transactional;
import org.example.activite2_mapping1.entities.Consultation;
import org.example.activite2_mapping1.entities.Medecin;
import org.example.activite2_mapping1.entities.Patient;
import org.example.activite2_mapping1.entities.RendezVous;
import org.example.activite2_mapping1.repositories.ConsultationRepository;
import org.example.activite2_mapping1.repositories.MedecinRepository;
import org.example.activite2_mapping1.repositories.PatientRepository;
import org.example.activite2_mapping1.repositories.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class HospitalServiceImpl implements HospitalService {
    private  PatientRepository patientRepository;

    private  ConsultationRepository consultationRepository;

    private  MedecinRepository medecinRepository;

    private  RendezVousRepository rendezVousRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, ConsultationRepository consultationRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository) {
        this.patientRepository = patientRepository;
        this.consultationRepository = consultationRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
