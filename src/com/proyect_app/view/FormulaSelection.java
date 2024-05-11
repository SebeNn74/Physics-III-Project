package com.proyect_app.view;

import javax.swing.*;

import com.proyect_app.view.components.ButtonImage;
import com.proyect_app.view.components.RoundedButton;
import com.proyect_app.view.components.RoundedPanel;

import java.awt.*;
import java.awt.event.ActionListener;

public class FormulaSelection extends JPanel {
    private JTextArea infoFormula;
    private RoundedPanel auxPanel;
    private RoundedButton gravityJButton;
    private RoundedButton volumeJButton;
    private RoundedButton pushJButton;
    private RoundedButton densityJButton;
    private ButtonImage homeButtonImage;
    private ButtonImage questionButtonImage;

    public FormulaSelection(ActionListener ac) {
        this.config();
        initComponents(ac);
    }

    public void initComponents(ActionListener ac) {
        createJTextAreaInfoFormula();
        createPushButton(ac);
        createHomeButtonImage(ac);
        createQuestionButtonImage(ac);
        createDensityButton(ac);
        createVolumeButton(ac);
        createGravityJButton(ac);
        createAuxPanel();
    }

    public void createAuxPanel() {
        auxPanel = new RoundedPanel(35, 35);
        auxPanel.setBounds(100, 70, 480, 330);
        auxPanel.setBackground(new Color(163, 206, 241));
        this.add(auxPanel);
    }

    public void config() {
        this.setLayout(null);
        this.setBackground(new Color(39, 76, 119));
    }

    public void createJTextAreaInfoFormula() {
        infoFormula = new JTextArea("             Dado: \n" + "        E = Vf · pf · g \n" + "¿Qué desea encontrar?");
        infoFormula.setFont(new Font("Arial", Font.PLAIN, 20));
        infoFormula.setForeground(new Color(39, 76, 119));
        infoFormula.setBorder(null);
        infoFormula.setBackground(new Color(163, 206, 241));
        infoFormula.setEditable(false);
        infoFormula.setBounds(240, 90, 250, 80);
        this.add(infoFormula);
    }

    private void createHomeButtonImage(ActionListener ac) {
    	homeButtonImage = new ButtonImage("resources/boton-inicio.png", 50, 50);
    	homeButtonImage.setBounds(110, 80, 50, 50);
    	homeButtonImage.addActionListener(ac);
    	homeButtonImage.setActionCommand("Home");
    	homeButtonImage.setBorder(null);
    	this.add(homeButtonImage);
    }

    private void createQuestionButtonImage(ActionListener ac) {
    	questionButtonImage = new ButtonImage("resources/boton-ayuda.png", 50, 50);
    	questionButtonImage.setBounds(520, 80, 50, 50);
    	questionButtonImage.addActionListener(ac);
    	questionButtonImage.setActionCommand("EMPquestionButtonImage");
    	questionButtonImage.setBorder(null);
    	this.add(questionButtonImage);
    }

    public void createGravityJButton(ActionListener ac) {
        gravityJButton = new RoundedButton("g : Gravedad");
        gravityJButton.addActionListener(ac);
        gravityJButton.setActionCommand("g");
        gravityJButton.setFont(new Font("Arial", Font.BOLD, 22));
        gravityJButton.setBounds(200, 320, 280, 37);
        gravityJButton.setBorder(null);
        this.add(gravityJButton);
    }

    public void createVolumeButton(ActionListener ac) {
        volumeJButton = new RoundedButton("Vf : Volumen");
        volumeJButton.addActionListener(ac);
        volumeJButton.setActionCommand("Vf");
        volumeJButton.setFont(new Font("Arial", Font.BOLD, 20));
        volumeJButton.setBounds(200, 230, 280, 37);
        volumeJButton.setBorder(null);
        this.add(volumeJButton);
    }

    public void createDensityButton(ActionListener ac) {
        densityJButton = new RoundedButton("pf : Densidad del fluido");
        densityJButton.addActionListener(ac);
        densityJButton.setActionCommand("pf");
        densityJButton.setFont(new Font("Arial", Font.BOLD, 22));
        densityJButton.setBounds(200, 275, 280, 37);
        ;
        densityJButton.setBorder(null);
        this.add(densityJButton);
    }

    public void createPushButton(ActionListener ac) {
        pushJButton = new RoundedButton("E : Empuje");
        pushJButton.addActionListener(ac);
        pushJButton.setActionCommand("E");
        pushJButton.setFont(new Font("Arial", Font.BOLD, 20));
        pushJButton.setBounds(200, 185, 280, 37);
        ;
        pushJButton.setBorder(null);
        this.add(pushJButton);
    }

}
