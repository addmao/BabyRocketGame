package com.babyrocket.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ReadyScreen extends ScreenAdapter {
	
	BabyRocketGame babyRocketGame;
	Texture readyImg;
	SpriteBatch batch;
	
	public ReadyScreen(BabyRocketGame babyRocketGame) {
		readyImg = new Texture("bg1.png");
		batch = babyRocketGame.batch;
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(100, 100, 100, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		batch.draw(readyImg, 0, 0);
		batch.end();
		if(Gdx.input.justTouched()) {
			babyRocketGame.setScreen(new GameScreen(babyRocketGame));
		}
	}
}
