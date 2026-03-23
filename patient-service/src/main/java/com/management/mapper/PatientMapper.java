package com.management.mapper;

import java.time.LocalDate;

import com.management.dto.PatientRequestDTO;
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
	

	public static Patient toModel(PatientRequestDTO patientRequestDTO) {
		Patient patient = new Patient();
		patient.setName(patientRequestDTO.getName());
		patient.setEmail(patientRequestDTO.getEmail());
		patient.setAddress(patientRequestDTO.getAddress());
		patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
		patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));
		
		return patient;
		
		
	}
}
