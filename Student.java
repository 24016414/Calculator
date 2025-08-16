import java.util.*;

public class Student {
    private ArrayList<String> studentIds = new ArrayList<>();
    private ArrayList<String> studentNames = new ArrayList<>();
    private ArrayList<Integer> studentAges = new ArrayList<>();
    private ArrayList<String> studentEmails = new ArrayList<>();
    private ArrayList<String> studentCourses = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void runApplication() {
        displayMainMenu();
   }

    public void displayMainMenu() {
        System.out.println("STUDENT MANAGEMENT APPLICATION ");
        System.out.println("");
        System.out.println("Enter (1) to launch menu or any other key to exit");
        String choice = scanner.nextLine();
        if (choice.equals("1")) {
            showMenu();
        } else {
            ExitStudentApplication();
        }
    }

    private void showMenu() {
        System.out.println("\nPlease select one of the following menu items:");
        System.out.println("(1) Capture a new student.");
        System.out.println("(2) Search for a student.");
        System.out.println("(3) Delete a student.");
        System.out.println("(4) Print student report.");
        System.out.println("(5) Exit Application.");
        
        String choice = scanner.nextLine();
        
        switch (choice) {
            case "1":
                SaveStudent();
                break;
            case "2":
                SearchStudent();
                break;
            case "3":
                DeleteStudent();
                break;
            case "4":
                StudentReport();
                break;
            case "5":
                ExitStudentApplication();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                showMenu();
        }
    }

    public void SaveStudent() {
        System.out.println("\nCAPTURE A NEW STUDENT ");
        System.out.println("*");
        
        System.out.print("Enter the student id: ");
        String id = scanner.nextLine();
        
        System.out.print("Enter the student name: ");
        String name = scanner.nextLine();
        
        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Enter the student age: ");
            String ageInput = scanner.nextLine();
            
            try {
                age = Integer.parseInt(ageInput);
                if (age >= 16) {
                    validAge = true;
                } else {
                    System.out.println("You have entered an incorrect student age!!!");
                    System.out.println("Please re-enter the student age >> ");
                }
            } catch (NumberFormatException e) {
                System.out.println("You have entered an incorrect student age!!!");
                System.out.println("Please re-enter the student age >> ");
            }
        }
        System.out.print("Enter the student email: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter the student course: ");
        String course = scanner.nextLine();
        
        studentIds.add(id);
        studentNames.add(name);
        studentAges.add(age);
        studentEmails.add(email);
        studentCourses.add(course);
        
        System.out.println("Student details have been successfully saved.");
        
        System.out.println("Enter (1) to launch menu or any other key to exit");
        String input = scanner.nextLine();
        if (input.equals("1")) {
            showMenu();
        } else {
            ExitStudentApplication();
        }
    }
    public void SearchStudent() {
        System.out.println("SEARCH FOR A STUDENT");
        System.out.println("----------------------------------------");
        
        System.out.print("Enter the student id to search: ");
        String searchId = scanner.nextLine();
        
        int index = studentIds.indexOf(searchId);
        
        if (index != -1) {
            System.out.println("----------------------------------------");
            System.out.println("STUDENT ID: " + studentIds.get(index));
            System.out.println("STUDENT NAME: " + studentNames.get(index));
            System.out.println("STUDENT AGE: " + studentAges.get(index));
            System.out.println("STUDENT EMAIL: " + studentEmails.get(index));
            System.out.println("STUDENT COURSE: " + studentCourses.get(index));
            System.out.println("----------------------------------------");
        } else {
            System.out.println("----------------------------------------");
            System.out.println("Student with Student Id: " + searchId + " was not found!");
            System.out.println("----------------------------------------");
        }
        
        System.out.println("Enter (1) to launch menu or any other key to exit");
        String input = scanner.nextLine();
        if (input.equals("1")) {
            showMenu();
        } else {
            ExitStudentApplication();
        }
    }

    public void DeleteStudent() {
        System.out.println("DELETE A STUDENT ");
        System.out.println("----------------------------------------");
        
        System.out.print("Enter the student id to delete: ");
        String deleteId = scanner.nextLine();
        
        int index = studentIds.indexOf(deleteId);
        
        if (index != -1) {
            System.out.print("Are you sure you want to delete student " + deleteId + " from the system? Yes (y) to delete: ");
            String confirmation = scanner.nextLine();
            
            if (confirmation.equalsIgnoreCase("y")) {
                studentIds.remove(index);
                studentNames.remove(index);
                studentAges.remove(index);
                studentEmails.remove(index);
                studentCourses.remove(index);
                System.out.println("----------------------------------------");
                System.out.println("Student with Student Id: " + deleteId + " WAS deleted!");
                System.out.println("----------------------------------------");
            } else {
                System.out.println("Deletion cancelled.");
            }
        } else {
            System.out.println("----------------------------------------");
            System.out.println("Student with Student Id: " + deleteId + " was not found!");
            System.out.println("----------------------------------------");
        }
        
        System.out.println("Enter (1) to launch menu or any other key to exit");
        String input = scanner.nextLine();
        if (input.equals("1")) {
            showMenu();
        } else {
            ExitStudentApplication();
        }
    }

    public void StudentReport() {
        System.out.println("----------------------------------------");
        System.out.println("|         STUDENT REPORT              |");
        System.out.println("----------------------------------------");
        if (studentIds.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            for (int i = 0; i < studentIds.size(); i++) {
                System.out.println("STUDENT " + (i + 1));
                System.out.println("----------------------------------------");
                System.out.println("STUDENT ID: " + studentIds.get(i));
                System.out.println("STUDENT NAME: " + studentNames.get(i));
                System.out.println("STUDENT AGE: " + studentAges.get(i));
                System.out.println("STUDENT EMAIL: " + studentEmails.get(i));
                System.out.println("STUDENT COURSE: " + studentCourses.get(i));
                System.out.println("----------------------------------------");
            }
        }
        
        System.out.println("Enter (1) to launch menu or any other key to exit");
        String input = scanner.nextLine();
        if (input.equals("1")) {
            showMenu();
        } else {
            ExitStudentApplication();
        }
    }

    public void ExitStudentApplication() {
        System.out.println("Exiting application...");
        
}
}