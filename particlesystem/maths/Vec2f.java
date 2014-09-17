package com.mangopearandapples.libraries.particlesystem.maths;

public class Vec2f {

	public float x, y;
	
	public Vec2f(){
		this(0.0f, 0.0f);
	}
	
	public Vec2f(float x, float y){
		this.x = x;
		this.y = y;
	}
	
	public void approach(Vec2f dest, float dt){
		if(distanceTo(dest, true) < dt){
			set(dest);
		}else{
			x += Math.cos(radiansTo(dest)) * dt;
			y += Math.sin(radiansTo(dest)) * dt;
		}
	}
	
	public void set(Vec2f v){
		x = v.x;
		y = v.y;
	}
	
	public void add(float x1, float y1){
		x += x1;
		y += y1;
	}
	
	public void sub(float x1, float y1){
		x -= x1;
		y -= y1;
	}
	
	public void multiply(float x1, float y1){
		x *= x1;
		y *= y1;
	}
	
	public void divide(float x1, float y1){
		x /= x1;
		y /= y1;
	}
	
	public void add(float a){
		add(a,a);
	}
	
	public void sub(float a){
		sub(a,a);
	}
	
	public void multiply(float a){
		multiply(a,a);
	}
	
	public void divide(float a){
		divide(a,a);
	}
	
	public void add(Vec2f v){
		add(v.x,v.y);
	}
	
	public void sub(Vec2f v){
		sub(v.x,v.y);
	}
	
	public void multiply(Vec2f v){
		multiply(v.x,v.y);
	}
	
	public void divide(Vec2f v){
		divide(v.x,v.y);
	}
	
	public void power(float p){
		x = (float) Math.pow(x, p);
		y = (float) Math.pow(y, p);
	}
	
	public Vec2f negative(){
		if((x < 0 && y < 0) || (x == 0 && y == 0)){
			return this;
		}
		float nx = (x < 0) ? x:-x;
		float ny = (y < 0) ? y:-y;
		return new Vec2f(nx, ny);
	}
	
	public Vec2f positive(){
		if((x > 0 && y > 0) || (x == 0 && y == 0)){
			return this;
		}
		float nx = (x > 0) ? x:-x;
		float ny = (y > 0) ? y:-y;
		return new Vec2f(nx, ny);
	}
	
	public Vec2f opposite(){
		return new Vec2f(-x, -y);
	}
	
	public double distanceTo(float x, float y, boolean matrix){
		return (matrix) ? Math.abs(Math.sqrt(((x - this.x)*(x - this.x)) + ((y - this.y)*(y - this.y)))):Math.sqrt(((x - this.x)*(x - this.x)) + ((y - this.y)*(y - this.y)));
	}
	
	public double distanceTo(Vec2f v, boolean matrix){
		return distanceTo(v.x, v.y, matrix);
	}
	
	public double angleTo(float x, float y){
		return (Math.atan2(y - this.y, x - this.x));
	}
	
	public double angleFrom(float x, float y){
		return (Math.atan2(this.y - y, this.x - x));
	}

	public double angleTo(Vec2f v){
		return angleTo(v.x, v.y);
	}
	
	public double angleFrom(Vec2f v){
		return angleFrom(v.x, v.y);
	}

	public double radiansTo(float x, float y){
		return Math.atan2(y - this.y, x - this.x);
	}
	
	public double radiansFrom(float x, float y){
		return Math.atan2(this.y - y, this.x - x);
	}

	public double radiansTo(Vec2f v){
		return radiansTo(v.x, v.y);
	}
	
	public double radiansFrom(Vec2f v){
		return radiansFrom(v.x, v.y);
	}
	
	public Vec2f clone(){
		return new Vec2f(x, y);
	}
	
	@Override
	public String toString(){
		return "Vec2f(" + x + "," + y +")";
	}
}
