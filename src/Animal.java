
import java.util.Optional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author russell
 */
public interface Animal 
{
    public double getCost();
    
    public String getName();
    
    public int getAge();
    
    public double getWeight();
    
    public double getHeight();
    
    public int getID();
    
    public Animal valueOf(Optional<Animal> a);
    
    @Override
    public String toString();
}
