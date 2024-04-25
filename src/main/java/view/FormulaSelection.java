package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class FormulaSelection extends JPanel{
    private JTextArea infoFormula;
    private JPanel auxPanel;
    private JButton gravityJButton;
    private JButton volumeJButton;
    private JButton pushJButton;
    private JButton densityJButton;
    private JLabel gravityJLabel;
    private JLabel volumeJLabel;
    private JLabel pushJLabel;
    private JLabel densityJLabel;
    public FormulaSelection(ActionListener ac) {
        this.config();
        initComponents(ac);    }
    public void initComponents(ActionListener ac){
        createJTextAreaInfoFormula();
        createPushButton(ac);
        createPushJLabel();
        createDensityJLabel();
        createGravityJLabel();
        createVolumeJLabel();
        createDensityButton(ac);
        createVolumeButton(ac);
        createGravityJButton(ac);
        createAuxPanel();


    }
    public void createAuxPanel(){
        auxPanel = new JPanel();
        auxPanel.setBounds(120,70,450,330);
        auxPanel.setBackground(Color.white);
        this.add(auxPanel);
    }
    public void config() {
        this.setLayout(null);
        this.setBackground(new Color(39, 76, 119));
    }
    public void createJTextAreaInfoFormula() {
        infoFormula = new JTextArea("             Dado: \n"+"        E = Vf * pf * g \n"+"¿Qué desea encontrar?");
        infoFormula.setFont(new Font("Arial", Font.BOLD, 19));
        infoFormula.setBorder(null);
        infoFormula.setBackground(Color.white);
        infoFormula.setEditable(false);
        infoFormula.setBounds(230,100,250,80);
        this.add( infoFormula);
    }
    public void createGravityJButton(ActionListener ac) {
        gravityJButton = new JButton("g");
        gravityJButton.addActionListener(ac);
        gravityJButton.setFont(new Font("Arial", Font.BOLD, 22));
        gravityJButton.setBounds(200,300,30,30);
        gravityJButton.setBorder(null);
        this.add(gravityJButton);
    }
    public void createVolumeButton(ActionListener ac) {
        volumeJButton = new JButton("Vf");
        volumeJButton.addActionListener(ac);
        volumeJButton.setFont(new Font("Arial", Font.BOLD, 22));
        volumeJButton.setBounds(200,220,30,30);
        volumeJButton.setBorder(null);
        this.add(volumeJButton);
    }
    public void createDensityButton(ActionListener ac) {
        densityJButton = new JButton("pf");
        densityJButton.addActionListener(ac);
        densityJButton.setFont(new Font("Arial", Font.BOLD, 22));
        densityJButton.setBounds(200,260,30,30);;
        densityJButton.setBorder(null);
        this.add(densityJButton);
    }
    public void createPushButton(ActionListener ac) {
        pushJButton = new JButton("E");
        pushJButton.addActionListener(ac);
        pushJButton.setFont(new Font("Arial", Font.BOLD, 20));
        pushJButton.setBounds(200,180,30,30);;
        pushJButton.setBorder(null);
        this.add(pushJButton);
    }
    public void createGravityJLabel(){
        gravityJLabel = new JLabel("Gravedad");
        gravityJLabel.setFont(new Font("Arial", Font.BOLD, 20));
        gravityJLabel.setBorder(null);
        gravityJLabel.setBackground(Color.blue);
        gravityJLabel.setBounds(240,300,250,50);
        this.add(gravityJLabel);
    }
    public void createVolumeJLabel(){
        volumeJLabel = new JLabel("Volumen del fluido");
        volumeJLabel.setFont(new Font("Arial", Font.BOLD, 20));
        volumeJLabel.setBorder(null);
        volumeJLabel.setBackground(Color.blue);
        volumeJLabel.setBounds(240,220,250,50);
        this.add( volumeJLabel);
    }
    public void createPushJLabel(){
        pushJLabel = new JLabel("Empuje");
        pushJLabel.setFont(new Font("Arial", Font.BOLD, 20));
        pushJLabel.setBorder(null);
        pushJLabel.setBackground(Color.blue);
        pushJLabel.setBounds(240,180,250,50);
        this.add(pushJLabel);
    }
    public void createDensityJLabel(){
        densityJLabel = new JLabel("Densidad del fluido");
        densityJLabel.setFont(new Font("Arial", Font.BOLD, 20));
        densityJLabel.setBorder(null);
        densityJLabel.setBackground(Color.blue);
        densityJLabel.setBounds(240,260,250,50);
        this.add( densityJLabel);
    }

    public static void main(String[] args) {
        new View(null).createPanelFormulaSelection(null);
        ;
    }


}
