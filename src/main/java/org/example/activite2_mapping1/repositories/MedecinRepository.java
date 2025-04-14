package org.example.activite2_mapping1.repositories;

import org.example.activite2_mapping1.entities.Medecin;
import org.example.activite2_mapping1.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
Medecin findByNom(String name);
}
