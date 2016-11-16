package com.babyrocket.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
	
	public static final int TINY_ROCKET_VELOCITY_X = 30;
	public static final int TINY_ROCKET_VELOCITY_Y = 30;
	
	public final TinyRocket tinyRocket;
	public final ArrayList<Alien> alienList;
	public final ArrayList<Asteroid> asteroidList;
	public final ArrayList<Predator> predatorList;
	public final ArrayList<Oil> oilList;
	public final ArrayList<Stone> stoneList;
	//public final EngineBar;
	Random random;
	
	int stateTime;
	int gameState;

	public World(BabyRocketGame babyRocketGame) {
		this.alienList = new ArrayList<Alien>();
		this.asteroidList = new ArrayList<Asteroid>();
		this.predatorList = new ArrayList<Predator>();
		this.oilList = new ArrayList<Oil>();
		this.babyRocketGame = babyRocketGame;
		random = new Random();
		playGame();
	}
	
	private void playGame() {
		
		
		
	}

	
	public void update(float deltaTime) {
		updateTinyRocket(deltaTime);
		updateAlien(deltaTime);
		updateAsteroid(deltaTime);
		updatePredator(deltaTime);
		updateOil(deltaTime);
	}
	
	private void updateTinyRocket(float deltaTime) {
		tinyRocket.
		tinyRocket.update(float deltaTime, float accelX, float accelY);
	}
	
	private void updateAlien(float deltaTime) {
		
	}
	
	private void updateAsteroid(float deltaTime) {
		
	}
	
	private void updatePredator(float deltaTime) {
		
	}
	
	private void updateOil(float deltaTime) {
		
		
	}
	
	private void checkHit() {
		checkHitAlien();
		checkHitAsteroid();
		checkHitPredator();
		checkHitOil();
	}
}
