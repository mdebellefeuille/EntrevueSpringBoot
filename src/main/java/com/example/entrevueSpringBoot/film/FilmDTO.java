package com.example.entrevueSpringBoot.film;

import java.util.List;

import lombok.Data;

@Data
public class FilmDTO {

	private String titre;

	private String description;

	private List<ActeurDTO> acteurs;

}
