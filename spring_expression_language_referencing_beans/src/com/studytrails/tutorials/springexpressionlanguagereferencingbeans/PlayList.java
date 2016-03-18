package com.studytrails.tutorials.springexpressionlanguagereferencingbeans;

import java.util.List;

public class PlayList {

	private List<String> songs;

	public List<String> getSongs() {
		return songs;
	}

	public void setSongs(List<String> songs) {
		this.songs = songs;
	}
	
	public String getFirstSong(){
		return getSongs().get(0);
	}

	
}
