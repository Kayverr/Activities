
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