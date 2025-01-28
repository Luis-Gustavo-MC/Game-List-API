package com.example.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dslist.DTO.GameDTO;
import com.example.dslist.DTO.GameMinDTO;

import com.example.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameControler {
	@Autowired
	private GameService gameService;
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
	@GetMapping(value = "/{id}")
	public GameDTO findAll(@PathVariable Long id){
		GameDTO result = (GameDTO) gameService.findById(id);
		return result;
	}
}	
