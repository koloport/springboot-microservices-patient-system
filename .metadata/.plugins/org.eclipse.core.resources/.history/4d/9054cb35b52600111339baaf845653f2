package com.management.controlller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.dto.PatientRequestDTO;
import com.management.dto.PatientResponseDTO;
import com.management.service.PatientService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/patients")
public class PatientController {
	
	private final PatientService patientService;
	
	public PatientController(PatientService patientService) {
		this.patientService=patientService;
	}
	
	@GetMapping
	public ResponseEntity<List<PatientResponseDTO>> getPatients(){
		List<PatientResponseDTO> patients =patientService.getPatient();
		return ResponseEntity.ok().body(patients);
	}
	
	@PostMapping
	public ResponseEntity<PatientResponseDTO> createPatient(@Valid @RequestBody PatientRequestDTO 
			patientRequestDTO){
		PatientResponseDTO patientResponseDTO=patientService.createPatient(patientRequestDTO);
		return ResponseEntity.ok().body(patientResponseDTO);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
