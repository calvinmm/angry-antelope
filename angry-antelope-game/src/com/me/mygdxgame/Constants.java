package com.me.mygdxgame;

public class Constants {

	public static final float SPEED = 50f;	// unit per second

	public static final float ROTATE_SPEED = 1.5f; // half a unit
	
	public static final float CAMERA_WIDTH = 1280;
	public static final float CAMERA_HEIGHT = 800;

	public static final int CAR_SCALAR = 2;
	
	public static final int CAR_HEIGHT = 48*CAR_SCALAR;
	public static final int CAR_WIDTH = 24*CAR_SCALAR;
	
	public static final int HALF_CAR_WIDTH = CAR_WIDTH/2;
	public static final int HALF_CAR_HEIGHT = CAR_HEIGHT/2;
	
	public static final int MAX_VELOCITY = 20;
	
	public static final float CAR_BACK_ACCELERATION_SCALE = .25f;
	public static final float CAR_ACCELERATION = 8;
	public static final float CAR_MAX_ACCELERATION = 320;

	
	public static final float ACCELEROMETER_SCALAR = 20;
	
	public static final float ACCELERATION_LOSS = .97f;
	public static final float ACCELERATION_MIN = 15;

	public static final float ROTATION_SCALAR = .1f;
	public static final int DEGREE_OFFSET = 90;
	
	public static final int PICKUP_RADIUS = 100;
	public static final int ZOMBIE_TRACKING_RADIUS = 200;
	public static final int ZOMBIE_TRACKING_SIREN_RADIUS = 400;
	
}