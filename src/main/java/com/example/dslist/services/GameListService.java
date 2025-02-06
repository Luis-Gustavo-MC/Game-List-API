package com.example.dslist.services;

import java.util.List;

import com.example.dslist.projections.GameMinProjection;
import com.example.dslist.repositories.GameRepository;
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
	@Autowired
	private GameRepository gameRepository;
	//Boa Pratica em classes service
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x-> new GameListDTO(x)).toList();
	}
	@Transactional
	public void move(Long listId,  int sourceIndex, int destinationIndex){
		List<GameMinProjection> list = gameRepository.searchByList(listId);

		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex,obj);
		int min = sourceIndex< destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		for (int i = min; i<=max ; i++){
			gameListRepository.updateBelogingPosition(listId,list.get(i).getId(),i);
		}
	}
}
