package danyey.lib;

import java.util.*;

public class Thing implements Comparable<Thing>
{
  public final String name;
  private Map<String,String> fields = new HashMap<String,String>();
  
  public Thing(String name)
  {
    this.name = name;
  }
  
  public int compareTo(Thing t)
  {
    return name.compareTo(t.name);
  }
  
  public void setField(String fieldName, String value)
  {
    fields.put(fieldName, value);
  }
  
  public List<String> getFields()
  {
    return new ArrayList(fields.keySet());
  }
  
  public String getFieldValue(String field)
  {
    return fields.get(field);
  }
  
  public boolean hasFieldValue(String field)
  {
    return fields.keySet().contains(field);
  }
}