/*************************************************************************
	> File Name: InterCpu.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 02:08:21 AM PDT
 ************************************************************************/
package org.tlq.test;
public class InterCpu implements Cpu{
    private int pins  = 0;
    public InterCpu(int pins){
        this.pins =  pins  ;
    }
    @Override
    public void calculate(){
        System.out.println( "Inter  CPU  的针脚数:"  +pins)  ;
    }

}

