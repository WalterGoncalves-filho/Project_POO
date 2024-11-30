package com.aula03;

public class Quadrado extends FiguraGeometrica {
    private float lado;
    
    public Quadrado() {
        super("Quadrado");
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area() {
        return this.lado * this.lado;
    }

}
