package lab6;

// public class design {

    // // TASK 1

    // public class Product {
    //     private String productMainName;
    //     private double productMainPrice;
    //     private int eachProductQuantity;
    
    //     public Product() {

    //         this.productMainName = "Unknown";
    //         this.productMainPrice = 0.0;
    //     }
    
    //     public Product(String productMainName, double productMainPrice) {

    //         this.productMainName = productMainName;
    //         this.productMainPrice = productMainPrice;
    //     }
    
    //     public void setQuantity(int eachProductQuantity) {

    //         this.eachProductQuantity = eachProductQuantity;
    //     }
    
    //     public double getproductMainPrice() {

    //         return productMainPrice;
    //     }
    
    //     public int geteachProductQuantity() {

    //         return eachProductQuantity;
    //     }
    
    //     public void displayInfo() {

    //         System.out.println("Product Name: " + productMainName);
    //         System.out.println("Price: $" + productMainPrice);
    //     }
    
    //     public void displayInfo(boolean showeachProductQuantity) {

    //         displayInfo();
    //         if (showeachProductQuantity) {

    //             System.out.println("Quantity: " + eachProductQuantity);
    //         }
    //     }
    // }









    // TASK 2

    // public class Passenger {
    //     public static int no_of_passenger = 0;
    //     public static double total_fare = 0.0;
    
    //     private String newPasengerName;
    //     private double eachPassengerDistance;
    //     private double perPassengerFare = 0;
    
    //     public Passenger(String newPasengerName, double eachPassengerDistance) {

    //         this.newPasengerName = newPasengerName;
    //         this.eachPassengerDistance = eachPassengerDistance;
    //         this.perPassengerFare = 20 * eachPassengerDistance;
    //         total_fare += perPassengerFare;
    //         no_of_passenger++;
    //     }
    
    //     public void storeBaggageWeight(double weight) {

    //         perPassengerFare += weight * 10;
    //         total_fare += weight * 10;
    //     }
    
    //     public void passengerDetails() {

    //         System.out.println("Name: " + newPasengerName);
    //         System.out.println("Fare: " + perPassengerFare + " TK");
    //     }
    // }





    // TASK 3

    // public class Book {
    //     public static int total_books_sold = 0;
    //     public static double total_revenue = 0.0;
    
    //     private String bookTitleName;
    //     private double PerBookPrice;
    
    //     public Book(String bookTitleName, int discountPercentage) {

    //         this.bookTitleName = bookTitleName;
    //         this.PerBookPrice = 150 - (150 * discountPercentage / 100.0);
    //         total_books_sold++;
    //         total_revenue += PerBookPrice;
    //     }
    
    //     public void bookDetails() {

    //         System.out.println("Title: " + bookTitleName);
    //         System.out.println("Price after Discount: " + PerBookPrice + " TK");
    //     }
    // }




    // TASK 4

    // public class Circle {
    //     public static int count = 0;
    //     private double circleMainRadius;
    
    //     public Circle(double circleMainRadius) {

    //         this.circleMainRadius = circleMainRadius;
    //         count++;
    //     }
    
    //     public double getRadius() {

    //         return circleMainRadius;
    //     }
    
    //     public void setRadius(double circleMainRadius) {

    //         this.circleMainRadius = circleMainRadius;
    //     }
    
    //     public double area() {

    //         return Math.PI * circleMainRadius * circleMainRadius;

    //     }
    // }





    // TASK 5

    // import java.util.ArrayList;

    // public class Borrower {
    //     public static int[] book_count = {3, 3, 3};
    //     public static String[] book_name = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};

    //     private String novelBookName;
    //     private ArrayList<String> bookArrayList = new ArrayList<>();

    //     public Borrower(String novelBookName) {
            
    //         this.novelBookName = novelBookName;
    //     }

    //     public void borrowBook(String book) {

    //         for (int i = 0; i < book_name.length; i++) {

    //             if (book_name[i].equals(book)) {

    //                 if (book_count[i] > 0) {

    //                     bookArrayList.add(book);
    //                     book_count[i]--;
    //                 } else {

    //                     System.out.println("This book is not available.");
    //                 }
    //                 return;
    //             }
    //         }
    //     }

    //     public void borrowerDetails() {

    //         System.out.println("Name: " + novelBookName);
    //         System.out.println("Books Borrowed: ");
    //         for (String book : bookArrayList) {

    //             System.out.println(book);
    //         }
    //     }

    //     public static int remainingBooks(String book) {

    //         for (int i = 0; i < book_name.length; i++) {

    //             if (book_name[i].equals(book)) {

    //                 return book_count[i];
    //             }
    //         }
    //         return 0;
    //     }

    //     public static void bookStatus() {

    //         System.out.println("Available Books: ");
    //         for (int i = 0; i < book_name.length; i++) {

    //             System.out.println(book_name[i] + ": " + book_count[i]);
    //         }
    //     }
    // }




    // TASk 6

    // public class Cargo {
    //     private static double totalWeightLoads = 0.0;
    //     private static int counterOfId = 1;
    //     private static final double MAX_CAPACITY = 10.0;
    
    //     private int cargoPerId;
    //     private String cargoContentsEach;
    //     private double perCargoWeight;
    //     private boolean cargoLoadedInfo;
    
    //     public Cargo(String cargoContentsEach, double perCargoWeight) {

    //         this.cargoContentsEach = cargoContentsEach;
    //         this.perCargoWeight = perCargoWeight;
    //         this.cargoPerId = counterOfId++;
    //         this.cargoLoadedInfo = false;
    //     }
    
    //     public void details() {

    //         System.out.println("Cargo ID: " + cargoPerId + ", Contents: " + cargoContentsEach + ", ");
    //         System.out.println("Weight: " + perCargoWeight + ", Loaded: " + cargoLoadedInfo);
    //     }
    
    //     public void load() {

    //         if (!cargoLoadedInfo && totalWeightLoads + perCargoWeight <= MAX_CAPACITY) {

    //             totalWeightLoads += perCargoWeight;
    //             cargoLoadedInfo = true;
    //             System.out.println("Cargo " + cargoPerId + " loaded for transport.");
    //         } else if (!cargoLoadedInfo) {

    //             System.out.println("Cannot load cargo, exceeds weight capacity.");
    //         }
    //     }
    
    //     public void unload() {

    //         if (cargoLoadedInfo) {

    //             totalWeightLoads -= perCargoWeight;
    //             cargoLoadedInfo = false;
    //             System.out.println("Cargo " + cargoPerId + " unloaded.");
    //         }
    //     }
    
    //     public static double capacity() {

    //         return MAX_CAPACITY - totalWeightLoads;
    //     }
    // }




    // TASK 7

    // public class Student {
    //     private static int totalStudentCount = 0;
    //     private static int totalCseStudentCount = 0;
    //     private static int otherCount = 0;
    
    //     private static int counterOfId = 1;
    
    //     private int eachStudentId;
    //     private String eachStudentName;
    //     private double studentCgpa;
    //     private String perStudentDept;
    
    //     public Student(String eachStudentName, double studentCgpa) {

    //         this(eachStudentName, studentCgpa, "CSE");
    //     }
    
    //     public Student(String eachStudentName, double studentCgpa, String perStudentDept) {

    //         this.eachStudentId = counterOfId++;
    //         this.eachStudentName = eachStudentName;
    //         this.studentCgpa = studentCgpa;
    //         this.perStudentDept = perStudentDept;
    //         totalStudentCount++;
    //         if (perStudentDept.equals("CSE")) {

    //             totalCseStudentCount++;
    //         } else {
    //             otherCount++;
    //         }
    //     }
    
    //     public void individualDetail() {

    //         System.out.println("ID: " + eachStudentId);
    //         System.out.println("Name: " + eachStudentName );
    //         System.out.println("CGPA: " + studentCgpa);
    //         System.out.println("Department: " + perStudentDept);
    //     }
    
    //     public static void printDetails() {

    //         System.out.println("Total Student(s): " + totalStudentCount);
    //         System.out.println("CSE Student(s): " + totalCseStudentCount);
    //         System.out.println("Other Department Student(s): " + otherCount);
    //     }
    // }
    




    // TASK 8

    // public class Player {
    //     public static int total = 0;
    //     private static String totalPlayersInPlay = "";
    
    //     private String eachPlayerName;
    //     private String playerNation;
    //     private int eachPlayerJerseyNum;
    
    //     public Player(String eachPlayerName, String playerNation, int eachPlayerJerseyNum) {

    //         this.eachPlayerName = eachPlayerName;
    //         this.playerNation = playerNation;
    //         this.eachPlayerJerseyNum = eachPlayerJerseyNum;
    //         if (total < 11) {

    //             total++;
    //             if (totalPlayersInPlay.isEmpty()) {

    //                 totalPlayersInPlay = eachPlayerName;
    //             } else {

    //                 totalPlayersInPlay += ", " + eachPlayerName;
    //             }
    //         }
    //     }
    
    //     public String player_detail() {

    //         return "Player Name: " + eachPlayerName + "\nJersey Number: " + eachPlayerJerseyNum + "\nCountry: " + playerNation;
    //     }
    
    //     public static void info() {

    //         System.out.println("Total number of players: " + total);
    //         System.out.println("Players enlisted so far: " + totalPlayersInPlay);
    //     }
    // }
    
    

    
    
// }
