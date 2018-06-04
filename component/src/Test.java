/*************************************************************************
	> File Name: Test.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 03:07:26 AM PDT
 ************************************************************************/
package indi.tlq.componet;
public class Test{
    public static void main(String[] args){
        Componet c1 = new Leaf();
        Componet c2 = new Composite();
        Componet c3 = new Leaf();
        c2.add(c1);
        c2.operator();
        c3.operator();
    }
}

