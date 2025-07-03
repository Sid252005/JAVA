import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[10];
        int count = 0;

        while (true) {
            System.out.println("\n--- Employee Management Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Display Employees Joined in Given Year");
            System.out.println("5. Find Employee with Max Salary");
            System.out.println("6. Find Employee with Min Salary");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count >= 10) {
                        System.out.println("Limit reached. Cannot add more.");
                        break;
                    }
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter DOB (dd mm yyyy): ");
                    int dd = sc.nextInt(), mm = sc.nextInt(), yy = sc.nextInt();
                    MyDate dob = new MyDate(dd, mm, yy);

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double sal = sc.nextDouble();

                    System.out.print("Enter DOJ (dd mm yyyy): ");
                    dd = sc.nextInt(); mm = sc.nextInt(); yy = sc.nextInt();
                    MyDate doj = new MyDate(dd, mm, yy);

                    employees[count++] = new Employee(name, dob, id, dept, sal, doj);
                    System.out.println("Employee added.");
                    break;

                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println(employees[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (employees[i].getId() == searchId) {
                            System.out.println(employees[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("Employee not found.");
                    break;

                case 4:
                    System.out.print("Enter year: ");
                    int year = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (employees[i].getDateOfJoining().getYear() == year) {
                            System.out.println(employees[i]);
                        }
                    }
                    break;

                case 5:
                    if (count == 0) {
                        System.out.println("No employees.");
                        break;
                    }
                    Employee maxEmp = employees[0];
                    for (int i = 1; i < count; i++) {
                        if (employees[i].getsalary() > maxEmp.getsalary()) {
                            maxEmp = employees[i];
                        }
                    }
                    System.out.println("Employee with Max Salary:\n" + maxEmp);
                    break;

                case 6:
                    if (count == 0) {
                        System.out.println("No employees.");
                        break;
                    }
                    Employee minEmp = employees[0];
                    for (int i = 1; i < count; i++) {
                        if (employees[i].getsalary() < minEmp.getsalary()) {
                            minEmp = employees[i];
                        }
                    }
                    System.out.println("Employee with Min Salary:\n" + minEmp);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
