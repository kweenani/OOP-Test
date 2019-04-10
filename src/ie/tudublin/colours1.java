package ie.tudublin;

import com.sun.tools.javac.util.Name.Table;

public class colours1
{

  private String displayColour;
  private int red;
  private int bkue;
  private int green;
  
  

  Table table;
  

 public void setup() {
  
  table = loadTable("colours.csv", "header");

  println(table.getRowCount() + " total rows in table"); 

  for (TableRow row : table.rows()) {
    
    int id = row.getInt("colour");
    String species = row.getString("species");
    String name = row.getString("colour");
    
    println(name + " (" + species + ") has an ID of " + id);

    
  }
}
}

