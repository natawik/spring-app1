package ru.klabukova.springcourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

public class PopMusic implements Music {
	private List<String> songs = new ArrayList<>();
	
	public PopMusic() {
		songs.add("Bad Guy");
		songs.add("Keep Believing");
		songs.add("For a Feeling");
	}

	public String getSong() {
		Random rand = new Random();
	    return songs.get(rand.nextInt(songs.size()));
	}

}
