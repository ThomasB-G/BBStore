/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author russell
 */
public class Dog implements Animal {
    private double cost;
    private String name;
    private int age;
    private double weight;
    private double height;
    private int id;
    
    Dog()
    {
        
    }

    public Dog(double cost, String name, int age, double weight, double height, int id) {
        this.cost = cost;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.id = id;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public int getID() {
        return id;
    }
}
