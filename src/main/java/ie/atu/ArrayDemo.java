package ie.atu;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args){
        int[] anArray;
        Scanner scanner = new Scanner(System.in);
        anArray = new int[10];
        int i=0;

        for(i=0;i<10;i++){
            anArray[i] = 100*(i+1);
        }

        for(int  value : anArray){
            System.out.println("Element at index "+ i + " is " + value);
            value++;
        }

        try
        {
            System.out.println("Enter a new number: ");
            anArray[10] = scanner.nextInt();

        }
        catch(Exception e){
            System.out.println("Exceeds array size");
        }

    }
}
