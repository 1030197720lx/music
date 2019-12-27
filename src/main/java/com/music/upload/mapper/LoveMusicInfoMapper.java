package com.music.upload.mapper;

import com.music.upload.dto.LoveMusicInfo;

public interface LoveMusicInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LoveMusicInfo record);

    int insertSelective(LoveMusicInfo record);

    LoveMusicInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LoveMusicInfo record);

    int updateByPrimaryKey(LoveMusicInfo record);
}