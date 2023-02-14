package cm.cti.cinema.serviceutilisateur.controleurs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import cm.cti.cinema.serviceutilisateur.models.Personne;
import cm.cti.cinema.serviceutilisateur.repositories.PersoneRepository;

@RestController
@RequestMapping(value = "api/personne")
public class PersonneControleur {
	@Autowired
	private PersoneRepository personeRepository;
	
	@GetMapping ("/nom/{nom}")
	public List<Personne> findByNom(
			@PathVariable("nom") String nom) {
		return personeRepository.findByNom(nom);
	}


}