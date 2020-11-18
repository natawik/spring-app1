package ru.klabukova.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		
		//MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		
		MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
		
		musicPlayer.playMusic(Genre.CLASSICALMUSIC);
		musicPlayer.playMusic(Genre.ROCKMUSIC);
		musicPlayer.playMusic(Genre.POPMUSIC);
		
		System.out.println(musicPlayer.getName());
		System.out.println(musicPlayer.getVolume());
		
		context.close();
	}

}
