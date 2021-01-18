import java.io.*;
import java.util.*;
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String name,Author[] authors,double price){
        this.name=name;
        this.authors=authors;
        this.price=price;
    }

    public Book(String name,Author[] authors,double price, int qty){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString(){
        return "Book[name="+name+",authors="+Arrays.toString(authors)+",price="+price+",qty="+qty +"]";
    }

    public String getAuthorName() {
        String names="";
        for (int i=0; i<authors.length;i++){
            names+=authors[i].getName()+" ";
        }
        return names;
    }

    public String getAuthorEmail() {
        String emails="";
        for (int i=0; i<authors.length;i++){
            emails+=authors[i].getEmail()+" ";
        }
        return emails;
    }

    public String getAuthorGender() {
        String genders="";
        for (int i=0; i<authors.length;i++){
            genders+=String.valueOf(authors[i].getGender())+" ";
        }
        return genders;
    }
}
