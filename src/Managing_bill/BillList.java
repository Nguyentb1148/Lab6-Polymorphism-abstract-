package Managing_bill;

import java.util.Scanner;

public class BillList extends Bill {
    public static Bill[] myBillList=new Bill[10];
    protected int nbPeople;

    public BillList() {
        nbPeople = 0;
    }
    public void add(Bill p){
        if (nbPeople == 10) System.out.println("List is full! Can not add");
        else {
            myBillList[nbPeople] = p;
            nbPeople++;
        }
    }
    public void displayAll(){
        for (int i =0;i<nbPeople;i++){
            myBillList[i].display();
        }
    }
    public void remove(int code){
        int index=-1;
        for (int i = 0; i < nbPeople; i++) {
            if (myBillList[i].getCode()==code){
                index=i;
            }
        }
        if (index==-1){
            System.out.println("There is no people in the list with the code "+code);
        }else{
        for (int i = 0; i < nbPeople-1; i++) {
            myBillList[i]=myBillList[i+1];
            }
            System.out.println("removed success");
            nbPeople--;
        }
    }
    public void totalBillSameType(String type){
        int total=0;
        for (int i = 0; i < nbPeople; i++) {
            if (myBillList[i].getType().equals(type)){
                total=total+myBillList[i].payment();
            }
        }
        System.out.println("Total "+total);
    }
    public void maxPayment(){
        int maxPayment=0;
        for (int i = 0; i < nbPeople; i++) {
            if (myBillList[i].payment()>=maxPayment){
                maxPayment=myBillList[i].payment();
            }
        }
        System.out.println("Max payment: "+maxPayment);
    }
    public static void main(String[] args) {
        BillList myPersonList=new BillList();
        Bill bill1=new Bill(1,"abc",10,20,500);
        Bill bill2=new Bill(2,"abc1",10,30,300);
        Bill bill3=new Bill(3,"abc",10,40,400);
        Bill bill4=new Bill(4,"abc1",10,50,300);
        Bill bill5=new Bill(5,"abc",10,60,500);
        Bill bill6=new Bill(6,"abc1",10,70,400);
        Bill bill7=new Bill(7,"abc",10,80,300);
        Bill bill8=new Bill(8,"abc1",10,90,500);
        Bill bill9=new Bill(9,"abc",10,100,400);
        Bill bill10=new Bill(10,"abc1",10,110,500);
        myPersonList.add(bill1);
        myPersonList.add(bill2);
        myPersonList.add(bill3);
        myPersonList.add(bill4);
        myPersonList.add(bill5);
        myPersonList.add(bill6);
        myPersonList.add(bill7);
        myPersonList.add(bill8);
        myPersonList.add(bill9);
        myPersonList.add(bill10);
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("1: Display all rank");
        System.out.println("2: Total bill with same customer type");
        System.out.println("3: Max payment ");
        System.out.println("4: Remove bill with specified code");
        System.out.print("Choice: ");
        choice=sc.nextInt();
        switch (choice){
            case 1:
                myPersonList.displayAll();
                break;
            case 2:
                System.out.print("Input type: ");
                String type=sc.next();
                myPersonList.totalBillSameType(type);
                break;
            case 3:
                myPersonList.maxPayment();
                break;
            case 4:
                System.out.print("Input code: ");
                int code=sc.nextInt();
                myPersonList.remove(code);
        }
    }
}

