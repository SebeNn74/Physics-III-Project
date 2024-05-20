package com.proyect_app.view;

import com.proyect_app.presenter.Presenter;

import java.awt.BorderLayout;
import javax.swing.*;

public class View extends JFrame {

    private MainWindow panelMainWindow;
    private FormulaSelection panelFormulaSelection;
    private PushView panelPush;
    private VolumeView panelVolume;
    private DensityView panelDensity;
    private GravityView panelGravity;
    private FormulaSelectionWeight panelWeightFormula;
    private PushWeightView panelPushWeight;
    private WeightView panelWeight;
    private ApparentWeightView panelApparentWeight;
    private JPanel panel;
    private FormulaDialog dialog;
    private FormulaWeightDialog wdialog;
    private DocumentDialog docDialog;
    private AppDocumentDialog appDocDialog;
    private ArqDocumentDialog arqDocumentDialog;

    public View(Presenter ac) {
        this.setUpFrame();
        this.initComponents(ac);
    }

    public void notifyWarning(String mesagge) {
        JOptionPane.showMessageDialog(null, mesagge, "", JOptionPane.ERROR_MESSAGE);
    }

    public void initComponents(Presenter ac) {
        addHeader(ac);
    }

    public void setUpFrame() {
        this.setTitle("Calculadora fuerza de empuje");
        this.setSize(700, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void createPanelMainWindow(Presenter ac) {
        setPanel();
        panelMainWindow = new MainWindow(ac);
        panel.add(panelMainWindow);
        panel.revalidate();
        panel.repaint();
        repaint();
    }

    public void createPanelWeight(Presenter ac) {
        setPanel();
        panelWeight = new WeightView(ac);
        panel.add(panelWeight);
        panel.revalidate();
        panel.repaint();
        repaint();
    } 
    
    public void createPanelApparentWeight(Presenter ac) {
        setPanel();
        panelApparentWeight = new ApparentWeightView(ac);
        panel.add(panelApparentWeight);
        panel.revalidate();
        panel.repaint();
        repaint();
    }

    public void createPanelGravity(Presenter ac) {
        setPanel();
        panelGravity = new GravityView(ac);
        panel.add(panelGravity);
        panel.revalidate();
        panel.repaint();
        repaint();
    }
    
    public void createPanelPushWeight(Presenter ac) {
        setPanel();
        panelPushWeight = new PushWeightView(ac);
        panel.add(panelPushWeight);
        panel.revalidate();
        panel.repaint();
        repaint();
    }
    
    public void createPanelWeightFormula(Presenter ac) {
        setPanel();
        panelWeightFormula = new FormulaSelectionWeight(ac);
        panel.add(panelWeightFormula);
        panel.revalidate();
        panel.repaint();
        repaint();
    }

    public void createPanelVolume(Presenter ac) {
        setPanel();
        panelVolume = new VolumeView(ac);
        panel.add(panelVolume);
        panel.revalidate();
        panel.repaint();
        repaint();
    }

    public void createPanelDensity(Presenter ac) {
        setPanel();
        panelDensity = new DensityView(ac);
        panel.add(panelDensity);
        panel.revalidate();
        panel.repaint();
        repaint();
    }

    public void createPanelFormulaSelection(Presenter ac) {
        setPanel();
        panelFormulaSelection = new FormulaSelection(ac);
        panel.add(panelFormulaSelection);
        panel.revalidate();
        panel.repaint();
        repaint();
    }

    public void createPanelPush(Presenter ac) {
        setPanel();
        panelPush = new PushView(ac);
        panel.add(panelPush);
        panel.revalidate();
        panel.repaint();
        repaint();
    }

    private void addHeader(Presenter ac) {
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
        if (panelGravity != null) {
            panelGravity.setVisible(false);
            remove(panelGravity);
        }
        if (panelWeightFormula != null) {
            panelWeightFormula.setVisible(false);
            remove(panelWeightFormula);
        }
        if (panelPushWeight != null) {
            panelPushWeight.setVisible(false);
            remove(panelPushWeight);
        }
        if (panelWeight != null) {
            panelWeight.setVisible(false);
            remove(panelWeight);
        }
        if (panelApparentWeight != null) {
            panelApparentWeight.setVisible(false);
            remove(panelApparentWeight);
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

    public PushWeightView getPanelPushWeight() {
        return panelPushWeight;
    }

    public WeightView getPanelWeight() {
        return panelWeight;
    }

    public ApparentWeightView getPanelApparentWeight() {
        return panelApparentWeight;
    }

    public void createFormulaDialog(Presenter ac){
        dialog = new FormulaDialog();
    }

    public void createWeightFormulaDialog(Presenter ac){
        wdialog = new FormulaWeightDialog();
    }

    public void createDocumentDialog(Presenter ac){
        docDialog = new DocumentDialog(ac);
    }

    public void createAppDocumentDialog(Presenter ac){
        appDocDialog = new AppDocumentDialog();
    }

    public void createArqDocumentDialog(Presenter ac){
        arqDocumentDialog = new ArqDocumentDialog();
    }

}