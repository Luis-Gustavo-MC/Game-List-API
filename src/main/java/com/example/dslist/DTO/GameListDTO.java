package com.example.dslist.DTO;

import com.example.dslist.entities.GameList;

public class GameListDTO {
	public Long id;
	public String name;
	
	public GameListDTO() {
		
	}

	public GameListDTO(GameList entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}
}
