package com.music.upload.controller;

import com.music.upload.dto.MusicInfo;
import com.music.upload.mapper.MusicInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

    @Autowired
    MusicInfoMapper musicInfoMapper;

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public MusicInfo query(){
        System.out.println();
        MusicInfo musicInfo =  musicInfoMapper.selectByPrimaryKey(1);
        return musicInfo;
    }
}
