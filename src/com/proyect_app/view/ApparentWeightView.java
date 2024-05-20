package com.proyect_app.view;

import com.proyect_app.view.components.ButtonImage;
import com.proyect_app.view.components.NumericTextField;
import com.proyect_app.view.components.RoundedButton;
import com.proyect_app.view.components.RoundedPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ApparentWeightView extends JPanel {

    private JLabel simulationLabel;
    private JLabel formulaLabel;
    private JLabel weightJLabel;
    private JLabel pushJLabel;
    private JLabel resultJLabel;
    private JTextField resultJTextField;
    private JTextField weightJTextField;
    private JTextField pushJTextField;
    private RoundedButton calculatorButton;
    private RoundedPanel calculatorPanel, simulatorPanel;
    private ButtonImage returnButtonImage;
    private ButtonImage homeButtonImage;
    private ButtonImage questionButtonImage;
    private AnimationPanel animationPanel;
    private int animationRunning;

    public ApparentWeightView(ActionListener ac) {
        this.config();
        animationRunning = 0;
        initComponents(ac);
    }

    public void initComponents(ActionListener ac) {
        createSimulationLabel();
        createFormulaLabel();
        createWeightJLabel();
        createWeightJTextField();
        createPushJLabel();
        createPushJTextField();
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
        returnButtonImage.setActionCommand("VolverFSWeight");
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
        questionButtonImage.setActionCommand("APWquestionButtonImage");
        questionButtonImage.setBorder(null);
        this.add(questionButtonImage);
    }

    public void createFormulaLabel() {
        formulaLabel = new JLabel("Wa = W - E");
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

    public double weightValue() {
        return Double.parseDouble(weightJTextField.getText());
    }

    public double pushValue() {
        return Double.parseDouble(pushJTextField.getText());
    }

    public void createWeightJTextField() {
        weightJTextField = new NumericTextField();
        weightJTextField.setBounds(480, 130, 90, 30);
        weightJTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        this.add(weightJTextField);
    }

    public void createWeightJLabel() {
        weightJLabel = new JLabel("W");
        weightJLabel.setBounds(430, 130, 20, 30);
        weightJLabel.setFont(new Font("Arial", Font.BOLD, 17));
        weightJLabel.setForeground(new Color(39, 76, 119));
        this.add(weightJLabel);
    }

    public void createPushJTextField() {
        pushJTextField = new NumericTextField();
        pushJTextField.setBounds(480, 180, 90, 30);
        pushJTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        this.add(pushJTextField);
    }

    public void createPushJLabel() {
        pushJLabel = new JLabel("E");
        pushJLabel.setBounds(430, 180, 27, 30);
        pushJLabel.setFont(new Font("Arial", Font.BOLD, 17));
        pushJLabel.setForeground(new Color(39, 76, 119));
        this.add(pushJLabel);
    }

    public void createResultTextField() {
        resultJTextField = new JTextField();
        resultJTextField.setBounds(520, 235, 100, 30);
        resultJTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        resultJTextField.setEditable(false);
        this.add(resultJTextField);
    }

    public void createResultLabel() {
        resultJLabel = new JLabel("Resultado");
        resultJLabel.setBounds(430, 235, 90, 30);
        resultJLabel.setFont(new Font("Arial", Font.BOLD, 17));
        resultJLabel.setForeground(new Color(39, 76, 119));
        this.add(resultJLabel);
    }

    public void createCalculatorButton(ActionListener ac) {
        calculatorButton = new RoundedButton("Calcular");
        calculatorButton.setBackground(new Color(231, 236, 239));
        calculatorButton.setForeground(new Color(39, 76, 119));
        calculatorButton.setBounds(480, 295, 100, 30);
        calculatorButton.setFont(new Font("Arial", Font.PLAIN, 18));
        calculatorButton.setBorder(null);
        calculatorButton.addActionListener(ac);
        calculatorButton.setActionCommand("CalcularPesoAp");
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