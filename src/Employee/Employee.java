package Employee;

public class Employee implements Comparable<Employee> {
    private int age;
    public Employee(int age){
            this.age=age;
    }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }
        @Override
        public int compareTo(Employee age){
                return age.age-this.age;
        }

}
