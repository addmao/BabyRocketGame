package com.babyrocket.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer {
	World world;
	BabyRocketGame babyRocketGame;
	
	Vector2 position;
	OrthographicCamera camera;
	BitmapFont font;
	Texture backgroundMoonImg;
	SpriteBatch batch;
	Texture readyImg;
	Texture gameOverImg;
	Texture tinyRocketImg;
	
	public WorldRenderer(BabyRocketGame babyRocketgame) {
		font = new BitmapFont();
		backgroundMoonImg = new Texture("moon_background.png");
		readyImg = new Texture("bg1.jpg");
		gameOverImg = new Texture("gameOver.png");
		tinyRocketImg = new Texture("TinyRocket.png");
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 600, 400);
		
		
		this.world = world;
		this.babyRocketGame = babyRocketGame;
		this.batch = batch;
		//batch = babyRocketGame.batch;
	}
	
	//@Override
	public void render() {
		camera.update();
		batch.setProjectionMatrix(camera.combined);
		renderMoonBackground();
		renderTinyRocket();
		renderAlien();
		renderAsteroid();
		renderPredator();
		renderOil();
		renderEngineBar();
	}
	
	
	public void renderMoonBackground() {
		batch.begin();
		batch.draw(backgroundMoonImg, camera.position.x - 10 / 2, camera.position.y - 15/ 2, 10, 15);
		batch.end();	
	}
	
	public void renderTinyRocket() {
		batch.enableBlending();
		batch.begin();
		batch.draw(tinyRocketImg, 20, 20);
		batch.end();
	}
	
	/*public void renderAlien() {
		int length = world.alienList.size();
		for(int i = 0; i < length; i++) {
			Alien alien = world.alienList.get(i);
		}
		
	}*/
	
	public void renderAsteroid() {
		
		
	}
	
	public void renderPredator() {
		
		
	}
	
	public void renderOil() {
		
		
		
	}
	
	public void renderEngineBar() {
		
		
		
		
	}
	
	public void draw() {
		//camera.update();
		//batch.setProjectionMatrix(camera.combined);
		
	
		
		//batch.begin();
		////
		//
		//batch.end();
		
	}
	
	public void readyState() {
		batch.draw(readyImg, 0, 0);
		if(Gdx.input.justTouched()) {
			babyRocketGame.setScreen(new GameScreen(babyRocketGame));
		}
	}
	
	public  void gameOverState() {
		batch.draw(gameOverImg, 0, 0);
		if(Gdx.input.justTouched()) {
			babyRocketGame.setScreen(new GameScreen(babyRocketGame));
		}
	}
	
	
	
	
	
	
	
	
}
