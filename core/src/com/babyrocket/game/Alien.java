package com.babyrocket.game;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Alien {
	Vector2 position;
	Rectangle bounds;
	
	public Alien(float x, float y, float width, float height) {
		this.position = new Vector2(x, y);
		this.bounds = new Rectangle(x - width / 2, y - height /2, width, height);
	}
}
