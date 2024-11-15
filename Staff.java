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
