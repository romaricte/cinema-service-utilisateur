package cm.cti.cinema.serviceutilisateur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import cm.cti.cinema.serviceutilisateur.models.Administrateur;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur, Long>{
	
}
