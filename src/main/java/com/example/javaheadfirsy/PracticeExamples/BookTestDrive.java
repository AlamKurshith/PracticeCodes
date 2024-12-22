package com.example.javaheadfirsy.PracticeExamples;

public class BookTestDrive {
    public static void main ( String[] args){
        Book[] myBooks = new Book[3];
        int x = 0;
        for(int i=0; i<3; i++){
            myBooks[i] = new Book();
        }

        myBooks[0].title = "Brother Karamozov";
        myBooks[1].title = "Moby Dick";
        myBooks[2].title = "The Post Master";

        myBooks[0].author = "Fyodor";
        myBooks[1].author = "Herman Melville";
        myBooks[2].author = "Tagore";

        while(x<3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x++;
        }

    }
}
