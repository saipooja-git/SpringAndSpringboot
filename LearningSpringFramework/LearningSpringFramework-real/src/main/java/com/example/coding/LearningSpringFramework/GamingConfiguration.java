package com.example.coding.LearningSpringFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.coding.LearningSpringFramework.game.GameRunner;
import com.example.coding.LearningSpringFramework.game.GamingConsole;
import com.example.coding.LearningSpringFramework.game.MarioGame;
import com.example.coding.LearningSpringFramework.game.PacMan;
import com.example.coding.LearningSpringFramework.game.SuperContra;
@Configuration
public class GamingConfiguration {

	
		// TODO Auto-generated method stub
		
		@Bean
		public GamingConsole game() {
			var game = new PacMan();
			return game;
		}
		
//		@Bean
//		public GameRunner gameRunner() {
//			var gameRunner = new GameRunner(game());
//			return gameRunner;
//		}
		
		@Bean
		public GameRunner gameRunner(GamingConsole game) {
			var gameRunner = new GameRunner(game);
			return gameRunner;
		}
		
//		var mario = new MarioGame();
//		var superr = new SuperContra();
//		var pac = new PacMan();
//		var game = new GameRunner(pac);
//		game.run();

	

}
