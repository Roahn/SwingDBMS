/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
public class DisplayReturn {
    
    private String bookid,student_id;
    public DisplayReturn(String bookid , String student_id)
    {
        this.bookid = bookid;
        this.student_id=student_id;
                
    }
    public String getbookid()
    {
        return bookid;
    }
    public String getstudent_id()
    {
        return student_id;
    }
    
}
