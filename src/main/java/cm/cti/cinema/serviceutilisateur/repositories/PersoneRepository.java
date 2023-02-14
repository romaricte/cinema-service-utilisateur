package cm.cti.cinema.serviceutilisateur.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import cm.cti.cinema.serviceutilisateur.models.Personne;

@Repository
public interface PersoneRepository extends JpaRepository<Personne, Long>{
	List<Personne> findByNom(String nom);
	List<Personne> findByEmail(String email);
	List<Personne> findByPrenom(String prenom);
}
