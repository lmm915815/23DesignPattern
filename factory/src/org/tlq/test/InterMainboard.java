/*************************************************************************
	> File Name: InterMainboard.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 02:17:43 AM PDT
 ************************************************************************/
package org.tlq.test;
public class InterMainboard implements Mainboard{

    private int cpuHoles = 0;

    public InterMainboard(int cpuHoles){
        this.cpuHoles =  cpuHoles;
    }

    @Override
    public void installCPU(){
        System.out.println("Inter主板CPU插槽孔数是:" +cpuHoles)  ;

    }
}

