package com.clonelol.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChampionDto {

    public String id;
    public String key;
    public String name;

//    public ChampionEntity convertToChamp() {
//        return ChampionEntitiy.builder()
//                .id(id)
//                .name(name)
//                .stats(statusBuilder())
//                .build();
//    }
}
