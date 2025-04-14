package org.example.activite2_mapping1.web;

import org.example.activite2_mapping1.entities.Patient;
import org.example.activite2_mapping1.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;
    @GetMapping("/patients")
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }
}
