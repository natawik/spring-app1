package ru.klabukova.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
	private Music music1;
	private Music music2;
	private Music music3;
	private String name;
	private int volume;
	
	public MusicPlayer() {}
	
	@Autowired
	public MusicPlayer(@Qualifier("classicalMusic") Music music1, 
					   @Qualifier("rockMusic") Music music2, 
					   @Qualifier("popMusic") Music music3) {
		this.music1 = music1;
		this.music2 = music2;
		this.music3 = music3;
	}
	
	public void playMusic() {
		System.out.println("Playing: " + music1.getSong());
		System.out.println("Playing: " + music2.getSong());
		System.out.println("Playing: " + music3.getSong());
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
