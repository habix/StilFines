package se.stil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import se.stil.models.Violation;

@Repository
public interface ViolationRepository extends JpaRepository<Violation, Long> {
}