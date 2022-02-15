package com.example.entrevueSpringBoot.film;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Acteur {

	@Id
	@Include
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String nom;

	private String prenom;

}
