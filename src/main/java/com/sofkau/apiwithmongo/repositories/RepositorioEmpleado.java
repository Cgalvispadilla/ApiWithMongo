package com.sofkau.apiwithmongo.repositories;

import com.sofkau.apiwithmongo.models.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioEmpleado extends MongoRepository<Empleado, String> {
}
