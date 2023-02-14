package cm.cti.cinema.serviceutilisateur.controleurs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cm.cti.cinema.serviceutilisateur.models.Client;
import cm.cti.cinema.serviceutilisateur.repositories.ClientRepository;

@RestController
@RequestMapping(value = "api/client")
public class ClientControleur {
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping
	public List<Client> findAllclient() {
		return clientRepository.findAll();
	}
	
	@GetMapping("/all")
	public List<Client> findAllClient2() {
		return clientRepository.findAll();
	}
	
	@PostMapping
	public Client create(
			@RequestBody Client client
			){
		client.setId(null);
		
		if(client.getPersonne().getNom().length() < 4) return null;
		
		clientRepository.save(client);
		return client;
	}
	
	@GetMapping("/{id}")
	public Client findById(
			@PathVariable("id") Long id
			) {
		return clientRepository.findById(id).get();
	}
	
	@DeleteMapping("/{id}")
	public String delete(
			@PathVariable("id") Long id
			) {
		Client client = clientRepository.findById(id).get();
		clientRepository.delete(client);
		return "OK";
	}
	
	@GetMapping("/valid/{isValid}")
	public List<Client> findByIsValid(
			@PathVariable("isValid") boolean isValid){
		return clientRepository.findByIsValid(isValid);
	}
		
}
