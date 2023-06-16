package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.game.gameRunner;
import com.example.demo.game.gamingConsole;
import com.example.demo.game.marioGame;
import com.example.demo.game.pacmanGame;
import com.example.demo.game.superContraGame;

public class App03basicSpringBeans {

	public static void main(String[] args) 
	{
	try (var context= new AnnotationConfigApplicationContext(GamingConfiguration.class))
		{
		//context.getBean(gamingConsole.class).up();
		
		context.getBean(gameRunner.class).run();
		
		}
	
	
	//var Game=new marioGame();
	//var Game=new superContraGame();
	//var Game=new pacmanGame();
	//var gameRunner=new gameRunner(Game);
	//gameRunner.run();

	}

}
