package com.music.upload.mapper;

import com.music.upload.dto.PlayListInfo;

public interface PlayListInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlayListInfo record);

    int insertSelective(PlayListInfo record);

    PlayListInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlayListInfo record);

    int updateByPrimaryKey(PlayListInfo record);
}