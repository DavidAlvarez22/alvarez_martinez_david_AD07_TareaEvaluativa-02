package eus.birt.dam.alvarez_martinez_david_AD07_TaEv2.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import eus.birt.dam.alvarez_martinez_david_AD07_TaEv2.domain.Farmacias;
import eus.birt.dam.alvarez_martinez_david_AD07_TaEv2.domain.Properties;

public interface FarmaciaRepository extends MongoRepository<Farmacias, String>{

}
