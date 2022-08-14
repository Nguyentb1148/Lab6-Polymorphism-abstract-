package University;

public class Professor extends Person {
    protected String department;
    public Professor(String code, String name, int rank,String department) {
        super(code, name, rank);
        this.department=department;
    }

    public String getDepartment() {
        return department;
    }
    public Professor(){

    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String description() {
        switch (rank){
            case 0: return "None";
            case 1: return "Assistant Professor";
            case 2: return "Associate Professor";
            case 3: return "Professor";
            case 4: return "Assistant Teaching Professor";
            case 5: return "Associate Teaching Professor";
            case 6: return "Teaching Professor";
            default: return "Error: Wrong rank. No description";
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Description: "+description());
        System.out.println("Professor department: "+department);
    }

}
