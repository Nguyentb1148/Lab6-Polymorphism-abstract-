package Managing_bill;
public class Bill {
    protected int code;
    protected String type;
    protected int oldIndex;
    protected int newIndex;
    protected int unitPrice;

    public Bill(int code,String type,int oldIndex,int newIndex,int unitPrice ){
        this.code=code;
        this.type=type;
        this.oldIndex=oldIndex;
        this.newIndex=newIndex;
        this.unitPrice=unitPrice;
    }
    public Bill(){
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getOldIndex() {
        return oldIndex;
    }
    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }
    public int getNewIndex() {
        return newIndex;
    }
    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }
    public int getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int price(){
        switch (unitPrice) {
            case 1: unitPrice=500;
            break;
            case 2: unitPrice=400;
            break;
            case 3: unitPrice=300;
            default:
        }
        return unitPrice;
    }
    public int payment(){
        return unitPrice*(newIndex-oldIndex);
    }
    public void display(){
        System.out.println("Person code: "+code);
        System.out.println("Person type: "+type);
        System.out.println("Person old index of water: "+oldIndex);
        System.out.println("Person new index of water: "+newIndex);
        System.out.println("Person unit price of using water: "+price());
        System.out.println("Person payment: "+payment() );
    }
}
