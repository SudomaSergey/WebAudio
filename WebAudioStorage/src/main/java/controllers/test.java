package controllers;

import dom.Song;

public class test {

	public static void main(String[] args) {
		
		for(Song song : DatabaseController.getAllSongs()){
			System.out.println(song.getName());
		}

	}

}
