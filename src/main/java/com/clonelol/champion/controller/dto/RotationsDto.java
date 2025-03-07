package com.clonelol.champion.controller.dto;

import com.clonelol.champion.entity.Rotations;
import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class RotationsDto {
    
    // 로테이션 챔피언 ID 리스트
    private ArrayList<Long> freeChampionIds;

    // 신규 유저를 위한 로테이션 챔피언 ID 리스트
    private ArrayList<Long> freeChampionIdsForNewPlayers;

    // 신규 유저 기준 레벨 ( 현재 10 레벨로 되어있음. )
    private int maxNewPlayerLevel;

    @Builder
    public Rotations convertToEntity() {
        return Rotations.builder()
                .id("rotations")
                .maxNewPlayerLevel(maxNewPlayerLevel)
                .build();
    }
}
