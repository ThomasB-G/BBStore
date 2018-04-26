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
import javax.swing.table.TableModel;

public class Cart implements TableModel {
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
        return 2;
    }

    @Override
    public int getColumnCount() {
        return cart.size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch(columnIndex)
        {
            case 0:
                return "Name";
            case 1:
                return "Price";
        }
        
        return "Unused Column";
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            case 0:
                return (Object) cart.get(rowIndex).getName();
            case 1:
                return (Object) ("$" + cart.get(rowIndex).getCost());
        }
        
        return "unused";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
