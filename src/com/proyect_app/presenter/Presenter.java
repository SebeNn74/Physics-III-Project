package com.proyect_app.presenter;

import com.proyect_app.model.Model;
import com.proyect_app.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter implements ActionListener {
    private View view;
    private Model model;

    public Presenter() {
        initComponents();
        view.createPanelMainWindow(this);
        model = new Model();
    }

    public void initComponents() {
        view = new View(this);
    }

    public double pushForce() {
        double density = view.getPanelPush().densityValue();
        double volume = view.getPanelPush().volumeValue();
        double gravity = view.getPanelPush().gravityValue();
        return model.calculatePushForce(density, volume, gravity);
    }

    public double volume() {
        double density = view.getPanelVolume().densityValue();
        double push = view.getPanelVolume().pushValue();
        double gravity = view.getPanelVolume().gravityValue();
        return model.calculateVolume(density, push, gravity);
    }

    public double density() {
        double push = view.getPanelDensity().pushValue();
        double volume = view.getPanelDensity().volumeValue();
        double gravity = view.getPanelDensity().gravityValue();
        return model.calculateDensityForce(push, volume, gravity);
    }

    public double gravityForce() {
        double density = view.getPanelGravity().densityValue();
        double volume = view.getPanelGravity().volumeValue();
        double push = view.getPanelGravity().pushValue();
        return model.calculateGravityForce(density, volume, push);
    }
    public double calculatePushWeightForce( ) {
        double weight= view.getPanelPushWeight().weightValue();
        double apparentWeight = view.getPanelPushWeight().apparentWeightValue();
        return model.calculatePushWeightForce(weight,apparentWeight);
    }
    public double calculateWeight( ) {
       double push=view.getPanelWeight().pushValue();
       double apparentWeight=view.getPanelPushWeight().apparentWeightValue();
       return model.calculateWeight(push,apparentWeight);
    }
    public double calculateApparenWeight() {
        double push=view.getPanelApparentWeight().pushValue();
        double weight=view.getPanelApparentWeight().weightValue();
        return model.calculateApparenWeight(push,weight);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "oneOption":
            view.createPanelFormulaSelection(this);
                break;
            case "twoOption":
                view.createPanelWeightFormula(this);
                break;
            case "Home":
                view.createPanelMainWindow(this);
                break;
            case "E":
                view.createPanelPush(this);
            break;
            case "Vf":
                view.createPanelVolume(this);
            break;
            case "g":
                view.createPanelGravity(this);
            break;
            case "pf":
                view.createPanelDensity(this);
            break;
            case "CalcularEmp":
                view.getPanelPush().showResult(pushForce());
            break;
            case "CalcularGrav":
                view.getPanelGravity().showResult(gravityForce());
            break;
            case "CalcularVol":
                view.getPanelVolume().showResult(volume());
            break;
            case "CalcularDen":
                view.getPanelDensity().showResult(density());
            break;
            case "CalcularPeso":
                view.getPanelWeight().showResult(calculateWeight());
            break;
            case "CalcularPesoAp":
                view.getPanelApparentWeight().showResult(calculateApparenWeight());
            break;
            case "CalcularEmPeso":
                view.getPanelPushWeight().showResult(calculatePushWeightForce());
            break;
            case "VolverFSDenVol":
                view.createPanelFormulaSelection(this);
            break;
            case "VolverFSWeight":
                view.createPanelWeightFormula(this);
            break;
            case "EWeight":
                view.createPanelPushWeight(this);
            break;
            case "W":
                view.createPanelWeight(this);
            break;
            case "Wa":
                view.createPanelApparentWeight(this);
            break;
            default:
                break;
        }

    }

}