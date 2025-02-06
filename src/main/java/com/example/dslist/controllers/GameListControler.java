package com.example.dslist.controllers;

import java.util.List;

import com.example.dslist.DTO.ReplacementDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

/*	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
*/

	@GetMapping
	public List<GameListDTO> findAll(){
		return gameListService.findAll();
	}
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long listId){
		return gameService.findByList(listId);
	}

	@PostMapping(value = "/{listId}/replacement")
	public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
		gameListService.move(listId,body.getSourceIndex(),body.getDestinationIndex());
	}



}	
