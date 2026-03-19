package com.cg.assignment_DTO.service;

import java.util.List;

import com.cg.assignment_DTO.dto.TraineeDTO;

public interface ITraineeService{
	
	public List<TraineeDTO> getAllTrainees();
	public TraineeDTO getTrainee(int id);
	public String deleteTrainee(int id);
	public TraineeDTO insertTrainee(TraineeDTO dto);
	public String updateTrainee(TraineeDTO dto);
	
}
