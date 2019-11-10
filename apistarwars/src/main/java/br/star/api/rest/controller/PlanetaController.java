package br.star.api.rest.controller;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.star.api.resource.model.PlanetaResource;
import br.star.api.rest.repository.PlanetaRepository;
import br.star.api.rest.service.ServiceImpl;
import model.Planeta;


@RestController
@RequestMapping(value = "/api")
public class PlanetaController {
	@Autowired
	private PlanetaRepository planetaRepository;
	
	@Autowired
	private ServiceImpl serviceBuscar;
	
	
	@GetMapping(path = "/planetas")
	public List<Planeta> buscarPlanetas() {
		
		return serviceBuscar.buscarTodosOsPlanetas();
	}
	
	@GetMapping(path = "/planeta/id/{_id}")
	public Optional<Planeta> buscarPorId(@PathVariable(name = "_id", required = true) ObjectId id) {
		
		return planetaRepository.findById(id);
	}
	
	@PostMapping(path = "/planeta/save")
	public void salvarPlaneta(@RequestBody PlanetaResource planeta) {
		planetaRepository.save(planeta);
	}

	@DeleteMapping(path = "/planeta/delete/{id}")
	public void deletePlaneta(@PathVariable (name = "id", required = true) Long id){
		planetaRepository.deleteById(id);
	}

}