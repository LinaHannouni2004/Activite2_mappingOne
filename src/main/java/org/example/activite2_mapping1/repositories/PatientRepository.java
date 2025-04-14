package org.example.activite2_mapping1.repositories;

import org.example.activite2_mapping1.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
Patient findByNom(String name);

}
