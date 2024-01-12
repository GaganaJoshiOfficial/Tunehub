package com.tunehub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.entity.Song;
import com.tunehub.repository.SongRepository;

@Service
public class SongServiceImplementation implements SongService {
	@Autowired
    SongRepository repo;
	@Override
	public void addSong(Song song) {
		repo.save(song);
		
	}
	@Override
	public List<Song> fetchAllSongs() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public boolean songnameExists(String name) {
	    Song song = repo.findByName(name);
		if(song==null) {
			return false;
			
		}else {
			return true;
	}

}
	@Override
	public void updateSong(Song song) {
		repo.save(song);
	}}