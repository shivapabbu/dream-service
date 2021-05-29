package com.dream.info;

import lombok.Data;

@Data
public class Ground {
    public int id;
    public int objectId;
    public String name;
    public String smallName;
    public String longName;
    public String location;
    public Town town;
    public Country country;
}
