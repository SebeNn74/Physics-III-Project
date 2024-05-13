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
    private RoundedPanel panelInfo, dataPanel;
    private JComboBox<String> comboBoxVolf;
    private JComboBox<String> comboBoxDenf;
    private JComboBox<String> comboBoxGrav;
    private ButtonImage returnButtonImage;
    private ButtonImage homeButtonImage;
    private ButtonImage questionButtonImage;

    public PushView(ActionListener ac) {
        this.config();
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
        createComboBoxVolf(ac);
        createComboBoxDenf(ac);
        createComboBoxGrav(ac);
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
        questionButtonImage.setActionCommand("EMPquestionButtonImage");
        questionButtonImage.setBorder(null);
        this.add(questionButtonImage);
    }

    private void createComboBoxVolf(ActionListener ac) {
        String[] opciones = { "Litros (L)", "Metros (m3)", "Centrimetros (cm3)" };
        comboBoxVolf = new JComboBox<>(opciones);
        comboBoxVolf.setBounds(580, 120, 60, 30);
        comboBoxVolf.addActionListener(ac);
        comboBoxVolf.setActionCommand("VolumenFCombo");
        comboBoxVolf.setBorder(null);
        this.add(comboBoxVolf);

    }

    private void createComboBoxDenf(ActionListener ac) {
        String[] opciones = { "kg/m3", "g/cm3", "g/mL" };
        comboBoxDenf = new JComboBox<>(opciones);
        comboBoxDenf.setBounds(580, 160, 60, 30);
        comboBoxDenf.addActionListener(ac);
        comboBoxDenf.setActionCommand("DensidadFCombo");
        comboBoxDenf.setBorder(null);
        this.add(comboBoxDenf);

    }

    private void createComboBoxGrav(ActionListener ac) {
        String[] opciones = { "m/s2", "Gal" };
        comboBoxGrav = new JComboBox<>(opciones);
        comboBoxGrav.setBounds(580, 200, 60, 30);
        comboBoxGrav.addActionListener(ac);
        comboBoxGrav.setActionCommand("GravCombo");
        comboBoxGrav.setBorder(null);
        this.add(comboBoxGrav);

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