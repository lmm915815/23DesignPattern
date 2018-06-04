/*************************************************************************
	> File Name: Componet.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 02:49:11 AM PDT
 ************************************************************************/
package indi.tlq.componet;
abstract class Componet{
    public abstract void add(Componet c);
    public abstract void remove(Componet c);
    public abstract Componet getChild(int i);
    public abstract void operator();
}

