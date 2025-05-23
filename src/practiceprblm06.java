
class Books {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookType;
    private float price;
    private String status;

    public Books(int bookId, String bookName, String bookAuthor, String bookType, float price, String status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookType = bookType;
        this.price = price;
        this.status = status;
    }

    public void addBook() {
    }

    public void deleteBook() {
    }

    public void displayBookDetails() {
    }

    public void inquiryBook() {
    }
}

class Librarian {
    private int id;
    private String name;

    public Librarian(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void searchBook(String keyword) {
    }

    public void verifyMember(int userId, boolean status) {
    }

    public void orderBook() {
    }

    public void sellBooks() {
    }
}

class Publisher {
    private int id;
    private String name;
    private String address;
    private String phoneNo;

    public Publisher(int id, String name, String address, String phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void addPub() {
    }

    public void modifyPub() {
    }

    public void deletePub() {
    }

    public void orderStatus() {
    }
}

class User {
    private int userId;
    private String userName;
    private String userAddress;
    private String phoneNo;

    public User(int userId, String userName, String userAddress, String phoneNo) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.phoneNo = phoneNo;
    }

    public void readBook() {
    }

    public void payFine(int amount) {
    }

    public void addMember() {
    }

    public void deleteMember() {
    }

    public void updateDetails() {
    }

    public void bookPurchase() {
    }
}

public class practiceprblm06 {
    public static void main(String[] args) {
        Books book1 = new Books(101, "OOP in Java", "Herbert Schildt", "Programming", 599.0f, "Available");
        Librarian lib = new Librarian(1, "Mr. Hossain");
        Publisher pub = new Publisher(301, "Pearson", "Dhaka", "01700000000");
        User user = new User(501, "Ayesha", "Chittagong", "01810000000");
    }
}

