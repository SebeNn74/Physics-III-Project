package com.proyect_app.view.components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;

public class CircleButton extends JButton implements MouseListener{

    private Color defaultTextColor;
    private Color defaultBackground;

    public CircleButton (String text){
        super(text);
        this.setBorder(null);
        this.setFont(new Font("Alegreya Sans", Font.PLAIN, 24));
        this.setBackground(new Color(231, 236, 239));
        this.setForeground(new Color(39, 76, 119));
        this.setBorderPainted(false);
        this.setContentAreaFilled(true);
        this.setFocusPainted(false);
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(100, 50));
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.defaultTextColor = this.getForeground();
        this.defaultBackground = this.getBackground();
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (getModel().isArmed()) {
            g2.setColor(new Color(96, 150, 186));
        } else {
            g2.setColor(getBackground());
        }

        RoundRectangle2D.Double shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 45, 45);

        g2.fill(shape);
        g2.setColor(getForeground());
        g2.setFont(getFont());
        g2.drawString(getText(), getWidth() / 2 - g2.getFontMetrics().stringWidth(getText()) / 2,
                getHeight() / 2 + g2.getFontMetrics().getAscent() / 2 - 5);
        g2.dispose();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       //
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(new Color(139, 140, 137));
        this.repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(defaultBackground);
        this.setForeground(defaultTextColor);
    }
    
}
