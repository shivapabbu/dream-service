package com.dream.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Player {
    private String playerId;
    private String playerRole;
    private String playerName;
    private float credits;
    private String rating;
}
