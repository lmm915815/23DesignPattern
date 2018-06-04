/*************************************************************************
	> File Name: Test.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 11:22:06 PM PDT
 ************************************************************************/
package org.tlq.builder;
public class Test{
    public static void main(String[] args){
        Director d= new Director();
        Builder b = new ConcreteBuilder();
        d.build(b);
        Computer c = b.getComputer();
        c.show();
    }
}

