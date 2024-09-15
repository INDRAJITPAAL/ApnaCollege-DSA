public class staticCounttCall {
    public static void main(String[] args) {
        System.out.print(Book.count);
        Book b=new Book(140);
        Book c=new Book(140);
        System.out.print(Book.count);
    }
}

class Book{
    int BookPrice;
    static int count;
    public  Book(int price){
        this.BookPrice=price;
        count++;
    }
}