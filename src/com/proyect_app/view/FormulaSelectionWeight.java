package com.proyect_app.view;

import com.proyect_app.view.components.CircleButton;
import com.proyect_app.view.components.RoundedPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FormulaSelectionWeight extends JPanel {
    private JTextArea infoFormula;
    private RoundedPanel auxPanel;
    private CircleButton weightJButton;
    private CircleButton pushJButton;
    private CircleButton apparentWeightJButton;
    private JLabel weightJLabel;
    private JLabel pushJLabel;
    private JLabel apparentWeightJLabel;

    public FormulaSelectionWeight(ActionListener ac) {
        this.config();
        initComponents(ac);
    }

    public void initComponents(ActionListener ac) {
        createJTextAreaInfoFormula();
        createPushButton(ac);
        createPushJLabel();
        createApparentWeightJButton(ac);
        createWeightJButton(ac);
        createApparentWeightJLabel();
        createWeightJLabel();
        createAuxPanel();
    }

    public void createAuxPanel() {
        auxPanel = new RoundedPanel(35, 35);
        auxPanel.setBounds(120, 70, 450, 330);
        auxPanel.setBackground(new Color(163, 206, 241));
        this.add(auxPanel);
    }

    public void config() {
        this.setLayout(null);
        this.setBackground(new Color(39, 76, 119));
    }

    public void createJTextAreaInfoFormula() {
        infoFormula = new JTextArea("             Dado: \n" + "        E = W - Wa \n" + "¿Qué desea encontrar?");
        infoFormula.setFont(new Font("Arial", Font.BOLD, 19));
        infoFormula.setForeground(new Color(39, 76, 119));
        infoFormula.setBorder(null);
        infoFormula.setBackground(new Color(163, 206, 241));
        infoFormula.setEditable(false);
        infoFormula.setBounds(250, 90, 250, 80);
        this.add(infoFormula);
    }

    public void createWeightJButton(ActionListener ac) {
        weightJButton = new CircleButton("W");
        weightJButton.addActionListener(ac);
        weightJButton.setFont(new Font("Arial", Font.BOLD, 22));
        weightJButton.setBounds(195, 220, 35, 35);
        weightJButton.setBorder(null);
        this.add(weightJButton);
    }

    public void createApparentWeightJButton(ActionListener ac) {
        apparentWeightJButton = new CircleButton("Wa");
        apparentWeightJButton.addActionListener(ac);
        apparentWeightJButton.setFont(new Font("Arial", Font.BOLD, 22));
        apparentWeightJButton.setBounds(197, 260, 35, 35);
        ;
        apparentWeightJButton.setBorder(null);
        this.add(apparentWeightJButton);
    }

    public void createPushButton(ActionListener ac) {
        pushJButton = new CircleButton("E");
        pushJButton.addActionListener(ac);
        pushJButton.setFont(new Font("Arial", Font.BOLD, 20));
        pushJButton.setBounds(195, 182, 35, 35);
        ;
        pushJButton.setBorder(null);
        pushJButton.setActionCommand("EWeight");
        this.add(pushJButton);
    }

    public void createWeightJLabel() {
        weightJLabel = new JLabel("Peso del objeto");
        weightJLabel.setFont(new Font("Arial", Font.BOLD, 20));
        weightJLabel.setForeground(new Color(39, 76, 119));
        weightJLabel.setBorder(null);
        weightJLabel.setBackground(Color.blue);
        weightJLabel.setBounds(240, 210, 250, 50);
        this.add(weightJLabel);
    }

    public void createPushJLabel() {
        pushJLabel = new JLabel("Empuje");
        pushJLabel.setFont(new Font("Arial", Font.BOLD, 20));
        pushJLabel.setForeground(new Color(39, 76, 119));
        pushJLabel.setBorder(null);
        pushJLabel.setBackground(Color.blue);
        pushJLabel.setBounds(240, 170, 250, 50);
        this.add(pushJLabel);
    }

    public void createApparentWeightJLabel() {
        apparentWeightJLabel = new JLabel("Peso aparente");
        apparentWeightJLabel.setFont(new Font("Arial", Font.BOLD, 20));
        apparentWeightJLabel.setForeground(new Color(39, 76, 119));
        apparentWeightJLabel.setBorder(null);
        apparentWeightJLabel.setBackground(Color.blue);
        apparentWeightJLabel.setBounds(240, 250, 250, 50);
        this.add(apparentWeightJLabel);
    }
}
