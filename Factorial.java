import java.util.*;
public class Factorial{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int sum = 1;
        int number = input.nextInt();
        for(int index = 1; index<number;index++){
            sum += sum*index;
        }
        System.out.print("Factorial: "+sum);
    }
}