/*************************************************************************
	> File Name: AmdMainboard.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 02:21:13 AM PDT
 ************************************************************************/
package org.tlq.test;
public class AmdMainboard implements Mainboard{


    private int cpuHoles = 0;
    public AmdMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU(){
        System.out.println("AMD主板的CPU插槽孔数:"+cpuHoles);
    }
}

