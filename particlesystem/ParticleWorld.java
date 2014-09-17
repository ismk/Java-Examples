package com.mangopearandapples.libraries.particlesystem;

import java.util.ArrayList;

import com.mangopearandapples.libraries.particlesystem.maths.Vec2f;

public class ParticleWorld {
	
	public long limit;
	public Vec2f center;
	
	public ArrayList<Particle> particles;
	public ArrayList<Emitter> emitters;
	
	public ParticleWorld(){
		this(1000, new Vec2f(0.0f, 0.0f));
	}
	
	public ParticleWorld(long limit, Vec2f center){
		this.limit = limit;
		this.center = center;
		particles = new ArrayList<Particle>();
		emitters = new ArrayList<Emitter>();
	}
	
	public void addEmitter(Emitter e){
		emitters.add(e);
	}
	
	public void newEmitter(Vec2f pos, float angle, double persecond){
		emitters.add(new Emitter(pos, angle, persecond, this));
	}

	public void update(float dt){
		for(Emitter e : emitters){
			e.emit(10000);
		}
		
		int deaths = 0;
		boolean death = false;
		for(int i = 0; i < particles.size()-deaths; ++i){
			if(death){
				i--;
				death = false;
			}
			if(particles.get(i).isDead()){
				particles.remove(i);
				deaths++;
			}
			
			particles.get(i).applyGravity(dt);
			
			if(particles.get(i).shouldMove()){
				particles.get(i).position.add(particles.get(i).velocity);
			}
		}
	}
	
}
