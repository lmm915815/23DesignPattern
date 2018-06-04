/*************************************************************************
	> File Name: Test3.java
	> Author: 
	> Mail: 
	> Created Time: Sat 02 Jun 2018 01:14:44 AM PDT
 ************************************************************************/
package indi.tlq.singleton;
public class Test3{
    public static void main(String[] args){
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        if(instance == instance2){
            System.out.println("is the same calss");
        }else{
            System.out.println("is not the same class");
        }
    }
}

