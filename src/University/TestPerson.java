package University;
import java.util.Scanner;
public class TestPerson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PersonList myPersonList = new PersonList();
        Person person1 = new Professor("1", "Pham Thanh Son", 3,"Computing");
        Person person2 = new Professor("43", "Tran Van Linh", 5, "Geographic");
        Person student1 = new Student("3", "Trinh Do Duy Hung", 3, "Engineer", 2024);
        Person student2 = new Student("32", "Vo Minh Quoc", 5, "IT Program", 2024);
        myPersonList.add(person1);
        myPersonList.add(person2);
        myPersonList.add(student1);
        myPersonList.add(student2);
        int choice;
        System.out.println("1: Average all rank");
        System.out.println("2: Display all person");
        System.out.println("3: Display person(code)");
        System.out.println("4: Remove person(code)");
        System.out.println("5: Person with max rank");
        System.out.print("choice: ");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Average rank:" +myPersonList.average());
                break;
            case 2:
                 myPersonList.displayAll();
                break;
            case 3:
                System.out.print("Input a rank person: ");
                int rank=sc.nextInt();
                myPersonList.displayAll(rank);
                break;
            case 4:
                System.out.println("Input a code person: ");
                String code=sc.next();
                myPersonList.removePerson(code);
                break;
            case 5:
                myPersonList.maxRank();
                break;
        }
    }
}
