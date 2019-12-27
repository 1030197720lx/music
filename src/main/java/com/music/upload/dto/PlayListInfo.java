package com.music.upload.dto;

public class PlayListInfo {
    private Integer id;

    private String playlistInfoName;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaylistInfoName() {
        return playlistInfoName;
    }

    public void setPlaylistInfoName(String playlistInfoName) {
        this.playlistInfoName = playlistInfoName == null ? null : playlistInfoName.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}