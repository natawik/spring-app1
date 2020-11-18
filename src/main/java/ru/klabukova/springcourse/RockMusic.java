package ru.klabukova.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music {
	private List<String> songs = new ArrayList<>();
	
	public RockMusic() {
		songs.add("Whole Lotta Love");
		songs.add("ThunderStruck");
		songs.add("Wind cries Mary");
	}

	public String getSong() {
		Random rand = new Random();
	    return songs.get(rand.nextInt(songs.size()));
	}

}
