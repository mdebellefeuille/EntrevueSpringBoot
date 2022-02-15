package com.example.entrevueSpringBoot.film;

import static java.util.stream.Collectors.toList;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class FilmConverterImpl implements FilmConverter {

	@Override
	public Film convertFilmDTO(FilmDTO filmDTO) {

		return Film.builder()
				.description(filmDTO.getDescription())
				.titre(filmDTO.getTitre())
				.acteurs(buildActeurs(filmDTO.getActeurs()))
				.build();
	}

	private List<Acteur> buildActeurs(List<ActeurDTO> acteurDTOs) {

		return acteurDTOs.stream()
				.map(acteur -> Acteur.builder()
						.nom(acteur.getNom())
						.prenom(acteur.getPrenom())
						.build())
				.collect(toList());
	}

}
