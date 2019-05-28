package org.hmily.pictureShowPattern.IteratorPattern;


/**
 * 迭代器模式 示例代码
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {
        BookShelf bookShelf=new BookShelf(5);
        bookShelf.appendBook(new Book("三体1"));
        bookShelf.appendBook(new Book("三体2"));
        bookShelf.appendBook(new Book("三体3"));
        bookShelf.appendBook(new Book("流浪地球"));
        Iterator iterator=bookShelf.iterator();
        while (iterator.hasNext()){
            Book book= (Book) iterator.next();
            System.out.printf("%s \n",book.getName());
        }
    }


}
