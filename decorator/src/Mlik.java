/*************************************************************************
	> File Name: Mlik.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 06:49:10 AM PDT
 ************************************************************************/
package indi.tlq.decorator;
public class Mlik extends DrinkDecorator{
    
    private float prise = 2;
    Mlik(Drink drink){
        super(drink);
    }
    
    @Override
    public float cost(){
        return  super.cost()+ prise;
    }

    @Override
    public  String toString(){
        return super.toString() + "millk";
    }
}

