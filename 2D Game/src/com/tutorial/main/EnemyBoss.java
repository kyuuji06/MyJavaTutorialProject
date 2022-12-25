package com.tutorial.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class EnemyBoss extends GameObject {
	
	private Handler handler;

	private int timer = 100;
	private int timer2 = 50;
	
	
	public EnemyBoss(int x,int y,ID id, Handler handler) {
		super(x,y,id);
		
		this.handler = handler;
		
		velX = 0;
		velY = 3;
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 64, 64);
	}

	public void tick() {
		x += velX;
		y += velY;
		
		if(timer <= 0) velY = 0;
		else timer--;
		
		if (timer <= 0) timer2--;
		if (timer2 <=0) {
			if(velX == 0) velX = 2;
		}
		
		
		//if(y <=0 || y >= Game.HEIGHT-52) velY *= -1;
		if(x <=0 || x >= Game.WIDTH-78) velX *= -1;
		
		//handler.addObject(new Trail(x, y, ID.Trail, Color.red, 64, 64, 0.02f, handler));
		
	}

	public void render(Graphics g) {
		g.setColor(Color.red);
		g.fillRect((int)x, (int)y, 64, 64);
	}
}
