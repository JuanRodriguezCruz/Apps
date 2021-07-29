package com.example.examen.model;

import javax.persistence.*;
import java.sql.*;
@Entity(name = "Comuna")
@Table(name = "comuna")
public class Comuna {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="nombre")
    private String nombre;

    @Column(name="totalAvistamientos")
    private int totalAvistamientos;

    @Column(name="region_id")
    private int insecto;

    @Column(name="aracnido")
    private int aracnido;

    @Column(name="miriapodo")
    private int miriapodo;

    @Column(name="nose")
    private int nose;

    @Column(name="vivo")
    private int vivo;

    @Column(name="muerto")
    private int muerto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalAvistamientos() {
        return totalAvistamientos;
    }

    public void setTotalAvistamientos(int totalAvistamientos) {
        this.totalAvistamientos = totalAvistamientos;
    }

    public int getInsecto() {
        return insecto;
    }

    public void setInsecto(int insecto) {
        this.insecto = insecto;
    }

    public int getAracnido() {
        return aracnido;
    }

    public void setAracnido(int aracnido) {
        this.aracnido = aracnido;
    }

    public int getMiriapodo() {
        return miriapodo;
    }

    public void setMiriapodo(int miriapodo) {
        this.miriapodo = miriapodo;
    }

    public int getNose() {
        return nose;
    }

    public void setNose(int nose) {
        this.nose = nose;
    }

    public int getVivo() {
        return vivo;
    }

    public void setVivo(int vivo) {
        this.vivo = vivo;
    }

    public int getMuerto() {
        return muerto;
    }

    public void setMuerto(int muerto) {
        this.muerto = muerto;
    }
}
