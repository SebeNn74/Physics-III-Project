package com.proyect_app.view;

import javax.swing.*;

import com.proyect_app.view.components.NumericTextField;
import com.proyect_app.view.components.RoundedButton;
import com.proyect_app.view.components.RoundedPanel;

import java.awt.*;
import java.awt.event.ActionListener;

public class VolumeView extends JPanel {
    private JLabel dataFormulaLabel;
    private JTextArea dataInfo;
    private JLabel gravityLabel;
    private JLabel fluidDensityLabel;
    private JLabel pushJLabel;
    private JLabel resultJLabel;
    private JTextField resultJTextField;
    private JTextField gravityTextField;
    private JTextField fluidDensityTextField;
    private JTextField pushTextField;
    private RoundedButton calculatorButton, returnButton;
    private RoundedPanel panelInfo, dataPanel;

    public VolumeView(ActionListener ac) {
        this.config();
        initComponents(ac);
    }

    public void initComponents(ActionListener ac) {
        createDataFormulaLabel();
        createFluidDensityTLabel();
        createFluidDensityTextField();
        createGravityLabel();
        createGravityTextField();
        createPushLabel();
        createPushJTextField();
        createCalculatorButton(ac);
        createJTextAreaInfoData();
        createResultLabel();
        createResultTextField();
        createReturnButton(ac);
        createPanelInfo();
        createDataPanel();
    }

    public void config() {
        this.setLayout(null);
        this.setBackground(new Color(39, 76, 119));
    }

    private void createPanelInfo() {
        panelInfo = new RoundedPanel(35,35);
        panelInfo.setBounds(400, 90, 260, 290);
        panelInfo.setBackground(new Color(163, 206, 241));
        this.add(panelInfo);
    }

    private void createDataPanel() {
        dataPanel = new RoundedPanel(35,35);
        dataPanel.setBounds(30, 90, 350, 290);
        dataPanel.setBackground(new Color(163, 206, 241));
        this.add(dataPanel);
    }

    public void createJTextAreaInfoData() {
        dataInfo = new JTextArea("Donde:\n" +
                "\nE-->Fuerza de empuje\n" +
                "pf-->Densidad del fluido\n" +
                "g -->Gravedad");
        dataInfo.setFont(new Font("Arial", Font.BOLD, 20));
        dataInfo.setBackground(new Color(163, 206, 241));
        dataInfo.setEditable(false);
        dataInfo.setForeground(new Color(39, 76, 119));
        dataInfo.setBounds(420, 140, 230, 150);
        dataInfo.setBorder(null);
        this.add(dataInfo);
    }

    public void createDataFormulaLabel() {
        dataFormulaLabel = new JLabel("Ingrese los siguientes datos: ");
        dataFormulaLabel.setFont(new Font("Arial", Font.BOLD, 20));
        dataFormulaLabel.setBorder(null);
        dataFormulaLabel.setForeground(new Color(39, 76, 119));
        dataFormulaLabel.setBounds(75, 100, 280, 30);
        this.add(dataFormulaLabel);
    }

    public double gravityValue() {
        return Double.parseDouble(gravityTextField.getText());
    }

    public double densityValue() {
        return Double.parseDouble(fluidDensityTextField.getText());
    }

    public double pushValue() {
        return Double.parseDouble(pushTextField.getText());
    }

    public void createGravityTextField() {
        gravityTextField = new NumericTextField();
        gravityTextField.setBounds(190, 230, 80, 30);
        this.add(gravityTextField);
    }

    public void createGravityLabel() {
        gravityLabel = new JLabel("g");
        gravityLabel.setBounds(140, 230, 20, 30);
        gravityLabel.setFont(new Font("Arial", Font.BOLD, 14));
        gravityLabel.setForeground(new Color(39, 76, 119));
        this.add(gravityLabel);
    }

    public void createResultTextField() {
        resultJTextField = new NumericTextField();
        resultJTextField.setBounds(190, 270, 80, 30);
        resultJTextField.setEditable(false);
        this.add(resultJTextField);
    }

    public void createResultLabel() {
        resultJLabel = new JLabel("Resultado");
        resultJLabel.setBounds(100, 270, 90, 30);
        resultJLabel.setFont(new Font("Arial", Font.BOLD, 14));
        resultJLabel.setForeground(new Color(39, 76, 119));
        this.add(resultJLabel);
    }

    public void createFluidDensityTextField() {
        fluidDensityTextField = new NumericTextField();
        fluidDensityTextField.setBounds(190, 190, 80, 30);
        this.add(fluidDensityTextField);

    }

    public void createFluidDensityTLabel() {
        fluidDensityLabel = new JLabel("pf");
        fluidDensityLabel.setBounds(140, 190, 20, 30);
        fluidDensityLabel.setForeground(new Color(39, 76, 119));
        fluidDensityLabel.setFont(new Font("Arial", Font.BOLD, 14));
        this.add(fluidDensityLabel);
    }

    public void createPushJTextField() {
        pushTextField = new NumericTextField();
        pushTextField.setBounds(190, 150, 80, 30);
        this.add(pushTextField);
    }

    public void createPushLabel() {
        pushJLabel = new JLabel("E");
        pushJLabel.setBounds(140, 150, 20, 30);
        pushJLabel.setForeground(new Color(39, 76, 119));
        pushJLabel.setFont(new Font("Arial", Font.BOLD, 14));
        this.add(pushJLabel);
    }

    public void createCalculatorButton(ActionListener ac) {
        calculatorButton = new RoundedButton("Calcular");
        calculatorButton.setBackground(new Color(231, 236, 239));
        calculatorButton.setForeground(new Color(39, 76, 119));
        calculatorButton.addActionListener(ac);
        calculatorButton.setBounds(178, 320, 100, 30);
        calculatorButton.setFont(new Font("Arial", Font.BOLD, 18));
        calculatorButton.setBorder(null);
        calculatorButton.setActionCommand("CalcularVol");
        this.add(calculatorButton);
    }

    public void showResult(Object T) {
        getResultJTextField().setText("" + String.valueOf(T));
        this.repaint();
    }

    public void createReturnButton(ActionListener ac) {
        returnButton = new RoundedButton("<-");
        returnButton.setBackground(new Color(39, 76, 119));
        returnButton.setForeground(new Color(231, 236, 239));
        returnButton.addActionListener(ac);
        returnButton.setBounds(38, 100, 20, 20);
        returnButton.setFont(new Font("Arial", Font.BOLD, 15));
        returnButton.setActionCommand("Volver");
        returnButton.setBorder(null);
        this.add(returnButton);
    }

    public JTextField getResultJTextField() {
        return resultJTextField;
    }
}