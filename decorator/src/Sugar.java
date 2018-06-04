/*************************************************************************
	> File Name: Sugar.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 06:53:33 AM PDT
 ************************************************************************/
package indi.tlq.decorator;
public class Sugar extends DrinkDecorator{
    Sugar(Drink drink){
        super(drink);
    }

    @Override
    public float cost(){
        return super.cost() + 3;
    }

    @Override
    public String toString(){
        return super.toString()+"Sugar";
    }

}

