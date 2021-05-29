package com.dream.controller;

import com.dream.model.CrickInfo;
import com.dream.model.Player;
import com.dream.model.Team;
import com.dream.service.DreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class DreamController {

    @Autowired
    private DreamService dreamService;

    @GetMapping("/getTeam/{teamId}")
    public Team getTeamInfo(@PathVariable String teamId){

        return dreamService.getTeamInfo(teamId);
    }

    @GetMapping("/deleteTeam/{teamId}")
    public void removeTeam(@PathVariable String teamId){

        dreamService.removeTeam(teamId);
    }

    @GetMapping("/getAllTeams")
    public List<Team> getAllTeams(){

        return dreamService.getAllTeams();
    }

    @PostMapping("/addTeam")
    public Team saveDreamTeam(@RequestBody Team dreamTeam){

        return dreamService.saveDreamTeam(dreamTeam);
    }

    @GetMapping("liveCrickInfo")
    public CrickInfo getCrickInfo(){
        String uri = "https://hs-consumer-api.espncricinfo.com/v1/pages/matches/current?latest=true";
        RestTemplate restTemplate = new RestTemplate();
        CrickInfo crickInfo = restTemplate.getForObject(uri, CrickInfo.class);
        crickInfo.setCrickInfoId("777");
        dreamService.saveCrickInfo(crickInfo);
        return crickInfo;

    }

}
