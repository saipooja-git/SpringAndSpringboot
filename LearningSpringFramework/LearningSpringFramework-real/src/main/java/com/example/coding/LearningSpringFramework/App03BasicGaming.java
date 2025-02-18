package com.example.coding.LearningSpringFramework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.coding.LearningSpringFramework.game.GameRunner;
import com.example.coding.LearningSpringFramework.game.GamingConsole;
import com.example.coding.LearningSpringFramework.game.MarioGame;
import com.example.coding.LearningSpringFramework.game.PacMan;
import com.example.coding.LearningSpringFramework.game.SuperContra;

public class App03BasicGaming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var context = new AnnotationConfigApplicationContext(GamingConfiguration.class);
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
//		var mario = new MarioGame();
//		var superr = new SuperContra();
//		var pac = new PacMan();
//		var game = new GameRunner(pac);
//		game.run();

	}

}
