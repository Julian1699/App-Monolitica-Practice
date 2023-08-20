package com.uspring.USpring.Repository;

import com.uspring.USpring.Entity.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface personaRepository extends CrudRepository<Persona,Long> {
}
