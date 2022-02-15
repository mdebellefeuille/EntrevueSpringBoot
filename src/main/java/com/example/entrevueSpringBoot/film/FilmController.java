package com.example.entrevueSpringBoot.film;

import static org.springframework.http.HttpStatus.CREATED;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class FilmController {

	private final FilmService service;

	@GetMapping("/api/film/{id}")
	public Film getFilm(@PathVariable Long id) {
		return service.getFilm(id);
	}

	@PostMapping("/api/film")
	@ResponseStatus(code = CREATED)
	public Film postFilm(@RequestBody FilmDTO film) {
		return service.postFilm(film);
	}
}
