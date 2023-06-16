package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.game.gamingConsole;
import com.example.demo.game.pacmanGame;

@Configuration
public class GamingConfiguration 
{
@Bean
	public gamingConsole game()
	{
	var game=new pacmanGame();
	return game;
	}
@Bean
public com.example.demo.game.gameRunner gameRunner()
{
var gameRunner=new com.example.demo.game.gameRunner(game());
return gameRunner;
}	
}
