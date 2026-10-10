package com.hospital.appliccation.PatientManagementSystem.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.appliccation.PatientManagementSystem.Service.PatientService;
import com.hospital.appliccation.PatientManagementSystem.Service.dto.PatientResponseDTO;

@RestController
@RequestMapping("/hospital")
public class PatientController {
	
	private  PatientService patientService;
	
	public PatientController(PatientService patientService)
	{
		this.patientService=patientService;
	}
	
	@GetMapping("/patients")
	public List<PatientResponseDTO> getpatientDetails()
	{
		List<PatientResponseDTO> res = patientService.getPatients();
		return res;
	}

}
