package org.example.activite2_mapping1.repositories;

import org.example.activite2_mapping1.entities.Consultation;
import org.example.activite2_mapping1.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {

}
