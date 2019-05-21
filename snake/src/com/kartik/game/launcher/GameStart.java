package com.kartik.game.launcher;

import com.kartik.game.Field;

public class GameStart {

	public static void main(String[] args) {
		Field.getInstance();
		Field.getFieldOrganizer().setPosition(100, 100);
		Field.getFieldOrganizer().setPosition(300, 300);
		Field.getFieldOrganizer().repaint();
		
	}
	
	
}
