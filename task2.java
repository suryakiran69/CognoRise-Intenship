import java.util.*;
class Book{
    private String tittle;
    private String author;
    private boolean checkedout;
    public Book(String tittle,String author ){
        this.tittle=tittle;
        this.author=author;
        this.checkedout=false;
    }
    public String gettittle(){
        return tittle;
    }
    public String getauthor(){
        return author;
    }
    public boolean checkedout(){
        return checkedout;
    }
    public void  setcheckout(boolean cd){
        checkedout=cd;
    }
    public String toString(){
        return "Book{\n"+"Tittle "+tittle + " ,author= " +author+   ",CheckedOut= " + checkedout +"\n  }" ;
    }
}
class LibraryCatalog{
    private ArrayList<Book> books;
    public LibraryCatalog(){
        this.books=new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);
    }
    public ArrayList<Book> searchByTittle(String tittle){
        ArrayList <Book> result =new ArrayList<>();
        for (Book book:books){
            if(book.getauthor().equalsIgnoreCase(tittle)){
                result.add(book);
            }
        }
        return result;
    } 

    public ArrayList<Book> searchByauthor(String author){
        ArrayList <Book> result =new ArrayList<>();
        for (Book book:books){
            if(book.getauthor().equalsIgnoreCase(author)){
                result.add(book);
            }
        }
        return result;
    }    
    public void checkOutBook(Book book){
        if(book !=null && !book.checkedout()){
            book.setcheckout(true);
            System.out.println("Book CheckedOut: "+book.gettittle());
        }
        else{
            System.out.println("invalid ");
        }
    }
    public void returnBook(Book book){
        if(book !=null &&book.checkedout()){
            book.setcheckout(false);
            System.out.println("Book Returned "+book.gettittle());
        }
        else{
            System.out.println("Invalid ");
        }
    }
    public void display(){
        System.out.println("Libary Catalog :");
        for (Book book:books){
            System.out.println(book);
        }
    }

}
public class task2 {
    public static void main(String arg[]){
          LibraryCatalog libraryCatalog=new LibraryCatalog();
          Book book1=new Book("5 Subject book ","Johnson");
          Book book2=new Book("One subject book ","Mariazeena");
          Book book3=new Book("Record ","Jeppiaar");
          libraryCatalog.addBook(book1);
          libraryCatalog.addBook(book2);
          libraryCatalog.addBook(book3);
          System.out.println("Welcome to Library ");
          System.out.println("1.Display Books \n 2.Search Book by Tittle \n 3.Search book by Author \n 4.Check Out Book \n 5.Return Book \n 6.Exit");
          boolean s=true;
          while (s){
          System.out.print("Enter your option :");
          Scanner sc =new Scanner (System.in);
          int x=sc.nextInt();
          sc.nextLine();
          switch(x){
            case 1:
            libraryCatalog.display();
            break;
            case 2:
            System.out.println("Enter the tittle of book you want ");
            String h=sc.nextLine();
            ArrayList<Book> booksByTittle=libraryCatalog.searchByTittle(h);
            System.out.println("Book by "+booksByTittle);
            break;
            case 3:
            System.out.println("Enter the author of book you want ");
            String a=sc.nextLine();
            ArrayList<Book> booksByAuthor=libraryCatalog.searchByauthor(a);
            System.out.println("Book by "+booksByAuthor);
            break;
            case 4:
            System.out.print("Enter the Book number \n 1 for Book1 \n 2 for Book2 \n 3 for Book 3 :");
            int l=sc.nextInt();
            if(l==1){
                libraryCatalog.checkOutBook(book1);
                libraryCatalog.display();
            }
            if(l==2){
                libraryCatalog.checkOutBook(book2);
                libraryCatalog.display();
            }
            if(l==3){
                libraryCatalog.checkOutBook(book3);
                libraryCatalog.display();
            }
            break;
           case 5:
           System.out.print("Enter the Book number \n 1 for Book1 \n 2 for Book2 \n 3 for Book 3 :");
            int g=sc.nextInt();
            if(g==1){
                libraryCatalog.returnBook(book1);
                libraryCatalog.display();
            }
            if(g==2){
                libraryCatalog.returnBook(book2);
                libraryCatalog.display();
            }
            if(g==3){
                libraryCatalog.returnBook(book3);
                libraryCatalog.display();
            }
            break;
            case 6:
            s=false;
            System.out.println("\n\n\nThank you, Visit Again\n\n\n");

            break;


        }}
       // System.out.println("\n\n\nThank you, Visit Again");
}

}
