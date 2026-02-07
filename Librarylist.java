import java.util.Scanner;

 class Librarylist{
    String title;
    int dayslate;

    int calculateLateFee()
    {
        return 0;
    }
  void display()
  {
    System.out.println("Title:" + title);
    System.out.println("Days Late:" + dayslate);
    System.err.println("LateFee : " + calculateLateFee());
  }
}


class Book extends LibraryItem
{
    int calculateLateFee()
    {
        return dayslate*2;
    }
}


class Magazine extends LibraryItem
{
    int calculateLateFee()
    {
        return dayslate*3;
    }
}


class DVD extends LibraryItem
{
    int calculateLateFee()
    {
        return dayslate*5;
    }
}

public class LibraryTest
{
    public static void main(String[] args) {
        Scanner sha = new Scanner(System.in);
        LibraryItem book = new Book();
        System.out.println("Enter the book Title:");
        book.title = sha.nextLine();
        System.out.println("Enter the days late:");
        book.dayslate = sha.nextInt();
        sha.nextLine();
        book.display();


        LibraryItem magazine = new Magazine();
        System.out.println("Enter the Magazine Title:");
        magazine.title = sha.nextLine();
        System.out.println("Enter the days late:");
        magazine.dayslate = sha.nextInt();
        sha.nextLine();
        magazine.display();


        LibraryItem dvd = new DVD();
        System.out.println("Enter the book Title:");
        dvd.title = sha.nextLine();
        System.out.println("Enter the days late:");
        dvd.dayslate = sha.nextInt();
        sha.nextLine();
        dvd.display();

        sha.close();
    }
}