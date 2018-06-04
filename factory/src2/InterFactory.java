/*************************************************************************
	> File Name: InterFactory.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 09:11:09 PM PDT
 ************************************************************************/
package org.tlq.abstractfactory;
import org.tlq.test.*;
public class InterFactory implements AbstractFactory{
    @Override
    public Cpu createCpu(){
        return  new  InterCpu(755);
    }
    @Override
    public Mainboard createMainboard(){
        return new  InterMainboard(755);

    }
}

