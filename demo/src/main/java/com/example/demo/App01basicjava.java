package com.example.demo;

import com.example.demo.game.gameRunner;
import com.example.demo.game.marioGame;
import com.example.demo.game.pacmanGame;
import com.example.demo.game.superContraGame;

public class App01basicjava {

	public static void main(String[] args) 
	{
	//var Game=new marioGame();
	//var Game=new superContraGame();
	var Game=new pacmanGame();
	var gameRunner=new gameRunner(Game);
	gameRunner.run();

	}

}
