package com.proyect_app.view;

import javax.swing.*;

import com.proyect_app.view.components.RoundedButton;
import com.proyect_app.view.components.RoundedPanel;

import java.awt.*;
import java.awt.event.ActionListener;

public class MainWindow extends JPanel {

    private RoundedButton optionOne;
    private RoundedButton optionTwo;;
    private JLabel info;
    private JTextArea calculator;
    private RoundedPanel panelFormulas;

    public MainWindow(ActionListener ac) {
        config();
        initComponents(ac);
    }

    public void initComponents(ActionListener ac) {
        createJTextAreaCalculator();
        createJLabelInfo();
        createJButtonFirstFormula(ac);
        createJButtonSecondFormula(ac);
        createJPanelFormulas();

    }

    public void createJTextAreaCalculator() {
        calculator = new JTextArea(" Calculadora Principio de \n" + "           arquimedes");
        calculator.setFont(new Font("Arial", Font.BOLD, 20));
        calculator.setBorder(null);
        calculator.setEditable(false);
        calculator.setForeground(new Color(245, 246, 248));
        calculator.setBackground(new Color(39, 76, 119));
        calculator.setBounds(220, 70, 250, 50);
        this.add(calculator);
    }

    public void createJPanelFormulas() {
        panelFormulas = new RoundedPanel(35, 35);
        panelFormulas.setBounds(95, 150, 500, 220);
        panelFormulas.setBackground(new Color(163, 206, 241));
        this.add(panelFormulas);
    }

    public void createJLabelInfo() {
        info = new JLabel("¿Que formula deseas usar?");
        info.setForeground(new Color(39, 76, 119));
        info.setFont(new Font("Arial", Font.BOLD, 20));
        info.setBorder(null);
        info.setBounds(215, 170, 360, 30);
        this.add(info);
    }

    public void createJButtonFirstFormula(ActionListener ac) {
        optionOne = new RoundedButton("  E = Vf * Pf * g   ");
        optionOne.addActionListener(ac);
        optionOne.setFont(new Font("Arial", Font.BOLD, 22));
        optionOne.setBounds(250, 220, 210, 40);
        optionOne.setActionCommand("oneOption");
        optionOne.setBorder(null);
        this.add(optionOne);
    }

    public void config() {
        this.setLayout(null);
        this.setBackground(new Color(39, 76, 119));
    }

    public void createJButtonSecondFormula(ActionListener ac) {
        optionTwo = new RoundedButton("   E = W - Wa  ");
        optionTwo.addActionListener(ac);
        optionTwo.setFont(new Font("Arial", Font.BOLD, 22));
        optionTwo.setBounds(250, 270, 210, 40);
        ;
        optionTwo.setBorder(null);
        optionTwo.setActionCommand("twoOption");
        this.add(optionTwo);
    }

    public static void main(String[] args) {
        new View(null).createPanelMainWindow(null);
    }
}