package com.example.entrevueSpringBoot.film;

public interface FilmService {

	Film getFilm(Long id);

	Film postFilm(FilmDTO film);

}
