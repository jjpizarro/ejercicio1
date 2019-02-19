/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unimagdalena.logica;

import java.time.LocalDate;
import java.util.HashSet;

/**
 *
 * @author Estudiante
 */
public abstract class Curso{
    private String titulo;
    private LocalDate inicio;
    private LocalDate finalizacion;
    private int diasClases;
    private float precioMatricula;
    private HashSet<Alumno> alumnosMatriculados;
    private HashSet<Alumno> aptos;
    private int nAlumnosMatriculados;

    protected Curso(String titulo, LocalDate inicio, LocalDate finalizacion, int diasClases, float precioMatricula) {
        this.titulo = titulo;
        this.inicio = inicio;
        this.finalizacion = finalizacion;
        this.diasClases = diasClases;
        this.precioMatricula = precioMatricula;
        this.alumnosMatriculados = new HashSet<Alumno>();
        this.aptos = new HashSet<Alumno>();
    }
    
    public boolean haTerminado(){
        return LocalDate.now().isAfter(finalizacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public LocalDate getFinalizacion() {
        return finalizacion;
    }

    public int getDiasClases() {
        return diasClases;
    }

    public float getPrecioMatricula() {
        return precioMatricula;
    }

    public HashSet<Alumno> getAlumnosMatriculados() {
        return alumnosMatriculados;
    }

    public HashSet<Alumno> getAptos() {
        return aptos;
    }

    public int getnAlumnosMatriculados() {
        return nAlumnosMatriculados;
    }
    
     
}
