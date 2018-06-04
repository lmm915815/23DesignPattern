/*************************************************************************
	> File Name: EagerSingleton.java
	> Author: 
	> Mail: 
	> Created Time: Sat 02 Jun 2018 12:47:09 AM PDT
 ************************************************************************/

package indi.tlq.singleton;
public class EagerSingleton{

    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return instance;
    }

}

