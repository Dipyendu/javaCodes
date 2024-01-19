package staticExample;
//Java Program to illustrate the use of static variable which is shared with all objects.
public class ObjectCounter{

    static int count=0;//will get memory only once and retain its value

    ObjectCounter(){
        ObjectCounter.count++;//incrementing the value of static variable
    }

    void displayObjectCount(){
        System.out.println(ObjectCounter.count);
    }

    public static void main(String args[]){
        //creating objects
        ObjectCounter c1=new ObjectCounter();
        ObjectCounter c2=new ObjectCounter();
        ObjectCounter c3=new ObjectCounter();

        c1.displayObjectCount();
        c2.displayObjectCount();
        c3.displayObjectCount();
    }
}