/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filtroJava;
import java.util.Scanner;
/**
 *
 * @author camper
 */
public class FiltroJava {

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        NinjaCrud ninjaCrud = new NinjaCrud();
        Ninja ninja1 = new Ninja(1, "Naruto","rasengan","konoha","shunnin");
        Ninja ninja2 = new Ninja(2, "Sasuke","chidori","konoha","shunnin");
        Ninja ninja3 = new Ninja(3, "RockLee","LotoEscondido","konoha","shunnin");
        ninjaCrud.create(ninja1);
        ninjaCrud.create(ninja2);
        ninjaCrud.create(ninja3);
        MisionCrud misionCrud = new MisionCrud();
        Mision mision1 = new Mision(1,"rescataGato","rescatar un gato",10.22,"shunnin");
        Mision mision2 = new Mision(2,"escoltar","escoltar al jefe",20.22,"gennin");
        misionCrud.create(mision2);
        misionCrud.create(mision1);
        MisionNinjaCrud misionNinjaCrud = new MisionNinjaCrud();
        OUTER:
        while (true) {
            System.out.println("Ingrese la seleccion de tu preferencia");
            System.out.println("1.Listar Ninjas con habilidades");
            System.out.println("2.Asignar mision Ninja");
            System.out.println("3.Salir");
            int selec = justNumber(scanner.next());
            switch (selec) {
                case 1 -> { 
                    for(int i = 1; i<=ninjaCrud.getNinjaDatabase().size(); i++){
                        System.out.println(ninjaCrud.read(i));
                    }
                }
                case 2 ->
                    System.out.println("en costruccion");
                case 3 -> {
                    break OUTER;
                }
                default -> System.out.println("Dato incorrecto");
            }
        }
    }
       
    public static int justNumber(String text){
        try{
            int x = Integer.parseInt(text);
            return x;
        }catch(Exception e){
            System.out.println("Dato ingresado incorrecto"+e);
        }
    return 0;
    }
    }

