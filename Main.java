import java.util.Scanner;
public class Main {
    /*this program lets user add, delete, and insert student name and number into the original student data i have created*/

     static void deleteID(String StudentID[][]) {
        //let user decide how many student would like to be removed
         System.out.println('\n' + "How many Student ID would you like to be removed from this array: ");
         Scanner scanner = new Scanner(System.in);
         //this removes the value and shrink the array size
         int digitsRemove = scanner.nextInt();
         int newLength = StudentID.length - digitsRemove;
         //prints out the new array

         for (int i = 0; i < newLength; i++) {
             System.out.println();
             for (int j = 0; j < StudentID[i].length; j++) {
                 System.out.print(StudentID[i][j] + " ");
             }
         }
    }
    static void addID(String StudentID[][]) {
        //get user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter new student name: ");
        String sName = scan.nextLine();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter new student number: ");
        String sNumber = scan2.nextLine();

        //copy the original array into this new array and increase the size
        String[][] newStudentID = new String[StudentID.length + 1][2];
        for (int i = 0; i < StudentID.length; i++) {
            for (int j = 0; j < StudentID[i].length; j++) {
                newStudentID[i][j] = StudentID[i][j];
            }
        }
        newStudentID[4][0] = sNumber;//assign user input to the assigned position
        newStudentID[4][1] = sName;//assign user input to the assigned position

        for (int i = 0; i < newStudentID.length; i++) {
            System.out.println();
            for (int j = 0; j < newStudentID[i].length; j++) {
                System.out.print(newStudentID[i][j] + " ");
            }
        }
    }
    static void insertID(String StudentID[][]) {
        //get user inputs
        Scanner scanInsert = new Scanner(System.in);
        System.out.println("Enter the location you want to insert: ");
        int insertLocation = scanInsert.nextInt();
        Scanner scanName = new Scanner(System.in);
        System.out.println("Enter the name you want to insert: ");
        String insertName = scanName.nextLine();
        Scanner scanNumber = new Scanner(System.in);
        System.out.println("Enter the number you want to insert: ");
        String insertNumber = scanNumber.nextLine();

        //copy the array from the beginning to the digit before insert location
        String[][] newInsertStudentID = new String[StudentID.length + 1][2];
        for (int i = 0; i < insertLocation - 1; i++) {
            for (int j = 0; j < StudentID[i].length; j++) {
                newInsertStudentID[i][j] = StudentID[i][j];
            }
        }
        //add the user's insert name and number to where the user want to insert
        newInsertStudentID[insertLocation - 1][0] = insertNumber;
        newInsertStudentID[insertLocation - 1][1] = insertName;

        //add the IDs from the original array after the insert location back to the new array
        for (int i = insertLocation - 1; i < StudentID.length; i++) {
            for (int j = 0; j < StudentID[i].length; j++) {
                newInsertStudentID[i + 1][j] = StudentID[i][j];
            }
        }
        //print out new array
        for (int k = 0; k < newInsertStudentID.length; k++) {
            System.out.println();
            for (int j = 0; j < newInsertStudentID[k].length; j++) {
                System.out.print(newInsertStudentID[k][j] + " ");
            }
        }
        }

    public static void main(String[] args) {
        //original array, initialized 2D array, each student has their own student number and name
        String[][] StudentID = {{"1001", "Tom"},
                {"1002", "Zach"},
                {"1003", "John"},
                {"1004", "Dav"}};
        //print out the array on screen
        for (int i = 0; i < StudentID.length; i++) {
            System.out.println();
            for (int j = 0; j < StudentID[i].length; j++) {
                System.out.print(StudentID[i][j] + " ");
            }
        }
        //let user decide what they want to change to the original array
        while (true) { //this while loop is to repeat the switch statement so the user can switch between methods
            //get user input to decide which method they want to use
            Scanner scanUser = new Scanner(System.in);
            System.out.println('\n');
            System.out.println("type 'Delete' to delete values from this array: \ntype 'Add' to add values at the end of this array: \ntype 'Insert' to insert values into this array: \ntype 'No' to end this program");
            String userChoice = scanUser.nextLine();

            //If user types 'No' this program will end
            if (userChoice.equals("No")) {
                break;
            }
            
            //If user types 'Delete' this program will use the Delete method
            if (userChoice.equals("Delete")) {
                deleteID(StudentID);
            }

            //If user types 'Add' this program will use the Add method
            if (userChoice.equals("Add")) {
                addID(StudentID);
                }

            //If user types 'Insert' this program will use the Insert method
            if (userChoice.equals("Insert")) {
                insertID(StudentID);
                }
            }
        }
    }









