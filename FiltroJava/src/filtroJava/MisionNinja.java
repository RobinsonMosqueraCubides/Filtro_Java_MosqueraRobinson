/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filtroJava;

/**
 *
 * @author camper
 */
public class MisionNinja {
    private int id;
    private int id_ninja;
    private int id_mision;
    private String startDate;
    private String endDate;

    public MisionNinja(int id_ninja, int id_mision, String startDate) {
        this.id_ninja = id_ninja;
        this.id_mision = id_mision;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "MisionNinja{" + "id=" + id + ", id_ninja=" + id_ninja + ", id_mision=" + id_mision + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void setId_ninja(int id_ninja) {
        this.id_ninja = id_ninja;
    }

    public void setId_mision(int id_mision) {
        this.id_mision = id_mision;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getId_ninja() {
        return id_ninja;
    }

    public int getId_mision() {
        return id_mision;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
    
    
    
}
