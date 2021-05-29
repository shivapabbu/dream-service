package com.dream.repo;

import com.dream.model.Player;
import com.dream.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepo extends MongoRepository<Team, String> {

    Team findByTeamId(String teamId);


}
