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

public class NinjaCrud extends AbstractCrud<Ninja> {
    
    private Map<Integer, Ninja> ninjaDatabase = new HashMap<>();

    @Override
    public void create(Ninja ninja) {
        ninjaDatabase.put(ninja.getId(), ninja);
        super.create(ninja); // Llama a la implementación común
    }

    @Override
    public Ninja read(int id) {
        return ninjaDatabase.get(id);
    }

    @Override
    public void update(int id, Ninja ninja) {
        if (ninjaDatabase.containsKey(id)) {
            ninjaDatabase.put(id, ninja);
            super.update(id, ninja); // Llama a la implementación común
        } else {
            System.out.println("Ninja not found with id: " + id);
        }
    }

    @Override
    public void delete(int id) {
        if (ninjaDatabase.containsKey(id)) {
            ninjaDatabase.remove(id);
            super.delete(id); // Llama a la implementación común
        } else {
            System.out.println("Ninja not found with id: " + id);
        }
    }

    public Map<Integer, Ninja> getNinjaDatabase() {
        return ninjaDatabase;
    }
}