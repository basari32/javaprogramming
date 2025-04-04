package sai;

import java.util.Scanner;

/* Create a class ‘Employee’ with data members Empid, Name, Salary, Address
 * and constructors to initialize the data members. 
 */
class EmployeeT {
    int empid;
    String name;
    float salary;
    String address;

    EmployeeT() {} 

    EmployeeT(int empid, String name, float salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

/* Create another class ‘Teacher’ that inherits the properties of class Employee
 * and contains its own data members department, subjects taught and constructors
 * to initialize these data members and also include display function to display
 * all the data members.
 */
class Teacher extends EmployeeT {
    String department, subject;

    Teacher(int empid, String name, float salary, String address, String department, String subject) {
        super(empid, name, salary, address);
        this.department = department;
        this.subject = subject;
    }

    public void display() {
        System.out.println("Teacher id : " + empid);
        System.out.println("Teacher name : " + name);
        System.out.println("Teacher salary : " + salary);
        System.out.println("Teacher address : " + address);
        System.out.println("Teacher department : " + department);
        System.out.println("Teacher subject : " + subject);
    }
}
/* Use array of objects to display details of N teachers. */


class TeacherArrObjects {
    public static void main(String[] args) {
        System.out.println("Enter number of Teachers: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("Enter Teacher details one by one.. ");
        Teacher teacher[] = new Teacher[n];
        
        Scanner scT = new Scanner(System.in);
        int tid;
        String name;
        float salary;
        String address;
        String department;
        String subject;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " teacher details..");
            System.out.println("Enter teacher id (integer): ");
            tid = scT.nextInt();
            scT.nextLine();  // Consume newline
            
            System.out.println("Enter teacher name (String): ");
            name = scT.nextLine();
            
            System.out.println("Enter teacher salary (float): ");
            salary = scT.nextFloat();
            scT.nextLine();  // Consume newline
            
            System.out.println("Enter teacher address (String): ");
            address = scT.nextLine();
            
            System.out.println("Enter teacher department (String): ");
            department = scT.nextLine();
            
            System.out.println("Enter teacher subject (String): ");
            subject = scT.nextLine();
            
            Teacher t = new Teacher(tid, name, salary, address, department, subject);
            teacher[i] = t;
        }
        
        System.out.println("Teachers are:\n");
        for (Teacher x : teacher) {
            x.display();
            System.out.println("\n");
        }
        
        sc.close();
        scT.close();
    }
}