package com.tutorial.main;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

//This is the VISUAL/VIDEO class for the game
public class Window extends Canvas {
	
	private static final long serialVersionUID = -240840600533728354L;
	
	public Window(int width, int height, String title, Game game) {
		JFrame frame = new JFrame(title);//created java frame package
		
		frame.setPreferredSize(new Dimension(width,height));
		frame.setMaximumSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension(width,height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(game);//adding frame on the game
		frame.setVisible(true);
		game.start();// start of the game
	}

}
