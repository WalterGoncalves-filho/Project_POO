package com.aula03;

public abstract class FiguraGeometrica {
    
    private String nomeFigura;
    
    public FiguraGeometrica(String nomeFigura) {
        this.nomeFigura = nomeFigura;
    }

    public String getNomeFigura() {
        return nomeFigura;
    }

    public float area(){
        return -1;
    }
}
