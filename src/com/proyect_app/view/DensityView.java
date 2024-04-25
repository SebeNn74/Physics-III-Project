package com.proyect_app.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DensityView extends JPanel {
    private JLabel dataFormulaLabel;
    private JTextArea dataInfo;
    private JLabel gravityLabel;
    private JLabel fluidVolumeLabel;
    private JLabel pushJLabel;
    private JLabel resultJLabel;
    private JTextField resultJTextField;
    private JTextField gravityTextField;
    private JTextField fluidVolumeTextField;
    private JTextField pushTextField;
    private JButton calculatorButton, returnButton;
    private JPanel panelInfo, dataPanel;

    public DensityView(ActionListener ac) {
        this.config();
        initComponents(ac);
    }

    public void initComponents(ActionListener ac) {
        createDataFormulaLabel();
        createFluidVolumeJLabel();
        createFluidVolumeJTextField();
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
        this.setBackground(new Color(61, 130, 162));
    }

    private void createPanelInfo() {
        panelInfo = new JPanel();
        panelInfo.setBounds(400, 90, 260, 290);
        panelInfo.setBackground(Color.white);
        this.add(panelInfo);
    }

    private void createDataPanel() {
        dataPanel = new JPanel();
        dataPanel.setBounds(30, 90, 350, 290);
        dataPanel.setBackground(Color.white);
        this.add(dataPanel);
    }

    public void createJTextAreaInfoData() {
        dataInfo = new JTextArea("Donde:\n" +
                "\nE-->Fuerza de empuje\n" +
                "Vf-->Volumen del fluido\n" +
                "g -->Gravedad");
        dataInfo.setFont(new Font("Arial", Font.BOLD, 20));
        dataInfo.setBackground(Color.white);
        dataInfo.setEditable(false);
        dataInfo.setBounds(420, 140, 230, 150);
        dataInfo.setBorder(null);
        this.add(dataInfo);
    }

    public void createDataFormulaLabel() {
        dataFormulaLabel = new JLabel("Ingrese los siguientes datos: ");
        dataFormulaLabel.setFont(new Font("Arial", Font.BOLD, 20));
        dataFormulaLabel.setBorder(null);
        dataFormulaLabel.setBackground(Color.blue);
        dataFormulaLabel.setBounds(75, 100, 280, 30);
        this.add(dataFormulaLabel);
    }

    public double gravityValue() {
        return Double.parseDouble(gravityTextField.getText());
    }

    public double volumeValue() {
        return Double.parseDouble(fluidVolumeTextField.getText());
    }

    public double pushValue() {
        return Double.parseDouble(pushTextField.getText());
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
        this.add(resultJLabel);
    }

    public void createFluidVolumeJTextField() {
        fluidVolumeTextField = new JTextField();
        fluidVolumeTextField.setBounds(190, 190, 80, 30);
        this.add(fluidVolumeTextField);

    }

    public void createFluidVolumeJLabel() {
        fluidVolumeLabel = new JLabel("Vf");
        fluidVolumeLabel.setBounds(140, 190, 20, 30);
        fluidVolumeLabel.setFont(new Font("century", Font.BOLD, 14));
        this.add(fluidVolumeLabel);
    }

    public void createPushJTextField() {
        pushTextField = new JTextField();
        pushTextField.setBounds(190, 150, 80, 30);
        this.add(pushTextField);
    }

    public void createPushLabel() {
        pushJLabel = new JLabel("E");
        pushJLabel.setBounds(140, 150, 20, 30);
        pushJLabel.setFont(new Font("century", Font.BOLD, 14));
        this.add(pushJLabel);
    }

    public void createCalculatorButton(ActionListener ac) {
        calculatorButton = new JButton("Calcular");
        calculatorButton.setBackground(new Color(5, 36, 90));
        calculatorButton.setForeground(Color.white);
        calculatorButton.addActionListener(ac);
        calculatorButton.setBounds(178, 320, 100, 30);
        calculatorButton.setFont(new Font("century", Font.BOLD, 18));
        calculatorButton.setBorder(null);
        calculatorButton.setActionCommand("CalcularDen");
        this.add(calculatorButton);
    }

    public void showResult(Object T) {
        getResultJTextField().setText("" + String.valueOf(T));
        this.repaint();
    }

    public void createReturnButton(ActionListener ac) {
        returnButton = new JButton("<-");
        returnButton.setBackground(new Color(5, 36, 90));
        returnButton.setForeground(Color.white);
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