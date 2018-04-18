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

public class CurrencyConverter {
    
    private EarthCoins earthCoins;
    private WizardGold wizardGold;
    
    CurrencyConverter()
    {
        
    }
    
    public double earthCoinsToDollars(double amount)
    {
        return earthCoins.toDollar(amount);
    }
    
    public double wizardGoldToDollars(double amount)
    {
        return wizardGold.toDollar(amount);
    }
    
    interface Currency
    {
        public double toDollar(double amount);
    }
    
    class EarthCoins implements Currency
    {

        @Override
        public double toDollar(double amount) {
            return amount * 1000.00;
        }
        
    }
    
    class WizardGold implements Currency
    {
        @Override
        public double toDollar(double amount) {
            return amount * 100000.00;
        }
    }
    
}
