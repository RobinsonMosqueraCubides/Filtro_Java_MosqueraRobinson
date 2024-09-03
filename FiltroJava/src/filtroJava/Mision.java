/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filtroJava;

/**
 *
 * @author camper
 */
public class Mision {
    private int id;
    private String name;
    private String description;
    private double recompensa;
    private String rango;

    // Constructor
    public Mision(int id, String name, String skill, double reco, String rango) {
        this.id = id;
        this.name = name;
        this.description = skill;
        this.recompensa = reco;
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Ninja id=" + id + ", name='" + name + "' recompensa= "+recompensa;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public double getRecompensa() {
        return recompensa;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRecompensa(double recompensa) {
        this.recompensa = recompensa;
    }


    
}