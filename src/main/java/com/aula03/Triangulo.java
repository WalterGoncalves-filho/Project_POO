package com.aula03;

public class Triangulo extends FiguraGeometrica{
    private float altura;
    private float base;
    private float area;


    public Triangulo() {
        super("Triangulo");
    }

   public float getArea() {
    return area;
}

public void setArea(float area) {
    this.area = area;
}

 public Triangulo(String nomeFigura) {
        super(nomeFigura);
    }


    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public float area() {
        return this.altura * this.base / (float) 2 ;
    }

    

    
}
