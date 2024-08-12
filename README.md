# Simple-Snake-Game in Java

This is a simple console-based Snake game implemented in Core Java. The game is played on a 20x20 grid where the snake moves in response to user input. The objective is to navigate the snake to eat food that randomly appears on the grid, causing the snake to grow in length. The game ends if the snake collides with the walls or its own tail.

## Features

- **Console-Based Gameplay**: The game runs entirely in the console, with simple text-based graphics.
- **Dynamic Snake Movement**: Control the snake using the WASD keys:
  - `W`: Up
  - `S`: Down
  - `A`: Left
  - `D`: Right
- **Random Food Placement**: Each time the snake consumes food, it grows longer, and new food appears at a random position on the grid.
- **Game Over Conditions**: The game ends if the snake collides with the walls or its own body.

## How to Play

1. Run the game in a Java-supported environment.
2. Use the WASD keys to move the snake.
3. Try to eat as much food as possible without hitting the walls or your own tail.

## Code Structure

- **Main Game Loop**: Continuously updates the game state and checks for collisions.
- **Movement Logic**: Handles the snake's direction and tail movement.
- **Food Generation**: Places food at a random location on the grid.
- **Rendering**: Displays the game grid, snake, and food in the console.

## Requirements

- Java Development Kit (JDK) installed.
