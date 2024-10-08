/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DAO.BookDAO;
import DTO.entities.Book;
import DTO.entities.Book1;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */
public class BookBUS {
    protected static BookDAO bookDAO ;
        private ArrayList<Book1> listAll= new ArrayList<>();  //THEM CAI NAY
    public BookBUS() throws ClassNotFoundException, SQLException {
        
    }   
    public ArrayList<Book1> getAll() throws ClassNotFoundException, SQLException, IOException                   //Sua lai cai nay
    {   
        bookDAO =new BookDAO();
        listAll=bookDAO.getAll();
        return listAll;
    }
    public Book1 getBookByISBN(String ISBN) throws ClassNotFoundException, SQLException, IOException            //Them cai nay roi xoa cai nay ben DAO DI
    {
       for (Book1 x :listAll)
       {
           if (x.getISBN().equals(ISBN.trim()))
               return x;
       }
       return null;
    }

     public ArrayList<Book1> getAllByCondition(String nameBook,String nameAuthor,String namePublisher) throws ClassNotFoundException, SQLException, IOException
     {
         ArrayList<Book1> result = new ArrayList<>();
        result = listAll;
         ArrayList<Book1> temp=new ArrayList<>();
        if ((!nameBook.trim().equals("")))
                {
                 for (Book1 i : result)
                 {
                     if (i.getTenSach().toLowerCase().contains(nameBook.trim().toLowerCase()))
                     {
                         temp.add(i);
                         
                     }
                 }result=temp;
                 
                 temp=new ArrayList<>();
                 
                 
                }
        if ((!nameAuthor.trim().equals("")))
                {                 
                   for (Book1 i:result)
                 {
                     if (i.getAuthor().toString().toLowerCase().contains(nameAuthor.trim().toLowerCase())==true)
                     {                      
                         temp.add(i);
                        
                     }
                     
                 }
                   result=temp;
                   temp=new ArrayList<>();
                 
                  
                }     
        if ((!namePublisher.trim().equals("")))
                {
                    
                   for (Book1 i:result)
                 {
                     
                     if (i.getPublisher().toLowerCase().contains(namePublisher.trim().toLowerCase())==true)
                     {
                         temp.add(i);
                         
                     }
                 } 
                   result=temp;
                 }
                
        return result;
}
     
    public void saveInfo(Book1 b) throws ClassNotFoundException, SQLException, IOException{
        bookDAO = new BookDAO();
        bookDAO.saveInfo(b);
    }
    public void updateStoreNumBooks(String ISBN,int storeNum,int borrowNum) throws ClassNotFoundException, SQLException
     {
         bookDAO.updateStoreNumBooks(ISBN, storeNum, borrowNum);
     }
}
