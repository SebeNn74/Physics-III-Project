package com.proyect_app.presenter;

import com.proyect_app.model.Model;
import com.proyect_app.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerificationPresenter implements ActionListener {
    private View view;
    private Model model;

    public VerificationPresenter() {
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

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "oneOption":
                view.createPanelFormulaSelection(this);
                break;
            case "twoOption":
                break;
            case "E":
                view.createPanelPush(this);
                view.getPanelPush().showResult(pushForce());
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
            case "Vf":
                view.createPanelVolume(this);
                break;
            case "g":
                view.createPanelGravity(this);
                break;
            case "pf":
                view.createPanelDensity(this);
                break;
            case "Volver":
                view.createPanelFormulaSelection(this);
                break;
            case "Inicio":
                view.createPanelMainWindow(this);
            break;
            default:
                break;
        }

    }

}