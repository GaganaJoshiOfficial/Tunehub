package com.tunehub.service;

import java.util.List;

import com.tunehub.entity.PlayList;

public interface PlaylistService {

  public void addPlaylist(PlayList playlist);

public List<PlayList> fetchAllPlaylists();

}
