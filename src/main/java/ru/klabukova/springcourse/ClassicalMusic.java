package ru.klabukova.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
	private List<String> songs = new ArrayList<>();
	
	public ClassicalMusic() {
		songs.add("Winter");
		songs.add("MoonLigth");
		songs.add("Symphony №9");
	}

	public String getSong() {

		Random rand = new Random();
	    return songs.get(rand.nextInt(songs.size()));
	}

}
