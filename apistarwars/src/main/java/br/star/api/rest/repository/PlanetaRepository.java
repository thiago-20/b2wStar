package br.star.api.rest.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import br.star.api.resource.model.PlanetaResource;
import model.Planeta;


public interface PlanetaRepository extends  MongoRepository<Planeta, ObjectId>{

	Optional<Planeta> findById(ObjectId _id);

	Optional<Planeta> deleteById(Long id);

	void save(PlanetaResource planeta);

	
	


	
}
