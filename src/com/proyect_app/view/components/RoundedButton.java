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

public class RoundedButton extends JButton implements MouseListener {
    
    private Color defaultTextColor;
    private Color defaultBackground;
    private Color hoverColor;
    private boolean isMouseOver;

    public RoundedButton(String text) {
        super(text);
        this.defaultTextColor = new Color(39, 76, 119);
        this.defaultBackground = new Color(231, 236, 239);
        this.hoverColor = new Color(139, 140, 137);
        initButton();
    }

    private void initButton() {
        setFont(new Font("Alegreya Sans", Font.PLAIN, 24));
        setForeground(defaultTextColor);
        setBackground(defaultBackground);
        setBorderPainted(false);
        setContentAreaFilled(true);
        setFocusPainted(false);
        setOpaque(false);
        setPreferredSize(new Dimension(100, 50));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        addMouseListener(this);
        isMouseOver = false;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Esto es importante para manejar correctamente la repintura
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Color fill = isMouseOver ? hoverColor : getBackground();
        g2.setColor(fill);
        RoundRectangle2D.Double shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 35, 35);
        g2.fill(shape);
        g2.setColor(getForeground());
        g2.setFont(getFont());
        g2.drawString(getText(), getWidth() / 2 - g2.getFontMetrics().stringWidth(getText()) / 2,
                getHeight() / 2 + g2.getFontMetrics().getAscent() / 2 - 2);
        g2.dispose();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        isMouseOver = true;
        repaint();
        revalidate(); // Agregar esto para asegurar la actualización completa del componente
    }

    @Override
    public void mouseExited(MouseEvent e) {
        isMouseOver = false;
        repaint();
        revalidate(); // Agregar esto para asegurar la actualización completa del componente
    }

    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
}