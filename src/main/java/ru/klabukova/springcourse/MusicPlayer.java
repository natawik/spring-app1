package ru.klabukova.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {
	List<Music> musicList = new ArrayList<>();
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;
	
	public MusicPlayer() {}
	
	public MusicPlayer(List<Music> musicList) {
		this.musicList = musicList;
	}
	
	public void playMusic() {
		Random rand = new Random();
	    Music music = musicList.get(rand.nextInt(musicList.size()));
	    
		System.out.println("Playing: " + music.getSong());
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

}
