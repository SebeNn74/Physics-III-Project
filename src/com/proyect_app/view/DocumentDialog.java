package com.proyect_app.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JLabel;

import com.proyect_app.view.components.RoundedButton;
import com.proyect_app.view.components.RoundedPanel;

public class DocumentDialog extends JDialog{

    private RoundedButton appButton, arqButton;
    private RoundedPanel panelInfo, panel;
    private JLabel tittle;

    public DocumentDialog(ActionListener ac){
        this.config();
        initComponents(ac);
    }

    public void initComponents(ActionListener ac) {
        createDocumentButton(ac);
        createRoundedPanel();
        createPanel();
        
    }

    public void config() {
        this.setLayout(null);
        this.setSize(500, 400);
        this.setBackground(new Color(163, 206, 241));
        this.setVisible(true);
    }

    private void createPanel(){
        panel = new RoundedPanel(0,0);
        panel.setBackground(new Color(39, 76, 119));
        panel.setBounds(0, 0, 500, 400);
        this.add(panel);
    }
    private void createRoundedPanel() {
        panelInfo = new RoundedPanel(35,35);
        panelInfo.setBackground(new Color(163, 206, 241));
        panelInfo.setBounds(30, 30, 430, 300);
        this.add(panelInfo);
    }

    public void createDocumentButton(ActionListener ac) {

        tittle = new JLabel("Selecciona la documentacion: ");
        tittle.setBounds(130, 50, 300, 40);
        tittle.setFont(new Font("Arial", Font.BOLD, 20));
        tittle.setForeground(new Color(39, 76, 119));
        this.add(tittle);

        appButton = new RoundedButton("Documentacion Aplicacion");
        appButton.addActionListener(ac);
        appButton.setActionCommand("APPBUTTON");
        appButton.setFont(new Font("Arial", Font.BOLD, 22));
        appButton.setBounds(100, 150, 300, 37);
        appButton.setBorder(null);
        this.add(appButton);

        arqButton = new RoundedButton("Documentacion Teorica");
        arqButton.addActionListener(ac);
        arqButton.setActionCommand("DOCBUTTON");
        arqButton.setFont(new Font("Arial", Font.BOLD, 22));
        arqButton.setBounds(100, 230, 300, 37);
        arqButton.setBorder(null);
        this.add(arqButton);
    }

    
}
