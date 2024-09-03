/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package filtroJava;

/**
 *
 * @author camper
 */
public interface CrudOperations<T> {
    void create(T item);
    T read(int id);
    void update(int id, T item);
    void delete(int id);
}