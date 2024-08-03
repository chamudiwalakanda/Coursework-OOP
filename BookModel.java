package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DBConnection;
import dto.BookDto;

public class BookModel {
    
     private final Connection connection ;
    
    public BookModel()throws ClassNotFoundException, SQLException{
        this.connection=DBConnection.getInstance().getConnection();
    }
    

    public BookDto getBook(String bookId) throws SQLException{
        String sql="SELECT * FROM book WHERE book_id=?";
       PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, bookId);

        ResultSet rst = statement.executeQuery();
        if(rst.next()){
            BookDto bookDto;
            bookDto = new BookDto(
                    rst.getString("bookID"),
                    rst.getString("Title"),
                    rst.getString("Author"),
                    rst.getString("category_id"));
            return bookDto;
        }
        return null;
    }
    
    
}
