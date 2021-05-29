package com.dream.info;

import lombok.Data;

import java.util.Date;

@Data
public class Series {
    public int id;
    public int objectId;
    public int scribeId;
    public String slug;
    public String name;
    public String longName;
    public String alternateName;
    public String longAlternateName;
    public int year;
    public int typeId;
    public boolean isTrophy;
    public String description;
    public String season;
    public Date startDate;
    public Date endDate;
}
