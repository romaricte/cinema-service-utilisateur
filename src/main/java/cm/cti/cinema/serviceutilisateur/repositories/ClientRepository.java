package cm.cti.cinema.serviceutilisateur.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import cm.cti.cinema.serviceutilisateur.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
	List<Client> findByIsValid(boolean isValid);
}
