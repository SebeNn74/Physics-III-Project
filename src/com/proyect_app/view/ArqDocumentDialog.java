package com.proyect_app.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;

import com.proyect_app.view.components.RoundedPanel;

public class ArqDocumentDialog extends JDialog{

    private RoundedPanel panelInfo, panel;
    private JLabel tittle, description;

    public ArqDocumentDialog(){
        this.config();
        initComponents();
        
    }

    public void initComponents() {
        createText();
        createRoundedPanel();
        createPanel();
        
    }

    public void config() {
        this.setLayout(null);
        this.setSize(500, 600);
        this.setBackground(new Color(163, 206, 241));
        this.setVisible(true);
    }

    private void createPanel(){
        panel = new RoundedPanel(0,0);
        panel.setBackground(new Color(39, 76, 119));
        panel.setBounds(0, 0, 500, 600);
        this.add(panel);
    }
    private void createRoundedPanel() {
        panelInfo = new RoundedPanel(35,35);
        panelInfo.setBackground(new Color(163, 206, 241));
        panelInfo.setBounds(30, 30, 430, 500);
        this.add(panelInfo);
    }

    private void createText(){
        tittle = new JLabel("Prinicipio de Arquimedes");
        tittle.setBounds(130, 50, 300, 40);
        tittle.setFont(new Font("Arial", Font.BOLD, 20));
        tittle.setForeground(new Color(39, 76, 119));
        this.add(tittle);

        description = new JLabel(
        "<html>Introduccion:<br>"+
        
        "El Principio de Arquímedes es un principio fundamental de la física que explica por qué los objetos flotan o se hunden cuando se sumergen en un fluido. Este principio fue formulado por el matemático y físico griego Arquímedes en el siglo III a.C.<br>"+

        "El principio de Arquímedes establece que:<br>"+
        "Cualquier cuerpo sumergido en un fluido experimenta un empuje hacia arriba igual al peso del fluido desplazado por el cuerpo.<br><br>"+
        "Formula:<br>"+
        "El empuje (E) se puede calcular utilizando la siguiente fórmula:<br>"+
        "E = Vf * pf * g<br>"+
        "E es el empuje o fuerza de flotacion.<br>"+
        "Vf es el volumen del fluido desplazado por el objeto.<br>"+
        "pf es la densidad del fluido.<br>"+
        "g es la aceleracion debida a la gravedad.<br><br>"+
        
        "Conceptos:<br>"+
        "Empuje: fuerza ascendente que un fluido ejerce sobre un objeto sumergido. Este empuje es responsable de que los objetos floten o se hundan.<br>"+
        "Desplazamiento del fluido: cuando un objeto se sumerge en un fluido, desplaza una cantidad de fluido igual a su propio volumen.<br>"+
        "Densidad del fluido: la masa por unidad de volumen del fluido. Un fluido más denso ejerce un mayor empuje sobre un objeto sumergido en él.<br>.</html>");

        description.setFont(new Font("Arial", Font.PLAIN, 12));
        description.setBounds(50, 80, 400, 450);
        description.setForeground(new Color(39, 76, 119));
        this.add(description);
    }
    
}
