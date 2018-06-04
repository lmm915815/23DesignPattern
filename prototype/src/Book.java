/*************************************************************************
	> File Name: Book.java
	> Author: 
	> Mail: 
	> Created Time: Fri 01 Jun 2018 02:01:04 AM PDT
 ************************************************************************/
package indi.tlq.prototype; 
import java.util.ArrayList;
import java.io.*;

public class Book implements Cloneable ,  Serializable{

    private String title;
    private ArrayList<String> image = new ArrayList<String>();


     
    public Book clone(){
        try{
            Book book = (Book) super.clone();
            return book;
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return  null;
    }

    public Book deepClone(){
        try{
            Book book = (Book) super.clone();
            book.image =   (ArrayList<String>)image.clone();
            return book;
        }catch (CloneNotSupportedException e ) { 
            e.printStackTrace();
        }
        return null;
    }

    public Book deepClone2() {
        try
        {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);

            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream  oi = new ObjectInputStream(bi);
            return((Book)oi.readObject());
            
        }catch(Exception  e){
            e.printStackTrace();
        }
        return null;
    }

    public String getTitle(){
        return  title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public ArrayList<String> getImage(){
        return image;
    }

    public void addImage(String img){
        image.add(img);
    }

    public void show(){
        System.out.println("-----------------start print------------");
        System.out.println("title: "+ title);
        for(String s:image){
            System.out.println("Image name:"+s);
        }

        System.out.println("------------------end print -------------");
    }
}

