package eus.birt.dam.alvarez_martinez_david_AD07_TaEv2.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eus.birt.dam.alvarez_martinez_david_AD07_TaEv2.domain.Farmacias;
import eus.birt.dam.alvarez_martinez_david_AD07_TaEv2.domain.Properties;
import eus.birt.dam.alvarez_martinez_david_AD07_TaEv2.repository.FarmaciaRepository;

@CrossOrigin (origins= {"http://localhost:4200"})
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class FarmaciaController {

	
	@Autowired
	FarmaciaRepository farmaciaRepository;
	
	
	
	/**
	 * Endpoint principal de farmacias.Devuelve todas las farmacias de euskadi
	 * @return
	 */
	@GetMapping("/farmacias")
	public ResponseEntity<List<Farmacias>> index() {
	    try {
	        List<Farmacias> farmacias = farmaciaRepository.findAll();
	        return new ResponseEntity<List<Farmacias>>(farmacias, HttpStatus.OK);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<List<Farmacias>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
		

	/**
	 * Endpoint devuelve todas las farmacias de un municipio
	 * @return
	 */
	
	@GetMapping("/municipios/{name}")
	public ResponseEntity<List<Farmacias>> showByName (@PathVariable("name") String name) {
		
		 try {
		        List<Farmacias> farmacias = farmaciaRepository.findAll();
		        List<Farmacias> farmaciaMunicipios = new ArrayList<Farmacias>();
		        
		        for (int i= 0; i<farmacias.size();i++) {
		        	
		        	String temp = farmacias.get(i).getProperties().getUdalerria();
		        	        	
		        	if(temp.equalsIgnoreCase(name)) {
		        	farmaciaMunicipios.add(farmacias.get(i));	
		        	}			        			        			        		
		        }
		        
		        return new ResponseEntity<List<Farmacias>>(farmaciaMunicipios, HttpStatus.OK);
		        		       
		    } catch (Exception e) {
		        e.printStackTrace();
		       return new ResponseEntity<List<Farmacias>>(HttpStatus.INTERNAL_SERVER_ERROR);
		    }
		
	}
	

	/**
	 * Endpoint devuelve el telefono de la farmacia solicitada
	 * @return
	 */
	
	@GetMapping("/telefono/{name}")
	public ResponseEntity<List<String>> telefono(@PathVariable("name") String name) {
	    try {
	        List<Farmacias> farmacias = farmaciaRepository.findAll();
	        List<String> farmaciaTelf = new ArrayList<String>();
	        
	        for (int i= 0; i<farmacias.size();i++) {
	        	
	        	String temp = farmacias.get(i).getProperties().getTitularra1();
	        	        	
	        	if(temp.equalsIgnoreCase(name)) {
	        	farmaciaTelf.add(farmacias.get(i).getProperties().getTelefonoa());	
	        	}			        			        			        		
	        }
	        
	        return new ResponseEntity<List<String>>(farmaciaTelf, HttpStatus.OK);
	    } catch (Exception e) {
	        e.printStackTrace();
	        return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	}






