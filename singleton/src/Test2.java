/*************************************************************************
	> File Name: Test2.java
	> Author: 
	> Mail: 
	> Created Time: Sat 02 Jun 2018 01:01:18 AM PDT
 ************************************************************************/
package indi.tlq.singleton;
public class Test2{

    public static void main(String[] args){

        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton instance2=LazySingleton.getInstance();
        if(instance == instance2){
            System.out.println("is the same class");
        }
        else
        {
            System.out.println("is not the same class");
        }
    }
}

