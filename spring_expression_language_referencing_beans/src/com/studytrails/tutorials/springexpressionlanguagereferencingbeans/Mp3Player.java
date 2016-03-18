package com.studytrails.tutorials.springexpressionlanguagereferencingbeans;

import java.util.List;

public class Mp3Player {
	private List<String> songsInPlayList;
	private String firstSong;
	
	public List<String> getSongsInPlayList() {
		return songsInPlayList;
	}
	public void setSongsInPlayList(List<String> songsInPlayList) {
		this.songsInPlayList = songsInPlayList;
	}
	public String getFirstSong() {
		return firstSong;
	}
	public void setFirstSong(String firstSong) {
		this.firstSong = firstSong;
	}
	

}
