import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class Book {      //Book details
    int id;
    String title;
    String author;
    boolean isIssued;
    Integer issuedByUserId; 

    Book(int id, String title, String author) {     
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
        this.issuedByUserId = null;
    }
}

class User {            //User details
    int userId;
    String name;
    String contactNo;  

    User(int userId, String name, String contactNo) {
        this.userId = userId;
        this.name = name;
        this.contactNo = contactNo;
    }
}

class IssueRecord {     //Issue history record
    int bookId;
    int userId;

    IssueRecord(int bookId, int userId) {
        this.bookId = bookId;
        this.userId = userId;
    }
}

public class library {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        ArrayList<IssueRecord> history = new ArrayList<>();  

        while (true) {
            try {
                System.out.println("\n------ Library Management System ------");
                System.out.print(
                    "1. Manage Books\n2. Manage Users\n3. Issue Book\n4. Return Book\n5. View Issue History\n6. Exit\nEnter choice: "
                );

                int choice = sc.nextInt();
                sc.nextLine();

                if (choice == 6) {
                    System.out.println("Exiting system...");
                    break;
                }

                switch (choice) {

                    case 1:
                        manageBooks(books);
                        break;

                    case 2:
                        manageUsers(users);
                        break;

                    case 3:
                        issueBook(books, users, history);
                        break;

                    case 4:
                        returnBook(books);
                        break;

                    case 5:
                        viewHistory(history);
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.nextLine();
            }
        }

        sc.close();
    }

    // Manage Books
    public static void manageBooks(ArrayList<Book> books) {
        while (true) {
            System.out.print(
                "\n--- Manage Books ---\n1. Add Book\n2. View Books\n3. Update Book\n4. Delete Book\n5. Back\nEnter choice: "
            );

            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 5) break;

            switch (ch) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    books.add(new Book(id, title, author));
                    System.out.println("Book added!");
                    break;

                case 2:
                    System.out.println("\nID | Title | Author | Issued");
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        for (Book b : books) {
                            System.out.println(
                                b.id + " | " + b.title + " | " + b.author + " | " + (b.isIssued ? "Yes" : "No")
                            );
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;

                    for (Book b : books) {
                        if (b.id == updateId) {
                            System.out.print("Enter new title: ");
                            b.title = sc.nextLine();
                            System.out.print("Enter new author: ");
                            b.author = sc.nextLine();
                            System.out.println("Book updated!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) System.out.println("Book not found!");
                    break;

                case 4:
                    System.out.print("Enter Book ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = false;

                    for (Book b : books) {
                        if (b.id == deleteId) {
                            books.remove(b);
                            System.out.println("Book deleted!");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) System.out.println("Book not found!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
    // Manage Users
    public static void manageUsers(ArrayList<User> users) {
        while (true) {
            System.out.print(
                "\n--- Manage Users ---\n1. Add User\n2. View Users\n3. Update User\n4. Delete User\n5. Back\nEnter choice: "
            );

            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 5) break;

            switch (ch) {

                case 1:
                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String uname = sc.nextLine();
                    System.out.print("Enter Contact No: ");
                    String contact = sc.nextLine();

                    users.add(new User(id, uname, contact));
                    System.out.println("User added!");
                    break;

                case 2:
                    System.out.println("\nUserID | Name | Contact");
                    if (users.isEmpty()) {
                        System.out.println("No users found.");
                    } else {
                        for (User u : users) {
                            System.out.println(u.userId + " | " + u.name + " | " + u.contactNo);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter User ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    boolean found = false;

                    for (User u : users) {
                        if (u.userId == updateId) {
                            System.out.print("Enter new name: ");
                            u.name = sc.nextLine();
                            System.out.print("Enter new contact: ");
                            u.contactNo = sc.nextLine();
                            System.out.println("User updated!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) System.out.println("User not found!");
                    break;

                case 4:
                    System.out.print("Enter User ID to delete: ");
                    int deleteId = sc.nextInt();
                    boolean deleted = false;

                    for (User u : users) {
                        if (u.userId == deleteId) {
                            users.remove(u);
                            System.out.println("User deleted!");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted) System.out.println("User not found!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
    // Issue Book
    public static void issueBook(ArrayList<Book> books, ArrayList<User> users, ArrayList<IssueRecord> history) {
        System.out.print("Enter Book ID to issue: ");
        int bid = sc.nextInt();

        Book bookToIssue = null;

        for (Book b : books) {
            if (b.id == bid) {
                bookToIssue = b;
                break;
            }
        }

        if (bookToIssue == null) {
            System.out.println("Book not found!");
            return;
        }

        if (bookToIssue.isIssued) {
            System.out.println("Book already issued!");
            return;
        }

        System.out.print("Enter User ID: ");
        int uid = sc.nextInt();

        boolean userExists = false;
        for (User u : users) {
            if (u.userId == uid) {
                userExists = true;
                break;
            }
        }

        if (!userExists) {
            System.out.println("User not found!");
            return;
        }

        bookToIssue.isIssued = true;
        bookToIssue.issuedByUserId = uid;     // NEW
        history.add(new IssueRecord(bid, uid));  // NEW HISTORY

        System.out.println("Book issued successfully!");
    }
    // Return Book
    public static void returnBook(ArrayList<Book> books) {
        System.out.print("Enter Book ID to return: ");
        int bid = sc.nextInt();

        for (Book b : books) {
            if (b.id == bid) {
                if (!b.isIssued) {
                    System.out.println("This book is not issued.");
                    return;
                }
                b.isIssued = false;
                b.issuedByUserId = null; // NEW
                System.out.println("Book returned successfully!");
                return;
            }
        }

        System.out.println("Book not found!");
    }
    // View Issue History
    public static void viewHistory(ArrayList<IssueRecord> history) {
        System.out.println("\n--- Issued History ---");
        System.out.println("BookID | UserID");

        if (history.isEmpty()) {
            System.out.println("No issue records found.");
        } else {
            for (IssueRecord r : history) {
                System.out.println(r.bookId + " | " + r.userId);
            }
        }
    }
}
