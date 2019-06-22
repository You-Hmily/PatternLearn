package org.hmily.pattern.graphic.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookShelf  implements Aggregate{

    private List<Book> books;

    public BookShelf(int maxsize) {
        books=new ArrayList<>(maxsize);
    }

    public  Book getBookAt(int index){
        return books.get(index);
    }

    public void  appendBook(Book book){
         this.books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    @Override
    public Iterator iterator(){
      return new BookShelfIterator(this);
    }

}
