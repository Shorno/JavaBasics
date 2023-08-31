
import java.io.StringWriter;
import java.util.List;
import java.util.ArrayList;
import java.util.SimpleTimeZone;

public class AssociationExample {
    public static void main(String[] args) {
        Author author1= new Author("XXXXXX Kamal Roy");
        author1.writeBook("Harry Porter");
        author1.writeBook("Romeo Juliet");

        List<Book> booksWrittenByAuthor1 =author1.getBooksAuthored();
        for ( Book x : booksWrittenByAuthor1){
            System.out.println(author1.getName()+" wrote "+ x.getTitle());
        }
    }
}
class Author{
    private String name;
    private List<Book> booksAuthored;

    public Author(String name){
        this.name=name;
        this.booksAuthored= new ArrayList<>();
    }
    public void writeBook(String title){
        Book newBook= new Book(title, this);
        booksAuthored.add(newBook);
    }
    public List<Book> getBooksAuthored(){
        return booksAuthored;
    }
    public String getName(){
        return name;
    }
}

class Book{
    private String title;
    private Author author;

    public Book(String title, Author author){
        this.title=title;
        this.author=author;
    }
    public String getTitle(){
        return title;
    }
    public Author getAuthor(){
        return author;
    }
}
