package ru.klabukova.springcourse;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
	@Bean
	public ClassicalMusic classicalMusic() {
		return new ClassicalMusic();
	}
	
	@Bean
	public RockMusic rockMusic() {
		return new RockMusic();
	}
	
	@Bean
	public PopMusic popMusic() {
		return new PopMusic();
	}
	
	@Bean
	public List<Music> musicList() {
		List<Music> musicList = new ArrayList<>();
		musicList.add(rockMusic());
		musicList.add(classicalMusic());
		musicList.add(popMusic());
		return musicList;
	}
	
	@Bean
	public MusicPlayer musicPlayer() {
		return new MusicPlayer(musicList());
		
	}

}
