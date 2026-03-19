package com.cg.assignment_DTO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.assignment_DTO.dto.TraineeDTO;
import com.cg.assignment_DTO.service.TraineeService;

@RestController
@RequestMapping("/trainee")
public class TraineeController {
	
	@Autowired
	public TraineeService service;
	
	@GetMapping
	public ResponseEntity<List<TraineeDTO>> getAllTrainees(){
		
		List<TraineeDTO> dto = service.getAllTrainees();
		
		if(dto != null) {
			return new ResponseEntity<List<TraineeDTO>>(dto, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TraineeDTO> getTrainee(@PathVariable int id){
		
		TraineeDTO dto = service.getTrainee(id);
		
		if(dto != null) {
			return new ResponseEntity<TraineeDTO>(dto, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping
	public ResponseEntity<TraineeDTO> insertTrainee(@RequestBody TraineeDTO tr){
		TraineeDTO dto = service.insertTrainee(tr);
		
		if(dto != null) {
			return new ResponseEntity<TraineeDTO>(dto, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteTrainee(@PathVariable int id){
		String dto = service.deleteTrainee(id);
		if(dto != "") {
			return new ResponseEntity<String>(dto, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping
	public ResponseEntity<String> updateTrainee(@PathVariable int id){
		String dto = service.deleteTrainee(id);
		if(dto != "") {
			return new ResponseEntity<String>(dto, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<List<TraineeDTO>> getTraineeByName(@PathVariable() String name){
		List<TraineeDTO> dto = service.getAllTrainees();
		
		if(dto != null) {
			return new ResponseEntity<List<TraineeDTO>>(dto, HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	

}
