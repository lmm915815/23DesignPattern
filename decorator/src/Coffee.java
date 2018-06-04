/*************************************************************************
	> File Name: Coffee.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 06:41:49 AM PDT
 ************************************************************************/
package indi.tlq.decorator;
public class Coffee implements Drink{
    private float mon;
    Coffee(float mon){
        this.mon = mon;
    }

    @Override
    public float cost(){
        return mon;
    }

    @Override
    public String toString(){
        return "coffee";
    }
}

