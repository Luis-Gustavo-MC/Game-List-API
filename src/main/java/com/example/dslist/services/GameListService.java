package com.example.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dslist.DTO.GameListDTO;
import com.example.dslist.entities.GameList;
import com.example.dslist.repositories.GameListRepository;
//Registro do serviço para o spring
@Service
public class GameListService {
	@Autowired
	private GameListRepository gameListRepository;
	
	//Boa Pratica em classes service
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x-> new GameListDTO(x)).toList();
	}
	
}
