package Managing_bill;

import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class BillList {
    public static final int SIZE = 100;
    private static  Bill[] myBillList;
    private static int nbPeople;
    public BillList() {
        myBillList = new Bill[SIZE];
        nbPeople = 0;
    }

    public  void add(Bill p){
        myBillList[nbPeople] = p;
        nbPeople++;
//        p.input();
//        p.price();
    }
    public void displayAll(){
        for (int i =0;i<nbPeople;i++){
            System.out.println("Bill "+(i+1));
            myBillList[i].display();
        }
    }
    public void totalSameType(String type){
        double total=0;
        for (int i =0;i<nbPeople;i++){
            if (myBillList[i].getType()==type){
                total = total + myBillList[i].payment();
            }
        }
        System.out.println("total: "+total);
    }

    public static void main(String[] args) {
        BillList myPersonList = new BillList();
        Bill person1 = new Bill(1,"abc",10,20,1) ;
        Bill person2 = new Bill(2,"a",20,30,400);
        Bill person3 = new Bill(3,"b",10,30,3);
        Bill person4 = new Bill(4,"a",20,30,1);
        myPersonList.add(person1);
        myPersonList.add(person2);
        myPersonList.add(person3);
        myPersonList.add(person4);
        myPersonList.displayAll();
        myPersonList.totalSameType("a");
//
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = sc.nextInt();
//
//        for (int i = 0; i < number; i++) {
//            myBillList[i].input();
//            myBillList[i].price();
//        }
//        for (int i = 0; i < number; i++) {
//            myBillList[i].display();
//        }
    }
}
