/*************************************************************************
	> File Name: MainboardFactory.java
	> Author: 
	> Mail: 
	> Created Time: Thu 31 May 2018 02:24:18 AM PDT
 ************************************************************************/
package org.tlq.test;
public class MainboardFactory{

    public static Mainboard createMainboard(int type){

        Mainboard mainboard = null;
        if(type == 1){
            mainboard = new InterMainboard(755);
        }else if (type ==2){
            mainboard = new AmdMainboard(938);
        }

        return  mainboard;
    }
}

