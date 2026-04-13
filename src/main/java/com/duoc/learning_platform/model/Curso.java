package com.duoc.learning_platform.model;

public class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private Boolean activo;
    private int capacidad;

    public Curso(int id, String nombre, String descripcion, Boolean activo, int capacidad) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.activo = activo;
        this.capacidad = capacidad;
    }

    public int getId() {return id;}

    public String getNombre() {return nombre;}

    public String getDescripcion() {return descripcion;}

    public Boolean getActivo() {return activo;}

    public int getCapacidad() {return capacidad;}
}
