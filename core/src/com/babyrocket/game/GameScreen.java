package com.babyrocket.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class GameScreen extends ScreenAdapter {
	public static final int GAME_READY = 0;
	public static final int GAME_OVER = 1;
	
	
	BabyRocketGame babyRocketGame;
	
	World world;
	OrthographicCamera guiCamera;
	Vector3 touchPoint;
	SpriteBatch batch;
	
	WorldRenderer worldRenderer;
	ReadyScreen readyScreen;
	Texture tinyRocketImg;
	Texture backgroundMoonImg;
	
	int gameState;
	
	public GameScreen(BabyRocketGame babyRocketGame) {
		this.babyRocketGame = babyRocketGame;
		this.worldRenderer = worldRenderer;
		
		batch = babyRocketGame.batch;
		backgroundMoonImg = new Texture("moon_background.png");
		tinyRocketImg = new Texture("TinyRocket.png");
	}
	
	public void create() {
		batch = new SpriteBatch();
	}

	public void update(float deltaTime) {
		
		
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(100, 100, 100, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		batch.draw(backgroundMoonImg, 0, 0);
		batch.draw(tinyRocketImg, 20, 20);
		batch.end();
		
		//update(delta);
		//batch.end();
	}
	
	public void draw() {
		GL20 gl = Gdx.gl;
		gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		worldRenderer.render();
	
		guiCamera.update();
		
		babyRocketGame.batch.setProjectionMatrix(gui.combined);
		babyRocketGame.batch.enableBlending();
		babyRocketGame.batch.begin();
		
		switch (gameState) {
		case GAME_READY:
			setScreenGameReady();
			break;
		case GAME_RUNNING:
			setScreenRunning();
			break;
		case GAME_OVER:
			setScreenGameOver();
			break;
		}
		babyRocketGame.batch.end();
	}
	
	public void setScreenGameReady() {
		
		
	}
	
	public void setScreenRunning() {
		
		
	}
	
	public void setScreenGameOver() {
		
		
		
	}
	
	
	
	public void babyRocketAction() {
		
		
		
		
	}
}
