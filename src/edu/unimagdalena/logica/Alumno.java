/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unimagdalena.logica;

import java.util.HashSet;

/**
 *
 * @author Estudiante
 */
public class Alumno {
    
    private final String nombre;
    private final String dni;
    private float credito;
    private HashSet<Curso> cursosMatriculados;

    public Alumno(String nombre, String dni, float credito) {
        this.nombre = nombre;
        this.dni = dni;
        this.credito = credito;
        this.cursosMatriculados = new HashSet<Curso>();
    }

    public Alumno(String nombre, String dni) {
        this(nombre, dni, 100);
    }
    
    public void incrementarCredito(float cantidad){
        this.credito += cantidad;
    }
    public void decrementarCredito(float cantidad){
        this.credito -= cantidad;
    }
    public void anadirCurso(Curso c){
        this.cursosMatriculados.add(c);
    }
    
}
