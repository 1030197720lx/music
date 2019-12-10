package com.music.upload.mapper;

import com.music.upload.dto.MusicInfo;
import org.springframework.stereotype.Component;

@Component
public interface MusicInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MusicInfo record);

    int insertSelective(MusicInfo record);

    MusicInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MusicInfo record);

    int updateByPrimaryKey(MusicInfo record);
}