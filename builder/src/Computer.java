/*************************************************************************
	> File Name: Computer.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 11:16:32 PM PDT
 ************************************************************************/
package org.tlq.builder;
import java.util.*;
public class Computer{
    private List<String> parts = new ArrayList<String>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        for(String s:parts){
            System.out.println(s + "installed");
        }
        System.out.println("complented!!!");
    }
}

