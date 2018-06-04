/*************************************************************************
	> File Name: AbstractFile.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 03:13:01 AM PDT
 ************************************************************************/
package indi.tlq.componet;
public abstract class AbstractFile{
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile  getChild(int i);
    public abstract void killVirus();
}

