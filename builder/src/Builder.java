/*************************************************************************
	> File Name: Builder.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 11:11:06 PM PDT
 ************************************************************************/
package org.tlq.builder;
public abstract class Builder{
    public abstract void builderCPU();
    public abstract void builderMainboard();
    public abstract void builderHD();
    public abstract Computer getComputer();
}

