import java.util.Scanner;

class Employee {
    String Name, Address;
    int Age;
    long Ph;
    double Salary;

    Employee(String name, String address, int age, long ph, double salary) {
        Name = name;
        Address = address;
        Age = age;
        Ph = ph;
        Salary = salary;
    }
    void printEmployee() {
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Phone Number: " + Ph);
        System.out.println("Address: " + Address);
    }
    void printSalary() {
        System.out.println("Salary: " + Salary);
    }
}

class Manager extends Employee {
    String Dep;

    Manager(String name, String address, int age, long ph, double salary, String dep) {
        super(name, address, age, ph, salary);
        Dep = dep;
    }

    void printDepartment() {
        System.out.println(Name + " is from the " + Dep + " dep.");
    }
}

class Officer extends Employee {
    String Spec;

    Officer(String name, String address, int age, long ph, double salary, String spec) {
        super(name, address, age, ph, salary);
        Spec = spec;
    }

    void printSpecialization() {
        System.out.println(Name + " is specialized in " + Spec + ".");
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, address, dep, spec;
        int age;
        long ph;
        double salary;

        System.out.println("Enter the details of the Manager:");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Phone Number: ");
        ph = sc.nextLong();
        sc.nextLine(); 
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Department: ");
        dep = sc.nextLine();

        Manager mgr = new Manager(name, address, age, ph, salary, dep);

        System.out.println("\nEnter the details of the Officer:");
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Age: ");
        age = sc.nextInt();
        System.out.print("Phone Number: ");
        ph = sc.nextLong();
        sc.nextLine(); 
        System.out.print("Address: ");
        address = sc.nextLine();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Specialization: ");
        spec = sc.nextLine();

        Officer off = new Officer(name, address, age, ph, salary, spec);

        System.out.println("\nTHE DETAILS OF THE MANAGER ARE:");
        mgr.printEmployee();
        mgr.printSalary();
        mgr.printDepartment();

        System.out.println("\nTHE DETAILS OF THE OFFICER ARE:");
        off.printEmployee();
        off.printSalary();
        off.printSpecialization();

        sc.close();
    }
}
