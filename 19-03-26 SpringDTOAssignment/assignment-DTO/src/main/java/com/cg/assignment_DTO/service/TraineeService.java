package com.cg.assignment_DTO.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.assignment_DTO.dao.TraineeJpaRepository;
import com.cg.assignment_DTO.dto.EntityMapper;
import com.cg.assignment_DTO.dto.TraineeDTO;
import com.cg.assignment_DTO.entity.Trainee;

@Service
public class TraineeService implements ITraineeService{
	
	@Autowired
	private TraineeJpaRepository repo;

	@Override
	public List<TraineeDTO> getAllTrainees() {
		
		List<Trainee> t = repo.findAll();
		List<TraineeDTO> dto = new ArrayList<TraineeDTO>();
		
		t.forEach(e -> dto.add(EntityMapper.toDTO(e)));
		
		return dto;
	}

	@Override
	public TraineeDTO getTrainee(int id) {
		Optional<Trainee> op = repo.findById(id);

	    if (op.isPresent()) {
	        return EntityMapper.toDTO(op.get());
	    } else {
	        return null;
	    }
	}

	@Override
	public String deleteTrainee(int id) {
		repo.deleteById(id);
		return "Trainee Deleted";
	}

	@Override
	public TraineeDTO insertTrainee(TraineeDTO t) {
		// TODO Auto-generated method stub
		
		Trainee trainee =  repo.saveAndFlush(EntityMapper.toEntity(t));
		return EntityMapper.toDTO(trainee);
	}

	@Override
	public String updateTrainee(TraineeDTO dto) {
		repo.saveAndFlush(EntityMapper.toEntity(dto));
		
		return "Trainee Updated!";
	}
	
	public List<TraineeDTO> getByName(String name){
	 	List<Trainee> t = repo.findByTraineeName(name);
	 	List<TraineeDTO> dto = new ArrayList<TraineeDTO>();
	 	
	 	t.forEach(e -> dto.add(EntityMapper.toDTO(e)));
	 	
	 	return dto;
		
	}

	
}
