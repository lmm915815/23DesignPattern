/*************************************************************************
	> File Name: AmdFactory.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 09:14:16 PM PDT
 ************************************************************************/
package org.tlq.abstractfactory;
import org.tlq.test.*;
public class AmdFactory implements AbstractFactory{

    @Override
    public Cpu createCpu(){
        return new AmdCpu(938);
    }

    @Override
    public Mainboard createMainboard(){
        return new AmdMainboard(938);
    }
}

