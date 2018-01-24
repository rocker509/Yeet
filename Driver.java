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
    private ArrayList arrM = new ArrayList <Integer>();
    private int[] arr;
    public Driver(){
        console = new Scanner(System.in);
        System.out.println("How many numbers would you like to generate?");
        int n = console.nextInt();
        System.out.println("Highest Number?");
        int z = console.nextInt();
        fill(n , z);
        print();
        sort();
        print();
        System.out.println();
    }

    public void fill(int n, int z){
        while(n > 0){
            arrM.add((int)((Math.random()) * z + 1));
            n--;
        }
    }

    public void print(){
        for(int i = 0; i < arrM.size(); i++){
            if(i % 12 == 0){
                System.out.println();
            }
            System.out.print(arrM.get(i) + " ");
        }
    }

    public void sort(){
        array();
        int n = arr.length;
        int i, key, j;
        for (i = 1; i < n; i++)
        {
            key = arr[i];
            j = i-1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public void array(){
        int[] arr = new int[arrM.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)arrM.get(i); 
        }
    }
    public void revamp(){
        arrM.clear();
        for(int i = 0; i < arr.length; i++){
            arrM.add(arr[i]);
        }
    }
}
