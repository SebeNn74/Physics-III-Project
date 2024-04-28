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
        if (e.getActionCommand().equals("oneOption")) {
            view.createPanelFormulaSelection(this);
        }
        if (e.getActionCommand().equals("twoOption")) {
            view.createPanelWeightFormula(this);
        }
        if (e.getActionCommand().equals("E")) {
            view.createPanelPush(this);
            view.getPanelPush().showResult(pushForce());
        }
        if (e.getActionCommand().equals("CalcularEmp")) {
            view.getPanelPush().showResult(pushForce());
        }
        if (e.getActionCommand().equals("CalcularGrav")) {
            view.getPanelGravity().showResult(gravityForce());
        }
        if (e.getActionCommand().equals("CalcularVol")) {
            view.getPanelVolume().showResult(volume());
        }
        if (e.getActionCommand().equals("CalcularDen")) {
            view.getPanelDensity().showResult(density());
        }
        if (e.getActionCommand().equals("CalcularPeso")){
            view.getPanelWeight().showResult(calculateWeight());
        }
        if (e.getActionCommand().equals("CalcularPesoAp")){
            view.getPanelApparentWeight().showResult(calculateApparenWeight());
        }
        if (e.getActionCommand().equals("CalcularEmPeso")){
            view.getPanelPushWeight().showResult(calculatePushWeightForce());
        }
        if (e.getActionCommand().equals("Vf")) {
            view.createPanelVolume(this);
        }
        if (e.getActionCommand().equals("g")) {
            view.createPanelGravity(this);
        }
        if (e.getActionCommand().equals("pf")) {
            view.createPanelDensity(this);
        }
        if (e.getActionCommand().equals("Volver")) {
            view.createPanelFormulaSelection(this);
        }
        if (e.getActionCommand().equals("VolverDos")) {
            view.createPanelWeightFormula(this);
        }
        if (e.getActionCommand().equals("EWeight")){
            view.createPanelPushWeight(this);
        }
        if (e.getActionCommand().equals("W")){
            view.createPanelWeight(this);
        }
        if (e.getActionCommand().equals("Wa")){
            view.createPanelApparentWeight(this);
        }
    }

    /*
     * public void cargarDatos() {
     * DefaultTableModel table = new DefaultTableModel();
     * int counter=0;
     * /**Asignacion del numero y nombre de las columnas de la tabla
     */
    /*
     * table.addColumn("Indice");
     * table.addColumn("Ingrediente");
     * table.addColumn("Cantidad");
     * for (Ingredient ingr : inv.getIngredientList2()) {
     * /**Creacion de un arreglo de objetos, el cual contiene la informacion
     * que se mostrará en cada una de las filas de la tabla
     */
    /*
     * Object[] fila = new Object[3];
     * counter++;
     * fila[0] = counter;
     * fila[1] = ingr.getName();
     * fila[2] = ingr.getQuantity();
     * /**Asignacion del arreglo a las filas de la tabla
     */
    /*
     * table.addRow(fila);
     * }
     * /**Metodo de la vista que solicita la tabla creada, y la almacena
     */
    /*
     * view.getPanelInfoInventory().updateTable(table);
     * }
     * public void dataVerification() {
     * pr.crearPropertiesFile();
     * String nombreUsuario = "";
     * String password = "";
     * nombreUsuario = view.user();
     * /**Verificacion del nombre de usuario
     */
    /*
     * if (pr.getDatos().get(0).equals(nombreUsuario)) {
     * password = view.password();
     * /**Verificacion de contraseña
     */
    /*
     * if (pr.getDatos().get(1).equals(password)) {
     * view.createPanelInventoryAdm(this);
     * 
     * } else {
     * view.notifyWarning("La clave ingresada es incorrecta");
     * }
     * } else {
     * view.notifyWarning("Información incorrecta");
     * }
     * }
     */
    public static void main(String[] args) {
        new Presenter().actionPerformed(null);
    }
}