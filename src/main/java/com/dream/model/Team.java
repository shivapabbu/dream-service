package com.dream.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="Teams")
public class Team {
    @Id
    private String teamId;
    private String teamFullName;
    private String teamShortName;
    private String teamOwner;
    private String coach;
    private String captain;
    private String venue;

}
