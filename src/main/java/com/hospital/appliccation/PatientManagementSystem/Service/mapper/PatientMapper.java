package com.hospital.appliccation.PatientManagementSystem.Service.mapper;

import org.springframework.stereotype.Component;

import com.hospital.appliccation.PatientManagementSystem.Service.dto.PatientResponseDTO;
import com.hospital.appliccation.PatientManagementSystem.model.Patient;

@Component
public class PatientMapper {

	public static PatientResponseDTO toDO(Patient patient)
	{
		PatientResponseDTO patientResponseDTO =new PatientResponseDTO() ;
		
		patientResponseDTO.setId(patient.getId().toString());
		patientResponseDTO.setName(patient.getEmail());
		patientResponseDTO.setEmail(patient.getEmail());
		patientResponseDTO.setDateOfBirth(patient.getDOB().toString());
		
		return patientResponseDTO;
		
		
		
	}
}
