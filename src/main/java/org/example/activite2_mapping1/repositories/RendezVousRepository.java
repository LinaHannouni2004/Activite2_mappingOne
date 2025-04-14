package org.example.activite2_mapping1.repositories;

import org.example.activite2_mapping1.entities.Patient;
import org.example.activite2_mapping1.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {

}
