/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filtroJava;

/**
 *
 * @author camper
 */
public class Ninja {
    private int id;
    private String name;
    private String skill;
    private String aldea;
    private String rango;

    // Constructor
    public Ninja(int id, String name, String skill, String aldea, String rango) {
        this.id = id;
        this.name = name;
        this.skill = skill;
        this.aldea = aldea;
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Ninja id=" + id + ", name='" + name + "' skill= "+skill;
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

    public String getSkill() {
        return skill;
    }

    public String getAldea() {
        return aldea;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }
    
}