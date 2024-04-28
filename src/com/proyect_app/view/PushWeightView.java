package com.proyect_app.view;

import com.proyect_app.view.components.RoundedButton;
import com.proyect_app.view.components.RoundedPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PushWeightView extends JPanel {
    private JLabel dataFormulaLabel;
    private JTextArea dataInfo;
    private JLabel apparentWeightJLabel;
    private JLabel weightJLabel;
    private JLabel resultJLabel;
    private JTextField resultJTextField;
    private JTextField apparentWeightJTextField;
    private JTextField weightJTextField;
    private RoundedButton calculatorButton, returnButton;
    private RoundedPanel panelInfo, dataPanel;

    public PushWeightView(ActionListener ac) {
        this.config();
        initComponents(ac);
    }

    public void initComponents(ActionListener ac) {
        createDataFormulaLabel();
        createWeightJTextField();
        createWeightJLabel();
        createApparentWeightJLabel();
        createApparentWeightJTextField();
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
                "\nW -->Peso del objeto\n" +
                "Wa-->Peso aparente");
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
        dataFormulaLabel.setBounds(75, 110, 280, 30);
        this.add(dataFormulaLabel);
    }

    public double apparentWeightValue() {
        return Double.parseDouble(apparentWeightJTextField.getText());
    }

    public double weightValue() {
        return Double.parseDouble(weightJTextField.getText());
    }

    public void createApparentWeightJTextField() {
        apparentWeightJTextField = new JTextField();
        apparentWeightJTextField.setBounds(190, 205, 80, 30);
        this.add(apparentWeightJTextField );
    }

    public void createApparentWeightJLabel() {
        apparentWeightJLabel = new JLabel("Wa");
        apparentWeightJLabel.setBounds(140, 205, 30, 30);
        apparentWeightJLabel.setFont(new Font("century", Font.BOLD, 14));
        apparentWeightJLabel.setForeground(new Color(39, 76, 119));
        this.add(apparentWeightJLabel);
    }

    public void createResultTextField() {
        resultJTextField = new JTextField();
        resultJTextField.setBounds(190, 245, 80, 30);
        resultJTextField.setEditable(false);
        this.add(resultJTextField);
    }

    public void createResultLabel() {
        resultJLabel = new JLabel("Resultado");
        resultJLabel.setBounds(100, 245, 90, 30);
        resultJLabel.setFont(new Font("century", Font.BOLD, 14));
        resultJLabel.setForeground(new Color(39, 76, 119));
        this.add(resultJLabel);
    }

    public void createWeightJTextField() {
        weightJTextField = new JTextField();
        weightJTextField.setBounds(190, 165, 80, 30);
        this.add(weightJTextField);

    }
    public void createWeightJLabel() {
        weightJLabel = new JLabel("W");
        weightJLabel.setBounds(140, 165, 20, 30);
        weightJLabel.setFont(new Font("century", Font.BOLD, 14));
        weightJLabel.setForeground(new Color(39, 76, 119));
        this.add(weightJLabel);
    }
    public void createCalculatorButton(ActionListener ac) {
        calculatorButton = new RoundedButton("Calcular");
        calculatorButton.setBackground(new Color(231, 236, 239));
        calculatorButton.setForeground(new Color(39, 76, 119));
        calculatorButton.addActionListener(ac);
        calculatorButton.setActionCommand("CalcularEmPeso");
        calculatorButton.setBounds(178, 300, 100, 30);
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
        returnButton.setBounds(38, 110, 20, 20);
        returnButton.setFont(new Font("century", Font.BOLD, 15));
        returnButton.setActionCommand("VolverDos");
        returnButton.setBorder(null);
        this.add(returnButton);
    }

    public JTextField getResultJTextField() {
        return resultJTextField;
    }

}