/*************************************************************************
	> File Name: Adapter1.java
	> Author: 
	> Mail: 
	> Created Time: Sat 02 Jun 2018 08:20:13 AM PDT
 ************************************************************************/
package indi.tlq.adapter;
public class Adapter1 extends Usber implements Ps2{
    @Override
    public void isPs2(){
        isUsb();
    }
}

