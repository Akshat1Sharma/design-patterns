package ObjectPoolDesignPattern;

import java.sql.Connection;
import java.util.HashMap;
import java.util.*;


public class Main {
    public static void main(String args[]) {
      // Do something...
      
  
      // Create the ConnectionPool:
      JDBCConnectionPool pool = new JDBCConnectionPool(
        "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
        "sa", "secret");
  
      // Get a connection:
      Connection con = pool.checkOut();
  
      // Use the connection
    
  
      // Return the connection:
      pool.checkIn(con);


      String q = "new";

      StringBuilder r = new StringBuilder(q);

      HashMap<Integer,Integer> calender = new HashMap<>();

      List<Integer> arr;
      Arrays.stream(new int[]).max().getAsInt()
   
    }
  }
