package com.proyect_app.view;

import com.proyect_app.view.components.ButtonImage;
import com.proyect_app.view.components.NumericTextField;
import com.proyect_app.view.components.RoundedButton;
import com.proyect_app.view.components.RoundedPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PushWeightView extends JPanel {

    private JLabel simulationLabel;
    private JLabel formulaLabel;
    private JLabel apparentWeightJLabel;
    private JLabel weightJLabel;
    private JLabel resultJLabel;
    private JTextField resultJTextField;
    private JTextField apparentWeightJTextField;
    private JTextField weightJTextField;
    private RoundedButton calculatorButton;
    private RoundedPanel panelInfo, dataPanel;
    private ButtonImage returnButtonImage;
    private ButtonImage homeButtonImage;
    private ButtonImage questionButtonImage;

    public PushWeightView(ActionListener ac) {
        this.config();
        initComponents(ac);
    }

    public void initComponents(ActionListener ac) {
        createSimulationLabel();
        createFormulaLabel();
        createWeightJTextField();
        createWeightJLabel();
        createApparentWeightJTextField();
        createApparentWeightJLabel();
        createCalculatorButton(ac);
        createResultLabel();
        createResultTextField();
        createReturnButtonImage(ac);
        createHomeButtonImage(ac);
        createQuestionButtonImage(ac);
        createCalculatorPanel();
        createSimulationPanel();
    }

    public void config() {
        this.setLayout(null);
        this.setBackground(new Color(39, 76, 119));
    }

    private void createCalculatorPanel() {
        panelInfo = new RoundedPanel(35, 35);
        panelInfo.setBackground(new Color(163, 206, 241));
        panelInfo.setBounds(400, 50, 260, 360);
        this.add(panelInfo);
    }

    private void createSimulationPanel() {
        dataPanel = new RoundedPanel(35, 35);
        dataPanel.setBackground(new Color(231, 236, 239));
        dataPanel.setBounds(30, 50, 350, 360);
        this.add(dataPanel);
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
        questionButtonImage.setActionCommand("EMPquestionButtonImage");
        questionButtonImage.setBorder(null);
        this.add(questionButtonImage);
    }

    public void createFormulaLabel() {
        formulaLabel = new JLabel("E = W - Wa");
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

    public double apparentWeightValue() {
        return Double.parseDouble(apparentWeightJTextField.getText());
    }

    public double weightValue() {
        return Double.parseDouble(weightJTextField.getText());
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

    public void createApparentWeightJTextField() {
        apparentWeightJTextField = new NumericTextField();
        apparentWeightJTextField.setBounds(480, 180, 90, 30);
        apparentWeightJTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        this.add(apparentWeightJTextField);
    }

    public void createApparentWeightJLabel() {
        apparentWeightJLabel = new JLabel("Wa");
        apparentWeightJLabel.setBounds(430, 180, 27, 30);
        apparentWeightJLabel.setFont(new Font("Arial", Font.BOLD, 17));
        apparentWeightJLabel.setForeground(new Color(39, 76, 119));
        this.add(apparentWeightJLabel);
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
        calculatorButton.setActionCommand("CalcularEmpPeso");
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