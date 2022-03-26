import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Collection {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<Book>();
        System.out.println("------------------Book Hall----------------");
        System.out.println("1.PonniyinSelvsan\n2.ConstitutionOfIndia\n3.Believe\n4.Ikigai\n5.SherlockHolmes\n6.Secret\n7.TheRichestManOfBabylon\n8.AnIntelligentInvestor\n9.Verkai\n0.Exit\nSelect the book by no");
        int chumma = 0;
        while (true){
            if(chumma>=1){
                System.out.println("if you completed press 0 else  choose the books");
            }
            else{
                System.out.print(">");
            }
            int qty=1;
            int fav = sc.nextInt();
            System.out.println(fav);
            if(fav==0){

            }
            else if(fav<10&&fav>-1){
                System.out.println("Enter the quantity: ");
                qty=sc.nextInt();
                chumma=1;
            }
            else{
                continue;
            }
            switch (fav) {
                case 1:
                    book.add(new Book("PonniyinSelvan", "Kalki", 500, qty));
                    continue;
                case 2:
                    book.add(new Book("ConstitutionOfIndia", "Ambedkar", 1000, qty));
                    continue;
                case 3:
                    book.add(new Book("Believe", "SureshRaina",600 , qty));
                    continue;
                case 4:
                    book.add(new Book("Ikigai", "HectorGracia", 300, qty));
                    continue;
                case 5:
                    book.add(new Book("SherlockHolmes", "ConanDoyle", 1500, qty));
                    continue;
                case 6:
                    book.add(new Book("Secret", "Rhonda Byrne", 400, qty));
                    continue;
                case 7:
                    book.add(new Book("TheRichestManOfBabylon", "Samuel Clason", 200, qty));
                    continue;
                case 8:
                    book.add(new Book("AnIntelligentInvestor", "Benjamin Graham", 700, qty));
                    continue;
                case 9:
                    book.add(new Book("Verkai", "Poomani", 600, qty));
                    continue;
                case 0:
                    break;
            }
            break;
        }
        Cart cart = new Cart(book);
        bill(cart);
    }
    public static void bill(Cart cart){
        int oldTotal=0;
        System.out.println("Your Purchased Items are ");
        cart.getBook().forEach(
                (temp)->{
                    if(temp.getQuantity()!=0){
                        cart.total+=(temp.getPrice()*temp.getQuantity());
                    }else{
                        System.out.println("Thank you");
                        System.exit(0);
                    }
                    System.out.println("Book name : "+temp.getName()+"\nAuthor Name : "+temp.getAuthor()+"\nPrice : "+temp.getPrice()+"\nQuantity : "+temp.getQuantity());
                }
        );
        if(cart.total>500&& cart.total<1000){
            oldTotal+=cart.total;
            cart.total=cart.total-(cart.total* 5/100);
        }
        else if(cart.total>1000&& cart.total<1500){
            oldTotal+=cart.total;
            cart.total=cart.total-(cart.total* 10/100);
        }
        else if (cart.total>1500&&cart.total<2000){
            oldTotal+=cart.total;
            cart.discount=15;
            cart.total=cart.total-(cart.total* 15/100);
        }else if(cart.total>2000){
            oldTotal+=cart.total;
            cart.discount=20;
            cart.total=cart.total-(cart.total* 20/100);
        }
        System.out.println("OldTOtal :"+oldTotal);
        System.out.println("Discount : "+cart.getDiscount()+"%");
        System.out.println("Total :"+cart.getTotal());
    }
}

class Cart{
    ArrayList<Book>book;
    double amount;
    int discount;
    double total;

    public Cart(ArrayList<Book> book) {
        this.book = book;

    }

    public ArrayList<Book> getBook() {
        return book;
    }

    public void setBook(ArrayList<Book> book) {
        this.book = book;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
class Book {
    String name;
    String author;
    int price;
    int quantity;

    public Book(String name, String author, int price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String model) {
        this.author = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
