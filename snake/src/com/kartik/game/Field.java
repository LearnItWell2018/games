package com.kartik.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Field extends JFrame implements Cloneable {

	static Field f;

	static FieldOrganizer fieldOrganizer;

	private Field() {

	}

	public static Field getInstance() {
		if (fieldOrganizer == null) {
			fieldOrganizer = new FieldOrganizer();
		}
		if (f == null) {
			f = new Field();
			f.setName("ok");
			f.setSize(500, 500);
			fieldOrganizer.setBackground(Color.RED);
			f.add(fieldOrganizer);
			f.show();
		}
		f.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				System.out.println(e.getKeyChar());
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyChar());
				
			}
		});
		
		return f;
	}
	
	
	public static FieldOrganizer getFieldOrganizer() {
		if (fieldOrganizer == null) {
			fieldOrganizer = new FieldOrganizer();
		}
		return fieldOrganizer;
	}

	public static void putShape (int x, int y) {
		Graphics g = fieldOrganizer.getGraphics();
		
		g.drawRect(x, y, 50, 50);
		g.setColor(Color.BLACK);
		fieldOrganizer.paintComponents(g);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
