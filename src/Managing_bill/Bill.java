package Managing_bill;

import java.util.Scanner;

public  class Bill {
    protected int code;
    protected String type;
    protected double oldIndex;
    protected double newIndex;
    protected int unitPrice;
    protected double payment;

    public Bill(int code,String type, double oldIndex, double newIndex,int unitPrice){
        this.code=code;
        this.type=type;
        this.newIndex=newIndex;
        this.oldIndex=oldIndex;
        this.unitPrice=unitPrice;
        this.payment=payment();
    }
    public Bill(){

    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getOldIndex() {
        return oldIndex;
    }
    public void setOldIndex(double oldIndex) {
        this.oldIndex = oldIndex;
    }
    public double getNewIndex() {
        return newIndex;
    }
    public void setNewIndex(double newIndex) {
        this.newIndex = newIndex;
    }
    public double getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
    public double getPayment() {
        return payment;
    }
    public void setPayment(double payment) {
        this.payment = payment;
    }

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input customer code: ");
        this.code=sc.nextInt();
        System.out.print("Input customer type: ");
        this.type=sc.nextLine();
        System.out.print("Input old index of water meter: ");
        this.oldIndex=sc.nextDouble();
        System.out.print("Input new index of water meter: ");
        this.newIndex=sc.nextDouble();
    }
    public void price(){
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("customer type          unit price of using water");
        System.out.println("“Resident”                        500");
        System.out.println("“Business” or “Organization”      400");
        System.out.println("otherwise                         300");
        System.out.println("What kind of customer? ");
        choice=sc.nextInt();
        switch (choice){
            case 1: this.unitPrice=500;
            break;
            case 2: this.unitPrice=400;
            break;
            case 3: this.unitPrice=300;
            default:
        }
    }
    public double payment(){
        payment=unitPrice*(newIndex-oldIndex);
        return payment;
    }
    public void display(){
        System.out.println("Customer code: "+this.code);
        System.out.println("Customer type: "+this.type);
        System.out.println("Old index of mater meter: "+this.oldIndex);
        System.out.println("New index of mater meter: "+this.newIndex);
        System.out.println("Unit price of using water: "+this.unitPrice);
        System.out.println("Payment: "+this.payment);
    }
}
