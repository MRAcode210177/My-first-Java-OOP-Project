package Book_package;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(){

    }

    public Book(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }
    //methods to get data
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn){
        this.isbn=isbn;
        System.out.println("ISBN updated for "+ title );
    }
    //3.borrowBook Method
    public void borrowBook(){
        if(!isBorrowed){
            isBorrowed=true;
            System.out.println(title + "has been successfully borrowed");
        }else{
            System.out.println(title+" already borrowed. I'm sorry");
        }
    //3.returnBook Method
    }
    public void returnBook(){
        if(isBorrowed){
            isBorrowed=false;
            System.out.println(title + "has been successfully returned");
        }else{
            System.out.println(title + "was not currently borrowed");
        }
    }
    public void displayStatus(){
        System.out.println("The book's title is "+this.title + " Author is " + this.author + " nd the status is " + this.isBorrowed);
    }
    //main function
    public static void main(String[] args){
        Book book1 = new Book("Physiology of money","peter", "bt20");
        System.out.println(book1.getAuthor());
        System.out.println(book1.getIsbn());
        System.out.println(book1.getTitle());
        book1.borrowBook();
        book1.borrowBook();

    }
}
