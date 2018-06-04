/*************************************************************************
	> File Name: Singleton2.java
	> Author: 
	> Mail: 
	> Created Time: Sat 02 Jun 2018 01:22:01 AM PDT
 ************************************************************************/
package indi.tlq.singleton;
public class Singleton2{
    private Singleton2(){}

    // 静态内部类
    private static class SingletonInner{
        private static Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return SingletonInner.instance;
    }
}

