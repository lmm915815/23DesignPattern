/*************************************************************************
	> File Name: ImageFile.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 03:19:56 AM PDT
 ************************************************************************/
package indi.tlq.componet;
public class ImageFile extends AbstractFile{
    private String name ;

    ImageFile(String name){
        this.name = name;
    }
    public void add(AbstractFile file){
        System.out.println("not support");
    }

    public void remove(AbstractFile file){
        System.out.println("not support");
    }
    public AbstractFile getChild(int i){
        System.out.println("not support");
        return null;
    }
    public void killVirus(){
        System.out.println("image file kill virus");
    }
}

