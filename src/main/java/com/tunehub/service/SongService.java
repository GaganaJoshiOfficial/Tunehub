package com.tunehub.service;

import java.util.List;

import com.tunehub.entity.Song;

public interface SongService {

   public void addSong(Song song);

  public List<Song> fetchAllSongs();

public boolean songnameExists(String name);

public void updateSong(Song song);

}
