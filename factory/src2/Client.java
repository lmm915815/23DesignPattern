/*************************************************************************
	> File Name: Client.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 09:25:52 PM PDT
 ************************************************************************/
package org.tlq.abstractfactory;
import org.tlq.test.*;
public class Client{
    public static void main(String[] args){
        createComputer(args[0]);
    }
    private static void createComputer(String type){
        ComputerEngineer cn  = new ComputerEngineer();
        AbstractFactory af = null;
        System.out.println(type);
        if(type.equals("amd")){
        System.out.println(type);
            af = new AmdFactory();

        }else{
           af  = new InterFactory();
        }
        cn.makeComputer(af);

    }
}

