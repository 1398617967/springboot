package com.lz.springboot.mapper;

import com.lz.springboot.bean.LiveActivityTeam;

import java.util.List;

public interface LiveActivityTeamMapper {
    int deleteByPrimaryKey(String teamId);

    int insert(LiveActivityTeam record);

    int insertSelective(LiveActivityTeam record);

    LiveActivityTeam selectByPrimaryKey(String teamId);

    int updateByPrimaryKeySelective(LiveActivityTeam record);

    int updateByPrimaryKey(LiveActivityTeam record);

    List<LiveActivityTeam> selectLiveActivityTeam();
}