package com.example.entrevueSpringBoot.film;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.val;

@Service
@RequiredArgsConstructor
public class FilmServiceImpl implements FilmService {

	private final FilmRepository repository;
	private final FilmConverter converter;

	@Override
	public Film getFilm(Long id) {

		return repository.findById(id)
				.orElse(null);
	}

	@Override
	public Film postFilm(FilmDTO filmDTO) {

		val entity = converter.convertFilmDTO(filmDTO);

		return repository.save(entity);
	}

}
