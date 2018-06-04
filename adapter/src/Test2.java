/*************************************************************************
	> File Name: Test2.java
	> Author: 
	> Mail: 
	> Created Time: Sat 02 Jun 2018 08:36:11 AM PDT
 ************************************************************************/
package indi.tlq.adapter;
public class Test2{
    public static void main(String[] args){
        Usb  usb =  new Usber();
        Ps2 p=new Adapter2(usb);
        p.isPs2();
    }
}

