package com.goosemagnet.chapter16.testtree;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTree {

    public static void main(String[] args) {
        new TestTree().go();
    }

    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");

        BookCompare bookCompare = new BookCompare();
        TreeSet<Book> tree = new TreeSet<>(bookCompare);

        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }

    public class BookCompare implements Comparator<Book> {

        @Override
        public int compare(Book one, Book two) {
            return one.title.compareTo(two.title);
        }
    }
}
