package com.tunehub.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tunehub.entity.PlayList;
import com.tunehub.repository.PlaylistRepository;

@Service
public class PlaylistServiceImplementation implements PlaylistService {
    @Autowired
    PlaylistRepository repo;
	@Override
	public void addPlaylist(PlayList playlist) {
	repo.save(playlist);
		
	}
	@Override
	public List<PlayList> fetchAllPlaylists() {
		
		return repo.findAll();
	}
	
}
