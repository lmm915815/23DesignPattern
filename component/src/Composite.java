/*************************************************************************
	> File Name: Composite.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 02:59:02 AM PDT
 ************************************************************************/
package indi.tlq.componet;
import java.util.*;
public class Composite extends Componet{

    private ArrayList<Componet> list = new ArrayList<Componet>();
    
    @Override
    public void add(Componet c){
        list.add(c);
    }
    
    @Override
    public void remove(Componet c){
        list.remove(c);
    }

    @Override
    public Componet getChild(int i){
        return (Componet)list.get(i);
    }

    public void operator(){
        for(Object obj:list){
            ((Componet)obj).operator();
        }
    }


}

