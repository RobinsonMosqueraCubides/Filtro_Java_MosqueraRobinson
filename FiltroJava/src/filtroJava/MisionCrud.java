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

public class MisionCrud extends AbstractCrud<Mision> {
    
    private Map<Integer, Mision> misionDatabase = new HashMap<>();

    @Override
    public void create(Mision mision) {
        misionDatabase.put(mision.getId(), mision);
        super.create(mision); // Llama a la implementación común
    }

    @Override
    public Mision read(int id) {
        return misionDatabase.get(id);
    }

    @Override
    public void update(int id, Mision mision) {
        if (misionDatabase.containsKey(id)) {
            misionDatabase.put(id, mision);
            super.update(id, mision); // Llama a la implementación común
        } else {
            System.out.println("mision not found with id: " + id);
        }
    }

    @Override
    public void delete(int id) {
        if (misionDatabase.containsKey(id)) {
            misionDatabase.remove(id);
            super.delete(id); // Llama a la implementación común
        } else {
            System.out.println("mision not found with id: " + id);
        }
    }

    public Map<Integer, Mision> getNinjaDatabase() {
        return misionDatabase;
    }
}