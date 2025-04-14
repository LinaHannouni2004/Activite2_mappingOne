package org.example.activite2_mapping1;

import lombok.Builder;
import org.example.activite2_mapping1.entities.*;
import org.example.activite2_mapping1.repositories.ConsultationRepository;
import org.example.activite2_mapping1.repositories.MedecinRepository;
import org.example.activite2_mapping1.repositories.PatientRepository;
import org.example.activite2_mapping1.repositories.RendezVousRepository;
import org.example.activite2_mapping1.service.HospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class Activite2Mapping1Application  {

    public static void main(String[] args) {
        SpringApplication.run(Activite2Mapping1Application.class, args);
    }
@Bean
   CommandLineRunner start(HospitalService hospitalService, PatientRepository patientRepository, RendezVousRepository rendezVousRepository, MedecinRepository medecinRepository) {

        return args -> {
            Stream.of("Mohammed","Hassan","Najat")
                    .forEach(name -> {
                        Patient patient = new Patient();
                        patient.setNom(name);
                        patient.setDateNaissance(new Date());
                        patient.setMalade(false);
                        hospitalService.savePatient(patient);

                    });
            Stream.of("aymane","Hassan","Najat")
                    .forEach(name -> {
                       Medecin medecin = new Medecin();
                       medecin.setNom(name);
                       medecin.setSpecialite(Math.random()>0.5?"cardio":"Dentist");
                       medecin.setEmail(name + "@gmail.com");
                       hospitalService.saveMedecin(medecin);

                    });

Patient patient = patientRepository.findById(1L).orElse(null);
Patient patient1 = patientRepository.findByNom("Mohamed");


            Medecin medecin = medecinRepository.findByNom("hassan");

            RendezVous rendezVous =new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.CANCELLED);
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient);
            RendezVous savedRDV=hospitalService.saveRDV(rendezVous);
            System.out.println(savedRDV.getId());

            RendezVous rendezVous1 =rendezVousRepository.findById(1L).orElse(null);
            Consultation consultation = new Consultation();
            consultation.setDateConsultation(rendezVous1.getDate());
            consultation.setRendezVous(rendezVous1);
            consultation.setRapport("Rapport");
            hospitalService.saveConsultation(consultation);
        };
   }
}
