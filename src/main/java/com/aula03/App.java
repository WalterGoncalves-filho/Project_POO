package com.aula03;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) { 
        iniciar();  
        
    }
    
    public static void iniciar(){
        Triangulo objTriangulo = new Triangulo();
        Quadrado objQuadrado = new Quadrado();

        entradaDados(objTriangulo, objQuadrado);
        exibirDados(objTriangulo, objQuadrado);
    }
    public static void entradaDados(Triangulo objTriangulo, Quadrado objQuadrado){
        objTriangulo.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a Altura do Triangulo: ")));
        objTriangulo.setBase(Float.parseFloat(JOptionPane.showInputDialog("Digite a Base do Triangulo: ")));
        objQuadrado.setLado(Float.parseFloat(JOptionPane.showInputDialog("Digite o Lado do Quadrado: ")));

    }
    public static void exibirDados(Triangulo objTriangulo, Quadrado objQuadrado){
        StringBuilder saidaMensagem = new StringBuilder();
        saidaMensagem.append("Figura Geometrica: ").append(objTriangulo.getNomeFigura());
        saidaMensagem.append("\n");

        saidaMensagem.append("Altura: ").append(objTriangulo.getAltura());
        saidaMensagem.append("\n");

        saidaMensagem.append("Base: ").append(objTriangulo.getBase());
        saidaMensagem.append("\n");

        saidaMensagem.append("Area: ").append(objTriangulo.area());
        saidaMensagem.append("\n\n");
        //saidaMensagem.append("\n");

        // Quadrado:
        saidaMensagem.append("Figura Geometrica: ").append(objQuadrado.getNomeFigura());
        saidaMensagem.append("\n");
        
        saidaMensagem.append("Lado: ").append(objQuadrado.getLado());
        saidaMensagem.append("\n");

        saidaMensagem.append("Area: ").append(objQuadrado.area());
        saidaMensagem.append("\n");


        JOptionPane.showMessageDialog(null, saidaMensagem);
    }
}
