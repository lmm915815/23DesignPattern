/*************************************************************************
	> File Name: AbstractFactory.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 09:09:10 PM PDT
 ************************************************************************/
package org.tlq.abstractfactory;
import org.tlq.test.*;
public interface AbstractFactory{
    public Cpu createCpu();
    public Mainboard createMainboard();
}

