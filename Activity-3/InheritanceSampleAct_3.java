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

class Person {
    protected String Name;
    protected String Address;

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return Name;
    }
    public void setAddress(String address) {
        this.Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public String toString(){
        return "Hello I am" + Name + "I lived in " + Address + ".";
    }
}

class Staff extends Person {
 
    private String School;
    private double Salary;

    public Staff(String Name, String Address, String School, double Salary) {
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.Salary = Salary;
    }

    public String toString(){
        return "Hello I am " + Name + " I lived in " + Address + ". I teach at " + School + " and my Salary every month is " + Salary + ".";
    }

    public void setSchool(String school) {
        this.School = school;
    }

    public String getSchool() {
        return School;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }
}

class Student extends Person {
    private String Program;
    private int Year;

    public Student(String Name, String Address, String Program, int Year) {
        this.Name = Name;
        this.Address = Address;
        this.Program = Program;
        this.Year = Year;
    }

    public String toString(){
        return "Hello I am" + Name + "I lived in " + Address + ". I am " + Year + "year of" + Program + ".";
    }

    public void setProgram(String program) {
        this.Program = program;
    }

    public String getProgram() {
        return Program;
    }

    public void setYear(int year) {
        this.Year = year;
    }

    public int getYear() {
        return Year;
    }

}