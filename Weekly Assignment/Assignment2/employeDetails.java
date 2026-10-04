package Assignment2;

public class employeDetails {

    public static void main(String[] args) {
        int empId = 1001;
        int age= 28;
        float salary= 55000.50f;
        char deptInitial ='T';
        boolean empStatus = true;

        System.out.println("Employee ID: " +empId);
        System.out.println("Age: " +age);
        System.out.print("Salary: " );
        System.out.format("%.2f", salary);
        System.out.println("" );
        System.out.println("Department Initial: " +deptInitial);
        System.out.println("Permanent:" +empStatus);
    }
}

