package com.mangopearandapples.libraries.particlesystem;

import com.mangopearandapples.libraries.particlesystem.maths.Vec2f;

public class Particle {

	private final ParticleWorld world;
	
	public final Vec2f position;
	public final Vec2f velocity;
	
	private long lifetime, starttime;
	
	public Particle(ParticleWorld world, float x, float y, long life){
		position = new Vec2f(x, y);
		velocity = new Vec2f(0,0);
		lifetime = life;
		this.world = world;
		starttime = (System.nanoTime() / 1000000);
	}
	
	public void applyGravity(float dt){
		float y = (float) ((Math.sin(position.angleTo(world.center)) * 9.8f) * (dt / 1000));
		float x = (float) ((Math.cos(position.angleTo(world.center)) * 9.8f) * (dt / 1000));
		velocity.add((x < 10.0f && x > -10.0f) ? x : 0,(y < 10.0f && y > -10.0f) ? y:0);
	}
	
	public boolean shouldMove(){
		return (velocity.x != 0 || velocity.y != 0);
	}
	
	public boolean isDead(){
		return ((System.nanoTime() / 1000000) - starttime >= lifetime);
	}
}
