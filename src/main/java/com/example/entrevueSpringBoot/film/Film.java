package com.example.entrevueSpringBoot.film;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.EqualsAndHashCode.Include;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@AllArgsConstructor()
@NoArgsConstructor
public class Film {

	@Id
	@Include
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String titre;

	private String description;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Acteur> acteurs;

}
