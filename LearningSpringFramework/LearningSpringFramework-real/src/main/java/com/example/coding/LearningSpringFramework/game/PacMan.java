package com.example.coding.LearningSpringFramework.game;

public class PacMan implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("sit");
	}
	
	public void left() {
		System.out.println("run back");
	}
	
	public void right() {
		System.out.println("run");
	}
}
