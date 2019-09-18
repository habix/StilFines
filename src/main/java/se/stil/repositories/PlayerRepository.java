package se.stil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se.stil.models.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
	
}