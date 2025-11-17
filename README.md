# Library-Management-System

Author: Nandhana MA

Description: This is a console-based Library Management System in Java that allows users to manage books, users, issue records, and book return operations. The system uses ArrayList, classes, and exception handling to perform CRUD operations and store issue history.

##  Technologies Used

- Java

- VScode

- Object-Oriented Programming (OOP) Concepts

- ArrayList

- Exception Handling

## Features

Book Management:

- Follows CRUD system to manage book details efficiently
User Management:

- Follows CRUD system to manage user details
Issue & Return:

- Issue a book to a user

- Prevent issuing already issued books and also return books

- Automatically links book to user

Issue History:

- Stores every issued book record permanently

- Displays Book ID + User ID 

Error Handling:

- Handles invalid input (non-numeric)

- Checks unavailable books

- Checks invalid users

- Prevents duplicate issue

## Sample Output
``` text
------ Library Management System ------
1. Manage Books
2. Manage Users
3. Issue Book
4. Return Book
5. View Issue History
6. Exit
Enter choice: 1

--- Manage Books ---
1. Add Book
2. View Books
3. Update Book
4. Delete Book
5. Back
Enter choice: 1
Enter Book ID: 157
Enter Title: Core Java
Enter Author: James Gosling
Book added!

--- Manage Books ---
1. Add Book
2. View Books
3. Update Book
4. Delete Book
5. Back
Enter choice: 1
Enter Book ID: 160
Enter Title: Python
Enter Author: Rossum   
Book added!

--- Manage Books ---
1. Add Book
2. View Books
3. Update Book
4. Delete Book
5. Back
Enter choice: 2

ID | Title | Author | Issued
157 | Core Java | James Gosling | No
160 | Python | Rossum | No

--- Manage Books ---
1. Add Book
2. View Books
3. Update Book
4. Delete Book
5. Back
Enter choice: 5

------ Library Management System ------
1. Manage Books
2. Manage Users
3. Issue Book
4. Return Book
5. View Issue History
6. Exit
Enter choice: 2

--- Manage Users ---
1. Add User
2. View Users
3. Update User
4. Delete User
5. Back
Enter choice: 1
Enter User ID: 222
Enter Name: Sufiya
Enter Contact No: 9333688901
User added!

--- Manage Users ---
1. Add User
2. View Users
3. Update User
4. Delete User
5. Back
Enter choice: 2

UserID | Name | Contact
222 | Sufiya | 9333688901

--- Manage Users ---
1. Add User
2. View Users
3. Update User
4. Delete User
5. Back
Enter choice: 5

------ Library Management System ------
1. Manage Books
2. Manage Users
3. Issue Book
4. Return Book
5. View Issue History
6. Exit
Enter choice: 3
Enter Book ID to issue: 160
Enter User ID: 222
Book issued successfully!

------ Library Management System ------
1. Manage Books
2. Manage Users
3. Issue Book
4. Return Book
5. View Issue History
6. Exit
Enter choice: 1

--- Manage Books ---
1. Add Book
2. View Books
3. Update Book
4. Delete Book
5. Back
Enter choice: 2

ID | Title | Author | Issued
157 | Core Java | James Gosling | No
160 | Python | Rossum | Yes

--- Manage Books ---
1. Add Book
2. View Books
3. Update Book
4. Delete Book
5. Back
Enter choice: 5

------ Library Management System ------
1. Manage Books
2. Manage Users
3. Issue Book
4. Return Book
5. View Issue History
6. Exit
Enter choice: 5

--- Issued History ---
BookID | UserID
160 | 222

------ Library Management System ------
1. Manage Books
2. Manage Users
3. Issue Book
4. Return Book
5. View Issue History
6. Exit
Enter choice: 6
Exiting system...
``` 
