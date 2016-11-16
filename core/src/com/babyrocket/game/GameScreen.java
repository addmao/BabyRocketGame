package com.babyrocket.game;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public class GameScreen extends ScreenAdapter {
	public static final int GAME_READY = 0;
	public static final int GAME_RUNNING = 1;
	public static final int GAME_OVER = 2;
	
	
	BabyRocketGame babyRocketGame;
	
	World world;
	OrthographicCamera guiCamera;
	Vector3 touchPoint;
	SpriteBatch batch;
	Vector2 positionRocket;
	
	WorldRenderer worldRenderer;
	ReadyScreen readyScreen;
	Texture tinyRocketImg;
	Texture backgroundMoonImg;
	Texture asteroidImg;
	Texture stoneImg;
	TinyRocket tinyRocket;
	BitmapFont font;
	Asteroid asteroid;
	
	int gameState;
	private int x;
	private int y;
	
	double currentTime = System.nanoTime();
	String score = "SCORE : ";
	
	ArrayList<Stone> stone = new ArrayList<Stone>();
	
	public GameScreen(BabyRocketGame babyRocketGame) {
		this.babyRocketGame = babyRocketGame;
		this.worldRenderer = worldRenderer;
		
		batch = babyRocketGame.batch;
		backgroundMoonImg = new Texture("moon_background.png");
		tinyRocketImg = new Texture("TinyRocket.png");
		tinyRocket = new TinyRocket(30, 30);
		font = new BitmapFont(Gdx.files.internal("font.fnt"), Gdx.files.internal("font.png"), false);
		asteroidImg = new Texture("Asteroid.png");
		asteroid = new Asteroid(300, 350);
		stoneImg = new Texture("stone.png");
		
		x = 300;
		y = 350;
	}
	
	public void create() {
		batch = new SpriteBatch();
	}

	public void update(float deltaTime) {
		control();
			
	}
	
	@Override
	public void render(float delta) {
		x -= 1;
		y -= 1;
		
		update(delta);
		//asteroid.update(delta);
		
		Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		positionRocket = tinyRocket.getPosition();
		batch.begin();
		batch.draw(backgroundMoonImg, 0, 0);
		font.draw(babyRocketGame.batch, score, 100, 500);
		batch.draw(tinyRocketImg, positionRocket.x, positionRocket.y);
		batch.draw(asteroidImg, x, y);
		
		int count = 0;
		while(count < stone.size()) {
			Stone thisStone = stone.get(count);
			thisStone.update();
			if(thisStone.stonePosition.x > -50 && thisStone.stonePosition.y < 400 + 50 && thisStone.stonePosition.y > -50 && thisStone.stonePosition.y < 600 + 50) {
				 batch.draw(stoneImg, thisStone.stonePosition.x, thisStone.stonePosition.y);
			}
		
			else {
				stone.remove(count);
				if(stone.size() > 0) {
					count--;
				}
			}
			count++;
		}

		
		batch.end();
		
		
		//draw();
		//batch.end();
	}
	
	public void control() {
		if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            positionRocket.x -= 10;
        }
		
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            positionRocket.x += 10;
        }
        
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            positionRocket.y -= 10;
        }
        
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            positionRocket.y += 10;
        }
        
        if(Gdx.input.isKeyPressed(Keys.SPACE) && Gdx.input.isKeyPressed(Keys.UP)) {
        	Stone shootStone = new Stone(positionRocket, new Vector2(0, 30));
        	stone.add(shootStone);
        }
        
        if(Gdx.input.isKeyPressed(Keys.SPACE) && Gdx.input.isKeyPressed(Keys.DOWN)) {
        	Stone shootStone = new Stone(positionRocket, new Vector2(0, -30));
        	stone.add(shootStone);
        }
        
        if(Gdx.input.isKeyPressed(Keys.SPACE) && Gdx.input.isKeyPressed(Keys.RIGHT)) {
        	Stone shootStone = new Stone(positionRocket, new Vector2(30, 0));
        	stone.add(shootStone);
        }
        
        if(Gdx.input.isKeyPressed(Keys.SPACE) && Gdx.input.isKeyPressed(Keys.LEFT)) {
        	Stone shootStone = new Stone(positionRocket, new Vector2(-30, 0));
        	stone.add(shootStone);
        }
	}
	
	public void draw() {
		GL20 gl = Gdx.gl;
		gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		//worldRenderer.render();
	
		guiCamera.update();
		batch.setProjectionMatrix(guiCamera.combined);
		batch.enableBlending();
		batch.begin();
		batch.draw(backgroundMoonImg, 0, 0);
		font.draw(babyRocketGame.batch, score, 100, 500);
		batch.draw(tinyRocketImg, positionRocket.x, positionRocket.y);
		batch.draw(asteroidImg, x, y);
		///guiCamera.update();
		///batch.setProjectionMatrix(guiCamera.combined);
		///batch.enableBlending();
		///batch.begin();
		///batch.draw(backgroundMoonImg, 0, 0);
		///batch.end();
		/*switch (gameState) {
		case GAME_READY:
			setScreenGameReady();
			break;
		case GAME_RUNNING:
			setScreenRunning();
			break;
		case GAME_OVER:
			setScreenGameOver();
			break;
		}*/
		///batch.end();
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
