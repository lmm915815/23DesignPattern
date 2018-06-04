/*************************************************************************
	> File Name: Adapter2.java
	> Author: 
	> Mail: 
	> Created Time: Sat 02 Jun 2018 08:32:52 AM PDT
 ************************************************************************/
package indi.tlq.adapter;
public class Adapter2 implements Ps2{
    private   Usb usb = null;

    Adapter2(Usb u){
        usb = u;
    }
    @Override
    public void isPs2(){
        usb.isUsb();
    }
}

