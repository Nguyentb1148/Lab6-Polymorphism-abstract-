package Employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(10);
        Employee emp2 = new Employee(40);
        Employee emp3 = new Employee(30);
        Employee emp4 = new Employee(60);
        ArrayList<Employee> myList = new ArrayList<>();
        myList.add(emp1);
        myList.add(emp2);
        myList.add(emp3);
        myList.add(emp4);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i).getAge());
        }
        Collections.sort(myList);
        System.out.println(" Reverse sorting:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i).getAge());
        }
        Collections.sort(myList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(" Ascending sorting:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i).getAge());
        }
    }
}
