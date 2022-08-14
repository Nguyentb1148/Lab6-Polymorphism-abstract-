package Ant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ant {
    protected String type;
    protected int hp;
    protected int hpLimit;
    public Ant(String type, int hpLimit) {
        this.type = type;
        this.hp = 100;
        this.hpLimit = hpLimit;
    }
    public String Alive() {
        String status;
       if (this.hp>this.hpLimit){
            status="Alive";
       }
       else {
           status="Dead";
       }
       return status;
    }
    public void damage(int damage) {
        if (damage > 0 && damage < 100) {
            this.hp -= damage;
        }
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Ant> list = new ArrayList<>();
        createNewBees(list);
        int choice=0;
        while (choice<3){
            System.out.println("-----------------------------");
            System.out.println("1: Create new ant list");
            System.out.println("2: Damage random");
            System.out.println("3: quit");
            System.out.print("Your choice: ");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    createNewBees(list);
                    System.out.println("List new ant");
                    for (int i = 0; i < list.size();i++) {
                        printBee(i+1, list.get(i));
                    }
                    break;
                case 2:
                    for (int i = 0; i < list.size(); i++)
                    {
                        int randomNum = (int)(Math.random()*80);
                        list.get(i).damage(randomNum);
                        printBee(i + 1, list.get(i));
                    }
                    break;
                case 3:
                default:
            }
        }
    }
    private static void printBee(int number, Ant ant)
    {
        System.out.println(number+": "+ant.type+ "\t"+ant.Alive()+ "\thealth = "+ ant.hp);
    }
    public static void createNewBees(List<Ant> list) {
        list.clear();
        for (int i = 0; i < 3; i++) {
            list.add(new Drone("Drone", 50));
            list.add(new Worker("Worker", 70));
            list.add(new Queen("Queen", 20));
        }
    }
}

