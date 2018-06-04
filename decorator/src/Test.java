/*************************************************************************
	> File Name: Test.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 06:56:17 AM PDT
 ************************************************************************/
package indi.tlq.decorator;
public class Test{
    public static void main(String[] args){
        Drink  coffee = new Coffee(10);        
        System.out.println(coffee.toString() + ":" + coffee.cost());

        coffee = new Mlik(coffee);
        System.out.println(coffee.toString() + ":" + coffee.cost());
        
        coffee = new Sugar(coffee);
        System.out.println(coffee.toString() + ":" + coffee.cost());
    }
}

