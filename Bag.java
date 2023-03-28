import java.util.Scanner;

import javax.sound.midi.Soundbank;

class Bag {
    Scanner sc = new Scanner(System.in);
    Book b;
    Laptop l;

    public void add() {
        if (b == null && l == null) {
            System.out.println("1.Book       2.Laptop");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Enter the Book Name");
                    String bname = sc.next();
                    System.out.println("Enter the Book Price");
                    double price = sc.nextInt();
                    System.out.println("Enter the Authour Name");
                    String authour = sc.next();
                    b = new Book(bname, price, authour);
                    break;

                case 2:

                    System.out.println("Enter the Laptop Name");
                    String lname = sc.next();
                    System.out.println("Enter the Laptop Price");
                    double lprice = sc.nextInt();
                    System.out.println("Enter the Brand Name");
                    String brand = sc.next();
                    l = new Laptop(lname, lprice, brand);
                    break;

            }
            if (b instanceof Book) {
                System.out.println("Book is Added Successfully..");
            }

            else if (l instanceof Laptop) {
                System.out.println("Laptop is Added Successfully..");
            }
        } else {
            System.out.println("Already Existed Sorry.");
        }

    }

    // --------------------------------------------------

    public void remove() {
        if (b == null && l == null) {
            System.out.println("Add Something First");
        } else {
            b = null;
            l = null;
            System.out.println("Removed Successfully.");
        }

    }

    // --------------------------------------------------

    public void display() {
        if (b == null && l == null) {
            System.out.println("Add Something First Then Display");
        } else {
            if (b instanceof Book) {
                System.out.println("Book Name Is    :- " + b.bname);
                System.out.println("Book Price Is   :- " + b.price);
                System.out.println("Book Authour Is :- " + b.authour);
            }
            if (l instanceof Laptop) {
                System.out.println("Laptop Name Is    :- " + l.lname);
                System.out.println("Laptop Price Is   :- " + l.lprice);
                System.out.println("Laptop Brand Is   :- " + l.brand);
            }
        }

    }
}
