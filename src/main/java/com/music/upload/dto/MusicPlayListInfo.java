package com.music.upload.dto;

public class MusicPlayListInfo {
    private Integer id;

    private Integer playlistInfoId;

    private Integer musicId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlaylistInfoId() {
        return playlistInfoId;
    }

    public void setPlaylistInfoId(Integer playlistInfoId) {
        this.playlistInfoId = playlistInfoId;
    }

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }
}