package com.dream.model;

import com.dream.info.MatchInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection="crickinfo")
public class CrickInfo {
    @Id
    private String crickInfoId;
    public List<MatchInfo> matches;
}
