package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
	}

	public void feed() {
		//1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE));
	}

	public Location getHeadLocation() {
		//2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		//1. use a switch statement to check on the currentDirection
		//   of the snake and calculate its next x and y position.
		switch (currentDirection) {
		case RIGHT:
			currentDirection = Direction.RIGHT;
		case LEFT:
			currentDirection = Direction.LEFT;
		case UP:
			currentDirection = Direction.UP;
		case DOWN:
			currentDirection = Direction.LEFT;
		}

		//2. Iterate through the SnakeSegments in reverse order
		//2a. Update each snake segment to the location of the segment 
		//    in front of it.
		
		for (int i = snake.size(); i > 0; i--) {
			if(i - 1 > -1) {
				snake.get(i).setLocation(snake.get(i + 1).getLocation());
			}
		}
		
		
		//3. set the location of the head to the new location calculated in step 1
		if (currentDirection == Direction.RIGHT){
			snake.get(0).location.x += 50;			
		} else 	if (currentDirection == Direction.LEFT){
			snake.get(0).location.x -= 50;	
		} else 	if (currentDirection == Direction.DOWN){
			snake.get(0).location.y += 50;	
		} else 	if (currentDirection == Direction.UP){
			snake.get(0).location.y -= 50;	
		}

		//4. set canMove to true
		canMove = true;
	}

	public void setDirection(Direction d) {
		if (canMove == true) {
			currentDirection = d;
			canMove= false; 
		}
		//1. set the current direction equal to the passed in Direction only if canMove is true.
		//   set canMove equal to false.
		//   make sure the snake cannot completely reverse directions.
		
	}

	public void reset(Location loc) {
		//1. clear the snake
		snake.clear();
		//2. set the location of the head

		//3. add the head to the snake
		snake.add(head);
		
	}

	public boolean isOutOfBounds() {
		//1. complete the method so it returns true if the head of the snake is outside of the window
		//   and false otherwise
		
		return false;
	}
	
	public boolean isHeadCollidingWithBody() {
		//1. complete the method so it returns true if the head is located
		//   in the same location as any other body segment
		for (int i = 0; i < snake.size(); i++) {
			if(snake.get(0).location == snake.get(i).location) {
				reset(snake.get(0).location);
			}
		}
		
		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		//1. complete the method so it returns true if the passed in
		//   location is located on the snake
		
		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
