package se.stil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se.stil.models.Fine;

@Repository
public interface FineRepository extends JpaRepository<Fine, Long> {
	
}