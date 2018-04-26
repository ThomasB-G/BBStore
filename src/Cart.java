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
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class Cart extends AbstractTableModel {
    private LinkedList<Animal> cart;
    private Controller cntl;
    
    Cart(Controller cntl)
    {
        this.cntl = cntl;
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
    
    public double totalCost()
    {
        // or cart.stream().map(Animal::getCost()).sum(); <-- this might work too still working on it
        return cart.stream().map((a) -> a.getCost()).reduce(0.0, (a, b) -> a + b);
    }

     @Override
    public int getRowCount() {
        return this.cart.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return (Object) cart.get(rowIndex).getName();
            case 1:
                return (Object) cart.get(rowIndex).getCost();
            default:
                return null;
        }

    }


}
