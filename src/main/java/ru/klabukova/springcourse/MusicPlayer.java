package ru.klabukova.springcourse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicPlayer.volume}")
	private int volume;
	
	public MusicPlayer() {}
	
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
