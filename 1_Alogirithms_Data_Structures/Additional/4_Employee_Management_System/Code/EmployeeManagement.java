import java.util.Scanner;

public class EmployeeManagement {
    int employeeId;
    String name;
    String position;
    double salary;

    public EmployeeManagement(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    static void traverse(EmployeeManagement[] employees) {
        for (EmployeeManagement employee : employees) {
            if (employee != null) {
                System.out.println("ID: " + employee.employeeId + ", Name: " + employee.name + ", Position: " + employee.position + ", Salary: " + employee.salary);
            }
        }
        System.out.println();
    }

    static void add(EmployeeManagement[] employees) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID to add: ");
        int id = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Position: ");
        String position = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new EmployeeManagement(id, name, position, salary);
                break;
            }
            if(employees[i].employeeId == id) {
                System.out.println("Employee with ID " + id + " already exists.");
                return;
            }
            
        }
    }

    static void delete(int id, EmployeeManagement[] employees) {
        int i = 0;
        for (i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].employeeId == id) {
                employees[i] = null;
                System.out.println("Employee with ID " + id + " has been deleted.");
                break;
            }
        }
        for(int j = i; j < employees.length - 1; j++) {
            if (employees[j + 1] != null) {
                employees[j] = employees[j + 1];
            } else {
                employees[j] = null;
            }
        }
    }

    static boolean search(int id, EmployeeManagement[] employees) {
        for (EmployeeManagement employee : employees) {
            if (employee != null && employee.employeeId == id) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("\nEmployee Management System\n");

        int size = 10;
        EmployeeManagement[] employees = new EmployeeManagement[size];
        employees[0] = new EmployeeManagement(101, "Alice", "Manager", 75000);
        employees[1] = new EmployeeManagement(102, "Bob", "Developer", 60000);
        employees[2] = new EmployeeManagement(103, "Charlie", "Designer", 50000);
        employees[3] = new EmployeeManagement(104, "David", "Tester", 40000);
        employees[4] = new EmployeeManagement(105, "Eva", "HR", 55000);
        employees[5] = new EmployeeManagement(106, "Frank", "Developer", 60000);
        employees[6] = new EmployeeManagement(107, "Grace", "Manager", 80000);
        employees[7] = new EmployeeManagement(108, "Hank", "Designer", 52000);

        System.out.println("Traversing the employee list:\n");
        traverse(employees);


        System.out.println("\nSearching for employee with ID 103:\n");
        boolean find = search(103, employees);
        System.out.println(find ? "Employee found: " : "Employee not found\n");
        System.out.println("Searching for employee with ID 110:\n");
        find = search(110, employees);
        System.out.println(find ? "Employee found: " : "Employee not found\n");

        add(employees);
        System.out.println("\nAfter adding a new employee:\n");
        traverse(employees);

        delete(105, employees);
        System.out.println("\nAfter deleting employee with ID 105:\n");
        traverse(employees);




    }

}
