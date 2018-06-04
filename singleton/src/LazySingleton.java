/*************************************************************************
	> File Name: LazySingleton.java
	> Author: 
	> Mail: 
	> Created Time: Sat 02 Jun 2018 12:59:12 AM PDT
 ************************************************************************/
package indi.tlq.singleton;
public class LazySingleton{
    private static LazySingleton instance = null;
    private LazySingleton(){};

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}

