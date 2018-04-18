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

public class Cart {
    private LinkedList<Animal> cart;
    
    Cart()
    {
        cart = new LinkedList<>();
    }
    
    public void addToCart(Animal a)
    {
        cart.add(a);
    }
    
    public void removeFromCart(Animal a)
    {
        cart.remove(a);
    }
    
    public Optional<Double> totalCost()
    {
        return cart.stream().map((a) -> a.getCost()).reduce( (accumulator, _item) -> accumulator + _item);
    }
}
