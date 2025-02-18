package com.example.coding.LearningSpringFramework.game;

// Class responsible for running a game using the GamingConsole interface
public class GameRunner {
    // Reference to a GamingConsole instance (game to be run)
    GamingConsole game;

    // Constructor to initialize the GameRunner with a specific game
    public GameRunner(GamingConsole game) {
    	this.game = game; // Assigns the provided GamingConsole instance to the 'game' field
    }

    // Method to execute the game logic by invoking directional movements
    public void run() {
        // Prints a message indicating the game is starting
        System.out.println("Hey Mario Game" + game);

        // Invokes the directional methods on the game object
        game.left();  // Moves the character left
        game.down();  // Moves the character down
        game.up();    // Moves the character up
        game.right(); // Moves the character right
    }
}
