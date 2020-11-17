package ru.klabukova.springcourse;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Music musicClassical = context.getBean("classicalMusic", Music.class);

		Music musicPop = context.getBean("popMusic", Music.class);

		Music musicRock = context.getBean("rockMusic", Music.class);
		
		//MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		
		MusicPlayer musicPlayer = new MusicPlayer(new ArrayList<Music>
								(Arrays.asList(musicClassical, musicPop, musicRock)));
		musicPlayer.playMusic();
		System.out.println(musicPlayer.getName());
		System.out.println(musicPlayer.getVolume());
		
		context.close();
	}

}
