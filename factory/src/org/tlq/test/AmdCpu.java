/*************************************************************************
	> File Name: AmdCput.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 02:11:49 AM PDT
 ************************************************************************/
package org.tlq.test;
public class AmdCpu implements Cpu{

    private int pins = 0;
    public AmdCpu(int pins){
        this.pins =  pins;
    }

   @Override
   public void calculate(){
       System.out.println("AMD CPU 的针脚数:"+ pins);
   }
}

