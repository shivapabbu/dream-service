package com.dream.service;

import com.dream.model.CrickInfo;
import com.dream.model.Player;
import com.dream.model.Team;
import com.dream.repo.CrickInfoRepo;
import com.dream.repo.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DreamService {

    @Autowired
    private TeamRepo teamRepo;

    @Autowired
    private CrickInfoRepo infoRepo;

    public Team saveDreamTeam(Team dreamTeam) {

        return teamRepo.save(dreamTeam);
    }

    public Team getTeamInfo(String teamId) {

        return teamRepo.findByTeamId(teamId);
    }

    private void helper(List<int[]> combinations, int data[], int start, int end, int index) {
        if (index == data.length) {
            int[] combination = data.clone();
            combinations.add(combination);
        } else if (start <= end) {
            data[index] = start;
            helper(combinations, data, start + 1, end, index + 1);
            helper(combinations, data, start + 1, end, index);
        }
    }


    public List<Team> getAllTeams() {
        return teamRepo.findAll();
    }

    public void removeTeam(String teamId) {
        teamRepo.deleteById(teamId);
    }

    public void saveCrickInfo(CrickInfo crickInfo) {

        infoRepo.save(crickInfo);
    }
}
