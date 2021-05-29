package com.dream.info;

import lombok.Data;

import java.util.List;

@Data
public class TeamInfo {

    public Teams team;
    public boolean isHome;
    public boolean isLive;
    public String score;
    public String scoreInfo;
    public List<Integer> inningNumbers;
    public Object points;
    public Object sidePlayers;
    public Object sideBatsmen;
    public Object sideFielders;
    public Object captain;
    public TeamOdds teamOdds;
}
