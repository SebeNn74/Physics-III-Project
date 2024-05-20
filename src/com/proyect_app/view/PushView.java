package com.proyect_app.view;

import javax.swing.*;

import com.proyect_app.view.components.ButtonImage;
import com.proyect_app.view.components.NumericTextField;
import com.proyect_app.view.components.RoundedButton;
import com.proyect_app.view.components.RoundedPanel;

import java.awt.*;
import java.awt.event.ActionListener;

public class PushView extends JPanel {

    private JLabel simulationLabel;
    private JLabel formulaLabel;
    private JLabel gravityLabel;
    private JLabel fluidDensityLabel;
    private JLabel fluidVolumeLabel;
    private JLabel resultJLabel;
    private JTextField resultJTextField;
    private JTextField gravityTextField;
    private JTextField fluidDensityTextField;
    private JTextField fluidVolumeTextField;
    private RoundedButton calculatorButton;
    private RoundedPanel calculatorPanel, simulatorPanel;
    private ButtonImage returnButtonImage;
    private ButtonImage homeButtonImage;
    private ButtonImage questionButtonImage;
    private AnimationPanel animationPanel;
    private int animationRunning;

    public PushView(ActionListener ac) {
        this.config();
        animationRunning = 0;
        initComponents(ac);
    }

    public void initComponents(ActionListener ac) {
        createSimulationLabel();
        createFormulaLabel();
        createFluidDensityLabel();
        createFluidDensityTextField();
        createGravityLabel();
        createGravityTextField();
        createFluidVolumeTextField();
        createfluidVolumeLabel();
        createCalculatorButton(ac);
        createResultLabel();
        createResultTextField();
        createReturnButtonImage(ac);
        createHomeButtonImage(ac);
        createQuestionButtonImage(ac);
        createCalculatorPanel();
        createSimulationPanel();
        createAnimationPanel("resources/FlotacionTotal.mp4");
    }

    public void config() {
        this.setLayout(null);
        this.setBackground(new Color(39, 76, 119));
    }

    private void createCalculatorPanel() {
        calculatorPanel = new RoundedPanel(35, 35);
        calculatorPanel.setBackground(new Color(163, 206, 241));
        calculatorPanel.setBounds(400, 50, 260, 360);
        this.add(calculatorPanel);
    }

    private void createSimulationPanel() {
        simulatorPanel = new RoundedPanel(35, 35);
        simulatorPanel.setBackground(new Color(231, 236, 239));
        simulatorPanel.setBounds(30, 50, 350, 360);
        this.add(simulatorPanel);
    }

    private void createReturnButtonImage(ActionListener ac) {
        returnButtonImage = new ButtonImage("resources/boton-volver.png", 50, 50);
        returnButtonImage.setBounds(425, 340, 50, 50);
        returnButtonImage.addActionListener(ac);
        returnButtonImage.setActionCommand("VolverFSDenVol");
        returnButtonImage.setBorder(null);
        this.add(returnButtonImage);
    }

    private void createHomeButtonImage(ActionListener ac) {
        homeButtonImage = new ButtonImage("resources/boton-inicio.png", 50, 50);
        homeButtonImage.setBounds(505, 340, 50, 50);
        homeButtonImage.addActionListener(ac);
        homeButtonImage.setActionCommand("Home");
        homeButtonImage.setBorder(null);
        this.add(homeButtonImage);
    }

    private void createQuestionButtonImage(ActionListener ac) {
        questionButtonImage = new ButtonImage("resources/boton-ayuda.png", 50, 50);
        questionButtonImage.setBounds(585, 340, 50, 50);
        questionButtonImage.addActionListener(ac);
        questionButtonImage.setActionCommand("PUSHquestionButtonImage");
        questionButtonImage.setBorder(null);
        this.add(questionButtonImage);
    }

    public void createFormulaLabel() {
        formulaLabel = new JLabel("E = Vf · pf · g");
        formulaLabel.setFont(new Font("Arial", Font.BOLD, 22));
        formulaLabel.setBackground(new Color(163, 206, 241));
        formulaLabel.setForeground(new Color(39, 76, 119));
        formulaLabel.setBounds(465, 70, 160, 30);
        formulaLabel.setBorder(null);
        this.add(formulaLabel);
    }

    public void createSimulationLabel() {
        simulationLabel = new JLabel("Esperando datos...");
        simulationLabel.setFont(new Font("Arial", Font.BOLD, 16));
        simulationLabel.setBorder(null);
        simulationLabel.setForeground(new Color(39, 76, 119));
        simulationLabel.setBounds(135, 230, 280, 30);
        this.add(simulationLabel);
    }

    private void createAnimationPanel(String videoPath) {
        animationPanel = new AnimationPanel(videoPath);
        animationPanel.setBounds(55, 20, 265, 350);
    }

    public void cargeAnimation(String type) {
        simulationLabel.setVisible(false);
        switch (type) {
            case "1":
                if (animationRunning == 0) {
                    animationPanel.playVideo();
                    simulatorPanel.add(animationPanel);
                    animationRunning = 1;
                } else {
                    animationPanel.changeVideo("resources/FlotacionTotal.mp4");
                }
                break;
            case "2":
                if (animationRunning == 0) {
                    animationPanel.changeVideo("resources/FlotacionParcial.mp4");
                    simulatorPanel.add(animationPanel);
                    animationRunning = 2;
                } else {
                    animationPanel.changeVideo("resources/FlotacionParcial.mp4");
                }
                break;
            case "3":
                if (animationRunning == 0) {
                    animationPanel.changeVideo("resources/Hundimiento.mp4");
                    simulatorPanel.add(animationPanel);
                    animationRunning = 3;
                } else {
                    animationPanel.changeVideo("resources/Hundimiento.mp4");
                }
                break;
            default:
                return;
        }
    }

    public double gravityValue() {
        return Double.parseDouble(gravityTextField.getText());
    }

    public double densityValue() {
        return Double.parseDouble(fluidDensityTextField.getText());
    }

    public double volumeValue() {
        return Double.parseDouble(fluidVolumeTextField.getText());
    }

    public void createFluidVolumeTextField() {
        fluidVolumeTextField = new NumericTextField();
        fluidVolumeTextField.setBounds(480, 120, 90, 30);
        fluidVolumeTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        this.add(fluidVolumeTextField);
    }

    public void createfluidVolumeLabel() {
        fluidVolumeLabel = new JLabel("Vf");
        fluidVolumeLabel.setBounds(430, 120, 20, 30);
        fluidVolumeLabel.setFont(new Font("Arial", Font.BOLD, 17));
        fluidVolumeLabel.setForeground(new Color(39, 76, 119));
        this.add(fluidVolumeLabel);
    }

    public void createFluidDensityTextField() {
        fluidDensityTextField = new NumericTextField();
        fluidDensityTextField.setBounds(480, 160, 90, 30);
        fluidDensityTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        this.add(fluidDensityTextField);
    }

    public void createFluidDensityLabel() {
        fluidDensityLabel = new JLabel("pf");
        fluidDensityLabel.setBounds(430, 160, 20, 30);
        fluidDensityLabel.setFont(new Font("Arial", Font.BOLD, 17));
        fluidDensityLabel.setForeground(new Color(39, 76, 119));
        this.add(fluidDensityLabel);
    }

    public void createGravityTextField() {
        gravityTextField = new NumericTextField();
        gravityTextField.setBounds(480, 200, 90, 30);
        gravityTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        this.add(gravityTextField);
    }

    public void createGravityLabel() {
        gravityLabel = new JLabel("g");
        gravityLabel.setBounds(430, 200, 20, 30);
        gravityLabel.setFont(new Font("Arial", Font.BOLD, 17));
        gravityLabel.setForeground(new Color(39, 76, 119));
        this.add(gravityLabel);
    }

    public void createResultTextField() {
        resultJTextField = new JTextField();
        resultJTextField.setBounds(520, 240, 100, 30);
        resultJTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        resultJTextField.setEditable(false);
        this.add(resultJTextField);
    }

    public void createResultLabel() {
        resultJLabel = new JLabel("Resultado");
        resultJLabel.setBounds(430, 240, 90, 30);
        resultJLabel.setFont(new Font("Arial", Font.BOLD, 17));
        resultJLabel.setForeground(new Color(39, 76, 119));
        this.add(resultJLabel);
    }

    public void createCalculatorButton(ActionListener ac) {
        calculatorButton = new RoundedButton("Calcular");
        calculatorButton.setBackground(new Color(231, 236, 239));
        calculatorButton.setForeground(new Color(39, 76, 119));
        calculatorButton.setBounds(480, 290, 100, 30);
        calculatorButton.setFont(new Font("Arial", Font.PLAIN, 18));
        calculatorButton.setBorder(null);
        calculatorButton.addActionListener(ac);
        calculatorButton.setActionCommand("CalcularEmp");
        this.add(calculatorButton);
    }

    public void showResult(Object T) {
        getResultJTextField().setText("" + String.valueOf(T));
        this.repaint();
    }

    public JTextField getResultJTextField() {
        return resultJTextField;
    }

}