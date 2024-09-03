/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filtroJava;

/**
 *
 * @author camper
 */
import java.util.HashMap;
import java.util.Map;

public class MisionNinjaCrud extends AbstractCrud<MisionNinja> {
    
    private Map<Integer, MisionNinja> misionNinjaDatabase = new HashMap<>();

    @Override
    public void create(MisionNinja misionNinja) {
        misionNinjaDatabase.put(misionNinja.getId(), misionNinja);
        super.create(misionNinja); // Llama a la implementación común
    }

    @Override
    public MisionNinja read(int id) {
        return misionNinjaDatabase.get(id);
    }

    @Override
    public void update(int id, MisionNinja misionNinja) {
        if (misionNinjaDatabase.containsKey(id)) {
            misionNinjaDatabase.put(id, misionNinja);
            super.update(id, misionNinja); // Llama a la implementación común
        } else {
            System.out.println("mision not found with id: " + id);
        }
    }

    @Override
    public void delete(int id) {
        if (misionNinjaDatabase.containsKey(id)) {
            misionNinjaDatabase.remove(id);
            super.delete(id); // Llama a la implementación común
        } else {
            System.out.println("mision not found with id: " + id);
        }
    }

    public Map<Integer, MisionNinja> getNinjaDatabase() {
        return misionNinjaDatabase;
    }
}