package com.proyect_app.view;

import javax.swing.*;

import com.proyect_app.view.components.RoundedButton;
import com.proyect_app.view.components.RoundedPanel;

import java.awt.*;
import java.awt.event.ActionListener;

public class PushView extends JPanel {
    private JLabel dataFormulaLabel;
    private JTextArea dataInfo;
    private JLabel gravityLabel;
    private JLabel fluidDensityLabel;
    private JLabel fluidVolumeLabel;
    private JLabel resultJLabel;
    private JTextField resultJTextField;
    private JTextField gravityTextField;
    private JTextField fluidDensityTextField;
    private JTextField fluidVolumeTextField;
    private RoundedButton calculatorButton, returnButton;
    private RoundedPanel panelInfo, dataPanel;

    public PushView(ActionListener ac) {
        this.config();
        initComponents(ac);
    }

    public void initComponents(ActionListener ac) {
        createDataFormulaLabel();
        createFluidDensityTLabel();
        createFluidDensityTextField();
        createGravityLabel();
        createGravityTextField();
        createFluidVolumeTextField();
        createfluidVolumeLabel();
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
        panelInfo.setBackground(new Color(163, 206, 241));
        panelInfo.setBounds(400, 90, 260, 290);
        
        this.add(panelInfo);
    }

    private void createDataPanel() {
        dataPanel = new RoundedPanel(35,35);
        dataPanel.setBackground(new Color(163, 206, 241));
        dataPanel.setBounds(30, 90, 350, 290);
       
        this.add(dataPanel);
    }

    public void createJTextAreaInfoData() {
        dataInfo = new JTextArea("Donde:\n" +
                "\nVf-->Volumen del fluido\n" +
                "pf-->Densidad del fluido\n" +
                "g -->Gravedad");
        dataInfo.setFont(new Font("Arial", Font.BOLD, 20));
        dataInfo.setBackground(new Color(163, 206, 241));
        dataInfo.setForeground(new Color(39, 76, 119));
        dataInfo.setEditable(false);
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

    public double volumeValue() {
        return Double.parseDouble(fluidVolumeTextField.getText());
    }

    public void createGravityTextField() {
        gravityTextField = new JTextField();
        gravityTextField.setBounds(190, 230, 80, 30);
        this.add(gravityTextField);
    }

    public void createGravityLabel() {
        gravityLabel = new JLabel("g");
        gravityLabel.setBounds(140, 230, 20, 30);
        gravityLabel.setFont(new Font("century", Font.BOLD, 14));
        gravityLabel.setForeground(new Color(39, 76, 119));
        this.add(gravityLabel);
    }

    public void createResultTextField() {
        resultJTextField = new JTextField();
        resultJTextField.setBounds(190, 270, 80, 30);
        resultJTextField.setEditable(false);
        this.add(resultJTextField);
    }

    public void createResultLabel() {
        resultJLabel = new JLabel("Resultado");
        resultJLabel.setBounds(100, 270, 90, 30);
        resultJLabel.setFont(new Font("century", Font.BOLD, 14));
        resultJLabel.setForeground(new Color(39, 76, 119));
        this.add(resultJLabel);
    }

    public void createFluidDensityTextField() {
        fluidDensityTextField = new JTextField();
        fluidDensityTextField.setBounds(190, 190, 80, 30);
        this.add(fluidDensityTextField);

    }

    public void createFluidDensityTLabel() {
        fluidDensityLabel = new JLabel("pf");
        fluidDensityLabel.setBounds(140, 190, 20, 30);
        fluidDensityLabel.setFont(new Font("century", Font.BOLD, 14));
        fluidDensityLabel.setForeground(new Color(39, 76, 119));
        this.add(fluidDensityLabel);
    }

    public void createFluidVolumeTextField() {
        fluidVolumeTextField = new JTextField();
        fluidVolumeTextField.setBounds(190, 150, 80, 30);
        this.add(fluidVolumeTextField);
    }

    public void createfluidVolumeLabel() {
        fluidVolumeLabel = new JLabel("Vf");
        fluidVolumeLabel.setBounds(140, 150, 20, 30);
        fluidVolumeLabel.setFont(new Font("century", Font.BOLD, 14));
        fluidVolumeLabel.setForeground(new Color(39, 76, 119));
        this.add(fluidVolumeLabel);
    }

    public void createCalculatorButton(ActionListener ac) {
        calculatorButton = new RoundedButton("Calcular");
        calculatorButton.setBackground(new Color(231, 236, 239));
        calculatorButton.setForeground(new Color(39, 76, 119));
        calculatorButton.addActionListener(ac);
        calculatorButton.setActionCommand("CalcularEmp");
        calculatorButton.setBounds(178, 320, 100, 30);
        calculatorButton.setFont(new Font("century", Font.BOLD, 18));
        calculatorButton.setBorder(null);
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
        returnButton.setFont(new Font("century", Font.BOLD, 15));
        returnButton.setActionCommand("Volver");
        returnButton.setBorder(null);
        this.add(returnButton);
    }

    public JTextField getResultJTextField() {
        return resultJTextField;
    }
}