package com.management.mapper;

import com.management.dto.PatientResponseDTO;
import com.management.model.Patient;

public class PatientMapper {
	
	public static PatientResponseDTO toDTO(Patient patient) {
		PatientResponseDTO patientDTO=new PatientResponseDTO();
		patientDTO.setId(patient.getId().toString());
		patientDTO.setEmail(patient.getEmail());
		patientDTO.setName(patient.getName());
		patientDTO.setAddress(patient.getAddress());
		patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());
		
		return patientDTO;
	}

}
