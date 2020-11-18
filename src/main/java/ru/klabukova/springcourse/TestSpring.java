package ru.klabukova.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		//MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		
		musicPlayer.playMusic();
		
		System.out.println(musicPlayer.getName());
		System.out.println(musicPlayer.getVolume());
		
		context.close();
	}

}
