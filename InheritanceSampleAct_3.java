public class InheritanceSampleAct_3 {
    public static void main(String[] args) {

        Student student = new Student("Jack", "1Paz St", "Computer Technology", 4);
        
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Program: " + student.getProgram());
        System.out.println("Year: " + student.getYear());

        Staff staff = new Staff("Mark", "Esperanza St", "St. Paul Colleges", 50000.0);

        System.out.println("\nStaff Details:");
        System.out.println("Name: " + staff.getName());
        System.out.println("Address: " + staff.getAddress());
        System.out.println("School: " + staff.getSchool());
        System.out.println("Salary: " + staff.getSalary());


        Staff staff1 = new Staff("Mara", "Catandaan", "STI Colleges", 600000.0);

        System.out.println("\nStaff Details:");
        System.out.println("Name: " + staff1.getName());
        System.out.println("Address: " + staff1.getAddress());
        System.out.println("School: " + staff1.getSchool());
        System.out.println("Salary: " + staff1.getSalary());
        System.out.println(staff1.toString());

    }
}

