package Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
class DisplayBooks {
    private String bookname ,categories,publisher,published_year,bookid ;
    public DisplayBooks(
            String bookname,
            String categories,
            String publisher,
            String published_year,
  
            String bookid)
    {
        this.bookname =bookname;
        this.categories = categories;
        this.publisher = publisher;
        this.published_year = published_year;
        this.bookid = bookid;
                
    }
      
    public String getbookname()
    {
        return bookname;
    };
     public String getsubject()
    {
        return categories;
    }
      public String getpublisher()
    {
        return publisher;
    }
       public String getyear()
    {
        return published_year;
    }
        public String getbookid()
    {
        return bookid;
    }
     
}
