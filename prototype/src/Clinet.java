/*************************************************************************
	> File Name: Clinet.java
	> Author: 
	> Mail: 
	> Created Time: Fri 01 Jun 2018 02:08:33 AM PDT
 ************************************************************************/
package indi.tlq.prototype;
public class Clinet{

    public static void main(String[] args){

        Book book1 = new Book();
        book1.setTitle("Tiles11");
        book1.addImage("Image11");
        
        System.out.println("book1");
        book1.show();
        
        // 克隆book1 ,并设置title
        Book book2 = book1.clone();
        book2.setTitle("title1-2");
        
        System.out.println("book2");
        book2.show();
        
        System.out.println("book1");
        book1.show();

        book2.addImage("image222");

        book1.show();

        book2.show();

        System.out.println("deep copy")    ;

        Book book3 =    book1.deepClone();
        book3.addImage("image111120")  ;
        book1.show();
        book3.show();


        System.out.println("deep copy 2");
        Book book4 = book1.deepClone2();
        book4.addImage("imagedeepcopy2");
        book1.show();
        book4.show();
    }
}

