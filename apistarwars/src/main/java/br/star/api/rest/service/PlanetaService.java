package br.star.api.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.star.api.rest.repository.PlanetaRepository;
import model.Planeta;

@Service
public class PlanetaService {
	
	@Autowired
	private PlanetaRepository planetaRepository;

	public void cadastro(Planeta planeta) {
		planetaRepository.save(planeta);
	
	}
}
