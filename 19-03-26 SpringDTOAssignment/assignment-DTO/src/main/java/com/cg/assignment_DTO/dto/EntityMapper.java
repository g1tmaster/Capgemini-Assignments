package com.cg.assignment_DTO.dto;

import com.cg.assignment_DTO.entity.Trainee;


public class EntityMapper {
	
	public static Trainee toEntity(TraineeDTO dto) {
		Trainee t = new Trainee();
		t.setTraineeId(dto.getTraineeId());
		t.setTraineeName(dto.getTraineeName());
		t.setTraineeDomain(dto.getTraineeDomain());
		t.setTraineeLocation(dto.getTraineeLocation());
		
		return t;
	}
	
	public static TraineeDTO toDTO(Trainee t) {
		TraineeDTO dto = new TraineeDTO();
		dto.setTraineeId(t.getTraineeId());
		dto.setTraineeName(t.getTraineeName());
		dto.setTraineeDomain(t.getTraineeDomain());
		dto.setTraineeLocation(t.getTraineeLocation());
		
		return dto;
	}

}
