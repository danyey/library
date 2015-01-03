package danyey.lib;

public class Book extends Thing
{
  public static final String TITLE = "title";
  public static final String AUTHOR = "author";
  public static final String SUBTITLE = "subtitle"; //volume
  public static final String LANGUAGE = "language";
  public static final String EDITOR = "editor"; //translator, editor, collator, illustrator
  public static final String PUBDATE = "pubdate";
  public static final String DESCRIPTION = "description";
  public static final String CATEGORY = "category";
  public static final String ISBN = "isbn";
  
  public static final String LOCATION = "location";
  public static final String INDATE = "indate";
  public static final String OUTDATE = "outdate";
  public static final String COST = "cost";
  
  public Book(String title)
  {
    super(title);
    setField(TITLE, title);
  }
  
  public String getTitle()
  {
    return name;
  }
  
  public void setAuthor(String author)
  {
    setField(AUTHOR, author);
  }
  
  public String getAuthor()
  {
    return getFieldValue(AUTHOR);
  }
}