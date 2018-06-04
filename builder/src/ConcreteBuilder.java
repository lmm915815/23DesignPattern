/*************************************************************************
	> File Name: ConcreteBuilder.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 11:14:42 PM PDT
 ************************************************************************/
package org.tlq.builder;
public class ConcreteBuilder extends Builder{
    Computer computer = new Computer();
    @Override
    public void builderCPU(){
        computer.add("install cpu");
    }

    @Override
    public void builderMainboard(){
        computer.add("install mainboard ");
    }

    @Override
    public void builderHD(){
        computer.add("install hd ");
    }

    @Override
    public Computer getComputer(){
        return computer;
    }
}

