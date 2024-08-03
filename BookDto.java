package dto;

public class BookDto {
    private String bookid;
    private String title;
    private String author;
    private String categoryid;

    public BookDto(){

    }

    public BookDto(String bookid,String title,String author,String caregoryid){
        this.bookid = bookid;
        this.title=title;
        this.author=author;
        this.categoryid=caregoryid; 
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }

    @Override
    public String toString() {
        return "BookDto [bookid=" + bookid + ", title=" + title + ", author=" + author + ", categoryid=" + categoryid
                + "]";
    }

    
}
