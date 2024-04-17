package Lab23;
public class Book {
	private int bookId;
    private String bookName;
    private String authorName;
    public Book(int bookId,String bookName,String authorName) {
        this.bookId=bookId;
        this.bookName=bookName;
        this.authorName=authorName;
    }
    public int getBookId() {
        return bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
}


