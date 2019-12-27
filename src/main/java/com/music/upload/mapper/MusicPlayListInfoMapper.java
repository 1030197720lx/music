package com.music.upload.mapper;

import com.music.upload.dto.MusicPlayListInfo;

public interface MusicPlayListInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MusicPlayListInfo record);

    int insertSelective(MusicPlayListInfo record);

    MusicPlayListInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MusicPlayListInfo record);

    int updateByPrimaryKey(MusicPlayListInfo record);
}