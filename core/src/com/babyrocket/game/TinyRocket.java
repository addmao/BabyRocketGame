package com.babyrocket.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.math.Vector2;

public class TinyRocket {
	private Vector2 position;
	public static final int ROCKET_STIL = 0;
	public static final int ROCKET_MOVE = 1;
	public static final int ROCKET_DEAD = 2;
	
	int state;
	Vector2 positionRocket;
	
	public TinyRocket(int x, int y) {
		position = new Vector2(x, y);
		state = ROCKET_STIL;
	}
	
	public Vector2 getPosition() {
		return position;
	}
	
	private void update(float deltaTime) {
		
	}
	
	
	
}
