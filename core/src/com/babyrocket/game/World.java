package com.babyrocket.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class World {
	
	WorldRenderer worldRenderer;
	BabyRocketGame babyRocketGame;
	
	OrthographicCamera camera;
	Vector3 touchPoint;
	SpriteBatch batch;
	
	public static final int GAME_READY = 0;
	public static final int GAME_RUNNING = 1;
	public static final int GAME_OVER = 2;
	private int score;
	
	public final TinyRocket tinyRocket;
	public final List<Alien> alienList;
	public final List<Asteroid> asteroidList;
	public final List<Predator> predatorList;
	public final List<Oil> oilList;
	public final EngineBar;
	
	public final Random random;
	
	
	
	int stateTime;
	int gameState;
	
	
	World(BabyRocketGame babyRocketGame) {
		score = 0;
	}
	
	public void update() {
		float deltaOfTime = Gdx.graphics.getDeltaTime();
		stateTime += deltaOfTime;
		
		if(Gdx.input.justTouched()) {
			if(gameState == GAME_READY) {
				gameState = GAME_RUNNING;
			}
		}
		
	}
	
	
	
	/*public void draw() {
		GL20 gl = Gdx.gl;
		gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		worldRenderer.render();
	
		gui.update();
		babyRocketGame.batch.setProjectionMatrix(gui.combined);
		babyRocketGame.batch.enableBlending();
		babyRocketGame.batch.begin();
		switch(gameState) {
		case GAME_READY:
			worldRenderer.readyState();
			break;
		case GAME_OVER:
			worldRenderer.gameOverState();
			break;
		}
		babyRocketGame.batch.end();
	}*/
	
	//public int getScore() {
	//	return score;
	//}
	
	//public void increaseScore() {
	//	score += 1;
	//}
}
