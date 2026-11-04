
package com.learning.vcube.oops;

import java.io.*;

class Book implements Serializable {

    transient int bookId;
    String title;
    String author;
    double price;

    Book(int bookId, String title, String author, double price) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class TestG {

    public static void main(String[] args) {

        try {
            Book b = new Book(101, "Java Programming", "James Gosling", 559.50);

            FileOutputStream fos = new FileOutputStream("book.text");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(b);

            oos.close();
            fos.close();

            System.out.println("Book object serialized successfully.");

        } catch (IOException e) {

            e.printStackTrace();
        }

    
        try {

            FileInputStream fis = new FileInputStream("book.text");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Book b = (Book) ois.readObject();

            System.out.println("\nBook Details:");

            System.out.println("Book ID : " + b.bookId);
            System.out.println("Title   : " + b.title);
            System.out.println("Author  : " + b.author);
            System.out.println("Price   : " + b.price);

            ois.close();
            fis.close();

        } catch (IOException | ClassNotFoundException e) {

            e.printStackTrace();
        }
    }
}

