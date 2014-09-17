package com.mangopearandapples.libraries.particlesystem;

import java.util.Random;

import com.mangopearandapples.libraries.particlesystem.maths.Vec2f;

public class Emitter {
	public static final Random random = new Random();

	public double particlesPerSecond;
	private double delay;
	private double lastEmitTime;
	
	public Vec2f position;
	public float angle;
	
	public ParticleWorld world;
	
	public Emitter(Vec2f pos, float angle, double persecond, ParticleWorld world){
		this.world = world;
		this.position = pos;
		this.angle = angle;
		particlesPerSecond = persecond;
		delay = (long) (1000L / particlesPerSecond);
		lastEmitTime = 0;
	}
	
	public void single(Vec2f pos, Vec2f vel, long life){
		Particle p = new Particle(world, pos.x, pos.y, life);
		p.velocity.set(vel);
		world.particles.add(p);
	}
	
	public void emit(long life){
		emit(0,0,life);
	}
	
	public void emit(float x, float y, long life){
		long time = System.nanoTime() / 1000000;
		if(lastEmitTime == 0){
			lastEmitTime = time - delay;
		}
		double difference = time - lastEmitTime;
		double angle = position.angleTo(world.center);
		if(difference >= delay){
			for(int i = 0; i < (difference / delay); ++i){
				Vec2f pos = position.clone();
				pos.add((float)Math.cos(angle + (random.nextFloat() * 5.0f) - 2.5f) * i, (float)Math.sin(angle + (random.nextFloat() * 5.0f) - 2.5f) * i);
				single(pos, new Vec2f(x, y), life);
				lastEmitTime = time - (difference % delay);
			}
		}
	}
	
}
