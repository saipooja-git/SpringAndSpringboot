package com.example.coding.LearningSpringFramework;

import com.example.coding.LearningSpringFramework.game.GameRunner;
import com.example.coding.LearningSpringFramework.game.MarioGame;
import com.example.coding.LearningSpringFramework.game.PacMan;
import com.example.coding.LearningSpringFramework.game.SuperContra;

public class App01Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var mario = new MarioGame();
		var superr = new SuperContra();
		var pac = new PacMan();
		var game = new GameRunner(pac);
		game.run();

	}

}
