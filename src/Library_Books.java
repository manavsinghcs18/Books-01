import javax.swing.*;
import java.awt.print.Book;
import java.util.Scanner;
public class Library_Books
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        scanner.nextLine().trim();
        if (n==0)
        {
            System.out.println("N/A");
        }
        else {
            String BooksName = scanner.nextLine().trim();
            String AuthorName = scanner.nextLine().trim();
            long ISBN = Long.parseLong(scanner.nextLine().trim());
            System.out.println("------------------------------");
            System.out.println("BooksName:"+"\t"+ BooksName);
            System.out.println("AuthorName:"+"\t"+AuthorName);
            System.out.println("ISBN:"+"\t"+ISBN);
            System.out.println("------------------------------");
        }
        scanner.close();
    }
}
class Books
{
    int n;
    private String BooksName;
    private String AuthorName;
    private long ISBN;
    private String getBooksName()
    {
        return BooksName;
    }
    private String getAuthorName()
    {
        return AuthorName;
    }
    private long getISBN()
    {
        return ISBN;
    }
    public void setBooksName(String BooksName)
    {
        this.BooksName=BooksName;
    }
    public void setAuthorName(String AuthorName)
    {
        this.AuthorName=AuthorName;
    }
    public void setISBN(long ISBN)
    {
        this.ISBN=ISBN;
    }
    public Books(String BooksName ,String AuthorName ,long ISBN)
    {
        this.BooksName=BooksName;
        this.AuthorName=AuthorName;
        this.ISBN=ISBN;
    }
    @Override
    public String toString()
    {
        return String.format("%16s\n%16s%10f" ,getBooksName(),getAuthorName(),getISBN());
    }

}
