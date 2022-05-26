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
    private String bookname ,subject,publisher,price,year,bookid ;
    public DisplayBooks(String bookname,String subject,String publisher,String price,String year,String bookid)
    {
        this.bookname =bookname;
        this.bookid = bookid;
        this.price = price;
        this.publisher = publisher;
        this.subject = subject;
        this.year = year;
                
    }
        public String getprice()
    {
        return price;
    };
    public String getbookname()
    {
        return bookname;
    };
     public String getsubject()
    {
        return subject;
    }
      public String getpublisher()
    {
        return publisher;
    }
       public String getyear()
    {
        return year;
    }
        public String getbookid()
    {
        return bookid;
    }
}
