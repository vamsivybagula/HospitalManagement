package com.hospital.appliccation.PatientManagementSystem.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hospital.appliccation.PatientManagementSystem.Repository.PatientRepository;
import com.hospital.appliccation.PatientManagementSystem.Service.dto.PatientResponseDTO;
import com.hospital.appliccation.PatientManagementSystem.Service.mapper.PatientMapper;
import com.hospital.appliccation.PatientManagementSystem.model.Patient;

@Service
public class PatientService {
	
	private PatientRepository patientRepository;

	public PatientService(PatientRepository patientRepository) {
		this.patientRepository = patientRepository;
	}
	
	public List<PatientResponseDTO> getPatients()
	{
		List<Patient> patients = patientRepository.findAll();
		return  patients.stream().map(PatientMapper::toDO).toList();

	}
	

}
