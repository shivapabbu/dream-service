package com.dream.info;

import lombok.Data;

@Data
public class Teams {
    public int id;
    public int objectId;
    public int scribeId;
    public String slug;
    public String name;
    public String longName;
    public String abbreviation;
    public boolean isCountry;
    public String primaryColor;
    public Image image;
}
