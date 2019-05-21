package com.kartik.game;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class FieldOrganizer extends JPanel {

	static int x;
	static int y;
	
	public static void setPosition(int x, int y) {
		Thread t = new Thread();
		t.setDaemon(true);
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FieldOrganizer.x = x;
		FieldOrganizer.y = y;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(x, y, 50, 50);
		g.fillRect(x+100, y+100, 50, 50);
		g.setColor(Color.BLACK);
	}
	
}
