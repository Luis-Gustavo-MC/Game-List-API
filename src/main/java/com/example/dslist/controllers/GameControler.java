package com.example.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dslist.DTO.GameMinDTO;
import com.example.dslist.entities.Game;
import com.example.dslist.repositories.GameRepository;

@RestController
@RequestMapping(value = "/games")
public class GameControler {
	@Autowired
	private GameRepository gameRepository;
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x-> new GameMinDTO(x)).toList();
		return dto;
	}
}	
