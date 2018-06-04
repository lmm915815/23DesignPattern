/*************************************************************************
	> File Name: Leaf.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 02:51:17 AM PDT
 ************************************************************************/
package indi.tlq.componet;
public class Leaf extends Componet{
    @Override
    public void add(Componet c){
        System.out.println("this is leaf node add()" );

    }

    @Override
    public void remove(Componet c){
        System.out.println("this is leaf node remove()");

    }

    @Override
    public Componet getChild(int i){
        System.out.println("this is leaf node getChild()");
        return  null;
        
    }

    @Override
    public void operator(){
        System.out.println("this is leaf node");
    }
}

