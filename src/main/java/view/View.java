package view;


import presenter.VerificationPresenter;

import java.awt.BorderLayout;
import javax.swing.*;


public class View extends JFrame{
    private MainWindow panelMainWindow;
    private FormulaSelection panelFormulaSelection;
    private PushView panelPush;
    private VolumeView panelVolume;
    private DensityView panelDensity;
    private GravityView panelGravity;
    private JPanel panel;
    public View(VerificationPresenter ac) {
        this.setUpFrame();
        this.initComponents(ac);
    }
    public void notifyWarning(String mesagge) {
        JOptionPane jo = new JOptionPane();
        jo.showMessageDialog(null,mesagge,"",JOptionPane.ERROR_MESSAGE);
    }
    public void initComponents(VerificationPresenter ac) {
        addHeader(ac);
    }
    public void setUpFrame() {
        this.setTitle("Calculadora fuerza de empuje");
        this.setSize(700,500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void createPanelMainWindow(VerificationPresenter ac) {
        setPanel();
        panelMainWindow = new MainWindow(ac);
        panel.add(panelMainWindow);
        panel.revalidate();
        panel.repaint();
        repaint();
    }
    public void createPanelGravity(VerificationPresenter ac) {
        setPanel();
        panelGravity = new GravityView(ac);
        panel.add(panelGravity);
        panel.revalidate();
        panel.repaint();
        repaint();
    }
    public void createPanelVolume(VerificationPresenter ac) {
        setPanel();
        panelVolume = new VolumeView(ac);
        panel.add(panelVolume);
        panel.revalidate();
        panel.repaint();
        repaint();
    }
    public void createPanelDensity(VerificationPresenter ac) {
        setPanel();
        panelDensity = new DensityView(ac);
        panel.add(panelDensity);
        panel.revalidate();
        panel.repaint();
        repaint();
    }
    public void createPanelFormulaSelection(VerificationPresenter ac){
        setPanel();
        panelFormulaSelection = new FormulaSelection(ac);
        panel.add(panelFormulaSelection);
        panel.revalidate();
        panel.repaint();
        repaint();
    }

    public void createPanelPush(VerificationPresenter ac) {
        setPanel();
        panelPush = new PushView(ac);
        panel.add(panelPush);
        panel.revalidate();
        panel.repaint();
        repaint();
    }

    private void addHeader(VerificationPresenter ac) {
        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        this.getContentPane().add(panel, BorderLayout.CENTER);
        panelMainWindow = new MainWindow(ac);
        panel.add(panelMainWindow, BorderLayout.CENTER);
    }
    private void setPanel() {
        if (panelMainWindow != null) {
            panelMainWindow.setVisible(false);
            remove(panelMainWindow);
        }
        if (panelPush != null) {
            panelPush.setVisible(false);
            remove(panelPush);
        }
        if (panelFormulaSelection != null) {
            panelFormulaSelection.setVisible(false);
            remove(panelFormulaSelection);
        }
        if (panelVolume != null) {
            panelVolume.setVisible(false);
            remove(panelVolume);
        }
        if (panelDensity != null) {
            panelDensity.setVisible(false);
            remove(panelDensity);
        }
        if(panelGravity != null){
            panelGravity.setVisible(false);
            remove(panelGravity);
        }

    }

    public MainWindow getPanelMainWindow() {
        return panelMainWindow;
    }

    public FormulaSelection getPanelFormulaSelection() {
        return panelFormulaSelection;
    }

    public PushView getPanelPush() {
        return panelPush;
    }

    public VolumeView getPanelVolume() {
        return panelVolume;
    }

    public DensityView getPanelDensity() {
        return panelDensity;
    }

    public GravityView getPanelGravity() {
        return panelGravity;
    }
}