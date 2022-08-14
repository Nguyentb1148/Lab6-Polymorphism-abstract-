package University;

public abstract class Person {
    protected String code;
    protected String name;
    protected int rank;
    public Person (String code, String name, int rank){
        this.code = code;
        this.name = name;
        this.rank = rank;
    }
    public Person(){

    }
    public void setCode(String code) {
        this.code = code;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public String getCode() {
        return code;
    }
    public String getName(){
        return name;
    }
    public int getRank() {
        return rank;
    }
    public abstract String description();
    public void display() {
        System.out.println("Person code:" + code);
        System.out.println("Person name:" + name);
        System.out.println("Rank:" + rank);
    }
}
