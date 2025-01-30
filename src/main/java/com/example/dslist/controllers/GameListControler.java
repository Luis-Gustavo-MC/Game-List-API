package com.example.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dslist.DTO.GameDTO;
import com.example.dslist.DTO.GameListDTO;
import com.example.dslist.DTO.GameMinDTO;
import com.example.dslist.services.GameListService;
import com.example.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListControler {
	@Autowired
	private GameListService gameListService;

	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameListDTO> findAll(){
		return gameListService.findAll();
	}
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		return gameService.findByList(listId);
	}
}	
