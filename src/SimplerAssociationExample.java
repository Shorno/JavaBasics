class Author{
    private String name;
    private Book book;

    public Author(String name){
        this.name=name;
    }
    public void writeBook(Book book, Book book1){
        this.book=book;
        book.setAuthor(this);
    }
    public Book getBook(){
        return book;
    }
    public String getName(){
        return name;
    }

}


class Book{
    private String title;
    private Author author;

    public Book(String title){
        this.title=title;
    }
    public void setAuthor(Author author){
        this.author=author;
    }
    public String getTitle(){
        return title;
    }
    public Author getAuthor(){
        return author;
    }
}


public class SimplerAssociationExample {
    public static void main(String[] args) {
        Author author= new Author("Shorno");
        Book book =new Book("Romeo Juliet and Himu");
        Book book1 =new Book("SEX with me");

        author.writeBook(book,book1);

        System.out.println("Writer: "+ author.getName());
        System.out.println("Book by "+ author.getName()+": "+ book.getTitle());

    }
}
