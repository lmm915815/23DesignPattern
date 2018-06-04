/*************************************************************************
	> File Name: Directior.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 11:13:06 PM PDT
 ************************************************************************/
package org.tlq.builder;
public class Director {
    public void build(Builder builder){
        builder.builderCPU();
        builder.builderMainboard();
        builder.builderHD();
    }
}

