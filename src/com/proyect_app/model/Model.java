package com.proyect_app.model;

public class Model {

    public Model() {

    }

    public double calculatePushForce(double density, double volume, double gravity) {
        return density * volume * gravity;
    }

    public double calculateVolume(double density, double push, double gravity) {
        return push / (density * gravity);
    }

    public double calculateDensityForce(double push, double volume, double gravity) {
        return push / (volume * gravity);
    }

    public double calculateGravityForce(double density, double volume, double push) {
        return push / (volume * density);
    }
}
