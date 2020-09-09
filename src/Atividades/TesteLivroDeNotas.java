package Atividades;


import sun.nio.cs.ext.SJIS;

import javax.swing.*;

public class TesteLivroDeNotas {
    public static void main(String[] args) {
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        String nomeDoCurso = JOptionPane.showInputDialog ("Prof, qual o  nome do curso?  ");
        livroDeNotas.setNomeDoCurso(nomeDoCurso);
        livroDeNotas.exibirMensagem();


    }
}
