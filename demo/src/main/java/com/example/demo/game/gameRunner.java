package com.example.demo.game;

public class gameRunner {
private gamingConsole game;
public gameRunner(gamingConsole game)
{
	this.game=game;
}

public void run() 
{
	System.out.println("Running class "+game);
	game.up();
	game.down();
	game.right();
	game.left();
}



}
