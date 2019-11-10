package br.star.api.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.star.api.rest.repository.PlanetaRepository;
import model.Planeta;

@Service
public class ServiceImpl {
	
	@Autowired
	private PlanetaRepository planetaRepository;


	public List<Planeta> buscarTodosOsPlanetas(){ 
	List<Planeta> listPlaneta = planetaRepository.findAll();
	return listPlaneta;
}
	
}
