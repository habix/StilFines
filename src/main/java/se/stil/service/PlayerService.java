package se.stil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.stil.models.Player;
import se.stil.repositories.PlayerRepository;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerRepository playerRepo;
	
	public List<Player> list(){
		return playerRepo.findAll();
	}

}
