package com.example.dslist.DTO;

import com.example.dslist.entities.Game;

import com.example.dslist.projections.GameMinProjection;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}
	public GameMinDTO(Game entivy) {
		this.id = entivy.getId();
		this.title = entivy.getTitle();
		this.year = entivy.getYear();
		this.imgUrl = entivy.getImgUrl();
		this.shortDescription = entivy.getShortDescription();
	}
	public GameMinDTO(GameMinProjection projection) {
		this.id = projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getYear();
		this.imgUrl = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();
	}
	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Integer getYear() {
		return year;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	
}
