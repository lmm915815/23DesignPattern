/*************************************************************************
	> File Name: Test1.java
	> Author: 
	> Mail: 
	> Created Time: Sat 02 Jun 2018 12:50:47 AM PDT
 ************************************************************************/

package indi.tlq.singleton;
public class Test1{

    public static void main(String[] args){
        EagerSingleton  instance = EagerSingleton.getInstance();
        EagerSingleton instance2 =EagerSingleton.getInstance();

        if(instance==instance2){
            System.out.println("is same class");
        }
        else
        {
            System.out.println("is not same class");
        }
    }
}

