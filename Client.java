package ZaDAnie_2;

public class Client {
    Chair chair;
     public void sit(){
         System.out.println("sit on " + Chair.class.getName());
     }
     public void setChair(Chair chair){
         this.chair = chair;
     }
}
