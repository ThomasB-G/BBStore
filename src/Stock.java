/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author russell
 */
import java.util.*;
import java.util.function.Predicate;

public class Stock {
    private LinkedList<Animal> stock;
    
    Stock()
    {
        stock = new LinkedList<>();
    }
    
    public void addAnimal(Animal a)
    {
        stock.add(a);
    }
    
    public void removeAnimal(Animal a)
    {
        stock.remove(a);
    }
    
    public void printList()
    {
        stock.forEach((a) -> System.out.print(a.toString()));
    }
    
    public LinkedList<Animal> returnListAsArray()
    {
        return stock;
    }
    
    public boolean animalExists(Animal a)
    {
        return stock.stream().anyMatch((Predicate<? super Animal>) a);
    }
    
    public Animal getAnimal(String a)
    {
        return stock.stream().filter(b -> b.getName().equalsIgnoreCase(a)).findFirst().get();
    }
    
    public Animal getAnimal(Animal a)
    {
        return stock.stream().filter(b -> b.equals(a)).findFirst().get();
    }
}
