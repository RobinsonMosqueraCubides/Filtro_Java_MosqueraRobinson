/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filtroJava;

/**
 *
 * @author camper
 */
public abstract class AbstractCrud<T> implements CrudOperations<T> {
    
    @Override
    public void create(T item) {
        System.out.println("Creating: " + item.toString());
    }

    @Override
    public T read(int id) {
        System.out.println("Reading item with id: " + id);
        return null; // Aquí simplemente retornamos null para simplificar
    }

    @Override
    public void update(int id, T item) {
        System.out.println("Updating item with id: " + id);
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting item with id: " + id);
    }
}