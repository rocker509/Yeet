import java.util.*;
/**
 * Write a description of class Diver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Driver
{
   private Scanner console;
   private ArrayList myArray = new ArrayList <Integer>();
   
   public Driver(){
       console = new Scanner(System.in);
       System.out.println("How many numbers would you like to generate?");
       int n = console.nextInt();
       System.out.println("Highest Number?");
       int z = console.nextInt();
       fill(n , z);
       print();
   }
   public void fill(int n, int z){
       while(n > 0){
           myArray.add((int)((Math.random()) * z + 1));
           n--;
       }
   }
   public void print(){
       for(int i = 0; i < myArray.size(); i++){
           if(i % 12 == 0){
               System.out.println();
           }
           System.out.print(myArray.get(i) + " ");
       }
   }
}
