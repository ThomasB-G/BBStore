
import java.util.*;

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
        stock.forEach((a) -> { System.out.print(a.toString()); });
    }
}
