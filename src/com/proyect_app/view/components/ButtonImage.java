package com.proyect_app.view.components;

import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ButtonImage extends JButton{
	
	private ImageIcon imageIcon;
	
	public ButtonImage(String path, int width, int height) {
		
		imageIcon = new ImageIcon(path);
		
		this.setPreferredSize(new Dimension(width, height));
		this.setIcon(imageIcon);
		this.setBorderPainted(false); 
		this.setContentAreaFilled(false); 
		this.setFocusPainted(false); 
		this.setOpaque(false);
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	}
	
	public ButtonImage(String path) {
		
		imageIcon = new ImageIcon(path);
		this.setIcon(imageIcon);
		this.setBorderPainted(false); 
		this.setContentAreaFilled(false); 
		this.setFocusPainted(false); 
		this.setOpaque(false);
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	}
	
	public ButtonImage(String path, int width) {
		
		imageIcon = new ImageIcon(path);
		
		this.setPreferredSize(new Dimension(width, imageIcon.getIconHeight()));
		this.setIcon(imageIcon);
		this.setBorderPainted(false); 
		this.setContentAreaFilled(false); 
		this.setFocusPainted(false); 
		this.setOpaque(false);
		this.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	}
}
