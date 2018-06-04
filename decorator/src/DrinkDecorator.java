/*************************************************************************
	> File Name: DrinkDecorator.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 06:44:43 AM PDT
 ************************************************************************/
package indi.tlq.decorator;
public class DrinkDecorator implements Drink{
    
    protected Drink drink;
    DrinkDecorator(Drink drink){
        this.drink = drink;
    }
    @Override
    public float cost(){
        return  drink.cost();
    }

    @Override
    public String toString(){
        return drink.toString();
    }
}

