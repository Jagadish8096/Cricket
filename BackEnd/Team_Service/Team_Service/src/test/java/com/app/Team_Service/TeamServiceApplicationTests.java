package com.app.Team_Service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.Team_Service.Entity.Player;
import com.app.Team_Service.Entity.Team;
import com.app.Team_Service.Repository.PlayerRepository;
import com.app.Team_Service.Repository.TeamRepository;

@SpringBootTest
class TeamServiceApplicationTests {

	@Autowired
	private PlayerRepository playerRepo;
	@Autowired
	private TeamRepository teamRepo;
	
	
	//TESTCASES FOR TEAM
	@Test
	public void saveTeam()
	{
		Team team=new Team();
		team.setTeam_id(1);
		team.setTeamName("SRH");
		team.setTeamMaxBudget(5000);
		 teamRepo.save(team);
		
		 Assertions.assertThat(team.getTeam_id()).isGreaterThan(0);
		 Assertions.assertThat(team.getTeamMaxBudget()).isGreaterThanOrEqualTo(5000);
		 
		
	}
	
	
	//TESTCASES FOR PLAYER
	@Test
	public void savePlayer()
	{
		Player player=new Player();
		player.setPlayerId(1);
		player.setPlayerName("Abhi");;
		player.setPlayerBiddingBudget(100);
		player.setPlayerTeamName("SRH");
		playerRepo.save(player);
		
		 Assertions.assertThat(player.getPlayerId()).isGreaterThan(0);
		 Assertions.assertThat(player.getPlayerBiddingBudget()).isGreaterThanOrEqualTo(100).isLessThanOrEqualTo(5000);
		 
		
	}
}
