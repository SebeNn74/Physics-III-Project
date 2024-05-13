package com.proyect_app.view;

import com.proyect_app.view.components.ButtonImage;
import com.proyect_app.view.components.RoundedButton;
import com.proyect_app.view.components.RoundedPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FormulaSelectionWeight extends JPanel {
    private JTextArea infoFormula;
    private RoundedPanel auxPanel;
    private RoundedButton weightJButton;
    private RoundedButton pushJButton;
    private RoundedButton apparentWeightJButton;
    private ButtonImage homeButtonImage;
    private ButtonImage questionButtonImage;

    public FormulaSelectionWeight(ActionListener ac) {
        this.config();
        initComponents(ac);
    }

    public void initComponents(ActionListener ac) {
        createJTextAreaInfoFormula();
        createHomeButtonImage(ac);
        createQuestionButtonImage(ac);
        createPushButton(ac);
        createApparentWeightJButton(ac);
        createWeightJButton(ac);
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

    public void createJTextAreaInfoFormula() {
        infoFormula = new JTextArea("             Dado: \n" + "        E = W - Wa \n" + "¿Qué desea encontrar?");
        infoFormula.setFont(new Font("Arial", Font.PLAIN, 20));
        infoFormula.setForeground(new Color(39, 76, 119));
        infoFormula.setBorder(null);
        infoFormula.setBackground(new Color(163, 206, 241));
        infoFormula.setEditable(false);
        infoFormula.setBounds(240, 90, 250, 80);
        this.add(infoFormula);
    }

    public void createPushButton(ActionListener ac) {
        pushJButton = new RoundedButton("E : Empuje");
        pushJButton.setFont(new Font("Arial", Font.BOLD, 20));
        pushJButton.setBounds(200, 190, 280, 37);
        pushJButton.setBorder(null);
        pushJButton.addActionListener(ac);
        pushJButton.setActionCommand("EWeight");
        this.add(pushJButton);
    }

    public void createWeightJButton(ActionListener ac) {
        weightJButton = new RoundedButton("W : Peso del objeto");
        weightJButton.setFont(new Font("Arial", Font.BOLD, 22));
        weightJButton.setBounds(200, 240, 280, 37);
        weightJButton.setBorder(null);
        weightJButton.addActionListener(ac);
        weightJButton.setActionCommand("W");
        this.add(weightJButton);
    }

    public void createApparentWeightJButton(ActionListener ac) {
        apparentWeightJButton = new RoundedButton("Wa : Peso aparente");
        apparentWeightJButton.setFont(new Font("Arial", Font.BOLD, 22));
        apparentWeightJButton.setBounds(200, 290, 280, 37);
        apparentWeightJButton.setBorder(null);
        apparentWeightJButton.addActionListener(ac);
        apparentWeightJButton.setActionCommand("Wa");
        this.add(apparentWeightJButton);
    }

}
