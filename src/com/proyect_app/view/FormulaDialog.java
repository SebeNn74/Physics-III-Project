package com.proyect_app.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;

import com.proyect_app.view.components.RoundedPanel;

public class FormulaDialog extends JDialog{

    private RoundedPanel panelInfo, panel;
    private JLabel tittle, description;

    public FormulaDialog(){
        this.config();
        initComponents();
    }

    public void initComponents() {
        createText();
        createRoundedPanel();
        createPanel();
        
    }

    public void config() {
        this.setLayout(null);
        this.setSize(500, 400);
        this.setBackground(new Color(163, 206, 241));
        this.setVisible(true);
    }

    private void createPanel(){
        panel = new RoundedPanel(0,0);
        panel.setBackground(new Color(39, 76, 119));
        panel.setBounds(0, 0, 500, 400);
        this.add(panel);
    }
    private void createRoundedPanel() {
        panelInfo = new RoundedPanel(35,35);
        panelInfo.setBackground(new Color(163, 206, 241));
        panelInfo.setBounds(30, 30, 430, 300);
        this.add(panelInfo);
    }

    private void createText(){
        tittle = new JLabel("Documentacion Formula");
        tittle.setBounds(130, 50, 300, 40);
        tittle.setFont(new Font("Arial", Font.BOLD, 20));
        tittle.setForeground(new Color(39, 76, 119));
        this.add(tittle);

        description = new JLabel("<html>Densidad Fuido (pf): medida de cuánto material está presente en un determinado volumen del fluido.<br>" +
        "Empuje (E): es la fuerza ejercida por un fluido sobre un objeto sumergido en él.<br>" +
        "Volumen Final (Vf): es el volumen del fluido desplazado por el objeto sumergido.<br>" +
        "Gravedad (g): es la aceleración debida a la gravedad terrestre.</html>");

        description.setFont(new Font("Arial", Font.PLAIN, 14));
        description.setBounds(50, 110, 400, 150);
        description.setForeground(new Color(39, 76, 119));
        this.add(description);
    }
    
}
