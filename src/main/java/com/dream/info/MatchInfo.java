package com.dream.info;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class MatchInfo {
    public int _uid;
    public int id;
    public int objectId;
    public int scribeId;
    public String slug;
    public String stage;
    public String state;
    public int internationalClassId;
    public int generalClassId;
    public String title;
    public String floodlit;
    public Date startDate;
    public Date endDate;
    public Date startTime;
    public boolean timePublished;
    public String scheduleNote;
    public boolean isCancelled;
    public String coverage;
    public String coverageNote;
    public String status;
    public String statusText;
    public String statusEng;
    public String internationalNumber;
    public Object generalNumber;
    public int winnerTeamId;
    public int tossWinnerTeamId;
    public int tossWinnerChoice;
    public int resultStatus;
    public int liveInning;
    public Series series;
    public Ground ground;
    public List<TeamInfo> teams;
    public String dayType;
    public String format;
    public int previewStoryId;
    public int reportStoryId;
    public DrawOdds drawOdds;
    public boolean isSuperOver;
    public List<String> languages;
}
