package com.hospital.appliccation.PatientManagementSystem.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.appliccation.PatientManagementSystem.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID>{
	

}
