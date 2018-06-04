/*************************************************************************
	> File Name: Usber.java
	> Author: 
	> Mail: 
	> Created Time: Sat 02 Jun 2018 08:18:26 AM PDT
 ************************************************************************/
package indi.tlq.adapter;
public class Usber implements Usb{
    @Override
    public void isUsb(){
        System.out.println("----usb-----");
    }
}

