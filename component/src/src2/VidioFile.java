/*************************************************************************
	> File Name: VidioFile.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 03:24:35 AM PDT
 ************************************************************************/
package indi.tlq.componet;
public class VidioFile extends AbstractFile{
    private String name ;
    VidioFile(String name){
        this.name = name;
    }

    @Override
    public void add(AbstractFile file){
        System.out.println("not support");
    }
    @Override
    public void remove(AbstractFile file){
        System.out.println("not support");
    }
    @Override
    public AbstractFile getChild(int i){
        System.out.println("not support");
        return null;
    }

    @Override
    public void killVirus(){
        System.out.println("Vidio file kill virus");
    }
}

