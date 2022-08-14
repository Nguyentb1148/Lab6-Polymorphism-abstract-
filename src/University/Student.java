package University;
public class Student extends Person{
    protected String degreeProgram;
    protected int yearOfGraduation;
    public Student(String code, String name, int rank,String degreeProgram,int yearOfGraduation ){
        super(code, name, rank);
        this.degreeProgram=degreeProgram;
        this.yearOfGraduation=yearOfGraduation;
    }
    public Student(){

    }
    public String getDegreeProgram() {
        return degreeProgram;
    }
    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }
    public int getYearOfGraduation() {
        return yearOfGraduation;
    }
    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Description:"+description());
        System.out.println("Degree Program: "+degreeProgram);
        System.out.println("Year of Graduation: "+yearOfGraduation);
    }
    @Override
    public String description() {
        switch (rank){
            case 0: return "None";
            case 1: return "Freshman";
            case 2: return "Sophomore";
            case 3: return "Junior";
            case 4: return "Senior";
            case 5: return "Graduate";
            case 6: return "Masters Postgraduate";
            case 7: return "Phd Postgraduate";
            default: return "Error: Wrong rank. No description";
        }
    }
}
