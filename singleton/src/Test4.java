/*************************************************************************
	> File Name: Test4.java
	> Author: 
	> Mail: 
	> Created Time: Sat 02 Jun 2018 01:26:40 AM PDT
 ************************************************************************/
package indi.tlq.singleton;
public class Test4{
    public static void main(String[] args){
        Singleton2  instance =  Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();

        System.out.println(instance);
        System.out.println(instance2);
    }
}

