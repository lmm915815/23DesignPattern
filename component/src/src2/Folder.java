/*************************************************************************
	> File Name: Folder.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 03:28:12 AM PDT
 ************************************************************************/
package indi.tlq.componet;
import java.util.*;
public class Folder extends AbstractFile{
    private ArrayList<AbstractFile> list = new ArrayList<AbstractFile>();
    private String name;

    Folder(String m){
        name = m;
    }

    @Override
    public void add(AbstractFile file){
        list.add(file);
    }

    @Override
    public void remove(AbstractFile file){
        list.remove(file);
    }

    @Override
    public AbstractFile getChild(int i){
        return list.get(i);
    }

    @Override
    public void killVirus(){
        System.out.println("folder kill virus");
        for(AbstractFile file:list){
            file.killVirus();
        }
    }
}

