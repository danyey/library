package danyey.lib;

import java.util.*;

public class Library implements Iterable<Book>
{
  private List<Book> books = new ArrayList<Book>();
  
  public void addBook(Book book)
  {
    books.add(book);
  }
  
  public Book getBookByTitle(String title)
  {
    for (Book b : books)
      if (b.getTitle().equalsIgnoreCase(title))
        return b;
    return null;
  }
  
  public List<Book findBooksByTitle(String approxTitle)
  {
    return findBooksWhere(Book.TITLE, approxTitle);
  }
  
  //very bad, want a nice tree for realtime title lookup
  public List<Book> findBooksWhere(String fieldName, String approxValue)
  {
    List<Book> res = new ArrayList<Book>();
    for (Book book : books)
      if (book.hasField(fieldName) && similar(fieldName, book.getField(fieldName), approxValue))
        res.add(book);
    return res;
  }
  
  public Iterator<Book> iterator()
  {
    return books.iterator();
  }
  
  public static similar(String fieldName, String value, String approxValue)
  {
    return value.contains(approxValue); //for a start
  }
}