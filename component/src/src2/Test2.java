/*************************************************************************
	> File Name: Test2.java
	> Author: 
	> Mail: 
	> Created Time: Mon 04 Jun 2018 03:31:21 AM PDT
 ************************************************************************/
package indi.tlq.componet;
public class Test2 {
    public static void main(String[] args){
        AbstractFile file1 = new ImageFile("png");
        AbstractFile file2 = new VidioFile("vodia");
        AbstractFile  folder = new Folder("folder");
        folder.add(file1);
        folder.add(file2);

        file1.killVirus();
        folder.killVirus();
    }
}

