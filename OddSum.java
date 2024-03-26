import java.util.*;
public class OddSum {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        for(int i = 1; i<=num; i=i+2){
            sum += i;
        }
        System.out.print("Sum: "+ sum);
    }
}
