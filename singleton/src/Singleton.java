/*************************************************************************
	> File Name: Singleton.java
	> Author: 
	> Mail: 
	> Created Time: Sat 02 Jun 2018 01:07:54 AM PDT
 ************************************************************************/
package indi.tlq.singleton;
public class Singleton{
    // volatile 变量的意思是每次获取instance都是充主内存中获取最新的值
    private static volatile Singleton instance = null;
    // 私有构造函数,其他类不能使用new来创建该对象
    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

