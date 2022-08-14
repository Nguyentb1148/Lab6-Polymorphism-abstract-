package University;
public class PersonList {
    private final Person[] myPersonList;
    private int nbPeople;
    public PersonList(){
        this.myPersonList=new Person[10];
        nbPeople=0;
    }
    public void displayAll(){
        for (int i = 0; i < nbPeople; i++) {
            myPersonList[i].display();
        }
    }
    public void displayAll(int rank){
        for (int i = 0; i < nbPeople; i++) {
            if (myPersonList[i].getRank() == rank) {
                myPersonList[i].display();
            }
        }
    }
    public void add(Person a){
        myPersonList[nbPeople]=a;
        nbPeople++;
    }
    public double average(){
        int sum=0;
        for (int i = 0; i < nbPeople; i++) {
         sum+=myPersonList[i].getRank();
        }
        return (double)sum/nbPeople;
    }
    public void maxRank(){
        int index=-1;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < nbPeople; i++) {
            if (myPersonList[i].getRank()>=max){
                max=myPersonList[i].getRank();
            }
        }
        System.out.println("Max rank: "+max);

    }
    public void removePerson(String code){
        int index=-1;
        for (int i = 0; i < nbPeople; i++) {
            if (myPersonList[i].getCode().equals(code)){
                index=i;
            }
        }
        if (index==-1){
            System.out.println("not found");
        }
        else {
            for (int i = 0; i < nbPeople-1; i++) {
                myPersonList[i]=myPersonList[i+1];

            }
            nbPeople--;
            System.out.println("removed person");
        }
    }
}
