package ru.klabukova.springcourse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	private String name;
	private int volume;
	
	public MusicPlayer() {}
	
	@Autowired
	public MusicPlayer(List<Music> music) {
		this.name = "My Player";
		this.volume = 50;
	}
	
	public void playMusic(Genre genre) {
		Music musicPlaying = null;
		if (genre.equals(Genre.CLASSICALMUSIC)) {
			musicPlaying = new ClassicalMusic();
		}
		else if (genre.equals(Genre.ROCKMUSIC)) {
			musicPlaying = new RockMusic();
		}
		else if (genre.equals(Genre.POPMUSIC)) {
			musicPlaying = new PopMusic();
		}
		System.out.println("Playing: " + musicPlaying.getSong());
		
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
