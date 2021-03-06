package com.me.mygdxgame;

import java.util.ArrayList;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.me.mygdxgame.ui.ScoreBoard;

public class World {

	/** Our player controlled hero **/
	Car car;
	TargetManager targets;
	ArrayList<Zombie> zombies;
	ArrayList<Body> zombieBodies;
	
	public Map map;
	ScoreBoard scoreBoard; 
		

	public Car getCar() {
		return car;
	}

	
	public TargetManager getTargets(){
		return targets;
	}
	
	/**
	 * hey why not
	 */
	public void addZombie() {
		Zombie z = new Zombie(new Vector2((float)Math.random()*100, (float) (Math.random()*100)));
		zombies.add(z);
	}
	
	public ArrayList<Zombie> getZombies() {
		return zombies;
	}
	// --------------------

	public World() {
		createDemoWorld();
	}

	private void createDemoWorld() {
		car = new Car(new Vector2(70, 200));
		targets = new TargetManager();
		
		targets.addTarget(400, 400);
		targets.addTarget(800, 400);
		
		scoreBoard = new ScoreBoard("User");
		
		zombies = new ArrayList<Zombie>();
		zombieBodies = new ArrayList<Body>();
		for (int i=0;i<Constants.NUMBER_ZOMBIES;i++){
			Zombie z = new Zombie(new Vector2((float)Math.random()*1280,(float) (Math.random()*800)));
//			Zombie z = new Zombie(new Vector2(100,100));
//			System.out.println((float)Math.random()*1280);
			zombies.add(z);
		}

	}
	
	
}
